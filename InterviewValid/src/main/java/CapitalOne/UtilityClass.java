package CapitalOne;

import java.io.FileInputStream;
import java.util.Properties;

public class UtilityClass {
	public Properties readpropertyfile () {
		FileInputStream fs = new FileInputStream(null);
		Properties prop = new Properties ();
		prop.load(fs);
		return prop;
	}

}
