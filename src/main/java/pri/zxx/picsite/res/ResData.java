package pri.zxx.picsite.res;

/**
 * @author Administrator
 * @desc
 * @createTime 2019-09-26-上午 9:23
 */
public class ResData extends ResDto {
    public Object data;

    public ResData(Object data) {
        this.data = data;
    }

    public ResData(Integer code, String msg, Object data) {
        super(code, msg);
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResData{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
