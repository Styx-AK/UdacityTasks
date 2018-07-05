/*Rocket cost = $120 Million
Rocket weight = 18 Tonnes
Max weight (with cargo) = 29 Tonnes
Chance of launch explosion = 4% * (cargo carried / cargo limit)
Chance of landing crash = 8% * (cargo carried / cargo limit)*/

import java.util.Random;

public class U2 extends Rocket {
    //Constructor:
    U2() {
        this.rocketCost = 120;
        this.rocketWeight = 18000;
        this.rocketMaxWeight = 29000;
        this.currentWeightOfRocket = this.rocketWeight;
        this.cargoLimit = this.rocketMaxWeight - this.rocketWeight;

    }

    //Methods:
    @Override
    public boolean launch() {
        double randomNumber = Math.random();
        this.chanceOfLaunchExplosion = 0.04 * ((double)this.cargoCarried / (double)this.cargoLimit);
        return !(this.chanceOfLaunchExplosion >= randomNumber);
    }


    @Override
    public boolean land() {
        double randomNumber = Math.random();
        this.chanceOfLandingCrash = 0.08 * ((double)this.cargoCarried / (double)this.cargoLimit);
        return !(this.chanceOfLandingCrash >= randomNumber);
    }
}
