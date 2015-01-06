package com.shinowit.entity;

import java.io.Serializable;

public class TmeInstockdetailsinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_InStockDetailsInfo.ID
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_InStockDetailsInfo.MerchandiseID
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private String merchandiseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_InStockDetailsInfo.BillCode
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private String billcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_InStockDetailsInfo.Num
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_InStockDetailsInfo.Price
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private Float price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_InStockDetailsInfo.ID
     *
     * @return the value of TMe_InStockDetailsInfo.ID
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_InStockDetailsInfo.ID
     *
     * @param id the value for TMe_InStockDetailsInfo.ID
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_InStockDetailsInfo.MerchandiseID
     *
     * @return the value of TMe_InStockDetailsInfo.MerchandiseID
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public String getMerchandiseid() {
        return merchandiseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_InStockDetailsInfo.MerchandiseID
     *
     * @param merchandiseid the value for TMe_InStockDetailsInfo.MerchandiseID
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setMerchandiseid(String merchandiseid) {
        this.merchandiseid = merchandiseid == null ? null : merchandiseid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_InStockDetailsInfo.BillCode
     *
     * @return the value of TMe_InStockDetailsInfo.BillCode
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public String getBillcode() {
        return billcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_InStockDetailsInfo.BillCode
     *
     * @param billcode the value for TMe_InStockDetailsInfo.BillCode
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_InStockDetailsInfo.Num
     *
     * @return the value of TMe_InStockDetailsInfo.Num
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_InStockDetailsInfo.Num
     *
     * @param num the value for TMe_InStockDetailsInfo.Num
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_InStockDetailsInfo.Price
     *
     * @return the value of TMe_InStockDetailsInfo.Price
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_InStockDetailsInfo.Price
     *
     * @param price the value for TMe_InStockDetailsInfo.Price
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
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
        TmeInstockdetailsinfo other = (TmeInstockdetailsinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchandiseid() == null ? other.getMerchandiseid() == null : this.getMerchandiseid().equals(other.getMerchandiseid()))
            && (this.getBillcode() == null ? other.getBillcode() == null : this.getBillcode().equals(other.getBillcode()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchandiseid() == null) ? 0 : getMerchandiseid().hashCode());
        result = prime * result + ((getBillcode() == null) ? 0 : getBillcode().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }
}