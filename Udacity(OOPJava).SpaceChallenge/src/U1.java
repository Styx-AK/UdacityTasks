/*Rocket cost = $100 Million
Rocket weight = 10 Tonnes
Max weight (with cargo) = 18 Tonnes
Chance of launch explosion = 5% * (cargo carried / cargo limit)
Chance of landing crash = 1% * (cargo carried / cargo limit)*/

import java.util.Random;

public class U1 extends Rocket {
    Rocket rocket = new Rocket(120, 18, 29);

    @Override
    public boolean launch() {
        if((new Random().nextInt(20)==0)*(cargo carried / cargo limit)){ //bound value gonna changes depends on weight of cargo
            return false;
        }
        else return true;
    }

    @Override
    public boolean land() {
        if(new Random().nextInt(100)==0){ //bound value gonna changes depends on weight of cargo
            return false;
        }
        else return true;
    }

}
