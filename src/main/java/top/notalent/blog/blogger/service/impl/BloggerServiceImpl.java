package top.notalent.blog.blogger.service.impl;

import org.springframework.stereotype.Service;
import top.notalent.blog.blogger.model.BloggerAccount;
import top.notalent.blog.blogger.model.BloggerInfo;
import top.notalent.blog.blogger.repository.BloggerAccountRepository;
import top.notalent.blog.blogger.repository.BloggerInfoRepository;
import top.notalent.blog.blogger.service.BloggerService;
import top.notalent.blog.blogger.util.BloggerUtil;
import top.notalent.blog.common.util.DateUtil;
import top.notalent.blog.common.util.EncryptUtil;

import javax.annotation.Resource;
import java.util.Date;

/**
 * BloggerServiceImpl
 * @author Roy Chen
 * 2019-07-28 11:28
 * @version 1.0
 **/
@Service
public class BloggerServiceImpl implements BloggerService {

    @Resource
    private BloggerAccountRepository bloggerAccountRepository;

    @Resource
    private BloggerInfoRepository bloggerInfoRepository;

    @Override
    public void register(String username, String password) {
        String salt = EncryptUtil.getUuid();
        Date date = new Date();
        BloggerAccount account = new BloggerAccount(username, EncryptUtil.md5Encrypt(password, salt), salt);
        BloggerUtil.addBloggerAccountTime(account, date);
        BloggerInfo info = new BloggerInfo();
        info.setNickname(DateUtil.getTimestamp(date));
        BloggerUtil.addBloggerInfoTime(info, date);
        account.setBloggerInfo(info);
        bloggerAccountRepository.save(account);
    }

    @Override
    public boolean isUsernameValid(String username) {
        return bloggerAccountRepository.countByUsername(username) < 1;
    }

    @Override
    public void updatePassword(String username, String password) {
        BloggerAccount account = bloggerAccountRepository.findByUsername(username);
        if (account != null) {
            account.setPassword(EncryptUtil.md5Encrypt(password, account.getSalt()));
            bloggerAccountRepository.save(account);
        }
    }
}