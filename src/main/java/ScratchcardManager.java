
import java.util.Arrays;

public class ScratchcardManager {

    private Integer[] cardsList;

    public ScratchcardManager(Integer cardsListLength) {
        this.cardsList = new Integer[cardsListLength];
        Arrays.fill(this.cardsList, 1);
    }

    public int getNumCards(Integer cardIndex){
        return cardsList[cardIndex];
    }

    public void addCards(Integer wCardIndex, Integer numWins){
        for (int i = 0; i < numWins; i++) {
            cardsList[wCardIndex + i + 1] += getNumCards(wCardIndex);
        }
    }

    public int getTotalCards(){
        Integer rollingSum = 0;
        for (Integer cardNum: cardsList) {
            rollingSum += cardNum;
        }
        return rollingSum;
    }
}
