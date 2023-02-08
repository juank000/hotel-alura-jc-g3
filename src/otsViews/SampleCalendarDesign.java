
package otsViews;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author JC
 */
public class SampleCalendarDesign {
    
    ScaleImg si = new ScaleImg();
    
    public void designSimple(DatePicker datePkr){
        designDateVetoPolicy(datePkr);
        JButton datePickerButton = datePkr.getComponentToggleCalendarButton();
        datePickerButton.setText("");
        si.scaleImageIconJBtn("/otsImages/icon-booking.png", datePickerButton);
    }
    
    public void designHighlightPolicy(DatePicker datePkr){
        datePkr.getSettings().setHighlightPolicy(new SampleHighlightPolicy());
    }

    public void designDateVetoPolicy(DatePicker datePkr){
        datePkr.getSettings().setVetoPolicy(new SampleDateVetoPolicy());
    }
    
    public void designShowToday(DatePicker datePkr){
        datePkr.getSettings().setColor(DatePickerSettings.DateArea.DatePickerTextValidDate, new Color(119, 255, 187));
        datePkr.getSettings().setFontValidDate(new Font("Monospaced", Font.ITALIC | Font.BOLD, 14));
        datePkr.setDateToToday();
    }
    
    public void designCustomOp1(DatePicker datePkr){
        datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundOverallCalendarPanel, Color.GRAY);
        datePkr.getSettings().setColor(DatePickerSettings.DateArea.CalendarTextNormalDates, new Color(70,70,70));
        datePkr.getSettings().setColor(DatePickerSettings.DateArea.CalendarTextWeekdays, new Color(60,60,60));
        datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundMonthAndYearNavigationButtons, Color.CYAN);
        datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundMonthAndYearMenuLabels, Color.LIGHT_GRAY);        
        datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundTodayLabel, Color.LIGHT_GRAY);
        datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundClearLabel, Color.MAGENTA);
        datePkr.getSettings().setFontValidDate(new Font(Font.DIALOG, Font.BOLD, 11));
    }
       
    //--------------------------------------------------------------------------
    /*
    // Set Not Editable
    datePkr.getSettings().setAllowKeyboardEditing(false);    
            
    // Set backgrounds:
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.CalendarBackgroundNormalDates, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundOverallCalendarPanel, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundMonthAndYearMenuLabels, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundTodayLabel, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundClearLabel, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundMonthAndYearNavigationButtons, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundTopLeftLabelAboveWeekNumbers, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.CalendarBackgroundSelectedDate, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.CalendarBorderSelectedDate, Color.COLOR);
    
    datePkr.getSettings().setColorBackgroundWeekdayLabels(Color.COLOR, true);
    datePkr.getSettings().setColorBackgroundWeekNumberLabels(Color.COLOR, true);
    
    // Set fonts:
    Font randomFont = new Font("Monospaced", Font.ITALIC | Font.BOLD, 12);
    Font smallerFont = new Font("Serif", Font.BOLD, 10);
    datePkr.getSettings().setFontMonthAndYearMenuLabels(randomFont);
    datePkr.getSettings().setFontMonthAndYearNavigationButtons(randomFont);
    datePkr.getSettings().setFontTodayLabel(randomFont);
    datePkr.getSettings().setFontClearLabel(randomFont);
    datePkr.getSettings().setFontCalendarDateLabels(randomFont);
    datePkr.getSettings().setFontCalendarWeekdayLabels(smallerFont);
    datePkr.getSettings().setFontCalendarWeekNumberLabels(smallerFont);
    
    datePkr.getSettings().setFontValidDate(new Font("Monospaced", Font.ITALIC | Font.BOLD, 14));
    datePkr.getSettings().setFontInvalidDate(new Font(Font.DIALOG, Font.ITALIC, 12));
    datePkr.getSettings().setFontVetoedDate(new Font(Font.DIALOG, Font.BOLD, 12));
    
    // Set text colors:
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.TextMonthAndYearMenuLabels, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.TextMonthAndYearNavigationButtons, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.TextTodayLabel, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.TextClearLabel, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.CalendarTextNormalDates, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.CalendarTextWeekdays, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.BackgroundCalendarPanelLabelsOnHover, Color.COLOR);
    datePkr.getSettings().setColor(DatePickerSettings.DateArea.TextCalendarPanelLabelsOnHover, Color.COLOR);
    */
    //--------------------------------------------------------------------------
}
