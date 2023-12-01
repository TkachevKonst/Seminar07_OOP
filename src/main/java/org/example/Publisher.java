package org.example;

public interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void sendOffer(String companyName, Specialty specialty, int salary);

}
