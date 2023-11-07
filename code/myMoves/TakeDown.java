package myMoves;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove
{
    public TakeDown(double pow, double acc)
    {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def,double damage)
    {
        damage = 0.25*damage;
        super.applyOppDamage(def, damage);
    }
    @Override
    protected String describe()
    {
        return "совершает Take Down";
    }
}
