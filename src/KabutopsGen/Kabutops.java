package KabutopsGen;

import KabutopsGen.SpecAttacks.DreamEater;

public class Kabutops extends Kabuto {

    public Kabutops(String s, int i) {
        super(s, i);
        this.setStats(60, 115, 105, 65, 70, 80);
        addMove(new DreamEater());
    }
}
