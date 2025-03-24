package Absol.PhysAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class Crunch extends PhysicalMove {

    public Crunch() {
        this.power = 80;
        this.accuracy = 1;
        this.type = Type.DARK;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(new Random().nextInt(11) == 2){
            pokemon.setMod(Stat.DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "наносит урон атакой Crunch";
    }
}
