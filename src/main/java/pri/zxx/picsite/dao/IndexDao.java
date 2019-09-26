package pri.zxx.picsite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pri.zxx.picsite.entity.FirstMenu;

/**
 * @author zxx
 * @desc
 * @createTime 2019-09-25-下午 2:12
 */
@Repository
public interface IndexDao extends JpaRepository<FirstMenu, Long> {
}
