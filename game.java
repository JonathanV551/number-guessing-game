import java.util.*;
public class game
{
    private int number;
    private int guess;
    private int numGuess;
    public game()
    {
        number = (int)(Math.random()*100)+1;
        guess = 0;
        numGuess = 0;
    }
    public void takeGuess()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        guess = sc.nextInt();
        numGuess++;
    }
    public void evaluateGuess()
    {
        if(guess == number)
        {
        System.out.println("Congratulations! You have guessed the number in "+numGuess+" guesses.");
        }
        else if(guess < number)
        {
        System.out.println("The number is greater than your guess.");
        }
        else
        {
        System.out.println("The number is less than your guess.");
        }
    }
    public static void main(String[] args)
    {
        game g = new game();
        while(true)
        {
        g.takeGuess();
        g.evaluateGuess();
        if(g.guess == g.number)
        {
            break;
        }
        }
    }
}