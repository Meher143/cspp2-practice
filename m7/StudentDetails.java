import java.util.Scanner;
class Student {
	 private String name;
     private String rollNumber;
     private float marks1;
     private float marks2;
	 private float marks3;
	Student(String n, String r, float m1, float m2, float m3)
	 {
	 //Constructor declaration//
     name = n;
     rollNumber = r;
     marks1 = m1;
     marks2 = m2;
     marks3 = m3;
	}
	double GPA() { //method declaration//
		double cgpa = (marks1 + marks2 + marks3)/3.0D;
		return cgpa;
	}
}	

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String rollNumber = sc.next();
		float m1 = sc.nextFloat();
		float m2 = sc.nextFloat();
		float m3 = sc.nextFloat();
		Student s = new Student(name, rollNumber, m1, m2, m3);
		System.out.println(s.GPA());
	}
}
