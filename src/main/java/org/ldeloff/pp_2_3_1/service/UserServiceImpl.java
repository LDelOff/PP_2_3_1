package org.ldeloff.pp_2_3_1.service;

import org.ldeloff.pp_2_3_1.dao.UserDAO;
import org.ldeloff.pp_2_3_1.dao.UserDAOImpl;
import org.ldeloff.pp_2_3_1.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService{
    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public List<User> allUser() {
        return userDAO.allUser();
    }

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public void delete(long id) {
        userDAO.delete(id);
    }

    @Override
    public void edit(User user) {
        userDAO.edit(user);
    }

    @Override
    public User getById(long id) {
        return userDAO.getById(id);
    }
}
