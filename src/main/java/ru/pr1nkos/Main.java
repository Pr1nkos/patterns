package ru.pr1nkos;

import ru.pr1nkos.behavioral.memento.TextEditor;
import ru.pr1nkos.behavioral.observer.Blog;
import ru.pr1nkos.behavioral.observer.User;
import ru.pr1nkos.behavioral.state.OrderContext;
import ru.pr1nkos.behavioral.strategy.BubbleSort;
import ru.pr1nkos.behavioral.strategy.Context;
import ru.pr1nkos.behavioral.strategy.QuickSort;
import ru.pr1nkos.behavioral.template.Beverage;
import ru.pr1nkos.behavioral.template.Tea;
import ru.pr1nkos.behavioral.template.Coffee;
import ru.pr1nkos.behavioral.visitor.Directory;
import ru.pr1nkos.behavioral.visitor.FileClass;
import ru.pr1nkos.behavioral.visitor.FileSystemSizeVisitor;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        /*
         *
         *
         * Синглтон - когда нужен только 1 класс для доступа к настройкам или к базе данных
         *
         *
         * */


/*      AppConfig appConfig = AppConfig.getInstance();
        System.out.println(appConfig.getProperty("database.url"));*/

        /*
        *
        *
        * Строитель - когда нужно строить сложный объект по частям
        *
        *
        *
/*        Computer computer = new Computer.Builder()
                .CPU("Ryzen")
                .GPU("6600XT")
                .HDD("1 TB")
                .RAM("32 GB")
                .build();
        System.out.println(computer.toString());*/

        /*
         *
         *
         * Прототип - клонирование объектов вместо создания для уменьшения накладных расходов на создание объектов
         *
         *
         * */

/*        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("Circle");
        System.out.println(clonedShape1.getType());
        System.out.println(clonedShape1);
        Shape clonedShape2 = ShapeCache.getShape("Square");
        System.out.println(clonedShape2.getType());
        clonedShape2.draw();*/





        /*
        *
        * Фабричный метод -когда создаются разные типы наследуемых объектов,
                мы можем делегировать создание таких объектов специальному классу
        *
        *
        * */


/*        EnemyFactory orcFactory = new OrcFactory();
        orcFactory.spawnEnemy();
        EnemyFactory goblinFactory = new GoblinFactory();
        goblinFactory.spawnEnemy();*/






        /*
         *
         *  Абстрактная фабрика - создание семейств связанных объектов
         *
         *
         * */
/*        Button button;
        CheckBox checkBox;
        GuiFactory factory = new WindowsFactory();
        button = factory.createButton();
        checkBox = factory.createCheckBox();
        button.paint();
        checkBox.paint();*/

        /*
         *
         *
         * Прокси - подстановка вместо реальных объектов другие, при этом откладывая создание только тогда, когда
         * действительно нужно программе (ленивая инициализация)
         *
         *
         * */

/*        Image image = new ProxyImage("test.jpg");
        image.display();
        System.out.println();
        image.display();*/





        /*
         *
         * Легковес - вынесение общих параметров для многих объектов в один общий объект, а персональные параметры
         * оставляет в мелких классах. Для облегчения веса программы
         *
         *
         * */



/*      Tree tree1 = TreeFactory.getTree("Bereza");
        tree1.display(1,2);
        Tree tree2 = TreeFactory.getTree("Buk");
        tree2.display(2,3);
        Tree tree3 = TreeFactory.getTree("Buk");
        tree3.display(3,4);*/



        /*
         *
         * Фасад - когда хотим упростить взаимодействие к набору интерфейсов
         *
         * */

/*        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(dvdPlayer, projector, lights);
        homeTheatreFacade.watchMovie("Dune");
        System.out.println();
        homeTheatreFacade.endMovie();*/

        /*
         *
         * Декоратор - добавление нового функционала объекту
         *
         * */

/*        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $ " + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $ " + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $ " + coffee.getCost());*/

        /*
         *
         *
         * Компоновщик - объединяет объекты в древовидные структуры для представления иерархии "часть-целое"
         *
         * */
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
        /*
         *
         *
         * Мост - разделение абстракции и реализации так, чтобы можно было независимо их изменять
         *
         *
         * */
