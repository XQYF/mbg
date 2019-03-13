package com.example.demo;

import com.example.demo.dao.AlbumMapper;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Album;
import com.example.demo.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {
    @Autowired
    private AdminService adminService;
    @Autowired
    private AlbumMapper albumMapper;
    @Test
    public void contextLoads() {
        List<Admin> admins = adminService.queryAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }
    @Test
    public void test3(){
        Admin admin = new Admin();
        System.out.println(admin);
    }
    @Test
    public void test4(){
        Album album = albumMapper.selectByPrimaryKey("1");
        System.out.println(album);
    }

}
