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
        addMove(new Snarl());
        addMove(new Facade());
        addMove(new FIreFang());
        addMove(new Crunch());
    }
}
