package cn.mywork.sketch.exception;

import cn.mywork.sketch.enums.ResultEnum;
import lombok.Getter;

/**
 * @author: sketch
 * @Date: 2022/1/6 20:47
 */
@Getter
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = -4088898423313593435L;
    private String msg;
    private ResultEnum resultEnum;

    public BaseException() {
    }

    public BaseException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public BaseException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.resultEnum = resultEnum;
    }
}
