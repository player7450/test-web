package lz.test.bean;

import lombok.Builder;
import lombok.Data;

/**
 * @author 万二(Zheng Liu)
 * @date 2017/12/12
 */
@Data
@Builder
public class AjaxResult {
    private Boolean success;
    private String msg;
    private Object data;

    public static AjaxResult success(Object data, String msg) {
        return new AjaxResultBuilder()
                .success(true)
                .msg(msg)
                .data(data)
                .build();
    }

    public static AjaxResult success(Object data) {
        return success(data, null);
    }

    public static AjaxResult success() {
        return success(null, null);
    }

    public static AjaxResult fail(String msg) {
        return new AjaxResultBuilder()
                .success(false)
                .msg(msg)
                .build();
    }

    public static AjaxResult fail() {
        return fail(null);
    }

}
