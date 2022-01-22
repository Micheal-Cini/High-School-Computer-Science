package ourLanguage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OurLanguage {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		
		File english = new File("english.txt");//Create/Access a file with the specified name
		Scanner englishFile=new Scanner(english);//Allows the specified file to be read
		
		File ourLanguage = new File("ourLanguage.txt");//Create/Access a file with the specified name
		Scanner ourLanguageFile=new Scanner(ourLanguage);//Allows the specified file to be read
	
		ArrayList<String> eng = new ArrayList<String>(); 
		ArrayList<String> our = new ArrayList<String>(); 
		
		for(int i = 0; englishFile.hasNextLine(); i++) {
			eng.add(i, englishFile.nextLine());
		}
		System.out.println(eng);
		for(int i = 0; ourLanguageFile.hasNextLine(); i++) {
			our.add(i, ourLanguageFile.nextLine());
		}
		
		System.out.println(our);
		while(true){
			
			System.out.println("1) Our Language to English \n"
					+ "2) English to Our Language");
			
		String menu = input.next();
			
			if(menu.equals("1")) {
				System.out.println("Go Ahead");
				input.nextLine();
				String sen = input.nextLine();
				String res = "";
				
				for (int i = 0; i < sen.length(); i++) {
					if(Character.isUpperCase(sen.charAt(i))) {
						//if (Character.isUpperCase(sen.charAt(i))&& Character.isUpperCase(res.charAt(1))) {
						//	System.out.println("HERE");
						//}
						
						res += sen.charAt(i);
					}
					else {
						res += sen.charAt(i);
					}
					System.out.println(res);
					
					
				}
				
				System.out.println(res+"Hello\n");
			}
			
			
			
			else if (menu.equals("2")) {
			System.out.println("Go Ahead");
			input.nextLine();
			String sen = input.nextLine();
			String res = "";
			
			for (int i = 0; i < sen.length(); i++) {
				
				if(Character.toString(sen.charAt(i)).equalsIgnoreCase(" ")) {
					res += " ";
				}
				
				for(int j = 0; j<eng.size(); j++) {
					
				if(Character.toString(sen.charAt(i)).equalsIgnoreCase(eng.get(j))) {
						res += our.get(j);
					}
				}
				
				
			}
			
			System.out.println(res+"\n");
			}
		}
		
		
	}

}
