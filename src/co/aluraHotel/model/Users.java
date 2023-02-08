
package co.aluraHotel.model;


/**
 *
 * @author JC
 */
public class Users {
 
    private Integer userId;
    private String userName;
    private String userPass;
    private Integer userType;
    
    private String userStatus;
    
    public Users(Integer userId, String userName, String userPass) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
    }
    
    public Users(String userName, String userPass, Integer userType) {
        this.userName = userName;
        this.userPass = userPass;
        this.userType = userType;
    }

    public Users(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public Users(String userName, String userPass, String userStatus) {
        this.userName = userName;
        this.userPass = userPass;
        this.userStatus = userStatus;
    }
    
        
        
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
       
    
    @Override
    public String toString() {
        return String.format("User -------------------------"
                              + " \n\tId:       %d"
                              + " \n\tName:     %s"
                              + " \n\tPass:     %s"
                              + " \n\tType:     %d"
                              + " \n\tStatus:   %s",
                
                              this.userId,
                              this.userName,
                              this.userPass,
                              this.userType,
                              this.userStatus);
    }
    
    /*@Override
    public String toString() {
        return String.format("User -------------------------"
                              + " \n\t%d"
                              + " \n\t%s"
                              + " \n\t%s"
                              + " \n\t%d",
                
                                this.userId,
                                this.userName,
                                this.userPass, 
                                this.userType);
    }*/
    
    /*@Override
    public String toString() {
        return String.format("User -------------------------"
                              + " \n\t%s"
                              + " \n\t%s"
                              + " \n\t%d",
                
                            this.userName,
                            this.userPass,
                            this.userType);
    }*/
    
    /*@Override
    public String toString() {
        return String.format("User -------------------------"
                              + " \n\t%s"
                              + " \n\t%s",
                            this.userName,
                            this.userPass);
    }*/
         
}
