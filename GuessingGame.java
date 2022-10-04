import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        int numberGuess, ten = 10, hundred = 100, thousand = 1000, attempts = 0, fiveAttempts = 5, fifteenAttempts = 15, thirtyFiveAttempts = 35;
        boolean flag = true;
        Random random10 = new Random();
        Scanner in = new Scanner(System.in);
        int number1 = random10.nextInt(ten);
        

        System.out.println("\n\t-- WELCOME TO NICK'S GUESSING GAME! --");

        while(flag) {
            attempts++;
            System.out.println("\n\t-- Level 1: Please enter a number to guess from 1-10 --\n");
            numberGuess = in.nextInt();

            if(attempts > fiveAttempts) {
                System.out.println("You failed. Number is: " + number1);
                flag = false;
                break;
            }

            if(numberGuess == number1) {
                System.out.println("\nCongrats! You got the number correct. On to the next: ");
                break;
            } else if(numberGuess > number1) {
                System.out.println("Incorrect. Number is too big. Try again.\n");
                continue;
            }else if(numberGuess < number1) {
                System.out.println("Incorrect. Number is too small. Try again.\n");
                continue;
            } else {
                System.out.println("Not a number!");
                continue;
            }
        }

        if(attempts < fifteenAttempts && flag == true) {        
            Random random100 = new Random();
            int number2 = random100.nextInt(hundred);
            while(flag) {
                attempts++;
                System.out.println("\n\t-- Level 2: Please enter a number to guess from 1-100 --\n");
                numberGuess = in.nextInt();

                if(attempts > fifteenAttempts) {
                    System.out.println("You failed. Number is: " + number1);
                    break;
                }
                if(numberGuess == number2) {
                    System.out.println("\nCongrats! You got the number correct. On to the next: ");
                    break;
                } else if(numberGuess > number2) {
                    System.out.println("Incorrect. Number is too big. Try again.\n");
                    continue;
                } else if(numberGuess < number2) {
                    System.out.println("Incorrect. Number is too small. Try again.\n");
                    continue;
                } else {
                    System.out.println("Not a number!");
                    continue;
                }
            }
        }

        if(attempts < thirtyFiveAttempts && flag == true) {
            Random random1000 = new Random();
            int number3 = random1000.nextInt(thousand);
            while(flag) {
                attempts++;
                System.out.println("\n\t-- Level 3: Please enter a number to guess from 1-1000 --\n");
                numberGuess = in.nextInt();

                if(attempts > thirtyFiveAttempts) {
                    System.out.println("You failed. Number is: " + number1);
                    break;
                }
                if(numberGuess == number3) {
                    System.out.println("YOU WIN!");
                    break;
                } else if(numberGuess > number3) {
                    System.out.println("Incorrect. Number is too big. Try again.\n");
                    continue;
                } else if(numberGuess < number3) {
                    System.out.println("Incorrect. Number is too small. Try again.\n");
                    continue;
                } else {
                    System.out.println("Not a number!");
                    continue;
                }
            }
        }   

        System.out.println("Total attempts: " + (attempts - 1));
        if(attempts < thirtyFiveAttempts && flag == true) {
            
            if(attempts == 3) {
                System.out.println("PERFECT SCORE");
                System.out.println("You get: A+");
            } else if(attempts > 3 && attempts < 10) {
                System.out.println("Wow, you're talented at guessing!");
                System.out.println("You get: A");
            } else if(attempts >= 10 && attempts < 20) {
                System.out.println("Not too bad!");
                System.out.println("You get: B");
            }  else if(attempts >= 20 && attempts < 35) {
                System.out.println("Needs some improvement.");
                System.out.println("You get: C");
            } else if(attempts >= 35) {
                System.out.println("You failed.");
                System.out.println("You get: F");
            } else {
                System.out.println("Huuh?");
            }
        }


    }
}