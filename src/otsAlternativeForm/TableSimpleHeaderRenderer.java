
package otsAlternativeForm;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author JC
 */
public class TableSimpleHeaderRenderer extends JLabel implements TableCellRenderer {

    public TableSimpleHeaderRenderer() {
        setOpaque(true);
        setFont(new Font("Roboto", Font.BOLD, 14));
        setBackground(Color.BLACK);
        setForeground(Color.CYAN);
        setBorder(BorderFactory.createEtchedBorder());
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object obj, boolean bln, boolean bln1, int i, int i1) {
        setText(obj.toString());
        return this;
    }
    
}
