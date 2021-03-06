package com.harcyah.kata.misc.nurse;

import java.util.HashMap;

public class Schedule extends HashMap<Heal, Integer> {

    private static final long serialVersionUID = -6953208456345592930L;

    public Schedule() {
        for (Heal heal : Heal.values()) {
            put(heal, 0);
        }
    }

    public void addHeal(Heal heal) {
        put(heal, get(heal) + 1);
    }

    public long getTotalDuration(long averageTimeBetweenSickBoys) {
        long workDuration = 0;
        int heals = 0;
        for (Heal heal : keySet()) {
            int times = get(heal);
            workDuration += times * heal.getDuration();
            heals += times;
        }
        return workDuration + (heals - 1) * averageTimeBetweenSickBoys;
    }

    public long getTotalCost() {
        long total = 0;
        for (Heal heal : keySet()) {
            int times = get(heal);
            total += times * heal.getCost();
        }
        return total;
    }

}
