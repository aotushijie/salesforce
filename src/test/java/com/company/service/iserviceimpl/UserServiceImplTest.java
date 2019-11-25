package com.company.service.iserviceimpl;

import com.company.commons.Results;
import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext.xml")
public class UserServiceImplTest {



    @Autowired
    UserService userservice;
    @Test
    public void login() {
        Results<User> res=  userservice.login("li","123456");
        TestCase.assertNotNull(res);
        System.out.println(res);
    }
}