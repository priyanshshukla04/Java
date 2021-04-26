package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {
    public int user_num;
    public int ran_num;
    public int score = 0;
    public int chance = 5;
    public int guess_left = chance;

    public Game() {
        Random rand = new Random();
        ran_num = rand.nextInt(50);
    }


    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 50...");
        user_num = sc.nextInt();
    }

    public void isCorrectNumber() {
        while (chance > 0) {
            takeUserInput();
            if (user_num == ran_num) {
                score += 1;
                System.out.println("Yeah! You Won and your score is "+score);
                break;
            }else if(user_num > ran_num){
                System.out.println("Please enter a smaller number...");
                guess_left--;
                chance--;
                score += 1;
                System.out.println("Chances left "+guess_left);
            }else {
                System.out.println("Please enter a greater number...");
                guess_left--;
                chance--;
                score += 1;
                System.out.println("Chances left "+guess_left);
            }
            if(guess_left == 0){
                System.out.println("Sorry You lost");
                System.out.println("The correct answer was "+ran_num);
                break;
            }
        }
    }
}

public class Guess_the_number {

    public static void main(String[] args) {
	// write your code here
        Game obj = new Game();
        System.out.println("Enter Y or y to play...");
        Scanner sc1 = new Scanner(System.in);
        String user_choice = sc1.nextLine();
        if(user_choice.equals("Y") || user_choice.equals("y")){
            obj.isCorrectNumber();
        }
    }
}

