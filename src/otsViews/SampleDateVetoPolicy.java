
package otsViews;

import com.github.lgooddatepicker.optionalusertools.DateVetoPolicy;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author JC
 */
public class SampleDateVetoPolicy implements DateVetoPolicy {

    /**
     * isDateAllowed, Return true if a date should be allowed, or false if a date should be vetoed.
     */
    @Override
    public boolean isDateAllowed(LocalDate date) {
        // Disallow days 7 to 11.
        if ((date.getDayOfMonth() >= 7) && (date.getDayOfMonth() <= 11)) {
          return false;
        }
        // Disallow odd numbered saturdays.
        if ((date.getDayOfWeek() == DayOfWeek.SATURDAY) && ((date.getDayOfMonth() % 2) == 1)) {
          return false;
        }
        // Allow all other days.
        return true;
      }
    }