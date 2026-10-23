package DAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

import DTO.Student;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public void createStuDetail(Student s)  {

        SessionFactory sess = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session op = sess.openSession();
        Transaction t = op.beginTransaction();

        Serializable s1 = op.save(s);

        t.commit();

    }

    @Override
    public void showAllStu() {

        SessionFactory session1 = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session openSession = session1.openSession();

        Transaction beginTransaction = openSession.beginTransaction();

        String sql = "from Student";
        Query query = openSession.createQuery(sql);
        List l = query.list();

        for(Object o : l) {
            System.out.println(o);
        }

        beginTransaction.commit();


        openSession.close();
        session1.close();

    }

    @Override
    public void searchById(int sid){

        SessionFactory session1 = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session openSession = session1.openSession();

        Transaction beginTransaction = openSession.beginTransaction();

        String sql = "from Student where id ="+sid;
        Query query = openSession.createQuery(sql);

        List l = query.list();
        for(Object o : l) {
            System.out.println(o);
        }

        beginTransaction.commit();


        openSession.close();
        session1.close();

    }

    @Override
    public void searchByName(String sname){
        SessionFactory session1 = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session openSession = session1.openSession();

        Transaction beginTransaction = openSession.beginTransaction();

        String sql = "from Student where name = :sname";
        Query query = openSession.createQuery(sql);

        query.setParameter("sname", sname);

        List l = query.list();
        for(Object o : l) {
            System.out.println(o);
        }

        beginTransaction.commit();


        openSession.close();
        session1.close();

    }

    @Override
    public void searchByMarks(int mark){
        SessionFactory session1 = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session openSession = session1.openSession();

        Transaction beginTransaction = openSession.beginTransaction();

        String sql = "from Student where marks>" + mark;
        Query query = openSession.createQuery(sql);

        List l = query.list();
        for(Object o : l) {
            System.out.println(o);
        }

        beginTransaction.commit();


        openSession.close();
        session1.close();


    }


    public boolean isExists(int id) {

        SessionFactory session1 = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session openSession = session1.openSession();

        Transaction beginTransaction = openSession.beginTransaction();

        String q = "from Student s where s.id= :id ";

        Object s = openSession.createQuery(q).setParameter("id", id).uniqueResult();

        beginTransaction.commit();


        openSession.close();
        session1.close();

        return s != null;
    }


    @Override
    public void updateStu(Student s , int ch){

        SessionFactory session1 = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session openSession = session1.openSession();

        Transaction beginTransaction = openSession.beginTransaction();

        Student stu = openSession.get(Student.class, s.getId());

        if(stu!=null) {
            if(ch==1)
                stu.setName(s.getName());
            else if(ch==2)
                stu.setEmail(s.getEmail());
            else if(ch==3)
                stu.setMarks(s.getMarks());

            beginTransaction.commit();
            System.out.println("Student Data Updated Successfully!!");
        }else {

            beginTransaction.rollback();
            System.out.println("Student data Not Found");

        }


        openSession.close();
        session1.close();

    }

    @Override
    public void deletestu(int id){

        SessionFactory session1 = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session openSession = session1.openSession();

        Transaction beginTransaction = openSession.beginTransaction();

        Student s = openSession.get(Student.class, id);
        openSession.delete(s);

        beginTransaction.commit();


        openSession.close();
        session1.close();

    }




}
