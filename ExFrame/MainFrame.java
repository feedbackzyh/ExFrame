package hospital;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyVetoException;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

//import Net.NetTools;

public class MainFrame extends JDesktopPane implements ActionListener {
	Dimension screen;
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	final JPanel opPane = new JPanel();
	private JMenuBar fMenu;
	private JMenu fMenuSys;
	private JMenuItem fMenuExit;
	// 入院管理
	private JMenu fMenuRy;
	private JMenuItem fMenuRyLogin;
	private JMenuItem fMenuRyquery;
	// 预交金管理
	private JMenu fMenuYj;
	private JMenuItem fMenuYjfee;
	private JMenuItem fMenuYjdcount;
	private JMenuItem fMenuYjcount;
	private JMenuItem fMenuYjquery;
	// 病历管理
	private JMenu fMenuBl;
	private JMenuItem fMenuBlquery;
	private JMenuItem fMenuBlmaint;
	private JMenuItem fMenuBlLogin;
	// 出院管理
	private JMenu fMenuCy;
	private JMenuItem fMenuCyLogout;
	private JMenuItem fMenuCyBack;
	private JMenuItem fMenuCyCount;
	// 锟斤拷询统锟斤拷
	private JMenu fMenuCq;
	private JMenuItem fMenuNullBed;
	private JMenuItem fMenuCountP;
	// 床位
	private JMenu fMenuBed;
	private JMenuItem fMenuSetBed;
	private JMenuItem fMenuSetP;
	private JMenuItem fMenuDBed;

	// private Icon ico;

	JFrame frame;

