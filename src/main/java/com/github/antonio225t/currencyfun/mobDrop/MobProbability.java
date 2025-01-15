package com.github.antonio225t.currencyfun.mobDrop;

import java.util.Random;

public class MobProbability {
    private final String mobName;
    private final int from;
    private final int to;
    private final Random rand;

    public MobProbability(String mobName, int from, int to) {
        this.mobName = mobName;
        this.from = from;
        this.to = to;
        this.rand = new Random();
    }

    public int roll() {
        return this.from != this.to ? this.from + this.rand.nextInt(this.to-this.from) : this.from;
    }

    public String getMobName() {return this.mobName;}
    public int getFrom() {return this.from;}
    public int getTo() {return this.to;}
}
