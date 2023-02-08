
package co.aluraHotel.model;

import java.sql.Date;

/**
 *
 * @author JC
 */
public class Booking {
     
    private Integer bookingId;
    private Date checkIn;
    private Date checkOut;
    private Integer qtyGuests;
    private Double price;
    private String paymentMethod;
    
    //------------------------------------------------------------------------------------------------
    private String name;
    private String surname;
    private Guests guests = new Guests(name, surname);
    //------------------------------------------------------------------------------------------------
    
    public Booking(Date checkIn, Date checkOut, Integer qtyGuests, Double price, String paymentMethod) {
        super();
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.qtyGuests = qtyGuests;
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    public Booking(Integer bookingId, Date checkIn, Date checkOut, Integer qtyGuests, Double price, String paymentMethod) {
        this.bookingId = bookingId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.qtyGuests = qtyGuests;
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    //------------------------------------------------------------------------------------------------
    public Booking(String name, String surname, Integer bookingId, Integer qtyGuests, Double price) {
        this.name = name;
        this.surname = surname;
        this.bookingId = bookingId;
        this.qtyGuests = qtyGuests;
        this.price = price;
    }
    
    public Booking(Integer bkId){
        this.bookingId = bkId;
    }
    //------------------------------------------------------------------------------------------------
    
    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Integer getQtyGuests() {
        return qtyGuests;
    }

    public Double getPrice() {
        return price;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    //-----------------------------------------------------------------
    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public String getSurname() {
        return surname;
    }

    /*public void setSurname(String surname) {
        this.surname = surname;
    }*/ 
    //-----------------------------------------------------------------
    
    @Override
    public String toString() {
        return String.format("Booking -------------------------"
                                + " \n\t  bkId:     %d"
                                + " \n\t  In:       %s"
                                + " \n\t  Out:      %s"
                                + " \n\t  Qty:      %d"
                                + " \n\t  Price:    %f"
                                + " \n\t  Payment:  %s",
                
                this.bookingId,
                this.checkIn,
                this.checkOut,
                this.qtyGuests,
                this.price,
                this.paymentMethod);
    }        
    
}
