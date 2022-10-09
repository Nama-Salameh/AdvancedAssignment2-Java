package Assignment.game;

import java.util.ArrayList;
import java.util.List;

public class Entity {
    public List<Types> getTypes() {
        return types;
    }

    private List<Types> types;

    public Entity(){
        types = new ArrayList<>();
    }

}
