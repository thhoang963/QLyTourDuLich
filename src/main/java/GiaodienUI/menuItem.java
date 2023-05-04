/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaodienUI;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author PC
 */
public class menuItem extends JButton{
    private int index;
    private boolean subMenu;
    
    private int subIdex;
    private int length;

    public menuItem(String name,int index, boolean subMenu) {
        super(name);
        this.index = index;
        this.subMenu = subMenu;
        setContentAreaFilled(false);
        setForeground(new Color(230,230,230));
        setHorizontalAlignment(SwingConstants.LEFT);
        setBorder(new EmptyBorder(9,10,9,10));
        setIconTextGap(10);
    }
    
    

    public void initmenuItem(int subIdex, int length) {
        this.subIdex = subIdex;
        this.length = length;
        setBorder(new EmptyBorder(9, 33, 9, 10));
        setBackground(new Color(18,99,63));
        setOpaque(true);
    }
    
}
