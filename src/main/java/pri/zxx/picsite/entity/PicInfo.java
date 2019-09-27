package pri.zxx.picsite.entity;

/**
 * @author Administrator
 * @desc
 * @createTime 2019-09-27-上午 9:59
 */
public class PicInfo {
    private Long picId;
    private String picName;
    private String url;
    private String tip;
    private String upTime;
    private String psize;
    private String ppoint;
    private Long smId;

    @Override
    public String toString() {
        return "PicInfo{" +
                "picId=" + picId +
                ", picName='" + picName + '\'' +
                ", url='" + url + '\'' +
                ", tip='" + tip + '\'' +
                ", upTime='" + upTime + '\'' +
                ", psize='" + psize + '\'' +
                ", ppoint='" + ppoint + '\'' +
                ", smId=" + smId +
                '}';
    }

    public Long getPicId() {
        return picId;
    }

    public void setPicId(Long picId) {
        this.picId = picId;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getUpTime() {
        return upTime;
    }

    public void setUpTime(String upTime) {
        this.upTime = upTime;
    }

    public String getPsize() {
        return psize;
    }

    public void setPsize(String psize) {
        this.psize = psize;
    }

    public String getPpoint() {
        return ppoint;
    }

    public void setPpoint(String ppoint) {
        this.ppoint = ppoint;
    }

    public Long getSmId() {
        return smId;
    }

    public void setSmId(Long smId) {
        this.smId = smId;
    }
}
