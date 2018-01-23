package ch11.exam06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		File originfile = new File(args[0]);
		File copyfile = new File(args[1]);
		
		//Connection Stream
		try {
			FileInputStream fis = new FileInputStream(originfile);
			FileOutputStream fos = new FileOutputStream(copyfile);
			
			int data = -1;
			while ((data = fis.read())!=-1) {
				fos.write(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
