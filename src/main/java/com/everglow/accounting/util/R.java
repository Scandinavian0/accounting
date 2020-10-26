package com.everglow.accounting.util;


import com.everglow.accounting.modules.vo.Result;
import org.springframework.http.HttpStatus;

/**
 *
 * 结果生成日志
 * @author ljz
 * @date 2018/6/14 20:46
 */
public class R {
    private static final String DEFAULT_OK_MESSAGE = "操作成功！";

    public static Result genOkResult() {
        return new Result(DEFAULT_OK_MESSAGE, HttpStatus.OK.value());
    }
    public static<T> Result<T> genOkResult(final T data) {
		return new Result<T>(DEFAULT_OK_MESSAGE, HttpStatus.OK.value()).setData(data);

    }

    public static Result genFailedResult(final String msg) {
		return new Result(msg, HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

	/**
	 * 无权限
	 */
	public static Result genUnAuthorizedResult(final String msg) {
		return new Result(msg, HttpStatus.UNAUTHORIZED.value());
	}
	/**
	 * security拒绝访问
	 */
	public static Result genForbiddenResult(final String msg) {
		return new Result(msg, HttpStatus.FORBIDDEN.value());
	}
}
