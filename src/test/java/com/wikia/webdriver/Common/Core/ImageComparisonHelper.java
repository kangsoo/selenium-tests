package com.wikia.webdriver.Common.Core;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

public class ImageComparisonHelper {
	
	// exeFileName = {compare_x64.exe, compare.exe}
	public static void compareImages(String imageFirst, String imageSecond, String imageOutput, String exeFileName){
		File f = new File("." + File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator
				+ "ImageTools" + File.separator + exeFileName);
		try {
			String path = f.getCanonicalPath();
			String command = path + " "+imageFirst+" "+imageSecond+ " "+imageOutput;
			System.out.println(command);
			Runtime.getRuntime().exec(command).waitFor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
