package myMoves;

import ru.ifmo.se.pokemon.*;

public class HornLeech extends PhysicalMove
{
    private double dmg;
    public HornLeech(double pow, double acc)
    {
        super(Type.GRASS, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def,double damage)
    {
        dmg = damage;
        super.applyOppDamage(def, damage);
    }
    @Override
    protected void 	applySelfEffects(Pokemon p)
    {
        Effect e = new Effect().stat(Stat.HP, (int)Math.round(dmg*0.5));
        p.addEffect(e);
    }
    @Override
    protected String describe()
    {
        return "совершает HornLeech";
    }
    
}
