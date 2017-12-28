package ssm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.blog.dao.BloggerDao;
import ssm.blog.entity.Blogger;
import ssm.blog.service.BloggerService;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class BloggerDaoTest {

    @Resource   //注入BloggerDao对象
    private BloggerDao bloggerDao;

    @Test
    public void getBloggerData() throws Exception {
        Blogger blogger = bloggerDao.getBloggerData();
        System.out.println(blogger);
    }

}
