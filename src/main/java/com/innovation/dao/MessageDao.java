package com.innovation.dao;

import com.innovation.entity.Message;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Innovation
 * @Date: 2018/7/14 17:15
 * @Vison: 1.0
 * @Description:
 */
public interface MessageDao {

    public Integer  add(Message msg);

    public Integer  update(Message  msg);

    public List<Message> list(Map<String,Object> map);

    public Integer getTotal(Map<String,Object> map);

    public Integer delete(Integer id);

    public Message findById(Integer id);
}
