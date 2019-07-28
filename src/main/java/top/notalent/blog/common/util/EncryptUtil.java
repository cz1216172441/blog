package top.notalent.blog.common.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

/**
 * EncryptUtil
 * @author Roy Chen
 * 2019-07-28 11:46
 * @version 1.0
 **/
public class EncryptUtil {

    public static String getUuid() {
        return UUID.randomUUID().toString().replaceAll("-", StringUtils.EMPTY);
    }

    public static String md5Encrypt(String password, String salt) {
        return DigestUtils.md5DigestAsHex((password + salt).getBytes());
    }

}
