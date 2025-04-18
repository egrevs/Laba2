package Absol;

import Absol.PhysAttacks.Crunch;
import Absol.PhysAttacks.FIreFang;
import Absol.PhysAttacks.Facade;
import Absol.SpecialAttacks.Snarl;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Absol extends Pokemon {


    public Absol(String s, int i) {
        super(s, i);
        this.setStats(65, 130, 60, 75, 60, 75);
        this.setType(Type.DARK);
        addMove(new Snarl(Type.DARK, 55, 0.95));
        addMove(new Facade(Type.NORMAL, 70, 1));
        addMove(new FIreFang(Type.FIRE, 65, 0.95));
        addMove(new Crunch(Type.DARK, 80, 1));
    }
}
