package kodlamaio.business;

import kodlamaio.core.logger.Logger;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception{
		Course[] courses = {new Course()};
		
		for (Course course1 : courses) {
			if(course.getName() == course1.getName()) {
				throw new Exception("Kurs ismi tekrar edemez");
			}else if(course.getPrice() < 0) {
				throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
			}else if(course.getCategory() == course1.getName()) {
				throw new Exception("Kategori ismi tekrar edemez.");
			}
		}
		courseDao.add(course);
		for (Logger logger : loggers) { 
			logger.log(course.getName());
		}
	}
	
}
