import java.util.ArrayList;

public class Scratchcard {

    private ArrayList<Integer> winningList;
    private ArrayList<Integer> myNumList;
    private int score = 0;
    private int wins = 0;

    // Set numCopies to 0 to do part 1 - points per card
    public Scratchcard(String cardInput, boolean isScore) {
        String[] headerAndData = cardInput.split(":");
        String[] winningAndMyNums = headerAndData[1].split("\\|");
        this.winningList = extractNumbers(winningAndMyNums[0]);
        this.myNumList = extractNumbers(winningAndMyNums[1]);
        if (isScore){calculateScore();}
        else {calculateWins();}
    }

    private ArrayList<Integer> extractNumbers(String numList){
        ArrayList<Integer> outputArray = new ArrayList<>();
        String[] splitList = numList.split(" ");
        for (String number: splitList) {
            try {
                outputArray.add(Integer.parseInt(number));
            } catch (NumberFormatException e) {}
        }
        return outputArray;
    }


    private void calculateScore() {
        for (Integer winningNum: winningList) {
            if (myNumList.contains(winningNum)){
                incrementScore();
            }
        }
    }

    public int incrementScore(){
        if (score == 0){
            this.score = 1;
        } else {
            this.score *= 2;
        }
        return score;
    }

    public int getScore() {
        return score;
    }

    private void calculateWins() {
        for (Integer winningNum: winningList) {
            if (myNumList.contains(winningNum)){
                this.wins ++;
            }
        }
    }

    public int getWins() {
        return wins;
    }

}
