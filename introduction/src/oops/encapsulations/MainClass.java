package oops.encapsulations;

import oops.encapsulations.models.Student;
import oops.encapsulations.models.Teacher;
import oops.encapsulations.models.*;

public class MainClass{
	public static void main(String[] args) {
		
		Student s1 = new Student("tom");
		Teacher t1 = new Teacher();
		
		s1.study();
		
	}
}