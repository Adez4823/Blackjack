import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class App {
    public static void main(String[] args) throws Exception {
       
    }
    ArrayList<Card> playerHand = new ArrayList<>(); // player and dealers' hand, their current cards
    ArrayList<Card> dealerHand = new ArrayList<>();


    static ArrayList<Integer> cardVals = new ArrayList<>(Arrays.asList( // ArrayList with all card vals
    2, 2, 2, 2,
    3, 3, 3, 3,
    4, 4, 4, 4,
    5, 5, 5, 5,
    6, 6, 6, 6,
    7, 7, 7, 7,
    8, 8, 8, 8,
    9, 9, 9, 9,
    10, 10, 10, 10,
    10, 10, 10, 10,
    10, 10, 10, 10,
    11, 11, 11, 11
    ));


    public static int totalHandVal(ArrayList<Card> hand) {
        int sum = 0;
        for (int i = 0; i < hand.size(); i++) { // loops through the player/dealer's ArrayList of type Card and adds the value of all the cards to sum
            sum += hand.get(i).getCardVal();
        }
        return sum;
    }
   


   


}

