package KabutopsGen.SpecAttacks;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {

//    public DreamEater() {
//        this.accuracy = 1;
//        this.power = 100;
//        this.type = Type.PSYCHIC;
//    }

    public DreamEater(Type type, double v, double v1) {
        super(type, v, v1);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (pokemon.getCondition() == Status.SLEEP) {
            super.applyOppDamage(pokemon, v);
            new Effect().stat(Stat.HP, + (int) (v / 2));
        }
    }

    @Override
    protected String describe() {
        return "наносит урон атакой Dream Eater";
    }
}
