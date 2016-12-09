package division;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class DIVISION extends JFrame {

int hor,vert,ma,mb;
public DIVISION() {
    initComponents();
}

private void initComponents() {
    Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
    vert = sSize.height;
    hor = sSize.width;
    //Setings of window//
    setSize(hor,vert);
    setResizable(true);
    //setUndecorated(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    //----------------//

    //Setings of buttons//
    ma=(hor/4);//height//
    mb=(vert/10);//width//
    //------------------//

    JPanel Menu = new JPanel();
    Menu.setLayout(null);
    Menu.setBackground(Color.red);
        JButton MBack = new JButton("Назад");
            MBack.setSize(ma, mb);
            MBack.setLocation((hor/2)-(ma/2),300);
            MBack.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    MBackActionPerformed(evt);
                }
            });
        JButton MSettings = new JButton("Настройки");
            MSettings.setSize(ma, mb);
            MSettings.setLocation((hor/2)-(ma/2),400);
            MSettings.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    MSettingsActionPerformed(evt);
                }
            });
        JButton MExit = new JButton("Выход");
            MExit.setSize(ma, mb);
            MExit.setLocation((hor/2)-(ma/2),500);
            MExit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    MExitActionPerformed(evt);
                }
            });
            
    Menu.add(MBack);Menu.add(MSettings);Menu.add(MExit);


   setContentPane(Menu); 
    
    

}                      

private void MBackActionPerformed(ActionEvent evt) {
    //
}

private void MSettingsActionPerformed(ActionEvent evt) {
    Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
    vert = sSize.height;
    hor = sSize.width;
    //Setings of window//
    setSize(hor,vert);
    setResizable(false);
    //setUndecorated(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    //----------------//

    //Setings of buttons//
    ma=(hor/4);//height//
    mb=(vert/10);//width//
    //------------------//
    JPanel SettingsMenu = new JPanel();
    SettingsMenu.setLayout(null);
    SettingsMenu.setBackground(Color.green);
        JButton SMBack = new JButton("Назад");
            SMBack.setSize(ma, mb);
            SMBack.setLocation((hor/2)-(ma/2),300);
            SMBack.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    SMBackActionPerformed(evt);
                }
            });
    SettingsMenu.add(SMBack);
    setContentPane(SettingsMenu);
}

private void MExitActionPerformed(ActionEvent evt) {
    System.exit(0);
}

private void SMBackActionPerformed(ActionEvent evt) {
   
}

public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new DIVISION().setVisible(true);
        }
    });
}

private JPanel Menu;
private JButton MExit;
private JButton MBack;
private JButton MSettings;
private JButton SMBack;
private JPanel SettingsMenu;                   
}