package top.notalent.blog.common.util;

import java.util.Date;

/**
 * DateUtil
 *
 * @author Roy Chen
 * 2019-07-28 11:39
 * @version 1.0
 **/
public class DateUtil {

    public static String getTimestamp(Date date) {
        return Long.toString(date.getTime());
    }

}
