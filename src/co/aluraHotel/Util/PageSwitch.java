
package co.aluraHotel.Util;

import co.aluraHotel.view.PageBooking;
import co.aluraHotel.view.PageLogin;
import co.aluraHotel.view.PageMenuOptions;
import co.aluraHotel.view.PageRegistration;
import co.aluraHotel.view.PageSearch;
import co.aluraHotel.view.PageSearchById;
import co.aluraHotel.view.PageSearchByName;
import co.aluraHotel.view.PageStart;
import co.aluraHotel.view.SuccessMssg;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author JC
 */
public class PageSwitch {
    
    private PageStart pageStart;
    private PageLogin pageLogin;
    private PageMenuOptions pageMenuOptions;
    private PageSearch pageSearch;
    private PageSearchById pageSearchById;
    private PageSearchByName pageSearchByName;
    private PageBooking pageBooking;
    private PageRegistration pageRegistration;
    private SuccessMssg sm;
    private PageMenuOptions pmo;
       
    // Frame -> Properties -> Default Close Opeartion as DISPOSE
    public void closeFrame(JFrame frame){
        WindowEvent closeWindow = new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    public void startForward(JFrame frame) {
        this.pageLogin = new PageLogin();
        this.pageLogin.setVisible(true);
        closeFrame(frame);
        //frame.dispose();
    }
    
    public void logingForward(JFrame frame) {
        this.pageMenuOptions = new PageMenuOptions();
        this.pageMenuOptions.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }  
    
    public void menuLogout(JFrame frame) {
        this.pageStart = new PageStart();
        this.pageStart.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }
    
    public void menuSearch(JFrame frame) {
        this.pageSearch = new PageSearch();
        this.pageSearch.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }
    
    public void menuBooking(JFrame frame) {
        this.pageBooking = new PageBooking();
        this.pageBooking.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }
    
    public void searchForwardById(JFrame frame) {
        this.pageSearchById = new PageSearchById();
        this.pageSearchById.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }  
    
    public void searchForwardByName(JFrame frame) {
        this.pageSearchByName = new PageSearchByName();
        this.pageSearchByName.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }
    
    public void searchByBack(JFrame frame) {
        this.pageSearch = new PageSearch();
        this.pageSearch.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }  
    
    public void searchBackMenu(JFrame frame) {
        this.pageMenuOptions = new PageMenuOptions();
        this.pageMenuOptions.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }
    
    public void bookingBackMenu(JFrame frame) {
        this.pageMenuOptions = new PageMenuOptions();
        
        this.pageMenuOptions.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }
    
    public void bookingForward(JFrame frame) {
        this.pageRegistration = new PageRegistration();
        this.pageRegistration.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }
    
    public void registrationBack(JFrame frame) {
        this.pageBooking = new PageBooking();
        this.pageBooking.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }
    
    public void registrationForward(JFrame frame) {
        this.sm = new SuccessMssg();
        this.sm.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }
    
    public void successOk(JFrame frame) {
        this.pmo = new PageMenuOptions();
        this.pmo.setVisible(true);
        //closeFrame(frame);
        frame.dispose();
    }
}
