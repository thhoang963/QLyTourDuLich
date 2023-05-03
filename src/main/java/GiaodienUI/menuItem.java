/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaodienUI;

import javax.swing.JButton;

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
    }
    
    

    public void initmenuItem(int subIdex, int length) {
        this.subIdex = subIdex;
        this.length = length;
        setContentAreaFilled(false);
    }
    
}
