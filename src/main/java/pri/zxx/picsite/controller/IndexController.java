package pri.zxx.picsite.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pri.zxx.picsite.entity.FirstMenu;
import pri.zxx.picsite.res.ResDto;
import pri.zxx.picsite.services.IndexService;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author zxx
 * @desc
 * @createTime 2019-09-25-下午 2:11
 */
@RestController
@Validated
public class IndexController {
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private IndexService indexService;

    @GetMapping(value = "/save")
    public String saveFm(@Valid FirstMenu firstMenu) {
        log.warn("添加一级分类:{}", firstMenu);
        boolean insert = indexService.insert(firstMenu);
        if (insert) {
            return JSON.toJSONString(new ResDto(10000, "添加成功"));
        } else {
            return JSON.toJSONString(new ResDto(5000, "添加失败"));
        }
    }

    @GetMapping(value = "/valid")
    public String validt(@NotEmpty(message = "名称不能为空")
                         @RequestParam(required = true, value = "name") String name,

                         @Min(value = 6, message = "年龄不能小于6")
                         @Max(value = 10, message = "年龄不能大于10")
                         @RequestParam(required = true, value = "age") Integer age) {
        log.warn("name:" + name + ",age:" + age);
        return "test";
    }
}
