package array;

public class StudentDriver {

	public StudentDriver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//public Student(String name, int age, int year, String degree, String blood, char gender, int roll, int marks) {
		StudentDb s1 = new StudentDb("Admin","pass");
		s1.login("Admin", "pass");
		s1.addStudent("Anjali" , 20,2026,"BA" , "B+" ,'F' ,112,370);
		s1.addStudent("Deepak" , 21,2025,"BBA" , "O+" ,'M' ,113,455);
		s1.addStudent("Pooja" , 19,2027,"BCA" , "A-" ,'F' ,114,490);
		s1.addStudent("Vikram" , 23,2023,"BTECH" , "B+" ,'M' ,115,515);
		s1.addStudent("Sneha" , 18,2028,"BE" , "O-" ,'F' ,116,385);
		s1.addStudent("Karthik" , 22,2024,"BSc" , "A+" ,'M' ,117,530);
		s1.addStudent("Ravi" , 21,2025,"BSc" , "A+" ,'M' ,103,480);
		s1.addStudent("Priya" , 19,2026,"BCom" , "B+" ,'F' ,104,510);
		s1.addStudent("Amit" , 22,2024,"BA" , "O-" ,'M' ,105,445);
		s1.addStudent("Neha" , 20,2025,"BBA" , "AB+" ,'F' ,106,520);
		s1.addStudent("Arjun" , 23,2023,"BCA" , "B-" ,'M' ,107,395);
		s1.addStudent("Kiran" , 21,2024,"BTECH" , "A" ,'F' ,108,460);
		s1.addStudent("Rohit" , 19,2027,"BE" , "O+" ,'M' ,109,540);
		s1.addStudent("Meera" , 18,2027,"BSc" , "AB-" ,'F' ,110,410);
		s1.addStudent("Sunil" , 22,2024,"BCom" , "A+" ,'M' ,111,505);
		
		System.out.println("____________________________________________________");
		s1.printDB();
		System.out.println("____________________________________________________");
		
	//System.out.println(s1.SearchByName("ena"));
	//s1.sortByName();
	//System.out.println("_______________________after sort___________________________");
	//s1.printDB();
	//System.out.println("____________________________________________________");
    //s1.sortByRollno();
   // s1.printDB();
    s1.addByPhno("john", 20, 2027, "BE", "o-", 'M', 117, 530, 9270043263l);
    s1.printDB();
    
	
	}

}
