package myPockemons;

import myMoves.*;
import ru.ifmo.se.pokemon.*;

public class Xerneas extends Pokemon
{
    public Xerneas(String name, int level)
    {
        super(name, level);
        super.setType(Type.FAIRY);
        super.setStats(126, 131, 95, 131, 98, 99);
        HornLeech hornLeech = new HornLeech(75, 100);
        Psychic psychic = new Psychic(90, 100);
        TakeDown takeDown = new TakeDown(90, 85);
        Facade facade = new Facade(70, 100);
        super.setMove(hornLeech,psychic,takeDown,facade);

    }
}
