import javax.naming.InitialContext;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import java.awt.*;
import java.awt.event.*;

//46	Write program to display combination of RGB using 3 scrollbars. 	
class P46 extends JFrame{
	Color panelBG;
	P46(){
		panelBG = new Color(0,0,0);
		initGui();
	}
	private void initGui(){
		setSize(400,300);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		P46 frame = this;
		// getContentPane().setBackground(Color.RED);
		setPreferredSize(new Dimension(400, 300));
    	pack();
		setVisible(true);
		this.setLayout(new GridLayout());

		
		JPanel p = new JPanel();
		p.setBounds(100, 120, 100, 120);
		p.setBackground(Color.blue);
		// p.setVisible(true);
		
		final JScrollBar r = new JScrollBar();
		final JScrollBar g = new JScrollBar();
		final JScrollBar b = new JScrollBar();
		r.addAdjustmentListener(new AdjustmentListener() {  
			public void adjustmentValueChanged(AdjustmentEvent e) {  
				p.setBackground(new Color(r.getValue(),panelBG.getGreen(),panelBG.getBlue()));
			}  
		});  
		g.addAdjustmentListener(new AdjustmentListener() {  
			public void adjustmentValueChanged(AdjustmentEvent e) {  
				p.setBackground(new Color(panelBG.getRed(),g.getValue(),panelBG.getBlue()));
				
			}  
		}); 
		b.addAdjustmentListener(new AdjustmentListener() {  
			public void adjustmentValueChanged(AdjustmentEvent e) {  
				p.setBackground(new Color(panelBG.getRed(),panelBG.getGreen(),b.getValue()));
				
			}  
		}); 
		r.setVisible(true);
		g.setVisible(true);
		b.setVisible(true);
		this.add(r);
		this.add(g);
		this.add(b);
		this.add(p);
	}
	public static void main(String[] args) {
		new P46();

	}
}