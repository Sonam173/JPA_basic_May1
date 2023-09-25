package com.example.JPAbasicsep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    LibraryCardRepository cardRepository;
    public String addStudent(Student student,Department department)
            // we student calling this api , you should allocating card for him
            // we should not take from user , genrate card in logic
    {
        LibraryCard card = new LibraryCard();// we are creating card entity , just go to card class ,
        // just checking which all parameter ,we should set
        card.setDepartment(department);

        card.setStudent(student);// to which student card is belong

        student.setLibraryCard(card);//set library card to student


        studentRepository.save(student);// only student will save


        return "Student added successfully";
    }
    public Student getStudentById(int studentId)
    {
       return studentRepository.findById(studentId).get();
    }

    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "student deleted successfully";
    }
}
