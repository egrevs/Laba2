package EmboarGen.SpecAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderBolt extends SpecialMove {

//    public ThunderBolt() {
//        this.type = Type.ELECTRIC;
//        this.accuracy = 1;
//        this.power = 95;
//    }


    public ThunderBolt(Type type, double v, double v1) {
        super(type, v, v1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        if(new Effect().chance(0.1).success()){
//            pokemon.setCondition(new Effect().condition(Status.PARALYZE));
            Effect.paralyze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "наносит урон атакой Thunderbolt";
    }
}
