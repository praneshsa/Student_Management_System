package DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student1")
public class Student {

    @Column(unique = true , nullable = false)
    @Id
    private int id ;
    @Column(unique = false , nullable = false)
    private String name;
    @Column(unique = true , nullable = false)
    private String email;
    @Column(unique = false , nullable = false)
    private int marks;


    public Student() {
        super();
    }

    public Student(int id, String name, String email,int marks) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [ " +  id + " :" + name + " : " + email + " : " + marks + "]";
    }



}
