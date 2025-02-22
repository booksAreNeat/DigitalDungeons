//KL
//This is the dice roller class

import java.util.Random;;

public class Dice {

    //Dice roll options
    public static int rollDice (int faceCount){
        
        Random roll = new Random();
        return roll.nextInt(faceCount) + 1;

    }
}


