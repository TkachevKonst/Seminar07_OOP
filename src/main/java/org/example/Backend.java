package org.example;

import java.util.Random;

public class Backend extends Specialty{
    static Random random = new Random();
    private final String title = "Backend";

    private final int minSalary = random.nextInt(85000);
    private final int maxSalary = random.nextInt(85000, 200000);
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
        return String.format("Backend");
    }
}
