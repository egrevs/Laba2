package Absol.PhysAttacks;

import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove {

//    public Crunch() {
//        this.power = 80;
//        this.accuracy = 1;
//        this.type = Type.DARK;
//    }

    public Crunch(Type type, double v, double v1) {
        super(type, v, v1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        if(new Effect().chance(0.2).success()){
            pokemon.setMod(Stat.DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "наносит урон атакой Crunch";
    }
}
