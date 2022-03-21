package com.game.monsters;

import com.game.classes.AttackType;
import com.game.classes.BaseClasse;

public abstract class MonsterClass implements BaseClasse {
    private int healthPoints;
    private int manaPoints;
    private int level;
    private AttackType attackType;
    private int attackAmount;
    private String name;
    private int maxHealthPoints;
    private int maxManaPoints;

    @Override
    public void attak() {
    }
    @Override
    public void restoreHealth(int amount) {
    }
    @Override
    public void loseHealth(int amount) {
    }
    @Override
    public void restoreMana(int amount) {
    }
    @Override
    public void loseMana(int amount) {
    }
    @Override
    public void levelUp() {
    }
    @Override
    public void info() {
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if (healthPoints < 0) this.healthPoints = 0;
        else if (healthPoints > maxHealthPoints) this.healthPoints = this.maxHealthPoints;
        else this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        if (manaPoints < 0) this.manaPoints = 0;
        else if (manaPoints > maxManaPoints) this.manaPoints = this.maxManaPoints;
        else this.manaPoints = manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 0) System.out.println("We can't lose level");
        this.level = level;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        this.attackAmount = attackAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }
}