package top.notalent.blog.blogger.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.notalent.blog.BlogApplication;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BloggerServiceTest {

    @Autowired
    private BloggerService bloggerService;

    @Test
    public void register() {
        String username = "test001";
        String password = "123456";
        bloggerService.register(username, password);
    }

}