package week3.day1.org.student;
import week3.day1.org.department.Department;
public class Student extends Department{
public void studentID() {
	System.out.println("14BCT017");
}
public void studentName() {
	System.out.println("Kasthuri R");
}
public void studentDept() {
	System.out.println("CT");
}
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentID();
		st.studentName();
		st.studentDept();
	}

}
