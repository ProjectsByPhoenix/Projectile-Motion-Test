/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package missiletraj;

import java.util.*;
/**
 *
 * @author Yt
 */
public class MissileTraj {

    /**
     * @param args the command line arguments
     */
    
    static void menu() {
        
Scanner input = new Scanner(System.in);
       
int userIn = 0;

while (userIn != 1){

System.out.print("Welcome to the Projectile Motion Mental Test Center!");
System.out.println(" PRESS '1' to begin");

 userIn = input.nextInt();

if (userIn != 1){

System.out.println("Whoops! Looks like you misunderstood, let's try that again.");
    
 }


        //call test function located in interface
        test();
}
    }
    
    static void test() {
        
        System.out.println("Let the test begin!");
        
        // establish counter for while loop
        int counter = 1;
        int i=0;
        //keeps track of how many questions were answered correctly and how many were answered incorrectly
        int result[] = new int[10];
        
        // provides questions 1 through 10 
        while (counter < 11){
//let's user know what question they are on        
System.out.println("QUESTION "+counter+" of 10");
//call question generation function   
result[i]= question();
// increment counters        
counter++;
i++;

        }
        
        int resultsCollector = result[0]+result[1]+result[2]+result[3]+result[4]+result[5]+result[6]+result[7]+result[8]+result[9];
        int finalResult = resultsCollector*10;
        
        System.out.println("Congratulation! You're received a score of "+finalResult);

    }

    static int question(){
        
        //create new interface object 
        Interface Caller = new Interface();
        
           // keeps track and returns results     
           int rightOrWrong = 0;  
           // holds random numbers for alternate answer choices
           int choices[] = new int[4];
           //holds correct character
           char correct = 'a';
           // is used for creating random answer choices and store them into choices array
           for (int i = 0; i < 4; i++){
           
           //choices array calling values function to fill with random numbers    
           choices[i] = Caller.values();
          
           }
    
           //holds the right answer so that it can replace one of the incorrect ones
           int right = equation();
           
           Random rn = new Random();
           
           //creates random number between 1 and 4
           int selector = rn.nextInt(4)+1;
           
           //replaces a random answer with the correct one 
           switch(selector){
           
               case 1: choices[0] = right; correct = 'a';
               break;
               case 2: choices[1] = right; correct = 'b';
               break;
               case 3: choices[2] = right; correct = 'c';
               break;
               case 4: choices[3] = right; correct = 'd';
               break;
           
           }
           
           Scanner input = new Scanner(System.in);
           
           //display choices
           System.out.println("Is it : ");
           System.out.println("A " + choices[0]);
           System.out.println("B " + choices[1]);
           System.out.println("C " + choices[2]);
           System.out.println("D " + choices[3]);
           
           
           char choice = input.next().charAt(0);
           
           if (choice == correct){
           
           rightOrWrong = 1;
           } else {
           
           rightOrWrong = 0;
           
           }
           
           
           return rightOrWrong;
    }
    
    static int equation(){
        
        Interface Caller = new Interface();
        
        Random num1 = new Random();
        Random num2 = new Random();
        Random num3 = new Random();
        
        int velocity = num1.nextInt(100)+1;
        int theta = num2.nextInt(100)+1;
        //provides random number between one and two
        int counter= num3.nextInt(2)+1;
        int rightAns=0;
        
    System.out.print("If an object is moving over a flat plane with a velocity of "+velocity+" and an angle of "+theta+" radeons, ");
    
    //this will make it to were the test will be randomly determined between height and range questions
    if (counter < 2) {
    
    //finishes asking the height question    
    System.out.println("what is the highest point, in meters, that the object will reach?"); 
    //collects the answer
    rightAns = Caller.calculateAnsHeight(velocity, theta);
    
    }
    // directs to a range question instead
    else {
    
    //finishes asking the height question
    System.out.println("what is the range, in meters, of the object?");
    //collects the answer
    rightAns = Caller.calculateAnsRange(velocity, theta);
    
    }
    
    
    
    return rightAns;
    
    }
    public static void main(String[] args) {
        
        menu();
        
        
        
        
        
        
    }
    
}
