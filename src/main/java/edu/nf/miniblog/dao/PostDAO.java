package edu.nf.miniblog.dao;

import edu.nf.miniblog.dao.support.HibernateDAO;
import edu.nf.miniblog.model.Post;
import org.springframework.stereotype.Repository;


@Repository
public class PostDAO extends HibernateDAO<Post> {
}
