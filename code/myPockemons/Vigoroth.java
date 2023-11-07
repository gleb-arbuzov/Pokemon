package myPockemons;

import myMoves.Slash;
import ru.ifmo.se.pokemon.*;

public class Vigoroth extends Slakoth
{
    public Vigoroth(String name, int level)
    {
        super(name,level);
        super.setType(Type.NORMAL);
        super.setStats(80, 80, 80, 55, 55, 90);

        Slash slash = new Slash(70, 100);
        this.addMove(slash);
    }
}