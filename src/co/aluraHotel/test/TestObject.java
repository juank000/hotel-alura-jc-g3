
package co.aluraHotel.test;

import co.aluraHotel.model.Booking;
import co.aluraHotel.model.Guests;
import co.aluraHotel.model.Users;
import java.sql.Date;

/**
 *
 * @author JC
 */
public class TestObject {
        
    
    public static void main(String... args) {
               
        Date dOne = Date.valueOf("2023-02-23");
        Date dTwo = Date.valueOf("2023-02-25");
        Date dBth = Date.valueOf("2000-01-01");
        
        Booking bk = new Booking(100, dOne, dTwo, 2, 975.11, "Cash");
        Guests gt = new Guests(111, "Test Name", "Test Surname", dBth, "Colombian", "(321)-098-7654", "test_1@mail.dev", 111);
        Users usr = new Users("testing_1", "pass_1", "active");
        
        System.out.println("Booking: \n" + bk);
        System.out.println("\nGuest: \n" + gt);
        System.out.println("\nUser: \n" + usr);
                        
    }
    
}
