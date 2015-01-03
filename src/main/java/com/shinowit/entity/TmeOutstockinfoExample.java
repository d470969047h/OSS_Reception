package com.shinowit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmeOutstockinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public TmeOutstockinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
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
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
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

    public TmeOutstockinfoExample(int pageSize, int pageIndex) {
        this();
        this.pageSize=pageSize;
        this.pageIndex=pageIndex;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
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

        public Criteria andOutbillcodeIsNull() {
            addCriterion("OutBillCode is null");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeIsNotNull() {
            addCriterion("OutBillCode is not null");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeEqualTo(String value) {
            addCriterion("OutBillCode =", value, "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeNotEqualTo(String value) {
            addCriterion("OutBillCode <>", value, "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeGreaterThan(String value) {
            addCriterion("OutBillCode >", value, "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OutBillCode >=", value, "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeLessThan(String value) {
            addCriterion("OutBillCode <", value, "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeLessThanOrEqualTo(String value) {
            addCriterion("OutBillCode <=", value, "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeLike(String value) {
            addCriterion("OutBillCode like", value, "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeNotLike(String value) {
            addCriterion("OutBillCode not like", value, "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeIn(List<String> values) {
            addCriterion("OutBillCode in", values, "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeNotIn(List<String> values) {
            addCriterion("OutBillCode not in", values, "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeBetween(String value1, String value2) {
            addCriterion("OutBillCode between", value1, value2, "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOutbillcodeNotBetween(String value1, String value2) {
            addCriterion("OutBillCode not between", value1, value2, "outbillcode");
            return (Criteria) this;
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

        public Criteria andOperidIsNull() {
            addCriterion("OperID is null");
            return (Criteria) this;
        }

        public Criteria andOperidIsNotNull() {
            addCriterion("OperID is not null");
            return (Criteria) this;
        }

        public Criteria andOperidEqualTo(String value) {
            addCriterion("OperID =", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotEqualTo(String value) {
            addCriterion("OperID <>", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidGreaterThan(String value) {
            addCriterion("OperID >", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidGreaterThanOrEqualTo(String value) {
            addCriterion("OperID >=", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLessThan(String value) {
            addCriterion("OperID <", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLessThanOrEqualTo(String value) {
            addCriterion("OperID <=", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLike(String value) {
            addCriterion("OperID like", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotLike(String value) {
            addCriterion("OperID not like", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidIn(List<String> values) {
            addCriterion("OperID in", values, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotIn(List<String> values) {
            addCriterion("OperID not in", values, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidBetween(String value1, String value2) {
            addCriterion("OperID between", value1, value2, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotBetween(String value1, String value2) {
            addCriterion("OperID not between", value1, value2, "operid");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNull() {
            addCriterion("OutTime is null");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNotNull() {
            addCriterion("OutTime is not null");
            return (Criteria) this;
        }

        public Criteria andOuttimeEqualTo(Date value) {
            addCriterion("OutTime =", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotEqualTo(Date value) {
            addCriterion("OutTime <>", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThan(Date value) {
            addCriterion("OutTime >", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OutTime >=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThan(Date value) {
            addCriterion("OutTime <", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThanOrEqualTo(Date value) {
            addCriterion("OutTime <=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIn(List<Date> values) {
            addCriterion("OutTime in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotIn(List<Date> values) {
            addCriterion("OutTime not in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeBetween(Date value1, Date value2) {
            addCriterion("OutTime between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotBetween(Date value1, Date value2) {
            addCriterion("OutTime not between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNull() {
            addCriterion("Handler is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNotNull() {
            addCriterion("Handler is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerEqualTo(String value) {
            addCriterion("Handler =", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotEqualTo(String value) {
            addCriterion("Handler <>", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThan(String value) {
            addCriterion("Handler >", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("Handler >=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThan(String value) {
            addCriterion("Handler <", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThanOrEqualTo(String value) {
            addCriterion("Handler <=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLike(String value) {
            addCriterion("Handler like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotLike(String value) {
            addCriterion("Handler not like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerIn(List<String> values) {
            addCriterion("Handler in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotIn(List<String> values) {
            addCriterion("Handler not in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerBetween(String value1, String value2) {
            addCriterion("Handler between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotBetween(String value1, String value2) {
            addCriterion("Handler not between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andOuttypeIsNull() {
            addCriterion("OutType is null");
            return (Criteria) this;
        }

        public Criteria andOuttypeIsNotNull() {
            addCriterion("OutType is not null");
            return (Criteria) this;
        }

        public Criteria andOuttypeEqualTo(Byte value) {
            addCriterion("OutType =", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeNotEqualTo(Byte value) {
            addCriterion("OutType <>", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeGreaterThan(Byte value) {
            addCriterion("OutType >", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("OutType >=", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeLessThan(Byte value) {
            addCriterion("OutType <", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeLessThanOrEqualTo(Byte value) {
            addCriterion("OutType <=", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeIn(List<Byte> values) {
            addCriterion("OutType in", values, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeNotIn(List<Byte> values) {
            addCriterion("OutType not in", values, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeBetween(Byte value1, Byte value2) {
            addCriterion("OutType between", value1, value2, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("OutType not between", value1, value2, "outtype");
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

        public Criteria andOutbillcodeLikeInsensitive(String value) {
            addCriterion("upper(OutBillCode) like", value.toUpperCase(), "outbillcode");
            return (Criteria) this;
        }

        public Criteria andOperidLikeInsensitive(String value) {
            addCriterion("upper(OperID) like", value.toUpperCase(), "operid");
            return (Criteria) this;
        }

        public Criteria andHandlerLikeInsensitive(String value) {
            addCriterion("upper(Handler) like", value.toUpperCase(), "handler");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(Remark) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated do_not_delete_during_merge Fri Jan 02 23:34:19 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
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