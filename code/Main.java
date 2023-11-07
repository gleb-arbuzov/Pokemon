import ru.ifmo.se.pokemon.*;
import myPockemons.*;

public class Main {
    public static void main(String[] args)
    {
        Battle b = new Battle();
        var p1 = new Slakoth("Slako", 1);
        var p2 = new Xerneas("Xer", 1);
        var p3 = new Onix("On",1);
        var p4 = new Slaking("Slaky",1);
        var p5 = new Steelix("Steel", 1);
        var p6 = new Vigoroth("Vir", 1);

        b.addAlly(p2);
        b.addAlly(p5);
        b.addAlly(p4);

        b.addFoe(p1);
        b.addFoe(p3);
        b.addFoe(p6);

        b.go();
    }
    }
