package io.renren.dao;

import io.renren.ApiApplication;
import io.renren.entity.UserEntity;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
@Autowired
UserDao userDao;

    @Test
    public void name() {
        System.out.println("userDao = " + userDao);
    }
}