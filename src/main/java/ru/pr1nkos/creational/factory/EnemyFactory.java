package ru.pr1nkos.creational.factory;

/**
 * The type Enemy factory.
 */
public abstract class EnemyFactory {
    /**
     * Create enemy enemy.
     *
     * @return the enemy
     */
    public abstract Enemy createEnemy();

    /**
     * Spawn enemy.
     */
    public void spawnEnemy(){
        Enemy enemy = createEnemy();
        enemy.attack();
    }
}
