import java.util.Scanner;
import java.lang.Math.*;
 

public class MatchMakerProgram {
 
    
    public static void main(String[] args) {
     
     
     //import Scanner and intitialize variables
     Scanner sc = new Scanner(System.in);
     int people = 5;
     
     //creating the array
     String[] names;
     
     //allocating memory for all names in array
     names = new String[people];
     
     //Ask user to enter the name of each potential date
     for(int i = 0; i < people; i++){
         System.out.print("\nEnter the name of someone you're into ;) : ");
         names[i] = sc.nextLine();
     }
     
     
     
     //Match maker match maker send me a match
     System.out.println("\nOur extremely complicated algorithm has matched you with... " + names[getRandom(5)] + "!");
     
       
    }
    
    //Randomization method
    public static int getRandom(int people){
         
         return (int)(Math.random()*(people - 1));
     }
}
