
public class StudentManager extends UserManager{
	
	public void addCourse (Student student) 
	{
	System.out.println("��renciye "+ student.studentCourse + " kursu eklendi!" );
	}
	
	public void addContact (Student student) 
	{
	System.out.println("��rencinin ileti�im bilgileri : "+ student.studentContact);
	}

}
