package ro.msg.edu.jbugs.user;

import dao.UserDao;
import entity.User;
import ro.msg.edu.jbugs.dto.UserDTO;
import ro.msg.edu.jbugs.dto.UserDTOEntityMapper;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Document me.
 *
 * @author msg systems AG; User Name.
 * @since 19.1.2
 */
@Stateless
public class userManager {
    @EJB
    UserDao userDao = new UserDao();

    public void insertUser(UserDTO userDTO) {
        User userToInser = UserDTOEntityMapper.getUserFromUserDTO(userDTO);
        userDao.insertUser(userToInser);
    }
}
