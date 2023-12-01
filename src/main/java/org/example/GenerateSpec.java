package org.example;

import java.util.Random;

public class GenerateSpec {
    static Random random = new Random();
   private Specialty generateSpecialty(SpecialtyType specialtyType){
        return switch (specialtyType){
            case Backend -> new Backend();
            case Manager -> new Manager();
        };
    }

    public Specialty generateSpecialty() {
        int typeIndex = random.nextInt(2);
        return switch (typeIndex) {
            case 0 -> generateSpecialty(SpecialtyType.Backend);
            case 1 -> generateSpecialty(SpecialtyType.Manager);
            default -> null;
        };
    }
}
