package dataAccess;

import entities.Insstructor;

public class HibernateInstructorDao implements InstructorDao {
	public void add(Insstructor insstructor) {
		System.out.println("Hibernate ile eğitmen veritabanına eklendi.");
	}

}
