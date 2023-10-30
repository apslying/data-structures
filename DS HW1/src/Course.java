
public class Course {
	private String coursenumber;
	private String coursename;
	private String time;
	private String room;
	private String students;
	private String instructor;
	private Boolean isFull;
	
	public Course(){
		
	}
	
	public Course(String coursenumber, String coursename, String time, String room,
			String students, String instructor, Boolean isFull) {
		this.coursenumber = coursenumber;
		this.coursename = coursename;
		this.time = time;
		this.room = room;
		this.students = students;
		this.instructor = instructor;
		this.isFull = isFull;
	}

	public String getCoursenumber() {
		return coursenumber;
	}

	public String getCoursename() {
		return coursename;
	}

	public String getTime() {
		return time;
	}

	public String getRoom() {
		return room;
	}

	public String getStudents() {
		return students;
	}

	public String getInstructor() {
		return instructor;
	}

	public Boolean getIsFull() {
		return isFull;
	}

	public void setCoursenumber(String coursenumber) {
		this.coursenumber = coursenumber;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public void setStudents(String students) {
		this.students = students;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public void setIsFull(Boolean isFull) {
		this.isFull = isFull;
	}
	
	
	
	
}
