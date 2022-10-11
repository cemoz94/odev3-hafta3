package javaProjectKodlamaIO;

import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.InstructorDao;
import entities.Category;
import entities.Course;
import entities.Insstructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("------Kurslar------");
		Course course1 = new Course(1,"C#",35);
		Course course2 = new Course(2,"Java", 55);
		List<Course> courseList = new ArrayList<>();
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),courseList, loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		
		System.out.println("------Kategoriler------");
		Category category1 = new Category(1,"Web Geliştirme");
		Category category2 = new Category(2, "Programlama");
		List<Category> categoryList = new ArrayList<>();
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),categoryList, loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		System.out.println("------Eğitmenler------");
		Insstructor insstructor1 = new Insstructor(1,"Engin Demiroğ");
		Insstructor insstructor2 = new Insstructor(2,"Cem Öz");
		List<Insstructor> instructorList = new ArrayList<>();
		
		InstructorManager instructorManager = new InstructorManager((InstructorDao) new HibernateInstructorDao(), instructorList, loggers);
		instructorManager.add(insstructor1);
		instructorManager.add(insstructor2);
		
		
			
	}

}
