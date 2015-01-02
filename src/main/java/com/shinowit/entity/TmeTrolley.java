package com.shinowit.entity;

import java.io.Serializable;
import java.util.Date;

public class TmeTrolley implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_Trolley.TrolleyID
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    private Integer trolleyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_Trolley.UserName
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_Trolley.CreateDate
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    private Date createdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_Trolley.TrolleyState
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    private String trolleystate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_Trolley.TotalMoney
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    private Float totalmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_Trolley.TrolleyID
     *
     * @return the value of TMe_Trolley.TrolleyID
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public Integer getTrolleyid() {
        return trolleyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_Trolley.TrolleyID
     *
     * @param trolleyid the value for TMe_Trolley.TrolleyID
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setTrolleyid(Integer trolleyid) {
        this.trolleyid = trolleyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_Trolley.UserName
     *
     * @return the value of TMe_Trolley.UserName
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_Trolley.UserName
     *
     * @param username the value for TMe_Trolley.UserName
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_Trolley.CreateDate
     *
     * @return the value of TMe_Trolley.CreateDate
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_Trolley.CreateDate
     *
     * @param createdate the value for TMe_Trolley.CreateDate
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_Trolley.TrolleyState
     *
     * @return the value of TMe_Trolley.TrolleyState
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public String getTrolleystate() {
        return trolleystate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_Trolley.TrolleyState
     *
     * @param trolleystate the value for TMe_Trolley.TrolleyState
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setTrolleystate(String trolleystate) {
        this.trolleystate = trolleystate == null ? null : trolleystate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_Trolley.TotalMoney
     *
     * @return the value of TMe_Trolley.TotalMoney
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public Float getTotalmoney() {
        return totalmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_Trolley.TotalMoney
     *
     * @param totalmoney the value for TMe_Trolley.TotalMoney
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setTotalmoney(Float totalmoney) {
        this.totalmoney = totalmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
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
        TmeTrolley other = (TmeTrolley) that;
        return (this.getTrolleyid() == null ? other.getTrolleyid() == null : this.getTrolleyid().equals(other.getTrolleyid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getTrolleystate() == null ? other.getTrolleystate() == null : this.getTrolleystate().equals(other.getTrolleystate()))
            && (this.getTotalmoney() == null ? other.getTotalmoney() == null : this.getTotalmoney().equals(other.getTotalmoney()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrolleyid() == null) ? 0 : getTrolleyid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getTrolleystate() == null) ? 0 : getTrolleystate().hashCode());
        result = prime * result + ((getTotalmoney() == null) ? 0 : getTotalmoney().hashCode());
        return result;
    }
}