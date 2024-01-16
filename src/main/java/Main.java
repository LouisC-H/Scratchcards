import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    // Part 1
//    public static void main(String[] args)
//    {
//        Integer rollingSum = 0;
//        try {
//            File myObj = new File("src/main/resources/input.txt");
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String wholeData = myReader.nextLine();
//
//                rollingSum += getCardScore(wholeData);
//
//
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        System.out.print(rollingSum);
//    }

    public static Integer getCardScore(String wholeData) {
        Scratchcard scratchcard = new Scratchcard(wholeData, true);
        return scratchcard.getScore();
    }

    // Part 2
    public static void main(String[] args)
    {
        File inputFile = new File("src/main/resources/input.txt");

        ScratchcardManager scratchcardManager = initialiseScratchcardManager(inputFile);

        iterateCards(scratchcardManager, inputFile);

        System.out.println(scratchcardManager.getTotalCards());
    }

    private static ScratchcardManager initialiseScratchcardManager(File inputFile){

        int rowCount = 0;

        try {
            Scanner lineCounter = new Scanner(inputFile);

            while (lineCounter.hasNextLine()) {
                String wholeData = lineCounter.nextLine();

                rowCount ++;
            }
            lineCounter.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return new ScratchcardManager(rowCount);
    }

    private static void iterateCards(ScratchcardManager scratchcardManager, File inputFile) {
        int rowCount = 0;

        try {
            Scanner myReader = new Scanner(inputFile);
            while (myReader.hasNextLine()) {
                String wholeData = myReader.nextLine();

                getCardCopies(scratchcardManager, wholeData, rowCount);
                rowCount ++;

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void getCardCopies(ScratchcardManager scratchcardManager, String wholeData, int rowCount) {
        int numCopies = scratchcardManager.getNumCards(rowCount);
        Scratchcard scratchcard = new Scratchcard(wholeData, false);
        scratchcardManager.addCards(rowCount, scratchcard.getWins());
    }
}
