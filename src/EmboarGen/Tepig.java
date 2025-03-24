package EmboarGen;

import KabutopsGen.StatusAttacks.Confide;
import KabutopsGen.StatusAttacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tepig extends Pokemon {

    public Tepig(String s, int i) {
        super(s, i);
        this.setType(Type.FIRE);
        this.setStats(65, 63, 45, 45, 45, 45);
        addMove(new Swagger());
        addMove(new Confide());
    }
}
