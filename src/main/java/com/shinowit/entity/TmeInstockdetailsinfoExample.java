package com.shinowit.entity;

import java.util.ArrayList;
import java.util.List;

public class TmeInstockdetailsinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public TmeInstockdetailsinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
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
     * This method corresponds to the database table TMe_InStockDetailsInfo
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
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
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

    public TmeInstockdetailsinfoExample(int pageSize, int pageIndex) {
        this();
        this.pageSize=pageSize;
        this.pageIndex=pageIndex;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_InStockDetailsInfo
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

        public Criteria andMerchandiseidIsNull() {
            addCriterion("MerchandiseID is null");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidIsNotNull() {
            addCriterion("MerchandiseID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidEqualTo(String value) {
            addCriterion("MerchandiseID =", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotEqualTo(String value) {
            addCriterion("MerchandiseID <>", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidGreaterThan(String value) {
            addCriterion("MerchandiseID >", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidGreaterThanOrEqualTo(String value) {
            addCriterion("MerchandiseID >=", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLessThan(String value) {
            addCriterion("MerchandiseID <", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLessThanOrEqualTo(String value) {
            addCriterion("MerchandiseID <=", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLike(String value) {
            addCriterion("MerchandiseID like", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotLike(String value) {
            addCriterion("MerchandiseID not like", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidIn(List<String> values) {
            addCriterion("MerchandiseID in", values, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotIn(List<String> values) {
            addCriterion("MerchandiseID not in", values, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidBetween(String value1, String value2) {
            addCriterion("MerchandiseID between", value1, value2, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotBetween(String value1, String value2) {
            addCriterion("MerchandiseID not between", value1, value2, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andBillcodeIsNull() {
            addCriterion("BillCode is null");
            return (Criteria) this;
        }

        public Criteria andBillcodeIsNotNull() {
            addCriterion("BillCode is not null");
            return (Criteria) this;
        }

        public Criteria andBillcodeEqualTo(String value) {
            addCriterion("BillCode =", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotEqualTo(String value) {
            addCriterion("BillCode <>", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeGreaterThan(String value) {
            addCriterion("BillCode >", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BillCode >=", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLessThan(String value) {
            addCriterion("BillCode <", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLessThanOrEqualTo(String value) {
            addCriterion("BillCode <=", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLike(String value) {
            addCriterion("BillCode like", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotLike(String value) {
            addCriterion("BillCode not like", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeIn(List<String> values) {
            addCriterion("BillCode in", values, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotIn(List<String> values) {
            addCriterion("BillCode not in", values, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeBetween(String value1, String value2) {
            addCriterion("BillCode between", value1, value2, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotBetween(String value1, String value2) {
            addCriterion("BillCode not between", value1, value2, "billcode");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("Num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("Num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("Num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("Num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("Num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("Num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("Num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("Num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("Num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("Num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("Num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLikeInsensitive(String value) {
            addCriterion("upper(MerchandiseID) like", value.toUpperCase(), "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andBillcodeLikeInsensitive(String value) {
            addCriterion("upper(BillCode) like", value.toUpperCase(), "billcode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_InStockDetailsInfo
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
     * This class corresponds to the database table TMe_InStockDetailsInfo
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