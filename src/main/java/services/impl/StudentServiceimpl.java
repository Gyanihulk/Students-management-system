package services.impl;
import repository.StudentRepository;
import services.StudentService;
import org.springframework.stereotype.Service;
import java.util.List;
import entity.Student;

@Service
public class StudentServiceimpl implements StudentService{
    private StudentRepository StudentRepository;
    public StudentServiceimpl(StudentRepository StudentRepository) {
        super();
        this.StudentRepository = StudentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return StudentRepository.findAll();
    }






}
