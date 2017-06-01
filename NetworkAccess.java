
public class NetworkAccess {
 

    public static void main(String[] args) {
    
     //creates Access reference variables
     Access userInfo[] = new Access[10];
     
     //instantiate objects
     userInfo[0] = new Access(2550,0);
     userInfo[1] = new LaptopAccess(4112,1,"Atlanta");
     userInfo[2] = new MobileAccess(2151,0,"Miami");
     userInfo[3] = new Access(12200,1);
     userInfo[4] = new LaptopAccess(64000,1);
     userInfo[5] = new Access(42000,0);
     userInfo[6] = new Access(36000,1);
     userInfo[7] = new MobileAccess(11565,0,"Mars");
     userInfo[8] = new LaptopAccess(85400,1);
     userInfo[9] = new Access(54000,0);     
     
     for(int i = 0; i < userInfo.length; i++){
         
         System.out.print("Printing access records: ");
         userInfo[i].getPrettyTOD();
         System.out.print(" ");
         userInfo[i].getService();
         System.out.print(" ");
         System.out.print(userInfo[i].getUserGPSLocation());
         System.out.print("\n");
         System.out.println("Access type?");
     
     }
     
     
     
     
     double average = getAverageTOD(userInfo);
     
     System.out.println("The average access time of day in hours past day start is: " + average);
    }
    
    //method returns average time of day in seconds as a double
    private static double getAverageTOD(Access[] a){
        double total = 0,averageSeconds, averageHours;
        
        for (Access a1 : a) {
            total += a1.getTOD();
        }
        
        averageSeconds = total/a.length;
        
        averageHours = (averageSeconds/3600);
                
        return averageHours;
    }
}

//Main Access class
class Access {
    
    //Initialized variables within class
    private int TOD, service;
    
    //Construction method for class
    public Access(int TOD, int service){
        
        //accepts input through the class call
        this.TOD = TOD;
        this.service = service;
    }
    
    //default return for user GPSLocation
    public String getUserGPSLocation()
    {
        
        return ("User GPS Location is unknown.");
    }
    
    public void returnTOD(){
        
    }
    
    //returnsTOD for calculating the average
    public int getTOD(){
    
        return TOD;
    }
    
    public void getPrettyTOD(){
    
        int hours,minutes,seconds;
        
        hours = (TOD/3600);
        minutes = ((TOD % 3600)/60);
        seconds = ((TOD % 3600) % 60);
    
        System.out.print(hours + ":" + minutes + ":" + seconds);
        
    }
    
    public void getService(){
    
        switch(service){
            case 0: System.out.print("Chat");
                    break;
                    
            case 1: System.out.print("Post");
                    break;
                    
            default:
                    break;   
        }
    }
}

//subclass of main Access class
class LaptopAccess extends Access{
    private String location = "";
    
    //Constructor for LaptopAccess. Added String
    public LaptopAccess(int TOD, int service, String location){
        
        super(TOD, service);
        this.location = location;
    }
    
    //Second Constructor class. String is optional for Laptops
    public LaptopAccess(int TOD, int service){
        
        //can be inherited from main access class
        super(TOD, service);
        
    }
    
    @Override
    public String getUserGPSLocation(){
        
        return ("Laptop user: GPS may not be available. " + location);
    }
    
}

//subclass of main Access class
class MobileAccess extends Access{
    private String location;
    
    public MobileAccess(int TOD, int service, String location){
    
    super(TOD, service);
    this.location = location;
    }
    
    @Override
    public String getUserGPSLocation(){
        
        return("Mobile user: GPS available! Location: " + location);
    }
    
    
}
