package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("jdbc veritabanına eklendi");
		
	}

}
