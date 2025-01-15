package com.github.antonio225t.currencyfun;

import com.github.antonio225t.currencyfun.mobDrop.GenericType;
import com.github.antonio225t.currencyfun.mobDrop.MobProbability;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.util.HashMap;

public class Config {

    public static Configuration config;
    public static HashMap<String, MobProbability> mobs = new HashMap<String, MobProbability>();

    public static void init(File f) {
        config = new Configuration(f);
        sync();
    }

    public static MobProbability defaultProbability = new MobProbability(null, 3, 5);

    public static void sync() {
        String category = "mobDrops";

        String[] mobsDefault = new String[] {
            "_* 3-5",
            "_Animals 2-3",
            "_Mobs 3-5",
            "_Bosses 40-60"
        };

        // Mob drops
        config.addCustomCategoryComment(category, "This category indicates the mobs that will have a probability do drop Rupees");
        for (String s : config.getStringList("mobs", category, mobsDefault, "<mobName> <from>-<to> (eg. Zombie 3-5) OR\n<mobname> <number> (eg. Zombie 4).\n\nDefault will be from 3 to 5 for every mob not present in this list.\nThe numbers are SHORTs (MIN: 0 MAX: 32767)!\nThere also are special names such as '_*' to specify anything, '_Animals' to specify animals, '_Mobs' to specify monsters and '_Bosses' to specify bosses!\n")) {
            MobProbability mp = parseProbability(s);
            mobs.put(mp.getMobName(), mp);
        }

        config.save();
    }

    private static MobProbability parseProbability(String s) {
        String mobName = s.split(" ")[0];
        int from;
        int to;

        String[] range = s.split(" ")[1].split("-");
        from = Short.parseShort(range[0]);
        to = range.length > 1 ? Short.parseShort(range[1]) : from;

        CurrencyFun.LOGGER.info("Loaded probability for '{}' {}", mobName, (from == to ? "dropping '" + from + "' rupees!" : "with range " + Math.min(from, to) + "-" + Math.max(from, to) + " chance of dropping rupees!"));
        return new MobProbability(mobName, Math.min(from, to), Math.max(from, to));
    }

    public static int getMobDroppingCount(Entity e) {
        if (mobs.containsKey(e.getName())) return mobs.get(e.getName()).roll();
        if (e instanceof EntityAnimal) {
            // CurrencyFun.LOGGER.info("Killed ANIMAL!");
            return getDefaultProbability(GenericType.ANIMAL).roll();
        } else if (e instanceof IBossDisplayData) {
            // CurrencyFun.LOGGER.info("Killed BOSS!");
            return getDefaultProbability(GenericType.BOSS).roll();
        } else if (e instanceof EntityMob) {
            // CurrencyFun.LOGGER.info("Killed MONSTER!");
            return getDefaultProbability(GenericType.MONSTER).roll();
        }
        return getDefaultProbability(GenericType.ALL).roll();
    }

    public static MobProbability getDefaultProbability(GenericType type) {
        if (type != null) {
            switch (type) {
                case ANIMAL:
                    if (mobs.containsKey("_Animals")) return mobs.get("_Animals");
                    return getDefaultProbability(GenericType.ALL);
                case MONSTER:
                    if (mobs.containsKey("_Mobs")) return mobs.get("_Mobs");
                    return getDefaultProbability(GenericType.ALL);
                case BOSS:
                    if (mobs.containsKey("_Bosses")) return mobs.get("_Bosses");
                    return getDefaultProbability(GenericType.ALL);
                case ALL:
                    if (mobs.containsKey("_*")) return mobs.get("_*");
            }
        }
        return defaultProbability;
    }
}
