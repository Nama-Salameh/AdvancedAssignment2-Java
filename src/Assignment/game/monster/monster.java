package Assignment.game.monster;
import Assignment.game.Types;
import Assignment.game.methods.EntityMove;
import Assignment.game.methods.EntityNoise;
import Assignment.game.methods.EntityRender;


public class monster implements Types, EntityMove, EntityRender, EntityNoise {
    @Override
    public void move() {
        System.out.println("I can move random (I am a monster)");
    }

    @Override
    public void noise() {
        System.out.println("I can make noise (I am a monster)");
    }

    @Override
    public void render() {
        System.out.println("I can disappear (I am a monster)");
    }
}
