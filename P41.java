import java.applet.*;
//41	Write a program to create an Applet to display a moving banner	
import java.awt.Graphics;
import java.awt.Color;
public class P41 extends Applet implements Runnable{
	String banner;
	Thread t = null;
	boolean stop = false;
	@Override
	public void init() {
		banner = getParameter("banner");
		setForeground(Color.red);
		setBackground(Color.cyan);
		t = new Thread(this);
		stop = false;
		t.start();
	}
	@Override
	public void run() {
		char ch = 0;
		try{
			while(stop != true){
				repaint();
				ch = banner.charAt(0);
				Thread.sleep(300);
				banner = banner.substring(1);
				banner += ch;

			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public void stop() {
		
	}
	@Override
	public void paint(Graphics g) {
		g.drawString(banner, 10, 20);		
	}
}