package test;

import base.Beverage;
import bevaregs.DarkRoast;
import bevaregs.Decaf;
import bevaregs.Espresso;
import bevaregs.HouseBlend;
import coffee_size.Size;
import condiments.Mocha;
import condiments.Soy;
import condiments.Whip;

public class StarbuzzCoffe {

    public static void main(String[] argus){
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        System.out.println(beverage2.cost());
        Beverage beverage2WithMocha = new Mocha(beverage2);
        Beverage beverage2WithMocha2 = new Mocha(beverage2WithMocha);
        Beverage beverage2WithMocha2AndWhip = new Whip(beverage2WithMocha2);
        System.out.println(beverage2WithMocha2AndWhip.getDescription() + " Cost: $"+ beverage2WithMocha2AndWhip.cost());

        Beverage beverage3 = new HouseBlend();
        Beverage beverage3WithSoy = new Soy(beverage3);
        Beverage beverage3WithSoyAndMocha = new Mocha(beverage3WithSoy);
        Beverage beverage3WithSoyAndMochaAndWhip = new Whip(beverage3WithSoyAndMocha);
        System.out.println(beverage3WithSoyAndMochaAndWhip.getDescription() + " Cost: $"+ beverage3WithSoyAndMochaAndWhip.cost());


        Beverage beverage4 = new Decaf();
        Beverage beverage4WithSoy = new Soy(beverage4);
        System.out.println(beverage4WithSoy.getDescription() + " Cost: $"+ beverage4WithSoy.cost());

        beverage4.setSize(Size.VENTI);
        Beverage beverage4WithSoyWithVenti = new Soy(beverage4);
        System.out.println(beverage4WithSoyWithVenti.getDescription() + " Cost: $"+ beverage4WithSoyWithVenti.cost());

    }
}
