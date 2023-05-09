package dao;

import model.Cat;
import model.CatOwner;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import utils.HibernateUtils;

import java.util.List;

public class CatOwnerDAO {

    public List<CatOwner> getCatOwnersByNameLike(String name){
        Session session = HibernateUtils.getCurrentSessionFromConfig();
        Transaction trn = session.beginTransaction();

        Criteria cr = session.createCriteria(CatOwner.class);
        cr.add(Restrictions.like("name", "%" + name + "%"));
        List<CatOwner> catOwners = cr.list();
        System.out.println(catOwners);

        trn.commit();
        return catOwners;
    }
}
