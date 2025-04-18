package Absol.PhysAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {

//    public Facade() {
//        this.power = 70;
//        this.accuracy = 1;
//        this.type = Type.NORMAL;
//    }

    public Facade(Type type, double v, double v1) {
        super(type, v, v1);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (pokemon.getCondition() == Status.BURN || pokemon.getCondition() == Status.POISON
                || pokemon.getCondition() == Status.PARALYZE) {
            this.power = power * 2;
        }
    }

    @Override
    protected String describe() {
        return "наносит урон атакой Facade";
    }
}
