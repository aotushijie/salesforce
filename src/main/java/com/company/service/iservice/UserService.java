package com.company.service.iservice;

import com.company.commons.Results;
import com.company.dao.pojo.User;

public interface UserService {
Results<User> login(String username, String Password);
}
