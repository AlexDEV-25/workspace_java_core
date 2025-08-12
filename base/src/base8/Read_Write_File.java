package base8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Read_Write_File {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("G:\\workspace_java_core\\base\\src\\base8\\xanadu");
			out = new FileOutputStream("G:\\workspace_java_core\\base\\src\\base8\\outagain");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (Exception e) {
			System.out.println("loi");
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
