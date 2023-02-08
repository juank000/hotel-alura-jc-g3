
package otsAlternativeForm;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author JC
 */
public class TableSimpleCellRender extends DefaultTableCellRenderer {

    public TableSimpleCellRender() {
        setFont(new Font("Roboto", Font.BOLD, 14));
        setForeground(Color.WHITE);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object obj, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, obj, isSelected, hasFocus, row, column);
        if(table.isCellSelected(row, column)){
            if(row%2==0){
            component.setBackground(new Color(222, 252, 186));
            component.setForeground(Color.BLACK);
        }else{
            component.setBackground(new Color(213, 231, 246));
            component.setForeground(Color.BLACK);
        }
        }else if(row%2==0){
            component.setBackground(new Color(51,51,51));
            component.setForeground(Color.LIGHT_GRAY);
        }else{
            component.setBackground(new Color(30,30,30));
            component.setForeground(Color.GRAY);
        }
        setBorder(new EmptyBorder(0,5,0,5));
        //setForeground(Color.LIGHT_GRAY);
        
        return component;
    }
    
}
