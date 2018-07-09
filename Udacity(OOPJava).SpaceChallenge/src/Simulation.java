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

    public ArrayList<U2> loadU2(int phase) {
        String phaseOfTheMission = "Phase-1.txt";
        if (phase == 2) {
            phaseOfTheMission = "Phase-2.txt";
        }
        ArrayList<U2> listOfU2Rockets = new ArrayList<>();
        ArrayList<Item> itemsToLoad = new ArrayList<>();
        itemsToLoad = this.loadItem(phaseOfTheMission);
        U2 newU2Rocket = new U2();
        while (itemsToLoad.size() > 0) {
            Item anItem = itemsToLoad.get(0);
            if(newU2Rocket.canCarry(anItem)) {
                newU2Rocket.carry(anItem);
                itemsToLoad.remove(0);
            } else {
                listOfU2Rockets.add(newU2Rocket);
                newU2Rocket = new U2();
            }
        }
        return listOfU2Rockets;
    }

    public int runSimulation(ArrayList<Rocket> listOfRockets) {
        int totalBudget = 0;
        for(int i = 0; i < listOfRockets.size(); i++) {
            Rocket currentRocket = new Rocket();
            currentRocket = listOfRockets.get(i);

            boolean launchResult = currentRocket.launch();
            while (!launchResult) {
                totalBudget += currentRocket.rocketCost;
                launchResult = currentRocket.launch();
            }
            totalBudget += currentRocket.rocketCost;

            boolean landResult = currentRocket.land();
            while (!landResult) {
                totalBudget += currentRocket.rocketCost;
                landResult = currentRocket.land();
            }
            totalBudget += currentRocket.rocketCost;
        }
        return totalBudget;
    }
}
