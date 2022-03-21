package com.game;

import com.game.classes.characters.Archer;
import com.game.classes.characters.Healer;
import com.game.classes.characters.Mage;
import com.game.classes.characters.Warrior;
import com.game.dungeons.Dungeon;

public class Main {

    public static void main(String[] args) {
        Party party = new Party(new Mage("Gandalf"), new Warrior("Aragorn"),
                new Archer("Legolas"),new Healer("Radogast"));
        party.info();
        Dungeon dungeon = new Dungeon();
        if (party.enterDungeon(dungeon)){
            party.setDungeon(dungeon);
            party.runDungeon();
        } else System.out.println("GAME OVER");
    }
}
