package myMoves;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove
{
    public RockSlide(double pow, double acc)
    {
        super(Type.ROCK, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p)
    {
        super.applyOppEffects(p);
        if (0.3 > Math.random()) //вероятность наложения эффекта 30%
        {
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe()
    {
        return "совершает RockSlide";
    }
}