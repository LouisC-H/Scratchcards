import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Integer rollingSum = 0;
        try {
            File myObj = new File("src/main/resources/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String wholeData = myReader.nextLine();

                rollingSum += getCardScore(wholeData);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.print(rollingSum);
    }

    public static Integer getCardScore(String wholeData) {
        Scratchcard scratchcard = new Scratchcard(wholeData);
        return scratchcard.getScore();
    }
}
