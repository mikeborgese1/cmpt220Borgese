// JA: Where is the course class defined?
public class ex10_9 {
	  public static void main(String[] args) {
	        course course = new course("Intro to Java :)");
	        for (int i = 0; i < 20; i++) {
	            course.addStudent("Student " + (i + 1));
	        }
	        String[] students = course.getStudents();
	        System.out.println(course.getCourseName());
	        for (int i = 0; i < students.length; i++) {
	            System.out.printf("%-12s ", students[i]);
	            if ((i + 1) % 5 == 0) {
	                System.out.printf("\n");
	            }
	        }
	        System.out.println("Number of students: " + course.getNumberOfStudents());
	        System.out.println("\nDropping two students from course..");
	        System.out.println("Student #1 dropped.");
	        course.dropStudent("Student " + (1));
	        System.out.println("Student #8 dropped.");
	        course.dropStudent("Student " + (8));
	        System.out.println("Displaying students...\n");
	        for (int i = 0; i < course.getNumberOfStudents(); i++) {
	            System.out.printf("%-12s ", students[i]);
	            if ((i + 1) % 5 == 0) {
	                System.out.printf("\n");
	            }
	        }
	        System.out.println("\nNumber of students: " + course.getNumberOfStudents());
	    }
}
