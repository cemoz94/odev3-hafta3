package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Course> courses;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, List<Course> courses, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		
	if (course.getPrice()<0) {
		throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
	}
	
	for(Course coursex:courses) {
		if (coursex.getName().equals(course.getName())) {
			throw new Exception("Kursların isimleri aynı olamaz.");
		}
	}
	
	courseDao.add(course);
	courses.add(course);
	for (Logger logger : loggers) {
		logger.log(course.getName());
		
	}
}
}