	// Tool tool;
	public MainFrame() {
		// JFrame.setDefaultLookAndFeelDecorated(true);
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = frame.getContentPane();
		container.add(this, BorderLayout.CENTER);
		this.setPreferredSize(new java.awt.Dimension(800, 550));
		frame.setTitle("hospital");
		// Image ico=Toolkit.getDefaultToolkit().getImage("Image/f.gif");
		// frame.setIconImage(ico);
		frame.setResizable(false);
		screen = toolkit.getScreenSize();
		frame.setLocation((screen.width - 800) / 2, screen.height / 2 - 600 / 2);// 锟斤拷锟节讹拷位
		// 锟斤拷硬说锟�
		fMenu = new JMenuBar();
		frame.setJMenuBar(fMenu);
		fMenu.setPreferredSize(new java.awt.Dimension(392, 23));
		{
			fMenuSys = new JMenu();
			fMenu.add(fMenuSys);
			fMenuSys.setText("系统(S)");
			fMenuSys.setFont(new Font("x", Font.PLAIN, 12));
			// 锟斤拷锟矫匡拷菁锟�
			fMenuSys.setMnemonic(java.awt.event.KeyEvent.VK_S);
			fMenuSys.setRolloverEnabled(true);
			{
				fMenuExit = new JMenuItem();
				fMenuSys.add(fMenuExit);
				fMenuExit.setText("退出系统");
				fMenuExit.addActionListener(this);
				fMenuExit.setFont(new Font("x", Font.PLAIN, 12));
				// fMenuExit.setIcon(new
				// ImageIcon(getClass().getClassLoader().getResource("Image/leave.gif")));
			}
		}
		{
			fMenuRy = new JMenu();
			fMenu.add(fMenuRy);
			fMenuRy.setText("入院管理(R)");
			fMenuRy.setFont(new Font("x", Font.PLAIN, 12));
			fMenuRy.setMnemonic(java.awt.event.KeyEvent.VK_R);
			fMenuRy.setRolloverEnabled(true);
			{
				fMenuRyLogin = new JMenuItem();
				fMenuRy.add(fMenuRyLogin);
				fMenuRyLogin.setText("入院登记");
				fMenuRyLogin.addActionListener(this);
				fMenuRyLogin.setFont(new Font("x", Font.PLAIN, 12));
				// fMenuKey.setIcon(new
				// ImageIcon(getClass().getClassLoader().getResource("Image/lx_1.gif")));
			}
			{
				fMenuRyquery = new JMenuItem();
				fMenuRy.add(fMenuRyquery);
				fMenuRyquery.setText("入院查询");
				fMenuRyquery.addActionListener(this);
				fMenuRyquery.setFont(new Font("x", Font.PLAIN, 12));
				// fMenuRyquery.setIcon(new
				// ImageIcon(getClass().getClassLoader().getResource("Image/lx_2.gif")));
			}

		}

		{
			fMenuYj = new JMenu();
			fMenu.add(fMenuYj);
			fMenuYj.setText("预交金管理(Y)");
			fMenuYj.setFont(new Font("x", Font.PLAIN, 12));
			fMenuYj.setMnemonic(java.awt.event.KeyEvent.VK_Y);
			fMenuYj.setRolloverEnabled(true);
			{
				fMenuYjfee = new JMenuItem();
				fMenuYj.add(fMenuYjfee);
				fMenuYjfee.setText("交纳预交金");
				fMenuYjfee.addActionListener(this);
				fMenuYjfee.setFont(new Font("x", Font.PLAIN, 12));
			}
			{
				fMenuYjdcount = new JMenuItem();
				fMenuYj.add(fMenuYjdcount);
				fMenuYjdcount.setText("预交金日结");
				fMenuYjdcount.addActionListener(this);
				fMenuYjdcount.setFont(new Font("x", Font.PLAIN, 12));
			}
			{
				fMenuYjcount = new JMenuItem();
				fMenuYj.add(fMenuYjcount);
				fMenuYjcount.setText("预交金统计");
				fMenuYjcount.addActionListener(this);
				fMenuYjcount.setFont(new Font("x", Font.PLAIN, 12));
			}
			{
				fMenuYjquery = new JMenuItem();
				fMenuYj.add(fMenuYjquery);
				fMenuYjquery.setText("预交金查询");
				fMenuYjquery.addActionListener(this);
				fMenuYjquery.setFont(new Font("x", Font.PLAIN, 12));
			}
		}

		{
			fMenuBl = new JMenu();
			fMenu.add(fMenuBl);
			fMenuBl.setText("住院病历（Z）");
			fMenuBl.setFont(new Font("x", Font.PLAIN, 12));
			fMenuBl.setMnemonic(java.awt.event.KeyEvent.VK_Z);
			fMenuBl.setRolloverEnabled(true);
			{
				fMenuBlLogin = new JMenuItem();
				fMenuBl.add(fMenuBlLogin);
				fMenuBlLogin.setText("病历录入");
				fMenuBlLogin.addActionListener(this);
				fMenuBlLogin.setFont(new Font("x", Font.PLAIN, 12));
				// fMenuBlLogin.setIcon(new
				// ImageIcon(getClass().getClassLoader().getResource("Image/LAN.gif")));
			}
			{
				fMenuBlmaint = new JMenuItem();
				fMenuBl.add(fMenuBlmaint);
				fMenuBlmaint.setText("病历维护");
				fMenuBlmaint.addActionListener(this);
				fMenuBlmaint.setFont(new Font("x", Font.PLAIN, 12));
				// fMenuBlquery.setIcon(new
				// ImageIcon(getClass().getClassLoader().getResource("Image/Local.gif")));
			}
			{
				fMenuBlquery = new JMenuItem();
				fMenuBl.add(fMenuBlquery);
				fMenuBlquery.setText("病历查询");
				fMenuBlquery.addActionListener(this);
				fMenuBlquery.setFont(new Font("x", Font.PLAIN, 12));
				// fMenuBlquery.setIcon(new
				// ImageIcon(getClass().getClassLoader().getResource("Image/Local.gif")));
			}
		}

		{
			fMenuCy = new JMenu();
			fMenu.add(fMenuCy);
			fMenuCy.setText("出院管理(C)");
			fMenuCy.setFont(new Font("x", Font.PLAIN, 12));
			fMenuCy.setMnemonic(java.awt.event.KeyEvent.VK_C);
			fMenuCy.setRolloverEnabled(true);
			{
				fMenuCyLogout = new JMenuItem();
				fMenuCy.add(fMenuCyLogout);
				fMenuCyLogout.setText("出院登记");
				fMenuCyLogout.addActionListener(this);
				fMenuCyLogout.setFont(new Font("x", Font.PLAIN, 12));
			}
			{
				fMenuCyBack = new JMenuItem();
				fMenuCy.add(fMenuCyBack);
				fMenuCyBack.setText("出院招回");
				fMenuCyBack.addActionListener(this);
				fMenuCyBack.setFont(new Font("x", Font.PLAIN, 12));
			}
			{
				fMenuCyCount = new JMenuItem();
				fMenuCy.add(fMenuCyCount);
				fMenuCyCount.setText("出院统计");
				fMenuCyCount.addActionListener(this);
				fMenuCyCount.setFont(new Font("x", Font.PLAIN, 12));
			}
		}
		{
			fMenuCq = new JMenu();
			fMenu.add(fMenuCq);
			fMenuCq.setText("查询统计(Q)");
			fMenuCq.setFont(new Font("x", Font.PLAIN, 12));
			fMenuCq.setMnemonic(java.awt.event.KeyEvent.VK_Q);
			fMenuCq.setRolloverEnabled(true);
			{
				fMenuNullBed = new JMenuItem();
				fMenuCq.add(fMenuNullBed);
				fMenuNullBed.setText("空床");
				fMenuNullBed.addActionListener(this);
				fMenuNullBed.setFont(new Font("x", Font.PLAIN, 12));
			}
			{
				fMenuCountP = new JMenuItem();
				fMenuCq.add(fMenuCountP);
				fMenuCountP.setText("病人查询");
				fMenuCountP.addActionListener(this);
				fMenuCountP.setFont(new Font("x", Font.PLAIN, 12));
			}
		}
		{
			fMenuBed = new JMenu();
			fMenu.add(fMenuBed);
			fMenuBed.setText("床位管理(B)");
			fMenuBed.setFont(new Font("x", Font.PLAIN, 12));
			fMenuBed.setMnemonic(java.awt.event.KeyEvent.VK_B);
			fMenuBed.setRolloverEnabled(true);
			{
				fMenuSetBed = new JMenuItem();
				fMenuBed.add(fMenuSetBed);
				fMenuSetBed.setText("管理床位");
				fMenuSetBed.addActionListener(this);
				fMenuSetBed.setFont(new Font("x", Font.PLAIN, 12));
			}
			{
				fMenuSetP = new JMenuItem();
				fMenuBed.add(fMenuSetP);
				fMenuSetP.setText("处理病人");
				fMenuSetP.addActionListener(this);
				fMenuSetP.setFont(new Font("x", Font.PLAIN, 12));
			}
			{
				fMenuDBed = new JMenuItem();
				fMenuBed.add(fMenuDBed);
				fMenuDBed.setText("锟秸憋拷锟斤拷");
				fMenuDBed.addActionListener(this);
				fMenuDBed.setFont(new Font("x", Font.PLAIN, 12));
			}
		}

		opPane.setLayout(new FlowLayout(FlowLayout.TRAILING));
		JButton restore = new JButton("#");
		restore.setMargin(new Insets(0, 0, 0, 0));
		restore.setPreferredSize(new Dimension(15, 15));
		restore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InnerFrame i = (InnerFrame) getSelectedFrame();
				try {
					// notice this method, when JInternalFrame set maximun false
					// this internal frame will be set as old size
					i.setMaximum(false);
				} catch (PropertyVetoException ex) {
					ex.printStackTrace();
				}
				i.showNorthPanel();
				opPane.setVisible(false);
			}

		});
		opPane.add(restore);
		JButton close = new JButton("X");
		close.setMargin(new Insets(0, 0, 0, 0));
		close.setPreferredSize(new Dimension(15, 15));
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JInternalFrame i = getSelectedFrame();
				i.dispose();
				opPane.setVisible(false);
			}

		});
		opPane.add(close);
		fMenu.add(opPane);
		opPane.setVisible(false);
		// 锟斤拷庸锟斤拷锟斤拷锟�
		// tool=new Tool(this);
		// this.add(tool,1);
		// 锟斤拷锟斤拷锟斤拷旃わ拷锟斤拷锟�
		// Chat chat=new Chat(this);
		// this.add(chat,2);

		frame.pack();
		frame.setVisible(true);
	}

	// 实锟斤拷ActionListener锟接口的凤拷锟斤拷
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == fMenuExit) {
			// 锟斤拷锟斤拷确锟斤拷
			int i = JOptionPane.showConfirmDialog(this, "确定退出形同吗?", "hospital", JOptionPane.YES_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (i == 0) {
				System.exit(0);
			}
		}
		if (e.getSource() == fMenuRyLogin) {
			JPanel pane = new JPanel();
			Component add = pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuRyquery) {
			JPanel pane = new JPanel();
			pane.add(new JButton("dadao"));
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuYjfee) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuYjdcount) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuYjcount) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuYjquery) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuBlquery) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuBlmaint) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuBlLogin) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuCyLogout) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuCyBack) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuCyCount) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuNullBed) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuCountP) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuSetBed) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuSetP) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
		if (e.getSource() == fMenuDBed) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("dadadada"));
			showFrame(pane);
		}
	}

	private void showFrame(JPanel pane) {
		InnerFrame iFrame = new InnerFrame(pane);
		iFrame.setVisible(true);
		add(iFrame);

	}

	class InnerFrame extends JInternalFrame {

		/** The is hidden. */
		boolean isHidden = false;

		/** The old ui. */
		BasicInternalFrameUI oldUi = null;

		/**
		 * Instantiates a new inner frame.
		 */
		public InnerFrame(JPanel pane) {
			oldUi = (BasicInternalFrameUI) getUI();
			setSize(200, 200);
			maximizable = true;
			closable = true;
			iconable = true;
			setTitle("fight down the bear!");
			add(pane);
			addComponentListener(new ComponentAdapter() {
				public void componentResized(ComponentEvent e) {
					InnerFrame selectedFrame = (InnerFrame) e.getSource();
					if (selectedFrame.isMaximum()) {
						selectedFrame.hideNorthPanel();
						opPane.setVisible(true);
						try {
							selectedFrame.setMaximum(true);
						} catch (PropertyVetoException ex) {
							ex.printStackTrace();
						}
					}
				}
			});
		}

		/**
		 * Hide north panel.
		 */
		public void hideNorthPanel() {
			((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
			this.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
			isHidden = true;
		}

		/**
		 * Show north panel.
		 */
		public void showNorthPanel() {
			this.setUI(oldUi);
			this.putClientProperty("JInternalFrame.isPalette", Boolean.FALSE);
			isHidden = false;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.swing.JInternalFrame#updateUI()
		 */
		public void updateUI() {
			super.updateUI();
			if (isHidden) {
				hideNorthPanel();
			}
		}
	}
}