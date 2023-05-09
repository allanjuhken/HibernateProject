package catclub;

import dao.CatDAO;
import dao.CatOwnerDAO;
import model.Barber;
import model.Cage;
import model.Cat;
import model.CatOwner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Session session = HibernateUtils.getCurrentSessionFromConfig();

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

//        Transaction trn = session.beginTransaction();
//        CatOwner catOwner = session.load(CatOwner.class, 1L);
//        session.getNamedQuery().executeUpdate(); //LAST LECTURE
//        System.out.println(catOwner);
//        trn.commit();
//
//        Transaction trn = session.beginTransaction();
//
//        CatOwner catOwner1 = session.load(CatOwner.class, 1L);
//        Cage cage1 = session.load(Cage.class, 1L);
//
//        List<Barber> barbers = new ArrayList<>();
//        List<Cat> cats = new ArrayList<>();
//        Barber barber1 = new Barber(4, "Jack", "Estonia", "Short", null);
//        barbers.add(barber1);
//        Cat cat1 = new Cat(8, "estonian", 3, true, cage1, catOwner1, barbers);
//        cats.add(cat1);
//        barber1.setClients(cats);
//
//        Cat cat2 = session.load(Cat.class, 7L);
//        cat2.setBarbers(barbers);
//        cats.add(cat2);
//
//        session.save(cat1);
//        session.save(barber1);
//
//        trn.commit();
//
//        CatDAO catDAO = new CatDAO();
//        Cat cat = catDAO.getCatWithBiggestRating();
//        System.out.println(cat);
//
//        CatDAO catDAO = new CatDAO();
//        List<Cat> cats = catDAO.getAllCatsByCatOwnerId(1L);
//        System.out.println(cats);
//
//        CatDAO catDAO = new CatDAO();
//        List<Cat> cats = catDAO.getAllCatsByCatOwnerCode("11111");
//        System.out.println(cats);
//
//        List<Cat> cats = catDAO.getCatsByOwnerName("O");
//        System.out.println(cats);
//
//        List<Cat> cats = catDAO.getCatsByGender(true);
//        System.out.println(cats);
//
//        List<String> breeds = new ArrayList<>();
//        breeds.add("persian");
//        breeds.add("british");
//
//        List<Cat> cats = catDAO.getCatsByBreeds(breeds);
//        System.out.println(cats);
//
//        List<Cat> cats = catDAO.getCatsWithRatingAbove(50);
//        System.out.println(cats);
//
//        List<Cat> cats = catDAO.getCatWithMaxRatingCriteria();
//        System.out.println(cats);
//
//        List<Cat> cats = catDAO.getCatWithOwnerWhoIsNotNull();
//        System.out.println(cats);
//
//        CatOwnerDAO catOwnerDAO = new CatOwnerDAO();
//
//        List<CatOwner> catOwners = catOwnerDAO.getCatOwnersByNameLike("o");

    }
}
