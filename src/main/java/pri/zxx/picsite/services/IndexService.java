package pri.zxx.picsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.zxx.picsite.dao.IndexDao;
import pri.zxx.picsite.entity.FirstMenu;

/**
 * @author Administrator
 * @desc
 * @createTime 2019-09-25-下午 2:11
 */
@Service
public class IndexService {
    @Autowired
    private IndexDao indexDao;

    public boolean insert(FirstMenu firstMenu) {
        FirstMenu save = indexDao.save(firstMenu);
        System.out.println(save);
        return true;
    }
}


