package top.notalent.blog.common.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import top.notalent.blog.common.constant.ResultConstant;

/**
 * Result
 * @author Roy Chen
 * 2019-07-28 11:38
 * @version 1.0
 **/
@Data
@AllArgsConstructor
public class Result {

    private Integer code;

    private String msg;

    private Object data;

    public static Result success() {
        return Result.successWithObject(ResultConstant.SUCCESS_STATUS);
    }

    public static Result successWithObject(Object data) {
        return new Result(ResultConstant.SUCCESS_CODE, StringUtils.EMPTY, data);
    }

    public static Result successWithMsg(String msg) {
        return new Result(ResultConstant.SUCCESS_CODE, StringUtils.EMPTY, ResultConstant.NULL_DATA);
    }

    public static Result error() {
        return Result.errorWithObject(ResultConstant.ERROR_STATUS);
    }

    public static Result errorWithObject(Object data) {
        return new Result(ResultConstant.ERROR_CODE, StringUtils.EMPTY, data);
    }

    public static Result errorWithMsg(String msg) {
        return new Result(ResultConstant.ERROR_CODE, msg, ResultConstant.NULL_DATA);
    }

}
