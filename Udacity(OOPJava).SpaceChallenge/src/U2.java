/*Rocket cost = $120 Million
Rocket weight = 18 Tonnes
Max weight (with cargo) = 29 Tonnes
Chance of launch explosion = 4% * (cargo carried / cargo limit)
Chance of landing crash = 8% * (cargo carried / cargo limit)*/

import java.util.Random;

public class U2 extends Rocket {

    @Override
    public boolean launch() {
        if(new Random().nextInt(25)==0){ //bound value gonna changes depends on weight of cargo
            return false;
        }
        else return true;
    }

    @Override
    public boolean land() {
        if(new Random().nextInt(12)==0){ //bound value gonna changes depends on weight of cargo
            return false;
        }
        else return true;
    }
}
