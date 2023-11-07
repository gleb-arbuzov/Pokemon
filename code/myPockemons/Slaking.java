package myPockemons;

import myMoves.ShadowClaw;
import ru.ifmo.se.pokemon.*;

public class Slaking extends Vigoroth
{
    public Slaking(String name, int level)
    {
        super(name,level);
        super.setType(Type.NORMAL);
        super.setStats(150, 160, 100, 95, 65, 100);

        ShadowClaw m = new ShadowClaw(70, 100);
        super.addMove(m);
    }
}
