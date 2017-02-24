package edu.nf.miniblog.dao;


import edu.nf.miniblog.dao.support.HibernateDAO;
import edu.nf.miniblog.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends HibernateDAO<User> {
}