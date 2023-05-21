package kodlama.IO;

import java.util.ArrayList;
import java.util.List;

import kodlama.IO.business.CategoryManager;
import kodlama.IO.business.CourseManager;
import kodlama.IO.business.InstructorManager;
import kodlama.IO.core.loggging.DatabaseLogger;
import kodlama.IO.core.loggging.EmailLogger;
import kodlama.IO.core.loggging.FileLogger;
import kodlama.IO.core.loggging.Logger;
import kodlama.IO.dataAccess.HibernateDao;
import kodlama.IO.dataAccess.JDBCDao;
import kodlama.IO.entities.Category;
import kodlama.IO.entities.Course;
import kodlama.IO.entities.Instructor;

public class Main {

   
	public static void main(String[] args) throws Exception {
		Instructor instructor1 = new Instructor("White"," Black");
		Category category1 = new Category(1, "Java");
		Category category2 = new Category(2, "Python");
		ArrayList<Category> categoryList = new ArrayList<>();
		ArrayList<Course> courses= new ArrayList<>();
		Course course1 = new Course(1,"Python OOP ileri", 45);
		Course course2 = new Course(2,"Java baslangic", 169.99);
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new EmailLogger()};
		InstructorManager instructorManager = new InstructorManager(new JDBCDao(),loggers );
		instructorManager.add(instructor1);
		System.out.println("****************************************************");
		CategoryManager categoryManager = new CategoryManager(new JDBCDao(), categoryList, loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
	
		CourseManager courseManager = new CourseManager(new HibernateDao(),loggers, courses);
	    courseManager.add(course1);
	    courseManager.add(course2);

	}

}
