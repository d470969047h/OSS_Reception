package com.shinowit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmeTrolleyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public TmeTrolleyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
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
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
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

    public TmeTrolleyExample(int pageSize, int pageIndex) {
        this();
        this.pageSize=pageSize;
        this.pageIndex=pageIndex;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
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

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andTrolleystateIsNull() {
            addCriterion("TrolleyState is null");
            return (Criteria) this;
        }

        public Criteria andTrolleystateIsNotNull() {
            addCriterion("TrolleyState is not null");
            return (Criteria) this;
        }

        public Criteria andTrolleystateEqualTo(Boolean value) {
            addCriterion("TrolleyState =", value, "trolleystate");
            return (Criteria) this;
        }

        public Criteria andTrolleystateNotEqualTo(Boolean value) {
            addCriterion("TrolleyState <>", value, "trolleystate");
            return (Criteria) this;
        }

        public Criteria andTrolleystateGreaterThan(Boolean value) {
            addCriterion("TrolleyState >", value, "trolleystate");
            return (Criteria) this;
        }

        public Criteria andTrolleystateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TrolleyState >=", value, "trolleystate");
            return (Criteria) this;
        }

        public Criteria andTrolleystateLessThan(Boolean value) {
            addCriterion("TrolleyState <", value, "trolleystate");
            return (Criteria) this;
        }

        public Criteria andTrolleystateLessThanOrEqualTo(Boolean value) {
            addCriterion("TrolleyState <=", value, "trolleystate");
            return (Criteria) this;
        }

        public Criteria andTrolleystateIn(List<Boolean> values) {
            addCriterion("TrolleyState in", values, "trolleystate");
            return (Criteria) this;
        }

        public Criteria andTrolleystateNotIn(List<Boolean> values) {
            addCriterion("TrolleyState not in", values, "trolleystate");
            return (Criteria) this;
        }

        public Criteria andTrolleystateBetween(Boolean value1, Boolean value2) {
            addCriterion("TrolleyState between", value1, value2, "trolleystate");
            return (Criteria) this;
        }

        public Criteria andTrolleystateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TrolleyState not between", value1, value2, "trolleystate");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(UserName) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_Trolley
     *
     * @mbggenerated do_not_delete_during_merge Sun Jan 04 15:01:26 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
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