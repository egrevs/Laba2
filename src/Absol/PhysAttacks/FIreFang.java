package Absol.PhysAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class FIreFang extends PhysicalMove {

    public FIreFang() {
        this.power = 65;
        this.accuracy = 0.95;
        this.type = Type.FIRE;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Random random = new Random();
        if(random.nextInt(11) == 1){
//            pokemon.setCondition(new Effect().condition(Status.BURN));
            Effect.burn(pokemon);
        }
        if(random.nextInt(11) == 1){
//            pokemon.setCondition(new Effect().condition(Status.PARALYZE));
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "наносит урон атакой FireFang";
    }
}
