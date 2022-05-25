import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

import org.w3c.dom.css.RGBColor;

//40	Write a program to create an Applet and use ``setColor ()``, ``drawString ()``, ``drawLine ()``, ``drawRect ()`` etc.
public class P40 extends Applet{
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawRect(10, 50, 20, 30);
		g.setColor(Color.red);
		g.drawLine(90, 100, 110, 120);
		g.setColor(new Color(100,90,90));
		g.drawString("Example String", 30, 20);
	}

}