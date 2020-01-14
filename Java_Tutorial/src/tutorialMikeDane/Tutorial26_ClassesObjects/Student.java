package tutorialMikeDane.Tutorial26_ClassesObjects;

public class Student {
	
	String name;
	String major;
	double gpa;
	
	public Student(String name, String major, double gpa) {
		this.name = name;
		this.gpa = gpa;
		this.major = major;
	}
	
	//Find out if Student is on Honour Role (GPA must be greater than 3.5)
	public boolean isOnHonourRole() {
		if(this.gpa >= 3.5){
			return true;
		}else {
			return false;
		}
	}

}
