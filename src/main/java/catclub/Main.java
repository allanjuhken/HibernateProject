package catclub;

import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;

public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtils.getCurrentSessionFromConfig();

//        Cat cat = new Cat();
//        cat.setId(10);
//        cat.setRating(10);
//        cat.setGender(true);
//        cat.setBreed("persian");
//        Transaction trn = session.beginTransaction();
//        session.save(cat);
//        trn.commit();
//
//        Transaction trn = session.beginTransaction();
//        Cat cat = session.load(Cat.class,1L);
//        System.out.println(cat);
//        trn.commit();

//        Transaction trn = session.beginTransaction();
//        List<Cat> cats = session.createCriteria(Cat.class).list();
//        trn.commit();
//        System.out.println(cats);

//        Transaction trn = session.beginTransaction();
//        Cage cage1 = new Cage(2,"black","FI65412");
//        session.save(cage1);
//        trn.commit();

//        Transaction trn = session.beginTransaction();
//        Cat cat = session.load(Cat.class, 1L);
//        System.out.println(cat);
//        trn.commit();

//        Cat cat1 = new Cat("balinese",100, true);
//        Cage cage2 = new Cage(6,"green", "NL77314");
//        cage2.setCat(cat1);
//        cat1.setCage(cage2);
//        System.out.println(cat1);
//        System.out.println(cage2);
//
//        Transaction trn = session.beginTransaction();
//        session.save(cat1);
//        session.save(cage2);
//        trn.commit();

        Transaction trn = session.beginTransaction();
        CatOwner catOwner = session.load(CatOwner.class, 2l);
        //session.getNamedQuery().executeUpdate();
        System.out.println(catOwner);
        trn.commit();

    }
}
