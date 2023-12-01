package org.example;

public class Retiree implements Observer{
    GenerateSpec generateSpec = new GenerateSpec();
    Specialty specialty = generateSpec.generateSpecialty();
    private String name;
    private int salary = specialty.getMinSalary()+2000;
    public Retiree(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, Specialty specialty, int salary) {
        if (this.salary <= salary & this.specialty.getTitle().equals(specialty.getTitle())){
            System.out.printf("Пенсионер %s, специальность %s, мой уровень зарплаты = %d :\n Мне нужна эта работа! (компания: %s; специальность %s; заработная плата: %d)\n***\n",
                    name, this.specialty, this.salary, nameCompany, specialty, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Пенсионер %s, специальность %s, мой уровень зарплаты = %d :\n Я найду работу получше! (компания: %s; специальность %s; заработная плата: %d)\n***\n",
                    name, this.specialty, this.salary, nameCompany, specialty, salary);
        }
    }
}
