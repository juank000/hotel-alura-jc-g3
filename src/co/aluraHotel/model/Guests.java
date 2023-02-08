
package co.aluraHotel.model;

import java.sql.Date;

/**
 *
 * @author JC
 */
public class Guests {
    
    private Integer guestId;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private String nationality;
    private String phone;
    private String email;
    private Integer bookingID;

    public Guests(Integer guestId, String name, String surname, Date dateOfBirth, String nationality, String phone, String email, Integer bookingID) {
        super();
        this.guestId = guestId;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.phone = phone;
        this.email = email;
        this.bookingID = bookingID;
    }
    
    public Guests(String name, String surname, Date dateOfBirth, String nationality, String phone, String email, Integer bookingID) {
        super();
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.phone = phone;
        this.email = email;
        this.bookingID = bookingID;
    }


    //-----------------------------------------------
    public Guests(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    //-----------------------------------------------
    
    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Integer getBookingID() {
        return bookingID;
    }

    public void setBookingID(Integer bookingID) {
        this.bookingID = bookingID;
    }  

    @Override
    public String toString() {
        return String.format("Guest -------------------------"
                            + "\n\tId:       %d "
                            + "\n\tName:     %s "
                            + "\n\tSurname:  %s "
                            + "\n\tBirth:    %s "
                            + "\n\tCountry:  %s "
                            + "\n\tPhone:    %s "
                            + "\n\te-Mail:   %s "
                            + "\n\tbkId:     %d",
                
                              this.guestId,
                              this.name,
                              this.surname,
                              this.dateOfBirth,
                              this.nationality,
                              this.phone,
                              this.email,
                              this.bookingID);
    }
    
    
}
