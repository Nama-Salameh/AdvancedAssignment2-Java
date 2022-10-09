package Assignment.game.monster;

import Assignment.game.methods.EntityRender;

public class Stealth  extends monster implements EntityRender {

    @Override
    public void render(){
        System.out.println("render in stealth monster");
    }
}
