package ru.pr1nkos.creational.factory;

public class GoblinFactory extends EnemyFactory{

    @Override
    public Enemy createEnemy() {
        return new Goblin();
    }
}
