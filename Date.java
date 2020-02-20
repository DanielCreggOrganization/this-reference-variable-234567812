/**
 * Date
 */
public class Date {
    
    // Instance Variables
     int day;
     int month;
     int year;
     String event;

    // Default Constructor (No Parameters)
    public Date(){
        day = 0;
        month = 0;
        year = 0;
        event = "nothing on today";
    }

    
    // Parameterized constructor (1 Parameter)
    // Your code here.
    public Date(int day){
        this.day = day;
       
   }    

    // Parameterized constructor (2 Parameters)
    // Your code here.
    
   public Date(int day, int month){
        this(day);
        this.month = month; 
       
   }        
    
   // Parameterized constructor (3 Parameters)
    public Date(int day, int month, int year, String event){
        // Your code here.
        this.day = day;
        this.month = month; 
        this.year = year;
        this.event = event;
    }
  
    // A simple print method
    public void printDate(){
        // Print the date like this: day/month/year
        // Your code here
    System.out.println(this.day+ "/" +this.month+ "/" +this.year);

    }

}
