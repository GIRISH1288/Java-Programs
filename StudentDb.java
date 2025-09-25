package array;

public class StudentDb {

	private String user ;
	private String pass;
	private Student[] db = new Student[10];
	private boolean checklogin ;
	private int size ; 
	
	public StudentDb() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentDb(String user , String pass) {
		// TODO Auto-generated constructor stub
		this.user = user;
		this.pass = pass;
		System.out.println("DB created !");
	}
	
	public boolean login(String user , String pass) {
	  if(user==this.user &&  pass ==this.pass) 
	  {
		  checklogin = true ;
		  System.out.println("login succesfully !");
		  return true;
	  }
		System.out.println("login failed");
		return false;
		
	}
	
	public boolean  addStudent(String name , int age , int year , String degree ,String blood, char gender , int roll , int marks ) {

		if(checklogin) {
			if(size<db.length*0.7) {
				db[size] = new Student (name ,age ,year,degree,blood , gender,roll,marks);
				
				size++;
				System.out.println(name+" Student added !");
				return true;
			}
			else {
				Student []temp = new Student[db.length*2];
				for(int i = 0; i<size;i++) {
					temp[i] = db[i];
					
				}
				System.out.println("new arr");
				db = temp;
				db[size] = new Student(name , age,year,degree,blood,gender,roll,marks);
				size++;
				System.out.println(name+" Student added !");
				return true;
			}
		}
		System.out.println("plase login !");
		return false;
	
	
	}
	
	public void printDB() {
  if(checklogin) {
	  for(int i = 0 ; i<size ; i++) {
		  System.out.println(db[i]);
	  }
  }		
  else {
	  System.out.println("please login !");
  }
}
	
	public boolean SearchByName(String name ) {
   
		if(checklogin) {
			for(int i = 0;i<size;i++) {
				if(db[i].name.equalsIgnoreCase(name)) {
					return true;
				}
			}
		}
		return false;
	}
	/////sort by name 
	public void sortByName() {
		if(checklogin) {
			for(int i = 0 ; i<size-1;i++) {
				for(int j =0  ; j<size-1 ;j++) {
					if(db[j].name.compareTo(db[j+1].name)>0) {
						Student temp = db[j];
						db[j] = db[j+1];
						db[j+1]= temp;
						
					}
				}
			}
			
		 }
		else {
			System.out.println("please login !");
		}
		}
	
	
	//remove by name 
 public boolean removeByName (String name ) {
	 if(checklogin) {
		 int i = 0 ;
		 for( ; i<size;i++) {
			 if(db[i].name.equals(name)) {
				 break;
			 }
		 }
		 if(i<size) {
			 Student temp []=new Student[db.length-1];
			 for(int j = 0; j<size;j++) {
				 if(j<i) {
					 temp[j] = db[j];
				 }
				 else if(j>i) {
					 temp[j-1] =db[j];
				 }
			 }
			 size--;
			 db= temp;
			 System.out.println(name +"removed from db!");
			 return true;
		 } 
		 else {
			 System.out.println("Student not found ! !");
			 return false; 
		 }
	 
	 }
	 else {
		 System.out.println("please login !");
		 return false;
	 }
	 
 }
 
 public void sortByRollno() {
	 if(checklogin) {
		 for(int i = 0 ; i<size-1;i++) {
			 for(int j = 0; j<size-1;j++) {
				 if(db[j].roll > db[j+1].roll) {
					 Student temp = db[j];
					 db[j] = db[j+1];
					 db[j+1]=temp;
					 
				 }
			 }
		 }
	 }
	 else {
		 System.out.println("please login !");
	 }
	
}
 
 public void sortByMarks() {
	if(checklogin) {
		for(int i = 0 ; i<size-1;i++) {
			for(int j = 0 ; j<size-1;j++) {
				if(db[j].roll >db[j+1].roll) {
					Student temp = db[j];
					db[j] = db[j+1];
					db[j+1] = temp;
				
				}
				
			}
			
		}
		
	}
	else {
		System.out.println("pleaee login !");
	}
	
 
 }
 public boolean addByPhno(String name, int age, int year, String degree, String blood, char gender, int roll, int marks,
long phno){
	 if(checklogin) {
		 if(size<db.length*0.7) {
			db[size] = new Student(name  , age , year , degree , blood , gender , roll , marks , phno); 
			size++;
			System.out.println(name +"Added with phno "+phno);
			return true;
		 }
		 else {
			 Student []temp = new Student[db.length*2];
			 for(int i = 0 ;i< size; i++) {
				 temp[i] = db[i];
			 }
			 System.out.println("new arr");
			 db = temp;
			 db[size] = new Student(name  , age , year , degree , blood , gender , roll , marks , phno);
			 size++;
			 System.out.println(name +"Added with phno "+phno);
			 return true;
		 }
		 
	 }
	 else {
		 System.out.println("please login !");
		 return false;
	 }
	
	
}
 public void removeByRollno() {
	
}
 
 

 

 
 
 
 
 
 }
   


