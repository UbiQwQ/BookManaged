package com.innovation.entity;

import java.util.Date;

/**
 * @Auther: Innovation
 * @Date: 2018/7/14 16:25
 * @Vison: 1.0
 * @Description:
 */
public class Book {
    private Integer id;
    private String bianhao;//图书编号
    private String name;//书名
    private String banhao;//出版书号
    private String bianzhu;//编著者
    private String chubanshe;//出版社
    private Date chubanDate;//出版日期
    private String danjia;//单价
    private Integer kucun;//库存数量


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getBianhao() {
        return bianhao;
    }
    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBanhao() {
        return banhao;
    }
    public void setBanhao(String banhao) {
        this.banhao = banhao;
    }
    public String getBianzhu() {
        return bianzhu;
    }
    public void setBianzhu(String bianzhu) {
        this.bianzhu = bianzhu;
    }
    public String getChubanshe() {
        return chubanshe;
    }
    public void setChubanshe(String chubanshe) {
        this.chubanshe = chubanshe;
    }


    public Date getChubanDate() {
        return chubanDate;
    }
    public void setChubanDate(Date chubanDate) {
        this.chubanDate = chubanDate;
    }
    public String getDanjia() {
        return danjia;
    }
    public void setDanjia(String danjia) {
        this.danjia = danjia;
    }
    public Integer getKucun() {
        return kucun;
    }
    public void setKucun(Integer kucun) {
        this.kucun = kucun;
    }
}
