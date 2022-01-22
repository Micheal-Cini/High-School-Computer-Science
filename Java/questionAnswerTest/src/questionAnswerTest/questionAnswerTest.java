package questionAnswerTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class questionAnswerTest {

	public static void main(String[] args) throws FileNotFoundException {
		Random rnd = new Random();
		int qst = rnd.nextInt(4);
		
		
		System.out.println(Questions(qst));
		ArrayList<String> answer = Answers(qst);
		
		String corAnswer = answer.get(0);
		
		Collections.shuffle(answer);
		
		System.out.println(answer);
		
		System.out.println(corAnswer);
		
		

	}
	
	public static String Questions(int qst) throws FileNotFoundException
	{
		File questions = new File("questions.txt");
		Scanner inputQuestions=new Scanner(questions);
		
		ArrayList <String> questionsArray=new ArrayList<String>();
		
		for (int i = 0; inputQuestions.hasNextLine(); i++) {
			String line = inputQuestions.nextLine();//Creates a variable to hold the next line in the text file
			questionsArray.add(i, line);//Adds that line to an array slot
		}
		
		inputQuestions.close();
		return questionsArray.get(qst);
		
		
	}
	
	public static ArrayList<String> Answers(int qst) throws FileNotFoundException {
		File answers = new File("answers.txt");
		Scanner inputAnswers=new Scanner(answers);
		
		ArrayList <String> answersArray=new ArrayList<String>();
		
		for (int i = 0; inputAnswers.hasNextLine(); i++) {
			String line = inputAnswers.nextLine();//Creates a variable to hold the next line in the text file
			answersArray.add(i, line);//Adds that line to an array slot
		}
		
		String str = answersArray.get(qst);
		
		ArrayList <String> qstAnswersArray=new ArrayList<String>((Arrays.asList(str.split(", "))));
		
		
		
		inputAnswers.close();
		return qstAnswersArray;
		
	}

}
