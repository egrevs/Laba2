package EmboarGen;

import EmboarGen.SpecAttacks.ThunderBolt;
import ru.ifmo.se.pokemon.Type;

public class Pignite extends Tepig {

    public Pignite(String s, int i) {
        super(s, i);
        this.setType(Type.FIGHTING, Type.FIRE);
        this.setStats(90, 93, 55, 70, 55, 55);
        addMove(new ThunderBolt(Type.ELECTRIC, 95, 1));
    }
}
