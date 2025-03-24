package EmboarGen;

import EmboarGen.PhysAttacks.AquaTail;

public class Emboar extends Pignite {

    public Emboar(String s, int i) {
        super(s, i);
        this.setStats(110, 123, 65, 100, 65, 65);
        addMove(new AquaTail());
    }
}
