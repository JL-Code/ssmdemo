package com.codeme.dao;

import com.codeme.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description 测试
 */
public class IUserDAOTest {
    private ApplicationContext context;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        IUserDAO dao = (IUserDAO) context.getBean("userMapper");
        User user = dao.findUserById(1);
        System.out.println(user.getName());
    }
}
