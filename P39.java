//39	Write a program to create an Applet and use ``setBackground ()`` and ``setForeground ()``. 	
//38	Create an applet which accepts the messages as parameter and scrolls the message 	
import java.applet.*;
import java.awt.*;

public class P39 extends Applet{
	String msg;
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void start(){
	}
	public void destroy(){

	}	
	public void paint(Graphics g){
		msg = "Background set to CYAN and foreground to RED.";
		g.drawString(msg.toString(), 10,30);
	}
	public void stop(){
		msg += "stop";
	}
}