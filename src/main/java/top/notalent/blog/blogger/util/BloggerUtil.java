package top.notalent.blog.blogger.util;

import top.notalent.blog.blogger.model.BloggerAccount;
import top.notalent.blog.blogger.model.BloggerInfo;

import java.util.Date;

/**
 * BloggerUtil
 * @author Roy Chen
 * 2019-07-28 11:59
 * @version 1.0
 **/
public class BloggerUtil {

    public static void addBloggerAccountTime(BloggerAccount bloggerAccount, Date date) {
        bloggerAccount.setCreateTime(date);
        bloggerAccount.setUpdateTime(date);
    }

    public static void addBloggerInfoTime(BloggerInfo bloggerInfo, Date date) {
        bloggerInfo.setCreateTime(date);
        bloggerInfo.setUpdateTime(date);
    }

}