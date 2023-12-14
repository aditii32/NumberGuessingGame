import java.util.*;
import java.util.Random;

public class Task2
{
    public static void main(String[] args)
    {
        Random rand= new Random();
        Scanner sc=new Scanner(System.in);

        int randomNumber = rand.nextInt(100)+ 1;
        //System.out.println("Random Number is "+ randomNumber);

        int tryCount = 0;
       while(true){ 
        System.out.println("Enter your guess (1-100):");
        
        int playerGuess = sc.nextInt();
        tryCount++;

        if(playerGuess == randomNumber){
            System.out.println("Correct! You Win");
            System.out.println("It took you"+ tryCount + "tries");
            break;
        }
        else if(randomNumber > playerGuess){
            System.out.println("Nope! The Numer is Higher.Guess Again.");
        }
        else{
            System.out.println("Nope! The Number is Lower.Guess Again");
        }
    }
  }
}
