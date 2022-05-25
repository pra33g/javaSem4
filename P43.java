//43	Create Adapter class for mousemotion listener	
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet name="Program 43" code="Program43" width=200 height=200>

</applet>
*/
class MyMouseMotionAdapter implements MouseMotionListener{
	@Override
	public void mouseDragged(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {}
}

class MyMouseMotionAdapterExtender extends MyMouseMotionAdapter{
	Program43 applet = null;
	public MyMouseMotionAdapterExtender(Program43 _applet){
		this.applet = _applet;
		applet.message = "Starting.";
	} 
	public void mouseDragged(MouseEvent e) {
		applet.message = "Dragged Mouse";
	}
	public void mouseMoved(MouseEvent e) {
		applet.message = "Moved Mouse";
	}
}


public class Program43 extends Applet implements Runnable{
	String message;
	Thread t;
	public void init(){
		message = null;
		Program43 app = this;
		t = new Thread(this);
		addMouseMotionListener(new MyMouseMotionAdapter(){
			@Override
			public void mouseDragged(MouseEvent e) {
				app.message = "Moved and Dragged me!";
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				app.message = "Moved me!";
			}
		});
		// addMouseMotionListener(new MyMouseMotionAdapterExtender(this));
		t.start();
	}

	@Override
	public void run() {
		try {
			while(true){
				repaint();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	@Override
	public void stop() {
		
	}
	@Override
	public void paint(Graphics g) {
		g.drawString(message, 10, 20);
	}
}