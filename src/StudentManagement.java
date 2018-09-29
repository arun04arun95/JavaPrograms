import com.projects.Student;

public class StudentManagement {

	public static void main(String[] args) {
		Student student = new Student();
		double total = 0;
		student.setName("Arun");
		student.setChemistry(129);
		student.setComputerScience(167);
		student.setEnglish(100);
		student.setMaths(184);
		student.setPhysics(157);
		student.setRollNumber("Arun");
		student.setTamil(122);
		total = student.getChemistry()+ 
				student.getComputerScience()+
				student.getEnglish()+
				student.getMaths()+
				student.getPhysics()+
				student.getTamil();
		student.setTotal(total);
		System.out.println(student.getName());
		System.out.println(student.getTotal());
		System.out.println(student.getName().hashCode());
		System.out.println(student.getRollNumber().hashCode());
		
	}
}