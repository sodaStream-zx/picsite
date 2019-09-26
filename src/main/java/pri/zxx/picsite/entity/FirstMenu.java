package pri.zxx.picsite.entity;

import javax.persistence.*;

/**
 * @author zxx
 * @desc
 * @createTime 2019-09-25-下午 2:13
 */
@Entity
public class FirstMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fmId;
    @Column
    private String fmName;
    @Column
    private Integer enabled;
    @Column
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
