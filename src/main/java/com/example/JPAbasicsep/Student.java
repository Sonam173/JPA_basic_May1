package com.example.JPAbasicsep;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student_info")
@Getter
@Setter

public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int studentId;

    private int age;
    @Column(name="full_name")
    private String name;

    private int marks;
    @OneToOne(mappedBy ="student",cascade = CascadeType.ALL)// what ever crud operation applied on
    // parant, will sholde be automattically apply child
    LibraryCard libraryCard;
}
