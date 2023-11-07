package myMoves;

import ru.ifmo.se.pokemon.*;

public class FireFang extends PhysicalMove
{
    public FireFang(double pow, double acc)
    {
        super(Type.FIRE, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p)
    {
        super.applyOppEffects(p);
        if (0.1 > Math.random()) //вероятность наложения эффекта 10%
        {
            Effect.flinch(p);
        }

        if (0.1 > Math.random()) //вероятность наложения эффекта 10%
        {
            Effect.burn(p);
        }
    }

    @Override
    protected String describe()
    {
        return "совершает Fire Fang";
    }
}
