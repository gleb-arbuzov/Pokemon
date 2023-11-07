package myMoves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove
{
    public Facade(double pow, double acc)
    {
        super(Type.ROCK, pow, acc);
    }
    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def)
    {
        if (Status.POISON == def.getCondition())
        {
            accuracy = 140;
            return super.calcCriticalHit(att,def);
        }
        else if (Status.BURN == def.getCondition())
        {
            accuracy = 140;
            return super.calcCriticalHit(att,def);
        }
        else if (Status.PARALYZE == def.getCondition())
        {
            accuracy = 140;
            return super.calcCriticalHit(att,def);
        }
        else
        {
            accuracy = 70;
            return super.calcCriticalHit(att,def);
        }
    }
    @Override
    protected double calcBaseDamage(Pokemon att,Pokemon def)
    {
        if (Status.POISON == def.getCondition())
        {
            accuracy = 140;
            return super.calcCriticalHit(att,def);
        }
        else if (Status.BURN == def.getCondition())
        {
            accuracy = 140;
            return super.calcCriticalHit(att,def);
        }
        else if (Status.PARALYZE == def.getCondition())
        {
            accuracy = 140;
            return super.calcCriticalHit(att,def);
        }
        else
        {
            accuracy = 70;
            return super.calcCriticalHit(att,def);
        }
    }
    @Override
    protected String describe()
    {
        return "совершает Facade";
    }
}