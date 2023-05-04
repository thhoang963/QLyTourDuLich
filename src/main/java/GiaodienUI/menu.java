/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaodienUI;

import java.awt.Component;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        {"Du_Lịch","Tour_Miền_Bắc","Tour_Miền_Trung","Tour_Miền_Tây_Nam_Bộ","Tour_Miền_Đông_Nam_Bộ"},
        {"Tab3"},
        {"Tab4"}
    };

    public menu() {
        init();
    }

    private void init() {
        layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2","fill");
        setLayout(layout);
        
        for(int i= 0;i < menuItems.length; i++)
        {
            addMenu(menuItems[i][0], i) ;   
        }
    }
    
    private Icon getIcon(int index)
    {
        URL url = getClass().getResource("/picture/icon/icon"+ index +".png");
        if (url != null) {
            return new ImageIcon(url);
        }
        else
        { return  null;}
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
                    if(item.isSelected()== true){
                        hideMenu(item,index);
                        item.setSelected(false);
                        System.out.println("hide " +item.isSelected());                   
                    }
                    if(item.isSelected() == false) {
                        item.setSelected(true);
                        addSubMenu(item,index, length, getComponentZOrder(item));
                        System.out.println("show "+item.isSelected());
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
}
