package dao;

import model.Cat;
import model.CatOwner;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import utils.HibernateUtils;

import java.util.List;

public class CatDAO {

    private Criterion haveOwner = Restrictions.isNotNull("catOwner");

    public Cat getCatWithBiggestRating() {
        Session session = HibernateUtils.getCurrentSessionFromConfig();

        Transaction trn = session.beginTransaction();

        Query query = session.getNamedQuery("Cat_Max_Rating");

        query.setMaxResults(1);
        Cat cat = (Cat) query.getResultList().get(0);

        trn.commit();

        return cat;

    }

    public List<Cat> getAllCatsByCatOwnerId(long id) {

        Session session = HibernateUtils.getCurrentSessionFromConfig();
        Transaction trn = session.beginTransaction();
        CatOwner catOwner = session.load(CatOwner.class, id);
        List<Cat> catsToReturn = catOwner.getCats();
        trn.commit();

        return catsToReturn;
    }

    public List<Cat> getAllCatsByCatOwnerCode(String code) {

        Session session = HibernateUtils.getCurrentSessionFromConfig();
        Transaction trn = session.beginTransaction();

        Query query = session.getNamedQuery("Cats_By_CatOwner_Code");
        query.setParameter("code", code);
        List<Cat> cats = query.getResultList();

        trn.commit();

        return cats;
    }

    public List<Cat> getCatsByOwnerName(String name) {

        Session session = HibernateUtils.getCurrentSessionFromConfig();
        Transaction trn = session.beginTransaction();

        Query query = session.getNamedQuery("Cats_By_CatOwner_Name");
        query.setParameter("name", "%" + name + "%");
        List<Cat> cats = query.getResultList();

        trn.commit();

        return cats;
    }

    public List<Cat> getCatsByGender(boolean gender) {

        Session session = HibernateUtils.getCurrentSessionFromConfig();
        Transaction trn = session.beginTransaction();

        Query query = session.getNamedQuery("Get_Cats_By_Gender");
        query.setParameter("gender", gender);
        List<Cat> cats = query.getResultList();

        trn.commit();
        return cats;
    }

    public List<Cat> getCatsByBreeds(List<String> breeds) {

        Session session = HibernateUtils.getCurrentSessionFromConfig();
        Transaction trn = session.beginTransaction();

        Query query = session.getNamedQuery("Get_Cats_By_Breeds");
        query.setParameter("breeds", breeds);
        List<Cat> cats = query.getResultList();

        trn.commit();
        return cats;
    }

    public List<Cat> getCatsWithRatingAbove(long rating) {

        Session session = HibernateUtils.getCurrentSessionFromConfig();
        Transaction trn = session.beginTransaction();

        Criteria cr = session.createCriteria(Cat.class);
        cr.add(Restrictions.gt("rating", rating));
        cr.add(haveOwner);
        List<Cat> cats = cr.list();
        trn.commit();
        return cats;
    }

    public List<Cat> getCatWithMaxRatingCriteria() {

        Session session = HibernateUtils.getCurrentSessionFromConfig();
        Transaction trn = session.beginTransaction();

        Criteria cr = session.createCriteria(Cat.class);
        cr.setProjection(Projections.max("rating"));
        List<Cat> cats = cr.list();
        trn.commit();
        return cats;
    }

    public List<Cat> getCatWithOwnerWhoIsNotNull() {

        Session session = HibernateUtils.getCurrentSessionFromConfig();
        Transaction trn = session.beginTransaction();

        Criteria cr = session.createCriteria(Cat.class);
        cr.add(Restrictions.isNotNull("catOwner"));
        List<Cat> cats = cr.list();
        trn.commit();
        return cats;
    }

}
