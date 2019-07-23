package net.guangbin.JavaGrammarReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsListTest {

	public static void test1() {
		String[] testArray = { "Jia", "You", "Ya" };
		List<String> testList = Arrays.asList(testArray);
		for (String s : testList) {
			System.out.println(s);
		}
	}

	public static void test2() {
		List<String> testList = Arrays.asList("Jia", "You", "Ya", "!!!");
		for (String s : testList) {
			System.out.println(s);
		}
	}

	public static void test3() {
		List<String> testList = new ArrayList<String>(Arrays.asList("Jia", "You", "Ya"));
		testList.add("!!!");
		for (String s : testList) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		System.out.println("<Test1>================================");
		ArrayAsListTest.test1();
		System.out.println("<Test2>================================");
		ArrayAsListTest.test2();
		System.out.println("<Test3>================================");
		ArrayAsListTest.test3();
	}

}
