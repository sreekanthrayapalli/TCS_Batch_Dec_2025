package com.tcs.sample.ioexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) {
		//try with Resource
		try(FileInputStream fis = new FileInputStream("d:/iofiles/t3.txt")) {
			int i=0;
			StringBuffer sb = new StringBuffer();
			while((i=fis.read())!=-1){
				char ch=(char)i;
				sb.append(ch);
			}
			System.out.println(sb.toString());
			
		}catch(FileNotFoundException f) {
			System.err.println("file name is wrong");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
