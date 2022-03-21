package com.game.dungeons;

import com.game.Party;
import com.game.monsters.MonsterClass;

public class Dungeon implements BasicDungeon{
    private boolean isOpened = false;
    private MonsterClass[] monsters;
    @Override
    public boolean open(Party party) {
        if (party.getPartyMembers().length < 3){
            System.out.println("Not enough party members!");
            isOpened = false;
        }
        else {
            System.out.println("Welcome, heroes! \n Get for the adventure!");
            isOpened = true;
        }
        return isOpened;
    }
}
