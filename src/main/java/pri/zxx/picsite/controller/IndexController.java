package pri.zxx.picsite.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pri.zxx.picsite.entity.FirstMenu;
import pri.zxx.picsite.res.ResDto;
import pri.zxx.picsite.services.IndexService;

/**
 * @author zxx
 * @desc
 * @createTime 2019-09-25-下午 2:11
 */
@RestController
public class IndexController {
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private IndexService indexService;

    @GetMapping(value = "/save")
    public String saveFm(FirstMenu firstMenu) {
        boolean insert = indexService.insert(firstMenu);
        if (insert) {
            return JSON.toJSONString(new ResDto(10000, "添加成功"));
        } else {
            return JSON.toJSONString(new ResDto(5000, "添加失败"));
        }
    }
}
