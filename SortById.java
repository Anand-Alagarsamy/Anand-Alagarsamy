package Student;

import java.util.Comparator;

public class SortById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentId-o2.studentId;
	}
	

}
