package com.company.dao.idaoimpl;

import com.company.commons.Results;
import com.company.dao.idao.UserDao;
import com.company.dao.pojo.User;
import org.springframework.stereotype.Repository;

@Repository("userdao")
public class UserDaoImpl implements UserDao {
    @Override
    public Results<User> login(String username, String password) {
        if ("li".equals(username) && "123456".equals(password)) {
            User user = new User(1, "li", "123456");
            return new Results<User>("200", "success", user);
        } else {
            return new Results<User>("400", "error", null);
        }

    }
}
