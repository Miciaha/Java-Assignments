/*
* Name: Miciaha Ivey
* Date: November 11th 2016
* Program Name: Pandora
* Purpose: Program will replicate the playlist creation feature of the Pandora music player
*/


import java.util.Scanner; //needed to use Scanner for input

public class MiniPandoraReplica {
  public static void main(String[] args) {
   
        //Declare variables
        String lname, playlist;
        int choice, music;
        
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        //Display the Opening Statement which includes the Pandora Menu
        System.out.print("*****************");
        System.out.print("~~!WELCOME TO PANDORA!~~");
        System.out.print("********************\n*\t\t\t\t\t\t\t    *\n*");
        System.out.println("\t\t  PANDORA MENU: \t\t\t    *");
        System.out.println("*\t\t  1 - Create New Pandora Channel \t    *");
        System.out.println("*\t\t  2 - Play Pandora Channel\t\t    *");
        System.out.println("*\t\t  3 - Exit Pandora\t\t\t    *\n*\t\t\t\t\t\t\t    *");
        System.out.print("**********************");
        System.out.print("***************************************\n\n");
       
        //Prompt the user for their last name and menu choice option
        System.out.print("Please enter your last name followed by your Pandora Menu Choice: ");
    
        //Read the user's lastname and read the user's menu choice; Parse string if necessary!
        lname = sc.next().toUpperCase();
        choice = sc.nextInt();
        sc.nextLine(); //This stops the cursor from trying to read things
        System.out.print("\n");
        
        //Control statement (if()/else if() or switch()) that is based on the user's menu choice
                //process the user's menu choice (options:  1, 2, 3, other)
        switch (choice) {
          case 1:
                
                 System.out.println("You have selected the CREATE NEW PANDORA CHANNEL menu item!\n");
                 System.out.print("Please enter the name of the new channel: ");
                 playlist = sc.nextLine().toUpperCase();
                 System.out.println("You have successfully created the following Pandora Channel: " + playlist);
                 
                 break;
                 
          case 2:
                //Play pandora channel
                System.out.println("You have selected the PLAY PANDORA CHANNEL menu item!\n");
                System.out.println("The user: " + lname + " currently has created the following channels:\n");
                System.out.println("1. Taylor Swift");
                System.out.println("2. Eminem");
                System.out.println("3. Beyonce");
                System.out.println("4. Rihanna");
                System.out.println("5. Michael Jackson");
                System.out.println("6. Elvis Presley");
                System.out.println("7. Justin Bieber");
                System.out.println("8. Madonna");
                System.out.println("9. Lady Gaga");
                System.out.println("10. Adele");
                System.out.print("\nWhat channel would you like to listen to? (Enter 1 - 10): ");
                music = sc.nextInt();
                
                System.out.print("You are now listening to: ");
                switch(music){
                  case 1:
                    System.out.println("TAYLOR SWIFT");
                    break;
                    
                  case 2:
                    System.out.println("EMINEM");
                    break;
                    
                  case 3:
                    System.out.println("BEYONCE");
                    break;
                    
                  case 4:
                    System.out.println("RIHANAA");
                    break;
                    
                  case 5:
                    System.out.println("MICHAEL JACKSON");
                    break;
                    
                  case 6:
                    System.out.println("ELVIS PRESLEY");
                    break;
                    
                  case 7:
                    System.out.println("JUSTIN BIEBER");
                    break;
                  case 8:
                    System.out.println("MADONNA");
                    break;
                    
                  case 9:
                    System.out.println("LADY GAGA");
                    break;
                    
                  case 10:
                    System.out.println("ADELE");
                    break;
                  
                  default:
                    break;
                    
                }
                
                break;
                
          case 3:
                //Exit pandora
                System.out.println("\nYou have selected the EXIT PANDORA menu item");
                break;
                
          default:
              System.out.println("\nInvalid entry\n");
                break;
        }
        
        //Display Thank you message
        System.out.println("\n" + lname + "! Thank you for being a valued listener!\n");
        System.out.print("*******************GOODBYE PANDORA LISTENER********************");
  }//end of main
}//end of class
