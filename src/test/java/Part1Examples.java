import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Part1Examples {

    @Test
    void testA(){
        Assertions.assertEquals(8, Main.getCardScore("Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53"));
    }

    @Test
    void testB(){
        Assertions.assertEquals(2, Main.getCardScore("Card 2: 13 32 20 16 61 | 61 30 68 82 17 32 24 19"));
    }

    @Test
    void testC(){
        Assertions.assertEquals(2, Main.getCardScore("Card 3:  1 21 53 59 44 | 69 82 63 72 16 21 14  1"));
    }

    @Test
    void testD(){
        Assertions.assertEquals(1, Main.getCardScore("Card 4: 41 92 73 84 69 | 59 84 76 51 58  5 54 83"));
    }

    @Test
    void testE(){
        Assertions.assertEquals(0, Main.getCardScore("Card 5: 87 83 26 28 32 | 88 30 70 12 93 22 82 36"));
    }

    @Test
    void testF(){
        Assertions.assertEquals(0, Main.getCardScore("Card 6: 31 18 13 56 72 | 74 77 10 23 35 67 36 11"));
    }
}


