package top.notalent.blog.blogger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.notalent.blog.blogger.model.BloggerInfo;

/**
 * BloggerInfoRepository
 * @author Roy Chen
 * 2019-07-28 11:24
 * @version 1.0
 **/
public interface BloggerInfoRepository extends JpaRepository<BloggerInfo, Integer> {

    BloggerInfo getByBloggerInfoId(Integer bloggerInfoId);

}
