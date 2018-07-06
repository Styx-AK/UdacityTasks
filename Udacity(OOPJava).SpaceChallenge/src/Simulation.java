import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    //Methods:
    private ArrayList<Item> loadItem(String filePath) {
        ArrayList<Item> listOfItems = new ArrayList<>();
        File file = new File(filePath);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException exceptionMessage) {
            System.out.println("No file found in the path: " + exceptionMessage.toString());
        }
        while (fileScanner.hasNextLine()) {
            Item anItem = new Item();
            String line = fileScanner.nextLine();
            int indexOfEqualsSign = line.indexOf('=');
            anItem.setName(line.substring(0, indexOfEqualsSign));
            anItem.setWeight(Integer.parseInt(line.substring(indexOfEqualsSign+1)));
            listOfItems.add(anItem);
        }
        fileScanner.close();
        return listOfItems;
    }


    public ArrayList<U1> loadU1(int phase) {
        String phaseOfTheMission = "Phase-1.txt";
        if (phase == 2) {
            phaseOfTheMission = "Phase-2.txt";
        }
        ArrayList<U1> listOfU1Rockets = new ArrayList<>();
        ArrayList<Item> itemsToLoad = new ArrayList<>();
        itemsToLoad = this.loadItem(phaseOfTheMission);
        U1 newU1Rocket = new U1();
        while (itemsToLoad.size() > 0) {
            Item anItem = itemsToLoad.get(0);
            if (newU1Rocket.canCarry(anItem)) {
                newU1Rocket.carry(anItem);
                itemsToLoad.remove(0);
            } else {
                listOfU1Rockets.add(newU1Rocket);
                newU1Rocket = new U1();
            }
        }
        return listOfU1Rockets;
    }

    // ------------------------
    public ArrayList<U2> loadU2(ArrayList<Item>) {
        //implementation of logic
        ArrayList<U2> listRockets = new ArrayList<>();
        return listRockets;
    }

    public int RunSimulation(ArrayList) {
        //implementation of logic
        int overallCost=0;
        return overallCost;
    }
}
