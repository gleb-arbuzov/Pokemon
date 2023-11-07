package myMoves;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove
{
    public ShadowClaw(double pow, double acc)
    {
        super(Type.GHOST, pow, acc);
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def)
    {
        return 1d / 8d;
    }
    @Override
    protected String describe()
    {
        return "совершает Shadow Claw";
    }
}
