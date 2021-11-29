package tn.esb.bis.UniversityMgt_API.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tn.esb.bis.UniversityMgt_API.Domains.Student;
import tn.esb.bis.UniversityMgt_API.Repositories.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepos;
    public ResponseEntity<?> getAllStudents()
    {
        List<Student> res=studentRepos.findAll();
        if(res.isEmpty())
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }
}
