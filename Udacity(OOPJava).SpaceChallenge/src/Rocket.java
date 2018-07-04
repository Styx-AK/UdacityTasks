public class Rocket implements SpaceShip {
    private int cost;
    private int weight;
    private int maxWeight;

    Rocket(int cost, int weight, int maxWeight) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    public boolean launch() {
        return true;
    }
    public boolean land() {
        return true;
    }
    public boolean canCarry(Item item) {
        if (item.weight <= Rocket.weight) {
            return true;
        }
        else return false;
    }
    public void carry(Item item) {
        rocket.carry += item.weight;
    }
}
