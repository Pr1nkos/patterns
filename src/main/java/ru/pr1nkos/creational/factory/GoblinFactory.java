package ru.pr1nkos.creational.factory;

/**
 * The type Goblin factory.
 */
public class GoblinFactory extends EnemyFactory{

    @Override
    public Enemy createEnemy() {
        return new Goblin();
    }
}
