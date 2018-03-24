
public class course {
	private String name;
    private String[] students = new String[10];
    private int num;

    public course(String name) {
        this.name = name;
    }

    public void addStudent(String student) {

        if (num >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[num++] = student;
    }

    public String[] getStudents() {

        return students;
    }

    public int getNumberOfStudents() {
        return num;
    }

    public String getCourseName() {
        return name;
    }

    public void dropStudent(String student) {

        for (int i = 0; i < students.length; i++) {

            if (student.equalsIgnoreCase(students[i])) {

                students[i] = null; // sets dropped student's value to null
                num--;
                while (i < num) {
                    students[i] = students[i + 1];
                    i++;
                }
                break;
            }
        }

    }

    public void clear(){
        students = new String[25];
        num = 0;
    }

    public Object clone() {
        course course = null;
        try {
            course = (course)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        course.students = students.clone();
        course.name = new String(name);

        return course;
    }

}
