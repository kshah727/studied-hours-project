/**
 * File Name: StudiedHoursApp.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 19, 2017
 */
package com.sqa.ks;

import com.sqa.ks.helpers.*;

public class StudiedHoursApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appName = "Student";
		// String userName = AppBasics.greetUserandGetName(appName);
		calcStudiedHours();
		// AppBasics.farewellUser(userName, appName);
	}

	private static void calcStudiedHours() {
		// private static f;
		// private static double avgJoggedHours;
		int day1NumHours;
		int day2NumHours;
		// private static int day3NumHours;
		// private static int day4NumHours;
		// private static int day5NumHours;
		// private static int day6NumHours;
		// private static int day7NumHours;
		String day1hours = AppBasics.requestInfoFromUser("How many hours did you study today, day 01?");
		day1NumHours = Integer.parseInt(day1hours);
		int total1 = day1NumHours;
		String day2hours = AppBasics.requestInfoFromUser("How many hours did you study today, day 02?");
		day2NumHours = Integer.parseInt(day2hours);
		int total2 = day2NumHours + day1NumHours;
		System.out.println("you have studided a total of " + total2 + " hours");
		System.out.println("you have studided an avg of " + (total2 / 2) + " hours");
		if (total2 < 10) {
			System.out.println("You are studioes");
		} else if (total2 < 20) {
			System.out.println("You are very studious");
		} else {
			System.out.println("You are a nerd!");
		}
	}
}
