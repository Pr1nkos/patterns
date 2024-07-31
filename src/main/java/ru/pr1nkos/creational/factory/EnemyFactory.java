package ru.pr1nkos.creational.factory;

public abstract class EnemyFactory {
    public abstract Enemy createEnemy();

    public void spawnEnemy(){
        Enemy enemy = createEnemy();
        enemy.attack();
    }
}
