package ro.msg.edu.jbugs.dto;

import entity.User;

/**
 * Document me.
 *
 * @author msg systems AG; User Name.
 * @since 19.1.2
 */
public class UserDTOEntityMapper {

    public static User getUserFromUserDTO(UserDTO userDTO) {
        User user = new User();
        user.setCounter(userDTO.getCounter());
        user.setEmail(userDTO.getEmail());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setMobileNumber(userDTO.getMobileNumber());
        user.setPassword(userDTO.getPassword());
        user.setStatus(userDTO.getStatus());
        user.setUserName(userDTO.getUserName());

        return user;
    }
}
