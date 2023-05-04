/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaodienUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MenuItem;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author PC
 */
public class menu extends JComponent{
    private MigLayout layout;
    private String [][]menuItems = new String[][]
    {
        {"Dashboard"},
        {"Du Lịch","Tour Miền Bắc","Tour Miền Trung","Tour Miền Tây Nam Bộ","Tour Miền Đông Nam Bộ"},
        {"Tab3"},
        {"Tab4"}
    };

    public menu() {
        init();
    }

    private void init() {
        layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2","fill");
        setLayout(layout);
        setOpaque(true);
        for(int i= 0;i < menuItems.length; i++)
        {
            addMenu(menuItems[i][0], i) ;   
        }
    }
    
    private Icon getIcon(int index)
    {
        URL url = getClass().getResource("/image/icon/"+index +".png");
        if (url != null) {
            return new ImageIcon(url);
        }
        else
        { 
            System.out.println("khong thay");
            return  null;
        }
    }
    
    private void addMenu (String menuName, int index) 
    {
        int length = menuItems[index].length;
        menuItem item = new menuItem (menuName, index, length >1) ;
        
        Icon icon = getIcon(index);
        if (icon != null) {
            item.setIcon(icon);
        }
        
        item.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                if (length > 1) {
                    if(item.isSelected() == false) {                        
                        addSubMenu(item,index, length, getComponentZOrder(item));
                        item.setSelected(true);
                        System.out.println("show "+item.isSelected());
                    } 
                    else{
                        hideMenu(item,index);
                        item.setSelected(false);
                        System.out.println("hide " +item.isSelected());                   
                    }
                }
            }
        });
        add (item);
        revalidate();
        repaint();
    }
    
    private void addSubMenu (menuItem item, int index,int length, int indexZ){
        JPanel panel = new JPanel(new MigLayout ("wrap 1, fillx, inset 0,gapy 0","fill")); 
        panel.setName(index + "");
        panel.setOpaque (false) ;
        for(int i= 1;i < length; i++)
        {
            menuItem subitem = new menuItem(menuItems[index][i],i,false);
            subitem.initmenuItem(i, length) ;
            panel.add (subitem) ;
        }
        add (panel,"h 0!",indexZ+1) ;
        revalidate();
        repaint();
        MenuAnimation.showMenu(panel, item, layout, true);
    }
    
    private void hideMenu(menuItem item, int index) {
        for(Component com:getComponents()) {
            if(com instanceof JPanel&&com.getName() != null&&com.getName().equals( index+"")) {
                com.setName(null) ;
                MenuAnimation.showMenu(com, item, layout, false);     
                break;                
            }            
        }
     }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(new Color(21,110,71));
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
