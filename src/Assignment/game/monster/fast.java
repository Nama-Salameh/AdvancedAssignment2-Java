package Assignment.game.monster;

import Assignment.game.methods.EntityMove;

public class fast extends monster implements EntityMove {
    @Override
    public void move(){
        System.out.println("I am a fast monster");
    }
}