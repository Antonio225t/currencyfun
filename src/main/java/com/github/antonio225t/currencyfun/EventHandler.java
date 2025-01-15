package com.github.antonio225t.currencyfun;

import com.github.antonio225t.currencyfun.registry.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

    @SubscribeEvent
    public void onKill(LivingDeathEvent e) {
        if (!e.entity.worldObj.isRemote) {
            if (!(e.entity instanceof EntityPlayer)) {
                int range = Config.getMobDroppingCount(e.entity);
                for (int i = 0;i < range;i++) {
                    e.entity.dropItem(Items.RUPEE, 1);
                }

            }
            /*
            CurrencyFun.LOGGER.info("Damage type: {}", e.source.damageType);
            CurrencyFun.LOGGER.info("Message: {}", e.source.getDeathMessage(Minecraft.getMinecraft().thePlayer).getFormattedText());
            CurrencyFun.LOGGER.info("Is mob: {}", e.entity instanceof EntityMob);
            CurrencyFun.LOGGER.info("Mob name: {} (ID: {})", e.entity.getName(), e.entity.getEntityId());
            if (e.source.getEntity() != null) CurrencyFun.LOGGER.info("Entity is player: {}", e.source.getEntity() instanceof EntityPlayer);
            if (e.source.getSourceOfDamage() != null) CurrencyFun.LOGGER.info("Source of damage: {}", e.source.getSourceOfDamage());
             */
        }
    }

}
