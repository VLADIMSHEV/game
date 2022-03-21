package com.game.monsters.characters;

import com.game.classes.AttackType;
import com.game.monsters.MonsterClass;

public class Necromancer extends MonsterClass {
    public Necromancer(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(100);
        this.setMaxManaPoints(50);
        this.setHealthPoints(100);
        this.setManaPoints(50);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(5);
    }
}
