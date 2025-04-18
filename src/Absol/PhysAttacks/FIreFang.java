package Absol.PhysAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FIreFang extends PhysicalMove {

//    public FIreFang() {
//        this.power = 65;
//        this.accuracy = 0.95;
//        this.type = Type.FIRE;
//    }


    public FIreFang(Type type, double v, double v1) {
        super(type, v, v1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        if(new Effect().chance(0.1).success()){
            Effect.flinch(pokemon);
        }

        if(new Effect().chance(0.1).success()){
            Effect.burn(pokemon);
        }

//        Random random = new Random();
//        if(random.nextInt(11) == 1){
//            pokemon.setCondition(new Effect().condition(Status.BURN));
//
//            Effect.burn(pokemon);
//        }
//        if(random.nextInt(11) == 1){
//            pokemon.setCondition(new Effect().condition(Status.PARALYZE));
//            Effect.flinch(pokemon);
//        }
    }

    @Override
    protected String describe() {
        return "наносит урон атакой FireFang";
    }
}
