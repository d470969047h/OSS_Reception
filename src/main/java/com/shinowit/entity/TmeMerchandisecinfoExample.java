package com.shinowit.entity;

import java.util.ArrayList;
import java.util.List;

public class TmeMerchandisecinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public TmeMerchandisecinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
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
     * This method corresponds to the database table TMe_MerchandiseCInfo
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
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
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

    public TmeMerchandisecinfoExample(int pageSize, int pageIndex) {
        this();
        this.pageSize=pageSize;
        this.pageIndex=pageIndex;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_MerchandiseCInfo
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

        public Criteria andMerchandisecidIsNull() {
            addCriterion("MerchandiseCID is null");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidIsNotNull() {
            addCriterion("MerchandiseCID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidEqualTo(String value) {
            addCriterion("MerchandiseCID =", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidNotEqualTo(String value) {
            addCriterion("MerchandiseCID <>", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidGreaterThan(String value) {
            addCriterion("MerchandiseCID >", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidGreaterThanOrEqualTo(String value) {
            addCriterion("MerchandiseCID >=", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidLessThan(String value) {
            addCriterion("MerchandiseCID <", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidLessThanOrEqualTo(String value) {
            addCriterion("MerchandiseCID <=", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidLike(String value) {
            addCriterion("MerchandiseCID like", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidNotLike(String value) {
            addCriterion("MerchandiseCID not like", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidIn(List<String> values) {
            addCriterion("MerchandiseCID in", values, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidNotIn(List<String> values) {
            addCriterion("MerchandiseCID not in", values, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidBetween(String value1, String value2) {
            addCriterion("MerchandiseCID between", value1, value2, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidNotBetween(String value1, String value2) {
            addCriterion("MerchandiseCID not between", value1, value2, "merchandisecid");
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

        public Criteria andMerchandisecnameIsNull() {
            addCriterion("MerchandiseCName is null");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameIsNotNull() {
            addCriterion("MerchandiseCName is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameEqualTo(String value) {
            addCriterion("MerchandiseCName =", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameNotEqualTo(String value) {
            addCriterion("MerchandiseCName <>", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameGreaterThan(String value) {
            addCriterion("MerchandiseCName >", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameGreaterThanOrEqualTo(String value) {
            addCriterion("MerchandiseCName >=", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameLessThan(String value) {
            addCriterion("MerchandiseCName <", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameLessThanOrEqualTo(String value) {
            addCriterion("MerchandiseCName <=", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameLike(String value) {
            addCriterion("MerchandiseCName like", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameNotLike(String value) {
            addCriterion("MerchandiseCName not like", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameIn(List<String> values) {
            addCriterion("MerchandiseCName in", values, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameNotIn(List<String> values) {
            addCriterion("MerchandiseCName not in", values, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameBetween(String value1, String value2) {
            addCriterion("MerchandiseCName between", value1, value2, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameNotBetween(String value1, String value2) {
            addCriterion("MerchandiseCName not between", value1, value2, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andSortidIsNull() {
            addCriterion("SortID is null");
            return (Criteria) this;
        }

        public Criteria andSortidIsNotNull() {
            addCriterion("SortID is not null");
            return (Criteria) this;
        }

        public Criteria andSortidEqualTo(Integer value) {
            addCriterion("SortID =", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotEqualTo(Integer value) {
            addCriterion("SortID <>", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThan(Integer value) {
            addCriterion("SortID >", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SortID >=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThan(Integer value) {
            addCriterion("SortID <", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThanOrEqualTo(Integer value) {
            addCriterion("SortID <=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidIn(List<Integer> values) {
            addCriterion("SortID in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotIn(List<Integer> values) {
            addCriterion("SortID not in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidBetween(Integer value1, Integer value2) {
            addCriterion("SortID between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotBetween(Integer value1, Integer value2) {
            addCriterion("SortID not between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Boolean value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Boolean value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Boolean value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Boolean value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Boolean value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Boolean> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Boolean> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Boolean value1, Boolean value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidLikeInsensitive(String value) {
            addCriterion("upper(MerchandiseCID) like", value.toUpperCase(), "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameLikeInsensitive(String value) {
            addCriterion("upper(MerchandiseCName) like", value.toUpperCase(), "merchandisecname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_MerchandiseCInfo
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
     * This class corresponds to the database table TMe_MerchandiseCInfo
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