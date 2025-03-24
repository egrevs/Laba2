package KabutopsGen;

import KabutopsGen.StatusAttacks.Confide;
import KabutopsGen.StatusAttacks.DoubleTeam;
import KabutopsGen.StatusAttacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kabuto extends Pokemon {

    public Kabuto(String s, int i) {
        super(s, i);
        this.setStats(30, 80, 90, 55, 45, 55);
        this.setType(Type.ROCK, Type.WATER);
        addMove(new DoubleTeam());
        addMove(new Swagger());
        addMove(new Confide());
    }
}
