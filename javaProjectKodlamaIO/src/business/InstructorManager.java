package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.InstructorDao;
import entities.Insstructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao,List<Insstructor> insstructorList, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Insstructor instructor) throws Exception {
		instructorDao.add(instructor);
	
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
	
}
