package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Operations {


    //Declaring the global variables for the opperations class
    //InputMatrix is copied into the ArrayX 2d array which is used as an input parameter
    int[][] ArrayX;
    int rowNum =0;
    int colNum =0;


    //Contructor class which takes in a Array parameyer and sets it to ArrayX
    public Operations (int [][] ArrayX) {
        this.ArrayX = ArrayX;
    }

    /*
    The isReflexive class takes in an 2d array parameter and runs a while loop to check if the values of the positons
    across the diagonal are = to 1.

    Whenever the position in the diagonal is = to 1, the counter is incremented, at the end if the counter is equal to
    the length of the array, the isReflevive boolean variables returns true. Else, it returns false

     */
    public boolean isReflexive(int [][] ArrayX) {

        int counter = 0;
        this.ArrayX = ArrayX;
        int checkNumber = 0;
        boolean isReflexive = false;

        int i = 0;

        while (counter <= ArrayX.length - 1) {
            if (ArrayX[i][i] == 1) {
                checkNumber++;
            }

            i++;
            counter++;
        }
        if (checkNumber == ArrayX.length) {
            isReflexive = true;
        }
        return isReflexive;
    }


    /*
    The isAntiSemetric method takes in an array parameter. The for loop loops through every element in the matrix, if the
    indix i = index j, it skips over o prevent repatiton. It then checks is the postion at [i][j] = [j][i] and if they
    1. If they satify those arguments, the matrix is semetric and returns the initialized value of false. If not, it
    returns true.

     */
    public boolean isAntiSyemtric(int [][] ArrayX) {
        this.ArrayX = ArrayX;

        boolean ans = false;
        int j =0;
        int counter =0;

        for (j =0; j < ArrayX.length; j++) {
            for (int i = 0; i < ArrayX.length; i++){
                if (i !=j) {
                    if (ArrayX[i][j] == ArrayX[j][i] && ArrayX[j][i] == 1) {
                        return ans;
                    }
                }
            }
        }

        return true;
    }


    /*
    The isTransitive method takes in a Array parameter and retunrs a boolean value. It uses three nested loops to check
    if the values at [i][j] = [j][k] = [i][k] = 1. If all these areguments are true it continues the loop. The loop
    breaks after one instance is false and returns false, else it retunrs true.
     */

    public boolean isTransitive(int [][] ArrayX) {
        this.ArrayX=ArrayX;

        for (int i = 0; i < ArrayX.length; i++) {
            for (int j = 0; j < ArrayX.length; j++) {
                if (ArrayX[i][j] == 1) {
                    for (int k = 0; k < ArrayX.length; k++) {
                        if (ArrayX[j][k] == 1) {
                            if (ArrayX[i][k] != 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /*
    the is complete method calls the isReflexive, isAntiSemetric, and is transitive methods. If all methods return a
    true value the is Complete methods returns a true value
   
     */
    public boolean isCompleteOrder(int [][] Arrayx) {
        this.ArrayX = Arrayx;
        if(isTransitive(ArrayX) && isReflexive(ArrayX) && isAntiSyemtric(ArrayX)){
            return true;
        }
        else{
            return false;
        }

    }



}
