package lab11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CynemasApp {

	private static ArrayList<Cynemas> CynemasList = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String cont = "";
		String selection;
		Cynemas movies = new Cynemas();

		populateMovieList(movies);

		System.out.print("Welcome to the Movie List Application!");
		System.out.println(" There are 10 movies on this List.");
		
			do {
				System.out.print("What category are you interested in?");
				System.out.println(" Drama, Sci-fi, Animated, Horror:");
				selection = scnr.nextLine();

				for (Cynemas movie : CynemasList) {
					if (movie.getCategory().equalsIgnoreCase(selection)) {
						System.out.println(movie.getPickMovie());
					}
				}
				System.out.print("Continue? (y/n): ");
				cont = scnr.nextLine();
				}while (!cont.equalsIgnoreCase("n"));
			System.out.println("Go, check Netflix!");
				
		scnr.close();
	
	}

	public static void populateMovieList(Cynemas movie) {
		CynemasList.add(new Cynemas("Lion King", "animated"));
		CynemasList.add(new Cynemas("August: Osage County", "drama"));
		CynemasList.add(new Cynemas("Get Out", "horror"));
		CynemasList.add(new Cynemas("Alien", "sci-fi"));
		CynemasList.add(new Cynemas("The Grinch", "animated"));
		CynemasList.add(new Cynemas("The Devil Wears Prada", "drama"));
		CynemasList.add(new Cynemas("IT", "horror"));
		CynemasList.add(new Cynemas("CoCo", "animated"));
		CynemasList.add(new Cynemas("Moana", "animated"));
		CynemasList.add(new Cynemas("Pretty Women", "drama"));
	}

}