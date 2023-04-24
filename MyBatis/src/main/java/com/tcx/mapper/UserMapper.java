package com.tcx.mapper;

import com.tcx.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    User selectById(int id);


//    多参数传递时，MyBatis会将多参数封装为map集合 如
//    map.put("arg0",参数值1)   map.put("param1",参数值1)
//    map.put("param2",参数值2) map.put("arg1",参数值2)
//    采用如@Param("status") 则是将arg0替换为status
//    Collection：map.put("arg0",collection集合)   map.put("Collection",collection集合)
//    List：      map.put("arg0",list集合)   map.put("Collection",list集合) map.put("list",list集合)
//    Array：     map.put("arg0",数组)   map.put("array",数组)
    List<User> selectCondition(@Param("status")int status,@Param("companyName")String companyName);
//    List<User> selectCondition(User user);
//    List<User> selectCondition(Map map);
    // 单条件查询时使用choose标签，相当于switch，内部<when>为case，otherwise为default（防止无条件）

    void insertUser(User user);

    void deleteByIds(@Param("ids")int[] ids);
}
