package com.shinowit.entity;

import java.io.Serializable;

public class TmeTrolleyitem implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_TrolleyItem.TrolleyItemID
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private Integer trolleyitemid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_TrolleyItem.TrolleyID
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private Integer trolleyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_TrolleyItem.MerchandiseName
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private String merchandisename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_TrolleyItem.PicPath
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private String picpath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_TrolleyItem.UnitPrice
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private Float unitprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_TrolleyItem.Num
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_TrolleyItem.SubTotal
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private Float subtotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_TrolleyItem.IsBuy
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private Boolean isbuy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_TrolleyItem.TrolleyItemID
     *
     * @return the value of TMe_TrolleyItem.TrolleyItemID
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public Integer getTrolleyitemid() {
        return trolleyitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_TrolleyItem.TrolleyItemID
     *
     * @param trolleyitemid the value for TMe_TrolleyItem.TrolleyItemID
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setTrolleyitemid(Integer trolleyitemid) {
        this.trolleyitemid = trolleyitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_TrolleyItem.TrolleyID
     *
     * @return the value of TMe_TrolleyItem.TrolleyID
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public Integer getTrolleyid() {
        return trolleyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_TrolleyItem.TrolleyID
     *
     * @param trolleyid the value for TMe_TrolleyItem.TrolleyID
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setTrolleyid(Integer trolleyid) {
        this.trolleyid = trolleyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_TrolleyItem.MerchandiseName
     *
     * @return the value of TMe_TrolleyItem.MerchandiseName
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public String getMerchandisename() {
        return merchandisename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_TrolleyItem.MerchandiseName
     *
     * @param merchandisename the value for TMe_TrolleyItem.MerchandiseName
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setMerchandisename(String merchandisename) {
        this.merchandisename = merchandisename == null ? null : merchandisename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_TrolleyItem.PicPath
     *
     * @return the value of TMe_TrolleyItem.PicPath
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public String getPicpath() {
        return picpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_TrolleyItem.PicPath
     *
     * @param picpath the value for TMe_TrolleyItem.PicPath
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_TrolleyItem.UnitPrice
     *
     * @return the value of TMe_TrolleyItem.UnitPrice
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public Float getUnitprice() {
        return unitprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_TrolleyItem.UnitPrice
     *
     * @param unitprice the value for TMe_TrolleyItem.UnitPrice
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setUnitprice(Float unitprice) {
        this.unitprice = unitprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_TrolleyItem.Num
     *
     * @return the value of TMe_TrolleyItem.Num
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_TrolleyItem.Num
     *
     * @param num the value for TMe_TrolleyItem.Num
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_TrolleyItem.SubTotal
     *
     * @return the value of TMe_TrolleyItem.SubTotal
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public Float getSubtotal() {
        return subtotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_TrolleyItem.SubTotal
     *
     * @param subtotal the value for TMe_TrolleyItem.SubTotal
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_TrolleyItem.IsBuy
     *
     * @return the value of TMe_TrolleyItem.IsBuy
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public Boolean getIsbuy() {
        return isbuy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_TrolleyItem.IsBuy
     *
     * @param isbuy the value for TMe_TrolleyItem.IsBuy
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setIsbuy(Boolean isbuy) {
        this.isbuy = isbuy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TmeTrolleyitem other = (TmeTrolleyitem) that;
        return (this.getTrolleyitemid() == null ? other.getTrolleyitemid() == null : this.getTrolleyitemid().equals(other.getTrolleyitemid()))
                && (this.getTrolleyid() == null ? other.getTrolleyid() == null : this.getTrolleyid().equals(other.getTrolleyid()))
                && (this.getMerchandisename() == null ? other.getMerchandisename() == null : this.getMerchandisename().equals(other.getMerchandisename()))
                && (this.getPicpath() == null ? other.getPicpath() == null : this.getPicpath().equals(other.getPicpath()))
                && (this.getUnitprice() == null ? other.getUnitprice() == null : this.getUnitprice().equals(other.getUnitprice()))
                && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
                && (this.getSubtotal() == null ? other.getSubtotal() == null : this.getSubtotal().equals(other.getSubtotal()))
                && (this.getIsbuy() == null ? other.getIsbuy() == null : this.getIsbuy().equals(other.getIsbuy()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrolleyitemid() == null) ? 0 : getTrolleyitemid().hashCode());
        result = prime * result + ((getTrolleyid() == null) ? 0 : getTrolleyid().hashCode());
        result = prime * result + ((getMerchandisename() == null) ? 0 : getMerchandisename().hashCode());
        result = prime * result + ((getPicpath() == null) ? 0 : getPicpath().hashCode());
        result = prime * result + ((getUnitprice() == null) ? 0 : getUnitprice().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getSubtotal() == null) ? 0 : getSubtotal().hashCode());
        result = prime * result + ((getIsbuy() == null) ? 0 : getIsbuy().hashCode());
        return result;
    }
}