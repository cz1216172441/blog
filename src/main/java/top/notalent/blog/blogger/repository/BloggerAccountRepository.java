package top.notalent.blog.blogger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.notalent.blog.blogger.model.BloggerAccount;

/**
 * BloggerAccountRepository
 * @author Roy Chen
 * 2019-07-28 11:18
 * @version 1.0
 **/
public interface BloggerAccountRepository extends JpaRepository<BloggerAccount, Integer> {

    BloggerAccount findByUsername(String username);

    Integer countByUsername(String username);

}