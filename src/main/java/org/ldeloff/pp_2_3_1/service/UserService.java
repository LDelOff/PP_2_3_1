package org.ldeloff.pp_2_3_1.service;

import org.ldeloff.pp_2_3_1.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<User> allUser();
    void add(User user);
    void delete(long id);
    void edit(User user);
    User getById(long id);
}
