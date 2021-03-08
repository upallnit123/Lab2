package edu.ru.lab2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author upall
 */
public class MainClass {
    
    public static void main(String[] args){
        
        int result;
        int[] iArray = {1,9,7,16,24,32,41,58,66,70,83,95};
        mySearch(iArray[], -1);
        if (result == -1){
            System.out.println("No equal number received.");
            System.out.println("This is the end of the program.");
        }
        else
        {
            System.out.println("The result is " + result);
        }
        
    }
    
    /**
     *
     * @param iArray
     * @param key
     * @return
     */
    public static int mySearch(int[] iArray, int key){
        
        //iArray = {1,9,7,16,24,32,41,58,66,70,83,95};
        Random rNumber = new Random();
        key = rNumber.nextInt(99);
        int i;
        
        //System.out.println(Arrays.toString(iArray));
        
        for (i = 0; i < iArray.length; i++){
            if (iArray[i] == key){
                System.out.println(key);
                return key;   
            }
            else
            {
                System.out.println("No equal number received.");
                //return -1;
            }    
        }
    return -1;
             
    }
    
    
}
