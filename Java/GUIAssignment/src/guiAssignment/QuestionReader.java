package guiAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;




public class QuestionReader {
	//Creates a global random variable
	Random rnd = new Random();
	int qst = rnd.nextInt(18);

	public String Questions() throws FileNotFoundException
	{
		//Reads the questions from the text file
		File questions = new File("questions.txt");
		Scanner inputQuestions=new Scanner(questions);
		
		ArrayList <String> questionsArray=new ArrayList<String>();
		
		//Add the questions to an array
		for (int i = 0; inputQuestions.hasNextLine(); i++) {
			String line = inputQuestions.nextLine();//Creates a variable to hold the next line in the text file
			questionsArray.add(i, line);//Adds that line to an array slot
		}
		
		inputQuestions.close();
		
		//Returns the questions at the random array slot
		return questionsArray.get(qst);
	}
	
	public ArrayList<String> Answers() throws FileNotFoundException {
		//Reads the answers from a text file
		File answers = new File("answers.txt");
		Scanner inputAnswers=new Scanner(answers);
		
		ArrayList <String> answersArray=new ArrayList<String>();
		
		//Adds the answers to an array
		for (int i = 0; inputAnswers.hasNextLine(); i++) {
			String line = inputAnswers.nextLine();//Creates a variable to hold the next line in the text file
			answersArray.add(i, line);//Adds that line to an array slot
		}
		
		//Gets the list of answers at the array position
		String str = answersArray.get(qst);
		
		//Splits the list of answers into a separate array (Divided where ever there is a ", "
		ArrayList <String> qstAnswersArray = new ArrayList<String>((Arrays.asList(str.split(", "))));
		
		ArrayList <String> corAnswerArray = new ArrayList<String>((Arrays.asList(str.split(", "))));;
		
		//Shuffles the answers
		Collections.shuffle(corAnswerArray);
		
		
		//Adds the correct answer to the array so it can be read
		corAnswerArray.add(4, qstAnswersArray.get(0));
		
		inputAnswers.close();
		
		//returns the array
		return corAnswerArray;
		
	}
	
	
}
