package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public class HibarnateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("hibarnate veritabanına eklendi");
		
	}

}
