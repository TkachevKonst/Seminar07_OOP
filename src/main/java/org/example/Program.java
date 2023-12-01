package org.example;

public class Program {
    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher);
        Company yandex = new Company("Yandex", publisher);
        Company geekBrains = new Company("GeekBrains", publisher);

        Student student1 = new Student("Студент #1");
        Student student2 = new Student("Студент #2");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        Retiree retiree1 = new Retiree("Пенсионер №1");
        Retiree retiree2 = new Retiree("Пенсионер №2");


        publisher.registerObserver(student1);
        publisher.registerObserver(student2);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(retiree1);
        publisher.registerObserver(retiree2);


        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }

    }
}
