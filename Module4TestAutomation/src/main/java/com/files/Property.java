package com.files;


	import java.io.FileInputStream;
	import java.io.InputStream;
	import java.util.Properties;

	public class Property {
		static Properties prop = new Properties();
		public static void readProperties() {
			
			try {
				InputStream propfile = new FileInputStream(
						"C:\\Users\\ACER\\eclipse-workspace\\Module4TestAutomation\\src\\main\\java\\Config.properties");
				prop.load(propfile); 
				System.out.println(prop.getProperty("browser"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


