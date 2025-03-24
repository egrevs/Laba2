package KabutopsGen.StatusAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove {

    public Swagger(){
        this.type = Type.NORMAL;
        this.accuracy = 0.85;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
//        if(pokemon.getStat(Stat.ATTACK) == 6){
//            pokemon.addEffect(new Effect());
//        }
        pokemon.setMod(Stat.ATTACK, +2);
        pokemon.confuse();
    }

    @Override
    protected String describe() {
        return "применяет способность Swagger";
    }
}
