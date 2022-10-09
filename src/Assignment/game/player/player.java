package Assignment.game.player;

import Assignment.game.Entity;
import Assignment.game.Types;
import Assignment.game.methods.EntityMove;
import Assignment.game.methods.EntityRender;

public class player implements Types,EntityMove, EntityRender {
    @Override
    public void move() {
        System.out.println("I can move from location to another (I am player)");
    }

    @Override
    public void render() {
        System.out.println("I am render in player");
    }

}
