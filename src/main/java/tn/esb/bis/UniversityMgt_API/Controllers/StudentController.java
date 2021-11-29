package tn.esb.bis.UniversityMgt_API.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esb.bis.UniversityMgt_API.Services.StudentService;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentServ;
}
