package com.tcs.sample.ioexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
		fos = new FileOutputStream("d:/iofiles/t1.txt");
		String s = "hello how are you";
		byte[]b = s.getBytes();
		fos.write(b);
		}catch(FileNotFoundException fis) {
			System.err.println("Location is wrong");
		} catch (IOException e) {
			System.err.println("some proble while writing the data");
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//try with Resouces
		try(FileOutputStream fos1 = new FileOutputStream("t2.txt");) {
			
			String s = "hello how are you";
			byte[]b = s.getBytes();
			fos1.write(b);
			}catch(FileNotFoundException fis) {
				System.err.println("Location is wrong");
			} catch (IOException e) {
				System.err.println("some proble while writing the data");
			}
	}

}
