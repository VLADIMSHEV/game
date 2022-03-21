package com.game.classes.characters;

import com.game.classes.AttackType;
import com.game.classes.CharacterClass;

public class Mage extends CharacterClass {
    public Mage(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(50);
        this.setMaxManaPoints(150);
        this.setHealthPoints(50);
        this.setManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_RANGED);
        this.setAttackAmount(9);
    }
}
