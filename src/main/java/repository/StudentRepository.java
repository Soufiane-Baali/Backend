package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entites.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
	
	Student findByCode(String code);
	
	List<Student> findByProgramId (String programId );

}
