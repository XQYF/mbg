package com.baizhi.test;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring.xml")
public class Test1 {
    @Autowired
    private AdminDao adminDao;
    @Test
    public void test2(){
        List<Admin> admins = adminDao.queryAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }
}
