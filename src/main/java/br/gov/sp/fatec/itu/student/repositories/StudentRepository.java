package br.gov.sp.fatec.itu.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.itu.student.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
