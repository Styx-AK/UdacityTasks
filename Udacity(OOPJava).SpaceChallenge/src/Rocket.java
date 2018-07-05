import java.util.Random;

public class Rocket implements SpaceShip {
    //Fields:
    int rocketCost;
    int rocketWeight;
    int rocketMaxWeight;
    int currentWeightOfRocket;
    int cargoCarried;
    int cargoLimit;
    double chanceOfLaunchExplosion;
    double chanceOfLandingCrash;

    // Methods:
    public boolean launch() {
        return true;
    }
    public boolean land() {
        return true;
    }

    public boolean canCarry(Item specifiedItem) {
        return (this.currentWeightOfRocket + specifiedItem.getWeight() <= rocketMaxWeight);
    }
    public void carry(Item specifiedItem) {
        this.currentWeightOfRocket += specifiedItem.getWeight();
        this.cargoCarried = this.currentWeightOfRocket - this.rocketWeight;
    }
}
