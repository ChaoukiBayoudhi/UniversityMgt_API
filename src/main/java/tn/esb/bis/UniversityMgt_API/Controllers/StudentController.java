package tn.esb.bis.UniversityMgt_API.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tn.esb.bis.UniversityMgt_API.Domains.Student;
import tn.esb.bis.UniversityMgt_API.Services.StudentService;

import javax.validation.Valid;

@RestController
//path coté client sera http://localhost:9592/students"
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentServ;
    //concatener au path "/all"
    @GetMapping("/all")
    public ResponseEntity<?> allStudents()
    {
        return studentServ.getAllStudents();
    }
    //La requête provenent du client contient une entête presentant
    //des informations generales genre la méthode HTTP utilisée (GET, Post,...)
    //le type de données transmis (json, xml, text,...)
    //La requête contient aussi un corps(body) contenant les données à transmettre
    //au serveur
    //ici le student st sera transmis dans le body
    @PostMapping("/add")
    //ou bien la ligne ci-dessous
    //@RequestMapping(value="/add",method = RequestMethod.POST)
    public ResponseEntity addStudent(@Valid @RequestBody Student st)
    {
        return studentServ.addStudent(st);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudent(@PathVariable Long id)
    {
        return studentServ.getStudentById(id);
    }
}
