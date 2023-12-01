package org.example;

import java.util.Random;

public class Manager extends Specialty{
    static Random random = new Random();
    private final String title = "Manager";
    private final int minSalary = random.nextInt(20000);
    private final int maxSalary = random.nextInt(20000, 85000);

    public String getTitle() {
        return title;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    @Override
    public String toString() {
        return String.format("Manager");
    }
}
