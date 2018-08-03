package by.htp.belavia.util;

import java.util.ResourceBundle;

public class PropertyManager {
	private static final ResourceBundle rb;
	static {
		rb = ResourceBundle.getBundle("config");
	}

	public static String getChrome() {
		return rb.getString("chrome.driver");
	}

	public static String getChromePath() {
		return rb.getString("chrome.path");
	}

	public static String getBaseUrl() {
		return rb.getString("base.url");
	}

}
