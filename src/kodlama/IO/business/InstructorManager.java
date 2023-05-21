package kodlama.IO.business;

import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import kodlama.IO.core.loggging.Logger;
import kodlama.IO.dataAccess.HibernateDao;
import kodlama.IO.dataAccess.InstructorDao;
import kodlama.IO.dataAccess.JDBCDao;
import kodlama.IO.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {

		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getName()+instructor.getLastName());
			
		}

	}
	 
	
	

}
