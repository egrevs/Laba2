package Absol.SpecialAttacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Snarl extends SpecialMove {

    public Snarl() {
        this.power = 55;
        this.accuracy = 0.95;
        this.type = Type.DARK;
    }

    @Override
    protected String describe() {
        return "наносит урон атакой Snarl";
    }
}
