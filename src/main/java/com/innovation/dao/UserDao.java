package com.innovation.dao;

import com.innovation.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Innovation
 * @Date: 2018/7/10 21:07
 * @Vison: 1.0
 * @Description:
 */
public interface UserDao {

    public Integer add(User user);

    public Integer update(User user);

    public List<User> list(Map<String, Object> map);

    public Integer getTotal(Map<String, Object> map);

    public User findByNum(String num);

    public User findById(Integer id);

    public Integer delete(Integer id);
}
