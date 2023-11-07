package myPockemons;

import myMoves.Facade;
import myMoves.Slam;
import myMoves.Swagger;
import ru.ifmo.se.pokemon.*;

public class Onix extends Pokemon
{
    public Onix(String name, int level)
    {
        super(name,level);
        super.setType(Type.ROCK, Type.GROUND);
        super.setStats(35, 45, 160, 30, 45, 70);

        Swagger swagger = new Swagger(0, 85);
        Facade facade = new Facade(70, 100);
        Slam slam = new Slam(80, 75);

        super.setMove(swagger,facade,slam);
    }
}
