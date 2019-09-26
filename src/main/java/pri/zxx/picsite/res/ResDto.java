package pri.zxx.picsite.res;

/**
 * @author Administrator
 * @desc
 * @createTime 2019-09-26-上午 9:22
 */
public class ResDto {
    public Integer code;
    public String msg;

    public ResDto() {
    }

    public ResDto(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResDto{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
