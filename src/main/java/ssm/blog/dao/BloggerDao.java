package ssm.blog.dao;

import org.springframework.stereotype.Repository;
import ssm.blog.entity.Blogger;
@Repository
public interface BloggerDao {
    /**
     * 查询博主信息
     * @return
     */
    Blogger getBloggerData();
}
