package com.shinowit.entity;

import java.io.Serializable;

public class TbaMembeaddrinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MembeAddrInfo.ID
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MembeAddrInfo.UserName
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MembeAddrInfo.RecMan
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private String recman;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MembeAddrInfo.Tel
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MembeAddrInfo.RecAddress
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private String recaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MembeAddrInfo.PostCode
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private String postcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MembeAddrInfo.IsDefault
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private Boolean isdefault;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MembeAddrInfo.ID
     *
     * @return the value of TBa_MembeAddrInfo.ID
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MembeAddrInfo.ID
     *
     * @param id the value for TBa_MembeAddrInfo.ID
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MembeAddrInfo.UserName
     *
     * @return the value of TBa_MembeAddrInfo.UserName
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MembeAddrInfo.UserName
     *
     * @param username the value for TBa_MembeAddrInfo.UserName
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MembeAddrInfo.RecMan
     *
     * @return the value of TBa_MembeAddrInfo.RecMan
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public String getRecman() {
        return recman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MembeAddrInfo.RecMan
     *
     * @param recman the value for TBa_MembeAddrInfo.RecMan
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setRecman(String recman) {
        this.recman = recman == null ? null : recman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MembeAddrInfo.Tel
     *
     * @return the value of TBa_MembeAddrInfo.Tel
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MembeAddrInfo.Tel
     *
     * @param tel the value for TBa_MembeAddrInfo.Tel
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MembeAddrInfo.RecAddress
     *
     * @return the value of TBa_MembeAddrInfo.RecAddress
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public String getRecaddress() {
        return recaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MembeAddrInfo.RecAddress
     *
     * @param recaddress the value for TBa_MembeAddrInfo.RecAddress
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setRecaddress(String recaddress) {
        this.recaddress = recaddress == null ? null : recaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MembeAddrInfo.PostCode
     *
     * @return the value of TBa_MembeAddrInfo.PostCode
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MembeAddrInfo.PostCode
     *
     * @param postcode the value for TBa_MembeAddrInfo.PostCode
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MembeAddrInfo.IsDefault
     *
     * @return the value of TBa_MembeAddrInfo.IsDefault
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public Boolean getIsdefault() {
        return isdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MembeAddrInfo.IsDefault
     *
     * @param isdefault the value for TBa_MembeAddrInfo.IsDefault
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
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
        TbaMembeaddrinfo other = (TbaMembeaddrinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getRecman() == null ? other.getRecman() == null : this.getRecman().equals(other.getRecman()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getRecaddress() == null ? other.getRecaddress() == null : this.getRecaddress().equals(other.getRecaddress()))
            && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getIsdefault() == null ? other.getIsdefault() == null : this.getIsdefault().equals(other.getIsdefault()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getRecman() == null) ? 0 : getRecman().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getRecaddress() == null) ? 0 : getRecaddress().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getIsdefault() == null) ? 0 : getIsdefault().hashCode());
        return result;
    }
}