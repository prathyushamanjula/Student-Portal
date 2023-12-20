package org.jsp.StudentPortal.Repository;

import org.jsp.StudentPortal.Dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
	Student findByEmail(String email);

	Student findByMobile(long mobile);
}
