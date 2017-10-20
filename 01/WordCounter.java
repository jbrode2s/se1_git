package se_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
	
	public static void main(String[] args){
		System.out.println(WCounter());
	}
	
	public static int WCounter() {
		File datei = new File("scan.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(datei);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int counter = 0;
		
		while(sc.hasNext()) {
			sc.next();
			counter++;
		}
		
		sc.close();
		return counter;
	}

}
