package pri.zxx.picsite.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pri.zxx.picsite.entity.FirstMenu;

/**
 * @author zxx
 * @desc
 * @createTime 2019-09-25-下午 2:12
 */
@Mapper
public interface IndexMapper {

    @Insert(value = "insert into first_menu(fm_name,enabled,tip) VALUES(#{fm.fmName},#{fm.enabled},#{fm.tip}) ")
    Integer save(@Param(value = "fm") FirstMenu fm);
}
