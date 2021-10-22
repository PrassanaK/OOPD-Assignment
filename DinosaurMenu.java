//****************************************************************
//Author: Prassana Kamalakannan
//Filename: DinosaurMenu.java
//DateModified: 29/10/2017
//****************************************************************
import java.util.*;

public class DinosaurMenu
{
    Scanner sc = new Scanner();
    public void mainMenuControl()
    {
        System.out.println("Please enter one of the following options");
        System.out.println("1: Add dinosaur");
        System.out.println("2: Display Dinosaur");
        System.out.println("3: Calculate Park Size");
        System.out.println("4: Read in Jurassic Park File");
        System.out.println("5: Write Jurassic Park File");
        System.out.println("6: Exit");
        n = sc.nextInt();
        do
        {
            switch(n)
            {
                case 1:
                    addDinosaur(); 
                    break;
                case 2:
                    displayDinosaur();
                    break;
                case 3:
                    calculateParkSize();
                    break;
                case 4:
                    readJParkFile();
                    break;
                case 5:
                    writeJParkFile();
                    break;
                case 6:
                    System.out.println("GoodBye");
                    break;
                default:
                    System.out.println("Please only enter valid options");
            } 
        }//END DO
    }
}      
