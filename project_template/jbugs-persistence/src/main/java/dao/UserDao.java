package dao;

import entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Document me.
 *
 * @author msg systems AG; User Name.
 * @since 19.1.2
 */
@Stateless
public class UserDao {
    @PersistenceContext(name = "jbugs-persistence")
    private EntityManager entityManager;

    public User findUser(Integer ID) {
        User user = entityManager.find(User.class, ID);
        return user;
    }

    public void insertUser(User user) {
        entityManager.persist(user);
    }

}
