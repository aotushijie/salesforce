package com.company.dao.idaoimpl;

import com.company.commons.Results;
import com.company.dao.idao.UserDao;
import com.company.dao.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext.xml")
public class UserDaoImplTest {

    @Autowired
    UserDao userdao;

    @Test
    public void login() {
       Results<User> res=  userdao.login("li","123456");
        TestCase.assertNotNull(res);
        System.out.println(res);
    }
}