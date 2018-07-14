package com.innovation.dao;

import com.innovation.entity.UserSub;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Innovation
 * @Date: 2018/7/14 17:16
 * @Vison: 1.0
 * @Description:
 */
public interface UserSubDao {

    public Integer add(UserSub userSub);

    public Integer update(UserSub userSub);

    public List<UserSub> list(Map<String,Object> map);

    public Integer getTotal(Map<String,Object> map);

    public UserSub findById(Integer id);

    public Integer delete(Integer id);
}
