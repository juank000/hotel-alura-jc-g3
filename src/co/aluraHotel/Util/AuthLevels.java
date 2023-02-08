
package co.aluraHotel.Util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JC
 */
public enum AuthLevels {
    EmpAUTH(1),
    EmpNoAUTH(2),
    ClientAUTH(3),
    ClientNoAUTH(4); 
    
    private int value;
    private static Map map = new HashMap<>();

    private AuthLevels(int value) {
        this.value = value;
    }

    static {
        for (AuthLevels al : AuthLevels.values()) {
            map.put(al.value, al);
        }
    }

    public static AuthLevels valueOf(int al) {
        return (AuthLevels) map.get(al);
    }

    public int getValue() {
        return value;
    }
    
}
