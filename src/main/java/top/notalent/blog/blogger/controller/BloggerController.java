package top.notalent.blog.blogger.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.notalent.blog.blogger.constant.BloggerConstant;
import top.notalent.blog.blogger.service.BloggerService;
import top.notalent.blog.common.util.Result;

/**
 * BloggerController
 * @author Roy Chen
 * 2019-07-28 11:31
 * @version 1.0
 **/
@RestController
@RequestMapping("/blogger")
public class BloggerController {

    @Autowired
    private BloggerService bloggerService;

    @PostMapping("/register")
    public Result register(String username, String password) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return Result.errorWithMsg(BloggerConstant.USERNAME_PASSWORD_NULL);
        }
        if (!bloggerService.isUsernameValid(username.trim())) {
            return Result.errorWithMsg(BloggerConstant.USERNAME_NOT_VALID);
        }
        bloggerService.register(username.trim(), password.trim());
        return Result.successWithMsg(BloggerConstant.REGISTER_SUCCESS);
    }

    @GetMapping("/isValid/username")
    public Result isUsernameValid(String username) {
        if (bloggerService.isUsernameValid(username.trim())) {
            return Result.success();
        }
        return Result.errorWithMsg(BloggerConstant.USERNAME_NOT_VALID);
    }

}
