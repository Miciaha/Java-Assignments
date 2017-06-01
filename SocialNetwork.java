
import java.util.*;

public class SocialNetwork {

   
    public static void main(String[] args) {
        
        System.out.println("Welcome to CleverlyNamed Social Network!");
        User Jill = new User(18, "Jill", "Female","Sweet dreams are made of this");
       
       Jill.addFriend("Carl");
       Jill.addFriend("Jamie");
       Jill.addFriend("Daughtry");
       Jill.printFriends();
       Jill.deleteFriend("Carl");
       Jill.printFriends();
       Jill.printBio();
    }
    
    
    public static class User {
        //Instantiating user class members
        private StringBuilder name = new StringBuilder();
        private StringBuilder gender = new StringBuilder();
        private StringBuilder motto = new StringBuilder();
        private int age;
        int friendCount = 0;
        
        //creating an array of StringBuilders
       ArrayList friends = new ArrayList(10);
        
        User(int age,String name,String gender,String motto){
            
            this.age = age;
            this.name.append(name);
            this.gender.append(gender);
            this.motto.append(motto);
        
        }
        
     
        void addFriend(String friend){
        
            friends.add(friend);
            
            System.out.println( name + " has added " + friend +" as a friend");
           
            friendCount++;
        }
       
        void deleteFriend(String exFriend){
        System.out.println("User " + name + " deleting friend " + exFriend + ". Sucks to suck " + exFriend);
            for(int i=0; i< friends.size(); i++){
                if(friends.get(i) == exFriend){
                    
                    friends.remove(i);
                 
                }
            }
        }

        void printFriends(){
        
            System.out.println("All friends of user " + name);
            int j = 1;
            for(int i=0; i< friends.size(); i++){
                
                System.out.println("Friend " + j + ":" +friends.get(i));
                j++;
            }
        }
        
        
        void printBio(){
            
            System.out.println("Bio for user " + name + ":");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Motto: " + motto);
        
        }

}
}
