package week3.day1.studentinfo;

public class Students {
	
	
	public void getStudentInfo(int id) {
		System.out.println("Student Id is " +id);
	}
		
	public void getStudentInfo(String name) {
		System.out.println("Student name is " +name);
	}
	
	public void getStudentInfo(String email, long phonenum) {
		System.out.println("email id and phonenum are " +email +phonenum);
	}
	public static void main(String[] args) {
	Students stinfo = new Students();
	stinfo.getStudentInfo("Kasthuri");
	stinfo.getStudentInfo("14321");
	stinfo.getStudentInfo("Kasthuri@gmail.com",   787196047);
	}
}
