
public class InstructorManager extends UserManager{
	
	public void addCours (Instructor instructor) 
	{
		System.out.println("E�itmenin "+instructor.instructorCourse +" kursu eklendi.");
	}

	public void addTrainings (Instructor instructor) 
	{
		System.out.println("E�itmenin "+instructor.instructorTrainings +" bilgileri");
	}

}

