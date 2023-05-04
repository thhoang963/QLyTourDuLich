/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaodienUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (length !=0 ){
            /*g2.setColor(new Color(43, 141, 98));
            g2.drawLine(18,0, 18, getHeight());
            g2.drawLine(18, getHeight()/2, 26, getHeight()/2);
            */
            g2.setColor(new Color (43,141,98));
            if(subIdex == 1)
            {
                g2.setColor(new Color(18, 0, 18,getHeight()));
                g2.drawLine(18, getHeight()/2, 26, getHeight()/2);
            }
            else if(subIdex == length -1){
                g2.setColor(new Color(18, 0, 18,getHeight()));
                g2.drawLine(18, getHeight()/2, 26, getHeight()/2);
            }
            else {
                g2.setColor(new Color(18, 0, 18,getHeight()));
                g2.drawLine(18, getHeight()/2, 26, getHeight()/2);
            }
        }
        else if(subMenu)
        {
            g2.setColor(getForeground()) ;
            int arrowWidth=8;
            int arrowHeight=4 ;
            Path2D p=new Path2D.Double();
            p.moveTo(0, arrowHeight);
            p.moveTo(arrowHeight/2, 0);
            p.lineTo(arrowWidth, arrowHeight);
            g2.translate(getWidth()-arrowWidth- 15,(arrowHeight- getHeight())/2 );
            g2.draw(p);
        }
        g2. dispose () ;
    }
    
    
}
