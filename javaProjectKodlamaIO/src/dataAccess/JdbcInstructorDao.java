package dataAccess;

import entities.Insstructor;

public class JdbcInstructorDao implements InstructorDao{
	public void add(Insstructor insstructor) {
		System.out.println("JDBC ile eğitmen veritabanına eklendi.");
	}

}
