package pri.zxx.picsite.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author zxx
 * @desc
 * @createTime 2019-09-25-下午 2:13
 */
public class FirstMenu {
    private Long fmId;
    @NotBlank(message = "一级目录名称不能为空")
    private String fmName;
    @NotNull(message = "是否启用不能为空")
    private Integer enabled;
    @Size(min = 6, max = 10)
    private String tip;


    public Long getFmId() {
        return fmId;
    }

    public void setFmId(Long fmId) {
        this.fmId = fmId;
    }

    public String getFmName() {
        return fmName;
    }

    public void setFmName(String fmName) {
        this.fmName = fmName;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "FirstMenu{" +
                "fmId=" + fmId +
                ", fmName='" + fmName + '\'' +
                ", enabled=" + enabled +
                ", tip='" + tip + '\'' +
                '}';
    }
}
