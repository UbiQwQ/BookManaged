package com.innovation.dao;

import com.innovation.entity.Book;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Innovation
 * @Date: 2018/7/14 17:17
 * @Vison: 1.0
 * @Description:
 */
public interface BookDao {

    public Integer add(Book book);

    public Integer update(Book book);

    public List<Book> list(Map<String,Object> map);

    public Integer getTotal(Map<String,Object> map);

    public Book findById(Integer id);

    public Integer delete(Integer id);
}
