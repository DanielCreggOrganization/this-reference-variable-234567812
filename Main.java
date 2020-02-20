/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // Create a Date object using the default constructor
         Date dateObject1 = new Date();
        System.out.println( dateObject1.year);
        // Create 3 more Date objects using all the paramiterised constructors
       Date dateObject2 = new Date(20, 2 , 2020);
        System.out.println(dateObject2.day+"/"+dateObject2.month+ "/" +dateObject2.year);
        // Call the printDate() method for each object you create.
        Date dateObject3 = new Date(20, 2);
        System.out.println(dateObject3.day+"/"+dateObject3.month);
        Date dateObject4 = new Date(20);
        System.out.println(dateObject4.day);
        System.out.println(dateObject4.year);
        
        Date dateObject5 = new Date(15, 12);
        System.out.println(dateObject5.month);

        Date dateObject6 = new Date(17, 3, 2020, "St. Patricks");
        System.out.println(dateObject6.event);

        
    }
   
}
