package com.lab_assessment_6_Q4;

import java.io.*;
import java.util.*;

public class Biggest {
	
	public static void main(String[] args) {
	double max = 0.0;
	int val = 0;
	List<String> list = new ArrayList<>();
	try
	{
		Scanner sc = new Scanner(new FileReader("data.txt"));
		String line = null;
		while (sc.hasNext()) {
			line = sc.nextLine();
			list.add(line);
		}
		for (int i = 0; i < list.size(); i++) {
			val = Double.compare(Double.parseDouble(list.get(i)), max);
			if (val > 0) {
				max = Double.parseDouble(list.get(i));
			}
		}
	}catch(
	FileNotFoundException e1)
	{
		e1.printStackTrace();
	}catch(
	IOException e1)
	{
		e1.printStackTrace();
	}System.out.println(max);

}}