/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_quiz;

import java.util.Scanner;

/**
 *
 * @author Nisa
 */
public class Main {
    public static void main(String[] args) {
        int menu, menu1;
        float wscore, cscore, iscore;
        String nim, name;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("REGISTRATION FORM PT.JUAN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Choose Form Type : ");
        menu = input.nextInt();
        
        System.out.println("REGISTRATION FORM");
        System.out.println();
        System.out.print("Input Student Number : ");
        nim = input.next();
        System.out.print("Input Name : ");
        name = input.next();
        System.out.print("Input Writing Exam Score : ");
        wscore = input.nextInt();
        System.out.print("Input Coding Test Score : ");
        cscore = input.nextInt();
        System.out.print("Input Interview Test Score : ");
        iscore = input.nextInt();
        
        do {
            System.out.println("Menu");
            System.out.println("1. Edit");
            System.out.println("2. Output");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            menu1 = input.nextInt();

            if (menu1 == 1) {
                System.out.println("EDIT FORM");
                System.out.print("Input Writing Exam Score : ");
                wscore = input.nextInt();
                System.out.print("Input Coding Test Score : ");
                cscore = input.nextInt();
                System.out.print("Input Interview Test Score : ");
                iscore = input.nextInt();
            }

            if (menu1 == 2) {
                Android android = new Android(wscore, cscore, iscore);
                Web web = new Web(wscore, cscore, iscore);

                System.out.print("Final Score : ");
                if (menu == 1) {
                    System.out.println(android.result());
                }
                
                else if(menu == 2) {
                    System.out.println(web.result());
                }
                
                System.out.print("INFORMATION : ");
                if (menu == 1) {
                    System.out.println(android.information(android.result()));
                    if (android.information(android.result()) == "PASSED") {
                        System.out.println("Congratulation to " + name + ", you are accepted as Android");
                    }
                    else {
                        System.out.println("Sorry to " + name + ", you are not accepted as Android");
                    }
                }
                
                else if(menu == 2) {
                    System.out.println(web.information(web.result()));
                    
                    if (web.information(web.result()) == "PASSED"){
                        System.out.println("Congratulation to " + name + ", you are accepted as Web");
                    }
                    
                    else {
                        System.out.println("Sorry to " + name + ", you are not accepted as Web");
                    }
                }
            }
        } while(menu1 != 3);
    }
}
