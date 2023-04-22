/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImageRender;

import java.awt.Component;
import java.awt.Image;
import java.util.Objects;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Huy1721
 */
public class ImageRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        String Photoname = value.toString();
        Icon imageIcon = new ImageIcon(new ImageIcon(Objects.requireNonNull(this.getClass().getResource(Photoname))).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));

        return new JLabel(imageIcon);
    }

}
