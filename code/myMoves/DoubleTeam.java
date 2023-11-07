package myMoves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove
{
    public DoubleTeam(double pow, double acc)
    {
        super(Type.NORMAL, pow, acc);
    }
    @Override
    public void applySelfEffects(Pokemon p)
    {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.EVASION, 1);
        p.addEffect(e);
    }
    @Override
    protected String describe()
    {
        return "совершает DoubleTeam";
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def)
    {
        return Boolean.TRUE;
    }
}
