package com.company.service.iserviceimpl;

import com.company.commons.Results;
import com.company.dao.idao.UserDao;
import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userservice")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userdao")
    private UserDao userDao;

    @Override
    public Results<User> login(String username, String password) {
        Results<User> res=null;
        try {
            res=userDao.login(username,password);

        }catch (Exception e){

        }
        return res;
    }
}
