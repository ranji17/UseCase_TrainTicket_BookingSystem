package TrainTicketBookingSystem;

import java.util.*;

public class PassengerDetails implements Comparable<PassengerDetails>
{
	private String Name;
	private int Age;
	private char Gender;
	
	public PassengerDetails(String name, int age, char gender) {
		super();
		this.Name = name;
		this.Age = age;
		this.Gender = gender;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		this.Gender = gender;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + Name + ", age=" + Age + ", gender=" + Gender + "]";
	}
       @Override
	public int compareTo(PassengerDetails p) {
		if(Age==p.Age)
		    return 0;
		
		else if(Age < p.Age)
			return 1;
		else
			return -1;
	}



}
