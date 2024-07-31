package ru.pr1nkos;

import ru.pr1nkos.structural.adapter.RoundHole;
import ru.pr1nkos.structural.adapter.RoundPeg;
import ru.pr1nkos.structural.adapter.SquarePeg;
import ru.pr1nkos.structural.adapter.SquarePegAdapter;
import ru.pr1nkos.structural.bridge.*;
import ru.pr1nkos.structural.composite.CompanyDirectory;
import ru.pr1nkos.structural.composite.Developer;
import ru.pr1nkos.structural.composite.Manager;


public class Main {
    public static void main(String[] args) {
        //Синглтон - когда нужен только 1 класс для доступа к настройкам или к базе данных
/*        AppConfig appConfig = AppConfig.getInstance();
        System.out.println(appConfig.getProperty("database.url"));*/

        //Строитель - когда нужно строить сложный объект по частям
/*        Computer computer = new Computer.Builder()
                .CPU("Ryzen")
                .GPU("6600XT")
                .HDD("1 TB")
                .RAM("32 GB")
                .build();
        System.out.println(computer.toString());*/

        //Прототип - клонирование объектов вместо создания для уменьшения накладных расходов на создание объектов

/*        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("Circle");
        System.out.println(clonedShape1.getType());
        System.out.println(clonedShape1);
        Shape clonedShape2 = ShapeCache.getShape("Square");
        System.out.println(clonedShape2.getType());
        clonedShape2.draw();*/

        /*Фабричный метод - когда создаются разные типы наследуемых объектов,
         мы можем делегировать создание таких объектов специальному классу
        */

/*        EnemyFactory orcFactory = new OrcFactory();
        orcFactory.spawnEnemy();
        EnemyFactory goblinFactory = new GoblinFactory();
        goblinFactory.spawnEnemy();*/

        /*Абстрактная фабрика - создание семейств связанных объектов
         *
         * */
/*        Button button;
        CheckBox checkBox;
        GuiFactory factory = new WindowsFactory();
        button = factory.createButton();
        checkBox = factory.createCheckBox();
        button.paint();
        checkBox.paint();*/

        /*Прокси - подстановка вместо реальных объектов другие, при этом откладывая создание только тогда, когда
         * действительно нужно программе (ленивая инициализация)
         *
         * */

/*        Image image = new ProxyImage("test.jpg");
        image.display();
        System.out.println();
        image.display();*/

        /* Легковес - вынесение общих параметров для многих объектов в один общий объект, а персональные параметры
         * оставляет в мелких классах. Для облегчения веса программы
         *
         * */
/*        Tree tree1 = TreeFactory.getTree("Bereza");
        tree1.display(1,2);
        Tree tree2 = TreeFactory.getTree("Buk");
        tree2.display(2,3);
        Tree tree3 = TreeFactory.getTree("Buk");
        tree3.display(3,4);*/

        /*Фасад - когда хотим упростить взаимодействие к набору интерфейсов*/
/*        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(dvdPlayer, projector, lights);
        homeTheatreFacade.watchMovie("Dune");
        System.out.println();
        homeTheatreFacade.endMovie();*/

        /*Декоратор - добавление нового функционала объекту*/
/*        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $ " + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $ " + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $ " + coffee.getCost());*/

        /*Компоновщик - объединяет объекты в древовидные структуры для представления иерархии "часть-целое"*/
/*        Developer developer1 = new Developer( "Serafim Kosach", 100,"Junior");
        Developer developer2 = new Developer("Maxim Kosach", 101, "Pro Racer");

        Manager manager1 = new Manager("Elena Kosach", 103, "Pro manager");

        CompanyDirectory engeneeringDirectory = new CompanyDirectory();
        engeneeringDirectory.addEmployee(developer1);
        engeneeringDirectory.addEmployee(developer2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(manager1);
        companyDirectory.addEmployee(engeneeringDirectory);

        companyDirectory.showEmployeeDetails();*/
        /*Мост - разделение абстракции и реализации так, чтобы можно было независимо их изменять*/
/*        Message textMessage = new TextMessage(new EmailSender());
        textMessage.send("Hello, Email!");
        Message encryptedMessage = new EncryptedMessage(new SMSSender());
        encryptedMessage.send("Hello, SMS!");*/

        /*Адаптер - объекты с несовместимыми интерфейсами могут работать вместе*/
/*
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        SquarePeg squarePeg = new SquarePeg(5);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        System.out.println("Round peg fits round hole: " + roundHole.fits(roundPeg));
        System.out.println("Square peg fits round hole: " + roundHole.fits(squarePegAdapter));
*/

    }

}