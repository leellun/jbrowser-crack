package jbrowser;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserContext;
import com.teamdev.jxbrowser.chromium.BrowserContextParams;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

public class Test {
	public static void main(String[] args) {
		Browser browser = new Browser(new BrowserContext(new BrowserContextParams("./txffc")));
		BrowserView view = new BrowserView(browser);
		int screenWidth = ((int) java.awt.Toolkit.getDefaultToolkit().getScreenSize().width);
		int screenHeight = ((int) java.awt.Toolkit.getDefaultToolkit().getScreenSize().height);
		JFrame frame = new JFrame();
		// 禁用close功能
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// 不显示标题栏,最大化,最小化,退出按钮
		// frame.setUndecorated(true);
		frame.setSize(screenWidth, screenHeight);
		frame.add(view, BorderLayout.CENTER);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
		browser.loadURL("www.baidu.com");
	}
}
