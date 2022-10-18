package kodlamaio;

import kodlamaio.business.CourseManager;
import kodlamaio.core.logger.DatabaseLogger;
import kodlamaio.core.logger.Logger;
import kodlamaio.core.logger.MailLogger;
import kodlamaio.dataAccess.HibarnateCourseDao;
import kodlamaio.dataAccess.JdbcCourseDao;
import kodlamaio.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1,"Javascript", "programlama", 50);
		Logger[] loggers = {new DatabaseLogger(), new MailLogger()};
		CourseManager courseManager = 
				new CourseManager( new HibarnateCourseDao() , loggers);
		courseManager.add(course1);
	}

}
