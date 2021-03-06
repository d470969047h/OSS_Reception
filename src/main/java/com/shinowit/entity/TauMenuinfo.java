package com.shinowit.entity;

import java.io.Serializable;

public class TauMenuinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAu_MenuInfo.MenuID
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private String menuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAu_MenuInfo.ID
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private Short id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAu_MenuInfo.MenuName
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private String menuname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAu_MenuInfo.URL
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAu_MenuInfo.SortID
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private String sortid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAu_MenuInfo.State
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private Boolean state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAu_MenuInfo.tag
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private String tag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAu_MenuInfo.checked
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private Boolean checked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAu_MenuInfo.MenuID
     *
     * @return the value of TAu_MenuInfo.MenuID
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public String getMenuid() {
        return menuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAu_MenuInfo.MenuID
     *
     * @param menuid the value for TAu_MenuInfo.MenuID
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAu_MenuInfo.ID
     *
     * @return the value of TAu_MenuInfo.ID
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAu_MenuInfo.ID
     *
     * @param id the value for TAu_MenuInfo.ID
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAu_MenuInfo.MenuName
     *
     * @return the value of TAu_MenuInfo.MenuName
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAu_MenuInfo.MenuName
     *
     * @param menuname the value for TAu_MenuInfo.MenuName
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAu_MenuInfo.URL
     *
     * @return the value of TAu_MenuInfo.URL
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAu_MenuInfo.URL
     *
     * @param url the value for TAu_MenuInfo.URL
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAu_MenuInfo.SortID
     *
     * @return the value of TAu_MenuInfo.SortID
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public String getSortid() {
        return sortid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAu_MenuInfo.SortID
     *
     * @param sortid the value for TAu_MenuInfo.SortID
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setSortid(String sortid) {
        this.sortid = sortid == null ? null : sortid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAu_MenuInfo.State
     *
     * @return the value of TAu_MenuInfo.State
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public Boolean getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAu_MenuInfo.State
     *
     * @param state the value for TAu_MenuInfo.State
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAu_MenuInfo.tag
     *
     * @return the value of TAu_MenuInfo.tag
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAu_MenuInfo.tag
     *
     * @param tag the value for TAu_MenuInfo.tag
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAu_MenuInfo.checked
     *
     * @return the value of TAu_MenuInfo.checked
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public Boolean getChecked() {
        return checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAu_MenuInfo.checked
     *
     * @param checked the value for TAu_MenuInfo.checked
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
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
        TauMenuinfo other = (TauMenuinfo) that;
        return (this.getMenuid() == null ? other.getMenuid() == null : this.getMenuid().equals(other.getMenuid()))
                && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getMenuname() == null ? other.getMenuname() == null : this.getMenuname().equals(other.getMenuname()))
                && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
                && (this.getSortid() == null ? other.getSortid() == null : this.getSortid().equals(other.getSortid()))
                && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
                && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
                && (this.getChecked() == null ? other.getChecked() == null : this.getChecked().equals(other.getChecked()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuid() == null) ? 0 : getMenuid().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMenuname() == null) ? 0 : getMenuname().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getSortid() == null) ? 0 : getSortid().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getChecked() == null) ? 0 : getChecked().hashCode());
        return result;
    }
}