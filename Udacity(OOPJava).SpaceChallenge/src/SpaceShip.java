public interface SpaceShip {

    //Methods:
    boolean launch();
    boolean land();
    boolean canCarry(Item specifiedItem);
    void carry(Item specifiedItem);
}
