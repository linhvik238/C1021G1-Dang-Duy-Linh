package com.codegym.repository.impl;

import com.codegym.model.Blog;
import com.codegym.repository.IBlogRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BlogRepositoryImpl implements IBlogRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query =em.createQuery("select b from Blog as b", Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog viewBlogDetail(Long id) {
        return em.find(Blog.class, id);
    }

    @Override
    public void createBlog(Blog blog) {
        em.persist(blog);
    }

    @Override
    public void edit(Blog blog) {
        em.merge(blog);
    }

    @Override
    public Blog findById(Long id) {
        TypedQuery<Blog> query = em.createQuery("select b from Blog as b where b.id=:id", Blog.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Blog> search(String header) {
            TypedQuery<Blog> query = em.createQuery("select b from Blog as b where b.header like :header", Blog.class);
            query.setParameter("header", "%" + header +"%");
        return query.getResultList();
    }

    @Override
    public void remove(Long id) {
        Blog blog = findById(id);
        if(blog!=null){
            em.remove(blog);
        }
    }

}
