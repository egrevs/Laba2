package EmboarGen.PhysAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class AquaTail extends PhysicalMove {

//    public AquaTail() {
//        this.type = Type.WATER;
//        this.power = 90;
//        this.accuracy = 0.9;
//    }


    public AquaTail(Type type, double v, double v1) {
        super(type, v, v1);
    }

    @Override
    protected String describe() {
        return "наносит урон атакой Aqua Tail";
    }
}
