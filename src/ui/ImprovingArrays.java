package ui;

import java.util.ArrayList;

public class ImprovingArrays {
	
	public static void main(String[] args) {
		ArrayList<String> myArrayList = new ArrayList<String>();
		
		myArrayList.add("first item");
		boolean result = myArrayList.add("second item");
		System.out.println(result);
		myArrayList.add("third item");
		myArrayList.add("fourth item");
		
		System.out.println(myArrayList.size());
		
		for(int i =0; i < myArrayList.size(); i++)
	}
}
