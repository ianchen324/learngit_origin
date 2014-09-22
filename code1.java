import java.util.Scanner; 2
3 public class GuessNumber {
￼
￼4 5 6 7 8 9
10 11 12
public static void main(String[] args) {
// Generate a random number to be guessed int number = (int)(Math.random() * 101);
Scanner input = new Scanner(System.in); System.out.println("Guess a magic number between 0 and 100");
generate a number
￼int guess = -1;
￼while (guess != number) {
120 Chapter 4 enter a guess
too high? too low?
Loops
13 // Prompt the user to guess the number
14 System.out.print("\nEnter your guess: ");
15 guess = input.nextInt();
16
17 if (guess == number)
18 System.out.println("Yes, the number is " + number); 19 else if (guess > number)
20 System.out.println("Your guess is too high");
21 else
22 System.out.println("Your guess is too low");
23 } // End of loop
24 }
25 }

