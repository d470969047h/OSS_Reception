package com.shinowit.entity;

import java.util.ArrayList;
import java.util.List;

public class TauMenuinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public TauMenuinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
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
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setCustomCriteria(String customCriteria) {
        this.customCriteria = customCriteria;
    }

    public String getCustomCriteria() {
        return this.customCriteria;
    }

    public int getSkipRecordCount() {
        int count = (this.pageIndex - 1) * this.pageSize;
        if (count < 0) {
            count = 0;
        }
        return count;
    }

    public int getEndRecordCount() {
        return this.pageIndex * this.pageSize;
    }

    public TauMenuinfoExample(int pageSize, int pageIndex) {
        this();
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
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

        public Criteria andMenuidIsNull() {
            addCriterion("MenuID is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("MenuID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(String value) {
            addCriterion("MenuID =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(String value) {
            addCriterion("MenuID <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(String value) {
            addCriterion("MenuID >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(String value) {
            addCriterion("MenuID >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(String value) {
            addCriterion("MenuID <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(String value) {
            addCriterion("MenuID <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLike(String value) {
            addCriterion("MenuID like", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotLike(String value) {
            addCriterion("MenuID not like", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<String> values) {
            addCriterion("MenuID in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<String> values) {
            addCriterion("MenuID not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(String value1, String value2) {
            addCriterion("MenuID between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(String value1, String value2) {
            addCriterion("MenuID not between", value1, value2, "menuid");
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

        public Criteria andIdEqualTo(Short value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Short value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Short value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Short value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Short value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Short value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Short> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Short> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Short value1, Short value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Short value1, Short value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("MenuName is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("MenuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("MenuName =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("MenuName <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("MenuName >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("MenuName >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("MenuName <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("MenuName <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("MenuName like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("MenuName not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("MenuName in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("MenuName not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("MenuName between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("MenuName not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
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

        public Criteria andSortidEqualTo(String value) {
            addCriterion("SortID =", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotEqualTo(String value) {
            addCriterion("SortID <>", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThan(String value) {
            addCriterion("SortID >", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThanOrEqualTo(String value) {
            addCriterion("SortID >=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThan(String value) {
            addCriterion("SortID <", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThanOrEqualTo(String value) {
            addCriterion("SortID <=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLike(String value) {
            addCriterion("SortID like", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotLike(String value) {
            addCriterion("SortID not like", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidIn(List<String> values) {
            addCriterion("SortID in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotIn(List<String> values) {
            addCriterion("SortID not in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidBetween(String value1, String value2) {
            addCriterion("SortID between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotBetween(String value1, String value2) {
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

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNull() {
            addCriterion("checked is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNotNull() {
            addCriterion("checked is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualTo(Boolean value) {
            addCriterion("checked =", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualTo(Boolean value) {
            addCriterion("checked <>", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThan(Boolean value) {
            addCriterion("checked >", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("checked >=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThan(Boolean value) {
            addCriterion("checked <", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualTo(Boolean value) {
            addCriterion("checked <=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedIn(List<Boolean> values) {
            addCriterion("checked in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotIn(List<Boolean> values) {
            addCriterion("checked not in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedBetween(Boolean value1, Boolean value2) {
            addCriterion("checked between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("checked not between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andMenuidLikeInsensitive(String value) {
            addCriterion("upper(MenuID) like", value.toUpperCase(), "menuid");
            return (Criteria) this;
        }

        public Criteria andMenunameLikeInsensitive(String value) {
            addCriterion("upper(MenuName) like", value.toUpperCase(), "menuname");
            return (Criteria) this;
        }

        public Criteria andUrlLikeInsensitive(String value) {
            addCriterion("upper(URL) like", value.toUpperCase(), "url");
            return (Criteria) this;
        }

        public Criteria andSortidLikeInsensitive(String value) {
            addCriterion("upper(SortID) like", value.toUpperCase(), "sortid");
            return (Criteria) this;
        }

        public Criteria andTagLikeInsensitive(String value) {
            addCriterion("upper(tag) like", value.toUpperCase(), "tag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated do_not_delete_during_merge Wed Jan 07 14:34:57 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TAu_MenuInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
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