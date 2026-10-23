package DAO;

import DTO.Student;

public interface StudentDAO {

    void createStuDetail(Student s);

    void showAllStu();

    void searchById(int id);

    void searchByName(String name);

    void searchByMarks(int mark);

    void updateStu(Student s , int ch);

    void deletestu(int id);

    boolean isExists(int stuid);



}
