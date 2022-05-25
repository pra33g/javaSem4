//38	Create an applet which accepts the messages as parameter and scrolls the message 	
import java.applet.*;
import java.awt.*;
/*
<applet code=P38 height=100 width=100>
	<param name=param1 value=hello!>
</applet>
*/
public class P38 extends Applet{
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
		msg = getParameter("param1");
		g.drawString(msg.toString(), 10,30);
	}
	public void stop(){
		msg += "stop";
	}
}