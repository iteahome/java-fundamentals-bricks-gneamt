package com.company;

public class Main {

    public static void main(String[] args) {
        
        int numberOfBricks = 14; // example value
        int i = 1;
        boolean theyStillHaveBricks = true;
        while (numberOfBricks > 0 && theyStillHaveBricks) {
            if (numberOfBricks <= i ){        //if they still have less than or exactly i bricks, Patlu will place them and will win
                System.out.println("Patlu");  //print the winner, Patlu
                theyStillHaveBricks = false;  //set the value to false to stop the iteration (while)
            }
            else if (i < numberOfBricks && numberOfBricks <= (i + 2*i)){  //if they still have more than i but less than or exactly 2*i, Motu will win
                System.out.println("Motu");                               //Print the winner, Motu
                theyStillHaveBricks = false;                              //set the value to false to stop the iteration (while)
            }
            else{
                numberOfBricks = numberOfBricks - i; //Patlu puts i bricks
                numberOfBricks = numberOfBricks - 2 * i; //Motu puts 2*i bricks
                i++;
            }
        }
    }
}
