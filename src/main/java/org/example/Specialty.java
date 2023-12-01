package org.example;

import java.util.Random;

public class Specialty {

    protected String title;
    protected int minSalary;
    protected int maxSalary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Specialty() {
        this.title = title;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }


    @Override
    public String toString() {
        return String.format("%s",title);
    }
}
