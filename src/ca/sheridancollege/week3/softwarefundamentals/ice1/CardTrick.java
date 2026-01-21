
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author ----
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i]=c;
//c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a card value(1-13):");
        int userValue = input.nextInt();
        System.out.print("ENter a suit (0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs):");
        int suitIndex = input.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[suitIndex]);
        

        // and search magicHand here
        boolean found= false;
        for (Card c : magicHand){
            if (c.getValue()== userCard.getValue()&& c.getSuit().equals(userCard.getSuit())){
                found = true;
                break;
            }
        }
        //Then report the result here
        if (found){
            System.out.println("Hoorayy!! Your card is in magic hand.");
        }else{
            System.out.println("Its not!! Try next time.");
        }
        input.close();
    }
    
}
