package tn.esb.bis.UniversityMgt_API.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esb.bis.UniversityMgt_API.Domains.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
