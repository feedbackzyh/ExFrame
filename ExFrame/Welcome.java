package hospital;

import java.awt.*;
import javax.swing.*;


public class Welcome extends JFrame implements Runnable {
	Thread t;
	private LoginGraphics loginGraphics_IL;

	public static void main(String[] args) {
		Welcome inst = new Welcome();
		inst.setVisible(true);
	}

	public Welcome() {
		super();
		t = new Thread(this);
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			setUndecorated(true);
			
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

			// setIconImage(Toolkit.getDefaultToolkit().getImage("image/f.gif"));
			setTitle("hospital");
			// setLayout(new FlowLayout());
	
			setSize(580, 486);
			//获取屏幕大小，确定显示位置
			setLocation((screen.width - getWidth()) / 2, (screen.height - getHeight()) / 2);
			{
				loginGraphics_IL = new LoginGraphics();
				add(loginGraphics_IL);
				loginGraphics_IL.setBorder(BorderFactory.createCompoundBorder(null, null));
				loginGraphics_IL.setBackground(new java.awt.Color(192, 192, 192));
			}
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			Thread.sleep(3000);
			new MainFrame();
			this.setVisible(false);
			t.interrupt();
		} catch (InterruptedException e) {
		}
	}
}
