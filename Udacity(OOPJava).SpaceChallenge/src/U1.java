/*Rocket cost = $100 Million
Rocket weight = 10 Tonnes
Max weight (with cargo) = 18 Tonnes
Chance of launch explosion = 5% * (cargo carried / cargo limit)
Chance of landing crash = 1% * (cargo carried / cargo limit)*/

public class U1 extends Rocket {
    //Constructor:
    U1() {
        this.rocketCost = 100;
        this.rocketWeight = 10000;
        this.rocketMaxWeight = 18000;
        this.currentWeightOfRocket = this.rocketWeight;
        this.cargoLimit = this.rocketMaxWeight - this.rocketWeight;

    }

    //Methods:
    @Override
    public boolean launch() {
        double randomNumber = Math.random();
        this.chanceOfLaunchExplosion = 0.05 * ((double)this.cargoCarried / (double)this.cargoLimit);
        return !(this.chanceOfLaunchExplosion >= randomNumber);
    }


    @Override
    public boolean land() {
        double randomNumber = Math.random();
        this.chanceOfLandingCrash = 0.01 * ((double)this.cargoCarried / (double)this.cargoLimit);
        return !(this.chanceOfLandingCrash >= randomNumber);
    }
}
