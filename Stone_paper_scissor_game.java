package com.company;
import java.util.Random;
import java.util.Scanner;

public class Stone_paper_scissor_game {

    public static void main(String[] args) {
	// write your code here
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        byte chance = 0;
        byte com_score = 0;
        byte user_score = 0;
        while(chance<4){
            System.out.println("Enter 1 for stone, 2 for paper and 3 for scissor");
            byte user_choice = sc.nextByte();
            byte comp_choice = (byte) r.nextInt(4);
            if(user_choice==1 && comp_choice==1 || user_choice==2 && comp_choice==2 ||
                    user_choice==3 && comp_choice==3)
            {
                System.out.println("###It is a Draw###");
                chance += 1;
            }
            else if(user_choice == 1 && comp_choice == 2 || user_choice==2 && comp_choice==3 ||
                    user_choice==3 && comp_choice==1)
            {
                System.out.println("Computer won this round");
                chance += 1;
                com_score = (byte) (com_score + 1);
            }
            else if(user_choice==2 && comp_choice==1 || user_choice==3 && comp_choice==2 ||
                    user_choice==1 && comp_choice==3)
            {
                System.out.println("User won this round");
                chance += 1;
                user_score += 1;
            }
        }
        if(user_score>com_score) {
            System.out.println("User won the game by " + user_score + "-" + com_score);
        }
        else if(com_score>user_score) {
            System.out.println("Computer won the game by " + user_score + "-" + com_score);
        }
        else if(user_score==com_score) {
            System.out.println("It is a draw with " + user_score + "-" + com_score);
        }
    }
}
