package myPockemons;

import myMoves.FireFang;
import ru.ifmo.se.pokemon.*;

public class Steelix extends Onix
{
    public Steelix(String name, int level)
    {
        super(name,level);
        super.setType(Type.STEEL,Type.GROUND);
        super.setStats(75, 85, 200, 55, 65, 30);

        FireFang fireFang = new FireFang(65, 95);

        super.addMove(fireFang);
    }
}