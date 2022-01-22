package week1.day1;

public class Student {
	
	int rollno = 1234;
	public void College () {
		System.out.println("Studying in this is myCollege");
	}
	public static void main(String[] args) {
		Student obj = new Student();
	System.out.println("My Roll Number is : "+obj.rollno);
		obj.College();
	}

}
