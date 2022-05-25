// 44 Write 4 different programs to implement all 4 layouts (Swings). 
// <applet name="P44" code="P44" width=200 height=200>

// </applet>
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class P44 {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JLabel msglabel;

   public P44(){
      prepareGUI();
   }
   public static void main(String[] args){
      P44 swingLayoutDemo = new P44();  
      swingLayoutDemo.showBorderLayoutDemo();    
	  swingLayoutDemo.showFlowLayoutDemo();   
	  swingLayoutDemo.showGridLayoutDemo();
	  swingLayoutDemo.showGridBagLayoutDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        
      statusLabel.setSize(350,100);
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   private void showBorderLayoutDemo(){

      JPanel panel = new JPanel();
      panel.setBackground(Color.darkGray);
      panel.setSize(300,300);
      BorderLayout layout = new BorderLayout();
      layout.setHgap(10);
      layout.setVgap(10);
      
      panel.setLayout(layout);        
      panel.add(new JButton("Center"),BorderLayout.CENTER);
      panel.add(new JButton("Line Start"),BorderLayout.LINE_START); 
      panel.add(new JButton("Line End"),BorderLayout.LINE_END);
      panel.add(new JButton("East"),BorderLayout.EAST);   
      panel.add(new JButton("West"),BorderLayout.WEST); 
      panel.add(new JButton("North"),BorderLayout.NORTH); 
      panel.add(new JButton("South"),BorderLayout.SOUTH); 

      controlPanel.add(panel);
      mainFrame.setVisible(true);  
   }
   private void showFlowLayoutDemo(){

	JPanel panel = new JPanel();
	panel.setBackground(Color.darkGray);
	panel.setSize(300,300);
	FlowLayout layout = new FlowLayout();
	layout.setHgap(10);
	layout.setVgap(10);
	
	panel.setLayout(layout);        
	panel.add(new JButton("Center"));
	panel.add(new JButton("Line Start")); 
	panel.add(new JButton("Line End"));

	controlPanel.add(panel);
	mainFrame.setVisible(true);  
 }
 private void showGridLayoutDemo(){
	headerLabel.setText("Layout in action: GridLayout");      
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.darkGray);
	panel.setSize(300,300);
	GridLayout layout = new GridLayout(0,3);
	layout.setHgap(10);
	layout.setVgap(10);
	
	panel.setLayout(layout);        
	panel.add(new JButton("Button 1"));
	panel.add(new JButton("Button 2")); 
	panel.add(new JButton("Button 3")); 
	panel.add(new JButton("Button 4")); 
	panel.add(new JButton("Button 5")); 
	controlPanel.add(panel);
	mainFrame.setVisible(true);  
 }
 private void showGridBagLayoutDemo(){
	headerLabel.setText("Layout in action: GridBagLayout");      

	JPanel panel = new JPanel();
	panel.setBackground(Color.darkGray);
	panel.setSize(300,300);
	GridBagLayout layout = new GridBagLayout();

	panel.setLayout(layout);        
	GridBagConstraints gbc = new GridBagConstraints();

	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbc.gridx = 0;
	gbc.gridy = 0;
	panel.add(new JButton("Button 1"),gbc);

	gbc.gridx = 1;
	gbc.gridy = 0;
	panel.add(new JButton("Button 2"),gbc); 

	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbc.ipady = 20;   
	gbc.gridx = 0;
	gbc.gridy = 1;
	panel.add(new JButton("Button 3"),gbc); 

	gbc.gridx = 1;
	gbc.gridy = 1;       
	panel.add(new JButton("Button 4"),gbc);  

	gbc.gridx = 0;
	gbc.gridy = 2;      
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbc.gridwidth = 2;
	panel.add(new JButton("Button 5"),gbc);  

	controlPanel.add(panel);
	mainFrame.setVisible(true);  
 }
}