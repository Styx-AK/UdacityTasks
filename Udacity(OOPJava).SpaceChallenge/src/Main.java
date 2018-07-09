import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation();

        //Load a fleet of U1 rockets.
        ArrayList listOfLoadedU1RocketsPhaseOne = simulation.loadU1(1);
        ArrayList listOfLoadedU1RocketsPhaseTwo = simulation.loadU1(2);
        int budgetU1ForPhaseOne = simulation.runSimulation(listOfLoadedU1RocketsPhaseOne);
        int budgetU1ForPhaseTwo = simulation.runSimulation(listOfLoadedU1RocketsPhaseTwo);


        System.out.println("Simulation \"E.M. sets U1 rockets to Mars\" costs: " +
                "\nphase one: $" + budgetU1ForPhaseOne+" millions." +
                "\nphase two: $" + budgetU1ForPhaseTwo+" millions. " +
                "\nTotal cost for the whole mission to complete: $" + (budgetU1ForPhaseOne + budgetU1ForPhaseTwo) + " millions.");
        System.out.println();

        //Load a fleet of U2 rockets.
        ArrayList listOfLoadedU2RocketsPhaseOne = simulation.loadU2(1);
        ArrayList listOfLoadedU2RocketsPhaseTwo = simulation.loadU2(2);
        int budgetU2ForPhaseOne = simulation.runSimulation(listOfLoadedU2RocketsPhaseOne);
        int budgetU2ForPhaseTwo = simulation.runSimulation(listOfLoadedU2RocketsPhaseTwo);

        System.out.println("Simulation \"E.M. sets U2 rockets to Mars\" costs: " +
                "\nphase one: $" + budgetU2ForPhaseOne+" millions." +
                "\nphase two: $" + budgetU2ForPhaseTwo+" millions. " +
                "\nTotal cost for the whole mission to complete: $" + (budgetU2ForPhaseOne + budgetU2ForPhaseTwo) + " millions.");
    }
}
