package ru.pr1nkos.creational.factory;

public class OrcFactory extends EnemyFactory {

    @Override
    public Enemy createEnemy() {
        return new Orc();
    }
}
