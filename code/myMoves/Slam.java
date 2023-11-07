package myMoves;

import ru.ifmo.se.pokemon.*;

public class Slam extends PhysicalMove
{
    public Slam(double pow, double acc)
    {
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected String describe()
    {
        return "совершает Slam";
    }
}
