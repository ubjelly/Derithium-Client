import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;
import java.awt.Container;
import java.awt.Dimension;
import java.net.*;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClientLoader extends Applet
{
	public static Properties props = new Properties();
	public JFrame frame;
	private JPanel jp = new JPanel();

	public static void main(String[] paramArrayOfString)
	{
		new ClientLoader("1");
	}

	public ClientLoader(String wld) {
		try {
			this.frame = new JFrame("Derithium");
			this.frame.setLayout(new BorderLayout());
			this.frame.setResizable(true);
			this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.jp.setLayout(new BorderLayout());
			this.jp.add(this);
			this.jp.setPreferredSize(new Dimension(765, 503));
			this.frame.getContentPane().add(this.jp, "Center");
			this.frame.pack();
			this.frame.setVisible(true);
			props.put("worldid", wld);
			props.put("members", "1");
			props.put("modewhat", "0");
			props.put("modewhere", "0");
			props.put("safemode", "0");
			props.put("game", "0");
			props.put("js", "1");
			props.put("lang", "0");
			props.put("affid", "0");
			props.put("lowmem", "0");
			props.put("settings", "kKmok3kJqOeN6D3mDdihco3oPeYN2KFy6W5--vZUbNA");
			Signlink sn = new Signlink(this, 32, "runescape", client.indexCount);
			client.providesignlink(sn);
			client localclient = new client();
			localclient.init();
		} catch (Exception localException) {
			localException.printStackTrace();
		}
	}
	public String getParameter(String paramString)
	{
		return ((String)props.get(paramString));
	}

	public URL getDocumentBase() {
		return getCodeBase();
	}

	public URL getCodeBase() {
		try {
			return new URL("http://127.0.0.1");
		} catch (MalformedURLException localException) {
			localException.printStackTrace();
			return null;
		}
	}
}