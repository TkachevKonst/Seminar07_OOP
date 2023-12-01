package org.example;



public class Company {
    GenerateSpec generateSpec = new GenerateSpec();


    private String name;

    private Publisher jobAgency;

    private int maxSalary;


    public Company(String name, Publisher jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(){
        Specialty specialty = generateSpec.generateSpecialty();
        int salary = specialty.getMaxSalary();
        jobAgency.sendOffer(name, specialty, salary);
    }
}
