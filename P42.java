//42	Write a program to create an Applet to handle mouse events.	
import java.applet.Applet;
import java.awt.event.*;

class MouseListenerAdapter1 extends MouseAdapter{
	P42 applet;
	public MouseListenerAdapter1(P42 _applet){
		this.applet = _applet;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		this.applet.showStatus("Mouse Clicked!");
	}
}
class MouseMotionAdapter1 extends MouseMotionAdapter{
	P42 applet;
	public MouseMotionAdapter1(P42 _applet){
		this.applet = _applet;
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		this.applet.showStatus("Moved Mouse!");
	}
}
public class P42 extends Applet {
	@Override
	public void init() {
		addMouseListener(new MouseListenerAdapter1(this));
		addMouseMotionListener(new MouseMotionAdapter1(this));
	}

}