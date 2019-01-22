package com.pe.l1.designPatterns;

import com.pe.l1.designPatterns.mediator.Mediator;
import com.pe.l1.designPatterns.singleton.Singleton;
import com.pe.l1.designPatterns.template.Template;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class DesignPattMenu {

    public static void subMenu(){
        int selection;
        Scanner input = new Scanner(System.in);

        display: while(true) {
            System.out.println("-- Design Patterns --");
            System.out.println(
                    "Select an option: \n" +
                            "  1) Singleton\n" +
                            "  2) Template\n" +
                            "  3) Mediator\n" +
                            "  4) Back to Main Menu"
            );

            try {
                selection = input.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("Please enter a numerical value.");
                selection = 9999;
            }
            input.nextLine();

            switch (selection) {
                case 1:
                    Singleton.intro();
                    break;
                case 2:
                    Template.intro();
                    break;
                case 3:
                    Mediator.intro();
                    break;
                case 4:
                    System.out.println("Going back to main menu.\n");
                    break display;
                default:
                    System.out.println("That was not a valid number. Select a number from the list.\n");
                    break;
            }
        }
    }
}
