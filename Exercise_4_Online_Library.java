package com.company;
import java.util.Scanner;

class Library{
    String[] issuebook = new String[100];
    String[] availablebook = new String[100];
    int books_present = 0;
    int issuedcount = 0;
    Scanner sc = new Scanner(System.in);

    public void addBook(){
        System.out.println("Add the book...");
        String[] str1 = sc.nextLine().split("-");
        for (String s : str1) {
            availablebook[books_present] = s;
            books_present++;
        }

    }

    public void issueBook(){
        System.out.println("Which book you want to issue?");
        String book_name = sc.next();
        for (String s : availablebook) {
            if (book_name.equals(s)) {
                System.out.println("This is your book!");
                issuebook[issuedcount] = book_name;
                issuedcount++;
                for(int i =0;i<availablebook.length;i++){
                    if(availablebook[i].equals(book_name)){
                        availablebook[i] = null;
                        books_present--;
                    }
                }
                return;
            }
                System.out.println("Your book is not present.");
        }
    }

    public void returnBook(){
        System.out.println("Enter the book you want to return");
        String book_return_name = sc.next();
        availablebook[books_present] = book_return_name;
        System.out.println("Returned successfully");
        for(int i =0; i< issuebook.length;i++){
            if(issuebook[i].equals(book_return_name)){
                issuebook[i] = null;
                issuedcount--;
            }
        }

    }

    public void showAvailableBooks(){
        for (String s : availablebook) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}

public class Exercise_4_Online_Library {
    public static void main(String[] args) {
	// write your code here
        Library lb = new Library();
        Scanner sc1 = new Scanner(System.in);
        lb.addBook();
        System.out.println("Enter 1 for see available books\n2 for return a book\n3 to issue book\n4 to add book\n");
        int user_choice = sc1.nextInt();
        if(user_choice == 1){
            lb.showAvailableBooks();
        }
        else if(user_choice == 2){
            lb.returnBook();
        }
        else if(user_choice == 3){
            lb.issueBook();
        }
        else if(user_choice == 4){
            lb.addBook();
        }
    }
}
