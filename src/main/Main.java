package main;

import java.util.Scanner;

import DAO.StudentDAO;
import DAO.StudentDAOImpl;
import DTO.Student;

public class Main {

    public static void main(String[] args) {

        java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.WARNING);

        Scanner sc = new Scanner(System.in);

        boolean b = true;

        StudentDAO stu = new StudentDAOImpl();

        while(b) {

            System.out.println("<--------------Student Management System------------>");
            System.out.println();
            System.out.println("1. Create Student ID ");
            System.out.println("2. Show all Student details ");
            System.out.println("3. Search by ID ");
            System.out.println("4. Search by Name ");
            System.out.println("5. Search by Marks ");
            System.out.println("6. Update Details ");
            System.out.println("7. Delete by ID ");
            System.out.println("8. Exit ");

            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1 :

                    Student s = new Student();

                    System.out.println("Enter the ID : ");
                    int id = sc.nextInt();
                    System.out.println("Enter the name : ");
                    String name = sc.next();
                    System.out.println("Enter the mail Id : ");
                    String mail = sc.next();
                    System.out.println("Enter the marks : ");
                    int marks = sc.nextInt();

                    s.setId(id);
                    s.setName(name);
                    s.setEmail(mail);
                    s.setMarks(marks);

                    stu.createStuDetail(s);
                    break;


                case 2 :

                    stu.showAllStu();
                    System.out.println();
                    break;

                case 3 :

                    System.out.println("Enter the Id : ");
                    int sid = sc.nextInt();

                    stu.searchById(sid);
                    System.out.println();
                    break;

                case 4 :

                    System.out.println("Enter the name :");
                    sc.nextLine();
                    String sname = sc.nextLine();

                    stu.searchByName(sname);
                    System.out.println();
                    break;

                case 5 :

                    System.out.println("Enter the mark : ");
                    int smark = sc.nextInt();

                    stu.searchByMarks(smark);
                    break;

                case 6 :

                    System.out.println("Updating the Id : ");
                    int stuid = sc.nextInt();

                    if(!stu.isExists(stuid)) {
                        System.out.println("Enter the valid ID....");
                    }

                    System.out.println("1. update the name ");
                    System.out.println("2. update the mail ");
                    System.out.println("3. update the marks ");

                    System.out.println(" Enter the choice : ");
                    int ch = sc.nextInt();

                    Student S = new Student();
                    S.setId(stuid);

                    switch(ch) {

                        case 1 :

                            System.out.println("Updating the name : ");
                            sc.nextLine();
                            String stuname = sc.nextLine();
                            S.setName(stuname);
                            break;

                        case 2 :

                            System.out.println("Updating the email : ");
                            sc.nextLine();
                            String stuemail = sc.nextLine();
                            S.setEmail(stuemail);
                            break;

                        case 3 :

                            System.out.println("Updating the marks : ");
                            int stumarks = sc.nextInt();
                            S.setMarks(stumarks);
                            break;

                        default :
                            System.out.println("Invaild choice.");

                    }

                    if (ch >= 1 && ch <= 3) {
                        stu.updateStu(S, ch);
                    }

                    break;

                case 7 :

                    System.out.println("Enter the ID : ");
                    int Sid= sc.nextInt();

                    stu.deletestu(Sid);
                    System.out.println();

                    break;


                case 8 :

                    b = false ;
                    System.out.println("Thank you!!");

                    break;

                default :

                    System.out.println("Invalid choice.");

            }

        }


    }

}