/*        Message textMessage = new TextMessage(new EmailSender());
        textMessage.send("Hello, Email!");
        Message encryptedMessage = new EncryptedMessage(new SMSSender());
        encryptedMessage.send("Hello, SMS!");*/

        /*
         *
         * Адаптер - объекты с несовместимыми интерфейсами могут работать вместе
         *
         * */
/*
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        SquarePeg squarePeg = new SquarePeg(5);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        System.out.println("Round peg fits round hole: " + roundHole.fits(roundPeg));
        System.out.println("Square peg fits round hole: " + roundHole.fits(squarePegAdapter));
*/
        /*
         *
         * Цепочка обязанностей - передавать запрос по цепочке, где каждый обработчик решает, обработать запрос,
         * или кинуть следующему обработчику
         *
         *
         */


/*        SupportHandler basic = new BasicSupportHandler();
        SupportHandler advanced = new AdvancedSupportHandler();
        SupportHandler supervisor = new SupervisorSupportHandler();

        basic.setSupportHandler(advanced);
        advanced.setSupportHandler(supervisor);

        basic.handleRequest("basic");
        basic.handleRequest("advanced");
        basic.handleRequest("supervisor");
        basic.handleRequest("none");
        */

        /*
         *
         *
         *  Команда - превращение запроса в объекты, позволяя передавать их как параметры, логировать их и поддерживать отмену операции
         *
         *
         * */
/*
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();*/
        /*
         *
         *
         * Итератор - когда нужно в сложной структуре данных пройтись по коллекциям или дать возможность выбора
         * типа итерации
         *
         *
         * */
/*

        NameRepository nameRepository = new NameRepository();

        for(Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
*/
        /*
         *
         *
         * Посредник - убирает большое количество связей между объектами, обеспечивая слабую
         * связанность
         *
         *
         * */

/*        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl("John", mediator);
        User user2 = new UserImpl("Jane", mediator);
        User user3 = new UserImpl("Jack", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hello!");*/

        /*
         *
         *
         * Снимок - сохранение состояния объекта для дальнейшего восстановления
         *
         *
         * */
/*
        TextEditor textEditor = new TextEditor();
        textEditor.write("Первая строчка");
        textEditor.write("Вторая строчка");
        TextEditor.Memento memento1 = textEditor.save();

        textEditor.write("Дополнительный текст");
        System.out.println("Текущее состояние: " + textEditor.getContent());

        textEditor.restore(memento1);
        System.out.println("Восстановленное состояние: " + textEditor.getContent());
*/
        /*
         *
         *
         * Наблюдатель - при изменении состояния объекта об этом узнавали только подписанные объекты
         *
         * */
/*
        Blog blog = new Blog();
        User user1 = new User("John");
        User user2 = new User("Jane");

        blog.addObserver(user1);
        blog.addObserver(user2);

        blog.publish("Новая книга");*/

        /*
         *
         * Состояние - когда у объектв в зависимости от состояния очень сильно меняется логики работы и минимизация ифов
         *
         * */
/*
        OrderContext order = new OrderContext();
        order.printStatus();

        order.next();
        order.printStatus();

        order.next();
        order.printStatus();

        order.next();
*/
        /*
         *
         *
         * Стратегия - когда нужно в классе предложить несколько вариаций алгоритмов в зависимости от требуемой ситуации делает алгоритмы взаимозаменяемыми
         *
         *
         * */

/*        int[] numbers = {1,2,3,5,6,53324,623,41};
        Context context = new Context();
        context.setStrategy(new QuickSort());
        context.executeStrategy(numbers);

        context.setStrategy(new BubbleSort());
        context.executeStrategy(numbers);*/

        /*
         *
         * Шабблонный метод - когда нужно расширять базовый функционал (скелет) и оставить базовый как шаблон
         *
         * */

/*        Beverage tea = new Tea();
        tea.prepareRecipe();

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();*/
        /*
         *
         * Посетитель - добавление операции к объектам, не изменяя объекты
         *
         *
         * */
/*
        Directory root = new Directory("root");
        root.addElement(new FileClass("file1.txt"));
        root.addElement(new FileClass("file2.txt"));

        Directory subDir = new Directory("subdir");
        subDir.addElement(new FileClass("file3.txt"));
        root.addElement(subDir);

        FileSystemSizeVisitor sizeVisitor = new FileSystemSizeVisitor();
        root.accept(sizeVisitor);

        System.out.println("Total size: " + sizeVisitor.getTotalsize());
*/


    }


}