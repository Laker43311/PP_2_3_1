package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> allUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    public User getUser(Long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    public void addUser(User user) {
        entityManager.persist(user);
    }

@Transactional
public void updateUser(User user) {
    entityManager.merge(user);
}

@Transactional
public void deleteUser(Long id) {
    User user = entityManager.find(User.class, id);
    if (user != null) {
        entityManager.remove(user);
    }
}
}