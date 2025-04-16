package com.cts.creatio.crm.language.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {
//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.	
		
		List <String> city= new ArrayList<String>();
		
		city.add("Delhi");
		city.add("Bangalore");
		city.add("Visakhapatnam");
		city.add("Lucknow");
		city.add("Indore");
		
		List<Integer> area=new ArrayList <Integer>();
		
		area.add(1484);
		area.add(714);
		area.add(640);
		area.add(631);
		area.add(564);
		
		System.out.println("Total area of the "+city.get(2)+" and "+city.get(3)+" is "+area.get(2)+area.get(3));

// 2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		
		HashSet <String> TrouristPlaces= new LinkedHashSet<String>();
		TrouristPlaces.add("Las Vegas Strip");
		TrouristPlaces.add("Times Square, New York City");
		TrouristPlaces.add("Central Park, New York City");
		TrouristPlaces.add("The Louvre, Paris");
		TrouristPlaces.add("Eiffel Tower, Paris");
		TrouristPlaces.add("Disneyland Park, California");
		TrouristPlaces.add("Disney World, Florida");
		TrouristPlaces.add("Grand Bazaar, Istanbul");
		TrouristPlaces.add("Colosseum, Rome");
		TrouristPlaces.add("Taj Mahal, India");
		
		System.out.println("Top 10 most visited tourist attractions in the world are: "+TrouristPlaces+" and their size is "+TrouristPlaces.size());

	
//Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.	
	
	int [] number=new int [10];
	number[0]=10;
	number[1]=10;
	number[2]=10;
	number[3]=20;
	number[4]=30;
	number[5]=40;
	number[6]=50;
	number[7]=60;
	number[8]=70;
	number[9]=80;

	System.out.println("Average of 5th and 6th Value is: "+(number[4]+number[5])/2);
	
	
//Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.	
	
	List <String> movies= new ArrayList<String>();
	movies.add ("Avatar (2009), $2.9 billion");
	movies.add ("Avengers: Endgame (2019), $2.7 billion");
	movies.add ("Titanic (1997), $2.2 billion");
	movies.add ("Star Wars: Episode VII - The Force Awakens (2015), $2.07 billion");
	movies.add ("Avengers: Infinity War (2018), $2.05 billion");
	
	System.out.println("Third movie on the list is: " +movies.get(2));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
