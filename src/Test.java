import Absol.Absol;
import EmboarGen.Emboar;
import EmboarGen.Pignite;
import EmboarGen.Tepig;
import KabutopsGen.Kabuto;
import KabutopsGen.Kabutops;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Test {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Absol("Абсол", 1);
        Pokemon p2 = new Kabuto("Кабуто", 1);
        Pokemon p3 = new Kabutops("Кабутопс", 1);
        Pokemon p4 = new Tepig("Тэпиг", 1);
        Pokemon p5 = new Pignite("Пигнайт",1);
        Pokemon p6 = new Emboar("Эмбер", 1);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
}