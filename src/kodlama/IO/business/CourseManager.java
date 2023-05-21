package kodlama.IO.business;

import java.util.ArrayList;

import kodlama.IO.core.loggging.Logger;
import kodlama.IO.dataAccess.CourseDao;
import kodlama.IO.entities.Category;
import kodlama.IO.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private ArrayList<Course> courses;
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, ArrayList<Course> courses) {

		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		for (Course course1 : courses) {
			
			if(course1.getUnitPrice() < 0) { 
				  throw new Exception("kurs fiyati sifirdan kucuk olamaz"); 
				  }
			else if(course.getCourseName()==course1.getCourseName()) {
				throw new Exception("kurs ismi ayni olamaz");
			}
		
		}
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		courses.add(course);
		courseDao.add(course);
	}
      
}
