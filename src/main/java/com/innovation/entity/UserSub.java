package com.innovation.entity;

import java.util.Date;

/**
 * @Auther: Innovation
 * @Date: 2018/7/14 16:30
 * @Vison: 1.0
 * @Description: 读者借阅信息表单 借阅图书时，需自动查阅该书库存数量，借出后，将该书库存数量自动减少
 */

public class UserSub {

    private Integer id;
    private Integer userId;
    private Integer bookId;
    private Date subDateTime;//借阅时间
    private Date returnDateTime;//归还 时间
    private Integer type;//1未还 2已还


    //////////////////
    private User user;
    private Book book;
    //////////////////


    public Integer getId() {
        return id;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getBookId() {
        return bookId;
    }
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public Date getSubDateTime() {
        return subDateTime;
    }
    public void setSubDateTime(Date subDateTime) {
        this.subDateTime = subDateTime;
    }
    public Date getReturnDateTime() {
        return returnDateTime;
    }
    public void setReturnDateTime(Date returnDateTime) {
        this.returnDateTime = returnDateTime;
    }
}
