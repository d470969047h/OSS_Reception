package com.shinowit.entity;

import java.util.ArrayList;
import java.util.List;

public class TmeTrolleyitemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public TmeTrolleyitemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_TrolleyItem
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
     * This method corresponds to the database table TMe_TrolleyItem
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
     * This method corresponds to the database table TMe_TrolleyItem
     *
     * @mbggenerated Fri Jan 02 15:01:59 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_TrolleyItem
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

    public TmeTrolleyitemExample(int pageSize, int pageIndex) {
        this();
        this.pageSize=pageSize;
        this.pageIndex=pageIndex;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_TrolleyItem
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

        public Criteria andTrolleyitemidIsNull() {
            addCriterion("TrolleyItemID is null");
            return (Criteria) this;
        }

        public Criteria andTrolleyitemidIsNotNull() {
            addCriterion("TrolleyItemID is not null");
            return (Criteria) this;
        }

        public Criteria andTrolleyitemidEqualTo(Integer value) {
            addCriterion("TrolleyItemID =", value, "trolleyitemid");
            return (Criteria) this;
        }

        public Criteria andTrolleyitemidNotEqualTo(Integer value) {
            addCriterion("TrolleyItemID <>", value, "trolleyitemid");
            return (Criteria) this;
        }

        public Criteria andTrolleyitemidGreaterThan(Integer value) {
            addCriterion("TrolleyItemID >", value, "trolleyitemid");
            return (Criteria) this;
        }

        public Criteria andTrolleyitemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TrolleyItemID >=", value, "trolleyitemid");
            return (Criteria) this;
        }

        public Criteria andTrolleyitemidLessThan(Integer value) {
            addCriterion("TrolleyItemID <", value, "trolleyitemid");
            return (Criteria) this;
        }

        public Criteria andTrolleyitemidLessThanOrEqualTo(Integer value) {
            addCriterion("TrolleyItemID <=", value, "trolleyitemid");
            return (Criteria) this;
        }

        public Criteria andTrolleyitemidIn(List<Integer> values) {
            addCriterion("TrolleyItemID in", values, "trolleyitemid");
            return (Criteria) this;
        }

        public Criteria andTrolleyitemidNotIn(List<Integer> values) {
            addCriterion("TrolleyItemID not in", values, "trolleyitemid");
            return (Criteria) this;
        }

        public Criteria andTrolleyitemidBetween(Integer value1, Integer value2) {
            addCriterion("TrolleyItemID between", value1, value2, "trolleyitemid");
            return (Criteria) this;
        }

        public Criteria andTrolleyitemidNotBetween(Integer value1, Integer value2) {
            addCriterion("TrolleyItemID not between", value1, value2, "trolleyitemid");
            return (Criteria) this;
        }

        public Criteria andTrolleyidIsNull() {
            addCriterion("TrolleyID is null");
            return (Criteria) this;
        }

        public Criteria andTrolleyidIsNotNull() {
            addCriterion("TrolleyID is not null");
            return (Criteria) this;
        }

        public Criteria andTrolleyidEqualTo(Integer value) {
            addCriterion("TrolleyID =", value, "trolleyid");
            return (Criteria) this;
        }

        public Criteria andTrolleyidNotEqualTo(Integer value) {
            addCriterion("TrolleyID <>", value, "trolleyid");
            return (Criteria) this;
        }

        public Criteria andTrolleyidGreaterThan(Integer value) {
            addCriterion("TrolleyID >", value, "trolleyid");
            return (Criteria) this;
        }

        public Criteria andTrolleyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TrolleyID >=", value, "trolleyid");
            return (Criteria) this;
        }

        public Criteria andTrolleyidLessThan(Integer value) {
            addCriterion("TrolleyID <", value, "trolleyid");
            return (Criteria) this;
        }

        public Criteria andTrolleyidLessThanOrEqualTo(Integer value) {
            addCriterion("TrolleyID <=", value, "trolleyid");
            return (Criteria) this;
        }

        public Criteria andTrolleyidIn(List<Integer> values) {
            addCriterion("TrolleyID in", values, "trolleyid");
            return (Criteria) this;
        }

        public Criteria andTrolleyidNotIn(List<Integer> values) {
            addCriterion("TrolleyID not in", values, "trolleyid");
            return (Criteria) this;
        }

        public Criteria andTrolleyidBetween(Integer value1, Integer value2) {
            addCriterion("TrolleyID between", value1, value2, "trolleyid");
            return (Criteria) this;
        }

        public Criteria andTrolleyidNotBetween(Integer value1, Integer value2) {
            addCriterion("TrolleyID not between", value1, value2, "trolleyid");
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

        public Criteria andUnitpriceIsNull() {
            addCriterion("UnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("UnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(Float value) {
            addCriterion("UnitPrice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(Float value) {
            addCriterion("UnitPrice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(Float value) {
            addCriterion("UnitPrice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("UnitPrice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(Float value) {
            addCriterion("UnitPrice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(Float value) {
            addCriterion("UnitPrice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<Float> values) {
            addCriterion("UnitPrice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<Float> values) {
            addCriterion("UnitPrice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(Float value1, Float value2) {
            addCriterion("UnitPrice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(Float value1, Float value2) {
            addCriterion("UnitPrice not between", value1, value2, "unitprice");
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

        public Criteria andSubtotalIsNull() {
            addCriterion("SubTotal is null");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNotNull() {
            addCriterion("SubTotal is not null");
            return (Criteria) this;
        }

        public Criteria andSubtotalEqualTo(Float value) {
            addCriterion("SubTotal =", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotEqualTo(Float value) {
            addCriterion("SubTotal <>", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThan(Float value) {
            addCriterion("SubTotal >", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThanOrEqualTo(Float value) {
            addCriterion("SubTotal >=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThan(Float value) {
            addCriterion("SubTotal <", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThanOrEqualTo(Float value) {
            addCriterion("SubTotal <=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalIn(List<Float> values) {
            addCriterion("SubTotal in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotIn(List<Float> values) {
            addCriterion("SubTotal not in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalBetween(Float value1, Float value2) {
            addCriterion("SubTotal between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotBetween(Float value1, Float value2) {
            addCriterion("SubTotal not between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLikeInsensitive(String value) {
            addCriterion("upper(MerchandiseID) like", value.toUpperCase(), "merchandiseid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_TrolleyItem
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
     * This class corresponds to the database table TMe_TrolleyItem
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