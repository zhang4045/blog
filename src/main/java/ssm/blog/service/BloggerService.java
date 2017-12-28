package ssm.blog.service;

import org.springframework.stereotype.Repository;
import ssm.blog.entity.Blogger;

public interface BloggerService {

    /**
     * 查询博主信息
     * @return
     */
    Blogger getBloggerData();
}
