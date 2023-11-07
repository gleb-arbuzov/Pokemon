package myPockemons;

import ru.ifmo.se.pokemon.*;
import myMoves.*;

public class Slakoth extends Pokemon
{
    public Slakoth(String name, int level)
    {
        super(name,level);
        super.setType(Type.NORMAL);
        super.setStats(60, 60, 60, 35, 35, 30);
        RockSlide rockSlide = new RockSlide(75, 90);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        super.setMove(doubleTeam,rockSlide);
    }
}