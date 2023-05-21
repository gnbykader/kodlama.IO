package kodlama.IO.dataAccess;

import kodlama.IO.entities.Category;
import kodlama.IO.entities.Course;
import kodlama.IO.entities.Instructor;

public class HibernateDao implements InstructorDao,CategoryDao,CourseDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanina eklendi");
		System.out.println("******************************************");

	}

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanina eklendi");
		System.out.println("******************************************");
		
	}

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanina eklendi");
		System.out.println("******************************************");
		
		
	}

}
