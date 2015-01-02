package com.shinowit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbaSupplyrecordinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public TbaSupplyrecordinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex=pageIndex;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setCustomCriteria(String customCriteria) {
        this.customCriteria=customCriteria;
    }

    public String getCustomCriteria() {
        return this.customCriteria;
    }

    public int getSkipRecordCount() {
        int count=(this.pageIndex-1)*this.pageSize;
        if (count<0){
             count=0;
        }
        return count;
    }

    public int getEndRecordCount() {
        return this.pageIndex*this.pageSize;
    }

    public TbaSupplyrecordinfoExample(int pageSize, int pageIndex) {
        this();
        this.pageSize=pageSize;
        this.pageIndex=pageIndex;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoIsNull() {
            addCriterion("PayAccountNo is null");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoIsNotNull() {
            addCriterion("PayAccountNo is not null");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoEqualTo(String value) {
            addCriterion("PayAccountNo =", value, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoNotEqualTo(String value) {
            addCriterion("PayAccountNo <>", value, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoGreaterThan(String value) {
            addCriterion("PayAccountNo >", value, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("PayAccountNo >=", value, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoLessThan(String value) {
            addCriterion("PayAccountNo <", value, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoLessThanOrEqualTo(String value) {
            addCriterion("PayAccountNo <=", value, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoLike(String value) {
            addCriterion("PayAccountNo like", value, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoNotLike(String value) {
            addCriterion("PayAccountNo not like", value, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoIn(List<String> values) {
            addCriterion("PayAccountNo in", values, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoNotIn(List<String> values) {
            addCriterion("PayAccountNo not in", values, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoBetween(String value1, String value2) {
            addCriterion("PayAccountNo between", value1, value2, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoNotBetween(String value1, String value2) {
            addCriterion("PayAccountNo not between", value1, value2, "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPaybankIsNull() {
            addCriterion("PayBank is null");
            return (Criteria) this;
        }

        public Criteria andPaybankIsNotNull() {
            addCriterion("PayBank is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankEqualTo(String value) {
            addCriterion("PayBank =", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotEqualTo(String value) {
            addCriterion("PayBank <>", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankGreaterThan(String value) {
            addCriterion("PayBank >", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankGreaterThanOrEqualTo(String value) {
            addCriterion("PayBank >=", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLessThan(String value) {
            addCriterion("PayBank <", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLessThanOrEqualTo(String value) {
            addCriterion("PayBank <=", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLike(String value) {
            addCriterion("PayBank like", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotLike(String value) {
            addCriterion("PayBank not like", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankIn(List<String> values) {
            addCriterion("PayBank in", values, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotIn(List<String> values) {
            addCriterion("PayBank not in", values, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankBetween(String value1, String value2) {
            addCriterion("PayBank between", value1, value2, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotBetween(String value1, String value2) {
            addCriterion("PayBank not between", value1, value2, "paybank");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoIsNull() {
            addCriterion("RecAccountNo is null");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoIsNotNull() {
            addCriterion("RecAccountNo is not null");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoEqualTo(String value) {
            addCriterion("RecAccountNo =", value, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoNotEqualTo(String value) {
            addCriterion("RecAccountNo <>", value, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoGreaterThan(String value) {
            addCriterion("RecAccountNo >", value, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("RecAccountNo >=", value, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoLessThan(String value) {
            addCriterion("RecAccountNo <", value, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoLessThanOrEqualTo(String value) {
            addCriterion("RecAccountNo <=", value, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoLike(String value) {
            addCriterion("RecAccountNo like", value, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoNotLike(String value) {
            addCriterion("RecAccountNo not like", value, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoIn(List<String> values) {
            addCriterion("RecAccountNo in", values, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoNotIn(List<String> values) {
            addCriterion("RecAccountNo not in", values, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoBetween(String value1, String value2) {
            addCriterion("RecAccountNo between", value1, value2, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoNotBetween(String value1, String value2) {
            addCriterion("RecAccountNo not between", value1, value2, "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecbankIsNull() {
            addCriterion("RecBank is null");
            return (Criteria) this;
        }

        public Criteria andRecbankIsNotNull() {
            addCriterion("RecBank is not null");
            return (Criteria) this;
        }

        public Criteria andRecbankEqualTo(String value) {
            addCriterion("RecBank =", value, "recbank");
            return (Criteria) this;
        }

        public Criteria andRecbankNotEqualTo(String value) {
            addCriterion("RecBank <>", value, "recbank");
            return (Criteria) this;
        }

        public Criteria andRecbankGreaterThan(String value) {
            addCriterion("RecBank >", value, "recbank");
            return (Criteria) this;
        }

        public Criteria andRecbankGreaterThanOrEqualTo(String value) {
            addCriterion("RecBank >=", value, "recbank");
            return (Criteria) this;
        }

        public Criteria andRecbankLessThan(String value) {
            addCriterion("RecBank <", value, "recbank");
            return (Criteria) this;
        }

        public Criteria andRecbankLessThanOrEqualTo(String value) {
            addCriterion("RecBank <=", value, "recbank");
            return (Criteria) this;
        }

        public Criteria andRecbankLike(String value) {
            addCriterion("RecBank like", value, "recbank");
            return (Criteria) this;
        }

        public Criteria andRecbankNotLike(String value) {
            addCriterion("RecBank not like", value, "recbank");
            return (Criteria) this;
        }

        public Criteria andRecbankIn(List<String> values) {
            addCriterion("RecBank in", values, "recbank");
            return (Criteria) this;
        }

        public Criteria andRecbankNotIn(List<String> values) {
            addCriterion("RecBank not in", values, "recbank");
            return (Criteria) this;
        }

        public Criteria andRecbankBetween(String value1, String value2) {
            addCriterion("RecBank between", value1, value2, "recbank");
            return (Criteria) this;
        }

        public Criteria andRecbankNotBetween(String value1, String value2) {
            addCriterion("RecBank not between", value1, value2, "recbank");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("TotalMoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("TotalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(Float value) {
            addCriterion("TotalMoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(Float value) {
            addCriterion("TotalMoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(Float value) {
            addCriterion("TotalMoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("TotalMoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(Float value) {
            addCriterion("TotalMoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(Float value) {
            addCriterion("TotalMoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<Float> values) {
            addCriterion("TotalMoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<Float> values) {
            addCriterion("TotalMoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(Float value1, Float value2) {
            addCriterion("TotalMoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(Float value1, Float value2) {
            addCriterion("TotalMoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andSupplytimeIsNull() {
            addCriterion("SupplyTime is null");
            return (Criteria) this;
        }

        public Criteria andSupplytimeIsNotNull() {
            addCriterion("SupplyTime is not null");
            return (Criteria) this;
        }

        public Criteria andSupplytimeEqualTo(Date value) {
            addCriterion("SupplyTime =", value, "supplytime");
            return (Criteria) this;
        }

        public Criteria andSupplytimeNotEqualTo(Date value) {
            addCriterion("SupplyTime <>", value, "supplytime");
            return (Criteria) this;
        }

        public Criteria andSupplytimeGreaterThan(Date value) {
            addCriterion("SupplyTime >", value, "supplytime");
            return (Criteria) this;
        }

        public Criteria andSupplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SupplyTime >=", value, "supplytime");
            return (Criteria) this;
        }

        public Criteria andSupplytimeLessThan(Date value) {
            addCriterion("SupplyTime <", value, "supplytime");
            return (Criteria) this;
        }

        public Criteria andSupplytimeLessThanOrEqualTo(Date value) {
            addCriterion("SupplyTime <=", value, "supplytime");
            return (Criteria) this;
        }

        public Criteria andSupplytimeIn(List<Date> values) {
            addCriterion("SupplyTime in", values, "supplytime");
            return (Criteria) this;
        }

        public Criteria andSupplytimeNotIn(List<Date> values) {
            addCriterion("SupplyTime not in", values, "supplytime");
            return (Criteria) this;
        }

        public Criteria andSupplytimeBetween(Date value1, Date value2) {
            addCriterion("SupplyTime between", value1, value2, "supplytime");
            return (Criteria) this;
        }

        public Criteria andSupplytimeNotBetween(Date value1, Date value2) {
            addCriterion("SupplyTime not between", value1, value2, "supplytime");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(UserName) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andPayaccountnoLikeInsensitive(String value) {
            addCriterion("upper(PayAccountNo) like", value.toUpperCase(), "payaccountno");
            return (Criteria) this;
        }

        public Criteria andPaybankLikeInsensitive(String value) {
            addCriterion("upper(PayBank) like", value.toUpperCase(), "paybank");
            return (Criteria) this;
        }

        public Criteria andRecaccountnoLikeInsensitive(String value) {
            addCriterion("upper(RecAccountNo) like", value.toUpperCase(), "recaccountno");
            return (Criteria) this;
        }

        public Criteria andRecbankLikeInsensitive(String value) {
            addCriterion("upper(RecBank) like", value.toUpperCase(), "recbank");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(Remark) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated do_not_delete_during_merge Fri Jan 02 15:01:59 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}