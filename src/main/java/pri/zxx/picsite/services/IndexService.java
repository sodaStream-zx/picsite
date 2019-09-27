package pri.zxx.picsite.services;

import org.springframework.stereotype.Service;
import pri.zxx.picsite.entity.FirstMenu;
import pri.zxx.picsite.mapper.IndexMapper;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @desc
 * @createTime 2019-09-25-下午 2:11
 */
@Service
public class IndexService {
    @Resource
    private IndexMapper indexMapper;

    public boolean insert(FirstMenu firstMenu) {
        Integer save = indexMapper.save(firstMenu);
        return save > 0;
    }
}


