package com.game.classes;

public interface BaseClasse {
    void attak();

    void restoreHealth(int amount);

    void loseHealth(int amount);

    void restoreMana(int amount);

    void loseMana(int amount);

    void levelUp();

    void info();
}
