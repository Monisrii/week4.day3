package week4.day3;

public class Student extends Department {
public void StudentName()
{
System.out.println("Monika");	
}
public void Studentdept()
{
System.out.println("BCA");
}
public void StudentId()
{
	System.out.println("12345");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new Student();
obj.collegeName();
obj.deptName();
obj.collegeCode();
obj.collegeRank();
obj.StudentName();
obj.StudentId();
obj.Studentdept();

	}

}
