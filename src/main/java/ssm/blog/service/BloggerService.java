package ssm.blog.service;

import org.springframework.stereotype.Repository;
import ssm.blog.entity.Blogger;

@Repository//注册为持久层的bean
public interface BloggerService {

    /**
     * 查询博主信息
     * @return
     */
    Blogger getBloggerData();
}
