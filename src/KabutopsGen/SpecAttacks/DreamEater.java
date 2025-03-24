package KabutopsGen.SpecAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove {

    public DreamEater() {
        this.accuracy = 1;
        this.power = 100;
        this.type = Type.PSYCHIC;
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (pokemon.getCondition() == Status.SLEEP) {
            super.applyOppDamage(pokemon, v);
        }
    }

    @Override
    protected String describe() {
        return "наносит урон атакой Dream Eater";
    }
}
