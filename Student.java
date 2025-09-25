package array;

public class Student {

	 String name ; 
     int age ;
	 int year ;
	 String degree;
	 String blood ;
	 char gender;
	 int roll ;
	 int marks ;
	 long phno ;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, int year, String degree, String blood, char gender, int roll, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.year = year;
		this.degree = degree;
		this.blood = blood;
		this.gender = gender;
		this.roll = roll;
		this.marks = marks;
		
	}
	public Student(String name, int age, int year, String degree, String blood, char gender, int roll, int marks,
			long phno) {
		this(name , age ,year,degree ,blood,gender,roll,marks);
		this.phno = phno;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Name ="+name+", age =" +age +", year = " +year +" , degree =" +degree 
				+", blood group = "+blood +", gender = "+gender +", Roll no =" +roll +",marks = " +marks+"," + phno+" ]";
	}
	
	public void displayStudent() {
     System.out.println("Name :"+name );
     System.out.println("Age :" +age);
     System.out.println("Year :" +year);
     System.out.println("degree :" + degree);
     System.out.println("Blood  grp :"+blood );
     System.out.println("Gender :"+gender);
     System.out.println("roll no :" +roll);
     
     System.out.println("------------------------------------------------");
	}


}
