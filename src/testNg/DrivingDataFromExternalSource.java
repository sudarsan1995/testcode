package testNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DrivingDataFromExternalSource {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties Prop=new Properties();
		FileInputStream file=new FileInputStream("G:\\Eclipse Projects\\TestNg\\src\\data.properties");
		Prop.load(file);
		
		Prop.getProperty("Browser");
		Prop.getProperty("Url");
	}

}
