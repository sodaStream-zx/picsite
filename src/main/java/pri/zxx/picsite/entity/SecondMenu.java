package pri.zxx.picsite.entity;

/**
 * @author Administrator
 * @desc
 * @createTime 2019-09-27-上午 9:55
 */
public class SecondMenu {
    private Long smId;
    private String smName;
    private Integer enabled;
    private String tip;
    private Long fmId;

    @Override
    public String toString() {
        return "SecondMenu{" +
                "smId=" + smId +
                ", smName='" + smName + '\'' +
                ", enabled=" + enabled +
                ", tip='" + tip + '\'' +
                ", fmId=" + fmId +
                '}';
    }

    public Long getFmId() {
        return fmId;
    }

    public void setFmId(Long fmId) {
        this.fmId = fmId;
    }

    public Long getSmId() {
        return smId;
    }

    public void setSmId(Long smId) {
        this.smId = smId;
    }

    public String getSmName() {
        return smName;
    }

    public void setSmName(String smName) {
        this.smName = smName;
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
}
