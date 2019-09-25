package pri.zxx.picsite.entity;

/**
 * @author Administrator
 * @desc
 * @createTime 2019-09-25-下午 2:38
 */
public class TheTst {
    private Long time;
    private Double score;

    public TheTst(Long time, Double score) {
        this.time = time;
        this.score = score;
    }

    public TheTst() {
    }

    @Override
    public String toString() {
        return "TheTst{" +
                "time=" + time +
                ", score=" + score +
                '}';
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
