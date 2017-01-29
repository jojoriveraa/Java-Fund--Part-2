package greetings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import printing.BWCartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {

		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "MY PRINTER", new BWCartridge());

		Map<String, List<Integer>> testScores = new HashMap<String, List<Integer>>();

		List<Integer> jorgeScores = new ArrayList<Integer>();
		jorgeScores.add(80);
		jorgeScores.add(100);
		jorgeScores.add(50);
		jorgeScores.add(70);
		
		List<Integer> joeScores = new ArrayList<Integer>();
		joeScores.add(10);
		joeScores.add(20);
		joeScores.add(30);
		joeScores.add(100);
		
		List<Integer> alexScores = new ArrayList<Integer>();
		alexScores.add(100);
		alexScores.add(90);
		alexScores.add(30);
		alexScores.add(0);

		testScores.put("Jorge", jorgeScores);
		testScores.put("Joe", joeScores);
		testScores.put("Alex", alexScores);
		
		printScores("Jorge", testScores);

	}
	
	public static void printScores(String studentName, Map<String, List<Integer>> scoresMap) {
				List<Integer> scores = scoresMap.get(studentName);
				for (int score : scores){
					System.out.println(score);
				}
	}
}
