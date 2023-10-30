
public class PersonViewerTest {

	public static void main(String[] args) {
		PersonViewer object = new PersonViewer();
		Person myStudent = new Student();
		Person myLecturer = new Lecturer();
		Person myEmployee = new Employee();
		
		object.view(myStudent);
		object.view(myLecturer);
		object.view(myEmployee);
		

	}

}
