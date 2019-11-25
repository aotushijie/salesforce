package com.company.dao.idao;

import com.company.commons.Results;
import com.company.dao.pojo.User;

public interface UserDao {
    Results<User> login(String username, String password);
}
