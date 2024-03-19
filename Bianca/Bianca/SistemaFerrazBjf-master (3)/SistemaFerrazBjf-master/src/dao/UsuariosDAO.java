/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UsuariosBjf;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u10840155107
 */
public class UsuariosDAO extends DAO_Abstract{

    @Override
    public void insert(Object objeto) {
      session.beginTransaction();
      session.save(objeto);
      session.getTransaction().commit();
}

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
       session.beginTransaction();
       session.flush();
       session.clear();
       session.delete(object);
       session.getTransaction().commit();
    }

    @Override
     public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosBjf.class);
        criteria.add(Restrictions.eq("idUsuarioBjf", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
     }
    @Override
    public ArrayList listAll() {
   session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuariosBjf.class);
    List lista = criteria.list();
    session.getTransaction().commit();
return (ArrayList) lista;
}
    
}