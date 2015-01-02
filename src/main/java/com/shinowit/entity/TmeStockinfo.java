package com.shinowit.entity;

import java.io.Serializable;

public class TmeStockinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_StockInfo.ID
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_StockInfo.MerchandiseID
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    private String merchandiseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_StockInfo.AvgPrice
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    private Float avgprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_StockInfo.Num
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_StockInfo.ID
     *
     * @return the value of TMe_StockInfo.ID
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_StockInfo.ID
     *
     * @param id the value for TMe_StockInfo.ID
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_StockInfo.MerchandiseID
     *
     * @return the value of TMe_StockInfo.MerchandiseID
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public String getMerchandiseid() {
        return merchandiseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_StockInfo.MerchandiseID
     *
     * @param merchandiseid the value for TMe_StockInfo.MerchandiseID
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setMerchandiseid(String merchandiseid) {
        this.merchandiseid = merchandiseid == null ? null : merchandiseid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_StockInfo.AvgPrice
     *
     * @return the value of TMe_StockInfo.AvgPrice
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public Float getAvgprice() {
        return avgprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_StockInfo.AvgPrice
     *
     * @param avgprice the value for TMe_StockInfo.AvgPrice
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setAvgprice(Float avgprice) {
        this.avgprice = avgprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_StockInfo.Num
     *
     * @return the value of TMe_StockInfo.Num
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_StockInfo.Num
     *
     * @param num the value for TMe_StockInfo.Num
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
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
        TmeStockinfo other = (TmeStockinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchandiseid() == null ? other.getMerchandiseid() == null : this.getMerchandiseid().equals(other.getMerchandiseid()))
            && (this.getAvgprice() == null ? other.getAvgprice() == null : this.getAvgprice().equals(other.getAvgprice()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchandiseid() == null) ? 0 : getMerchandiseid().hashCode());
        result = prime * result + ((getAvgprice() == null) ? 0 : getAvgprice().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        return result;
    }
}