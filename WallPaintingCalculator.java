import java.util.Scanner;

public class HousePainting {

    
    public static void main(String[] args) {
        
        //declare variables
        double wallLength;
        double wallHeight;
        double windowLength;
        double windowHeight;
        double doorLength;
        double doorHeight;
        int doorCount;
        int windowCount;
        
        String response;
        
        double houseSA;
        double windowSA = 0;
        double doorSA = 0;
        
        Scanner sc = new Scanner(System.in);
        
        //Welcome message
        
        System.out.println("Let's see how many buckets of paint you need to paint your house!\nPlease answer the following questions using feet as a measurement.");
        System.out.print("\nWall length: ");
        wallLength = sc.nextDouble();
        System.out.print("Wall height: ");
        wallHeight = sc.nextDouble();
        
       
        
        System.out.print("Do you wish to account for windows and doors? (yes/no): ");
        response = sc.next().toLowerCase();
        
        
        if ( "yes".equals(response) || "y".equals(response)){
            
            
            System.out.print("\nWindow length: ");
            windowLength = sc.nextDouble();
            System.out.print("Window height: ");
            windowHeight = sc.nextDouble();
            System.out.print("Window count: ");
            windowCount = sc.nextInt();
            //Calculate total window surface area
            
            windowSA = (windowLength * windowHeight * windowCount);
            
            //ON TO THE DOORS
            System.out.print("\nDoor length: ");
            doorLength = sc.nextDouble();
            System.out.print("Door height: ");
            doorHeight = sc.nextDouble();
            System.out.print("Door count: ");
            doorCount = sc.nextInt();
            //Calculate total door surface area
            
            doorSA = (doorLength * doorHeight * doorCount);
        }else {
            System.out.println("You're a strange fellow...");
        }
        
        //We're just gonna assume that there are four walls and they're all the same size
        houseSA = ((wallLength * wallHeight * 4) - windowSA - doorSA);
        double paint = Math.ceil(houseSA / 400);
        
        System.out.println("The total surface area of your house comes out to " + houseSA + " sqft.");
        System.out.println("You'll need " + (int)paint + " buckets of paint");
    }
    
}
