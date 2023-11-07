package myMoves;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove
{
    public Psychic(double pow, double acc)
    {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p)
    {
        super.applyOppEffects(p);
        if (0.1 > Math.random()) //вероятность наложения эффекта 10%
        {
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe()
    {
        return "совершает Psychic";
    }
}
