import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

class P45u extends JFrame implements ActionListener {
    JMenu menu, welcome;
    JMenuItem morning, evening, afternoon;
    
    P45u(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(100, 100);
        setLayout(null);

        JMenuBar jmb = new JMenuBar();
        menu = new JMenu("Menu");
        welcome = new JMenu("Generate Greeting");
        menu.add(welcome);
        morning = new JMenuItem("morning");
        morning.addActionListener(this);
        evening = new JMenuItem("evening");
        evening.addActionListener(this);
        afternoon = new JMenuItem("afternoon");
        afternoon.addActionListener(this);
        
        welcome.add(morning);
        welcome.add(evening);
        welcome.add(afternoon);

        menu.addActionListener(this);
        
        
        jmb.add(menu);
        setJMenuBar(jmb);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == evening){
            JFrame popup = new JFrame("Greetings!");
            popup.setSize(50, 20);
            popup.setPreferredSize(new DimensionUIResource(300, 200));
            popup.setVisible(true);
            JLabel l = new JLabel("Good " + evening.getText() + "!", JLabel.CENTER);
            popup.getContentPane().add(l);
                        
        }
        if (e.getSource() == morning){
            JFrame popup = new JFrame("Greetings!");
            popup.setSize(50, 20);
            popup.setPreferredSize(new DimensionUIResource(300, 200));
            popup.setVisible(true);
            JLabel l = new JLabel("Good " + morning.getText() + "!", JLabel.CENTER);
            popup.getContentPane().add(l);
                        
        }
        if (e.getSource() == afternoon){
            JFrame popup = new JFrame("Greetings!");
            popup.setSize(50, 20);
            popup.setPreferredSize(new DimensionUIResource(300, 200));
            popup.setVisible(true);
            JLabel l = new JLabel("Good " + afternoon.getText() + "!", JLabel.CENTER);
            popup.getContentPane().add(l);
                        
        }
    }
    public static void main(String[] args) {
        new P45u();
    }
}
