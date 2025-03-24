package EmboarGen.SpecAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class ThunderBolt extends SpecialMove {

    public ThunderBolt() {
        this.type = Type.ELECTRIC;
        this.accuracy = 1;
        this.power = 95;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(new Random().nextInt(11) == 1){
//            pokemon.setCondition(new Effect().condition(Status.PARALYZE));
            Effect.paralyze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "наносит урон атакой Thunderbolt";
    }
}
