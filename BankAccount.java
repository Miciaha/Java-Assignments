
import java.util.Scanner;

public class BankAccount{
    

        //Main Function
        public static void main(String []args){
        
                //Declare and initialize a variable for balance to $5000.
                double balance = 5000;
     
                int accNum;
                char choice;
                           
                //Call the welcomeMessage() function
                welcomeMessage();

                //Prompt the user to enter the account number 
                accNum = accountInfo();
            
         
                //Process menu using a Do-While loop and Switch statement

                do{
                       //Call the displayMenu() function AND assign it to a variable

                           choice = displayMenu();          
                                          
                        switch(choice){
                            case 'D':
                                //Case (If the menu choice is D)
                                        //Call the depositFunds(balance) function AND assign it to a variable
                                       balance = depositFunds(balance);
                                        break;
                                        
                            case 'W':
                                //Case (If the menu choice is W)
                                        //Call the withdrawFunds(balance) function AND assign it to a variable
                                        balance = withdrawFunds(balance);
                                        break;
                            
                            case 'B':
                                //Case (If the menu choice is B)
                                        //Call the checkBalance(account number, balance) function
                                        checkBalance(accNum,balance);
                                        break;
                            
                            case 'X':
                                //Case (If the menu choice is X)
                                 
                            default:
                                //Default for user error handling
                                break;
                                
                        }//end of switch     
             
                }while(choice != 'X');  
        
            
            //Display final message
            System.out.println("Thank you for being a loyal customer!");
            
        }//end of main
        
             
        /**************************************************** FUNCTION DEFINITIONS *****************************************************/

         //Display welcome message 
         public static void welcomeMessage(){             

             System.out.println("***************************************");
             System.out.println("       Welcome to Seminole Bank        ");
             System.out.println("***************************************");
             
             
         }//end of welcomeMessage
         
         //Prompt and Read users account number.  RETURN the account number to main().
         public static int accountInfo (){
                
                int num;
                Scanner info = new Scanner(System.in);
                //Don't forget to declare local Scanner object to read account number.
                System.out.print("\nPlease enter your 5-digit seminole account number: ");
                num = info.nextInt();
                
                System.out.println("Thank you!");
                
                return num;
             
         }//end of accountInfo
         
        
         //Display menu choices to the user and Read the users banking choice.  RETURN the users menu choice to main().
         public static char displayMenu (){
                
                //Don't forget to declare local Scanner object to read menu choice.
                char c;
                Scanner ch = new Scanner(System.in);
                
                System.out.println("\nEnter D for deposit, W for withdrawal, B for balance, or X to exit the menu");
                c = ch.next().charAt(0);
                c = Character.toUpperCase(c);
                return c;
                          
             
         }//end of displayMenu
         
         
         //Prompt the user for the amount to deposit and Read deposit amount.  Update the balance and RETURN the balance to main().
         public static double depositFunds(double balance){
          
                //Don't forget to declare local Scanner object to read deposit amount.
                Scanner amount = new Scanner(System.in);
                double deposit;
                
                System.out.print("\nEnter the amount of the deposit: ");
                deposit = amount.nextDouble();
                
                balance = balance + deposit;
                
                return balance;
         }//end of depositFunds
         
    
         //Prompt the user for the amount to withdraw and Read withdrawal amount.  Update the balance and RETURN the balance to main().
         public static double withdrawFunds(double balance){
             
                //Don't forget to declare local Scanner object to read withdrawal amount.
                Scanner amount = new Scanner(System.in);
                double withdraw;
                
                System.out.print("\nEnter the amount of the withdrawal: ");
                withdraw = amount.nextDouble();
                
                balance = balance - withdraw;
                return balance;
             
         }//end of withdrawFunds
     
         //Display the balance and DO NOT RETURN anything to main().
         public static void checkBalance(int accNum,double balance){
             System.out.print("\nAccount number: " + accNum +" has a current balance of: ");
             System.out.printf("%.2f \n",balance);
               
         }//end of checkBalance
                  
   
}//end of BankAccount Class
