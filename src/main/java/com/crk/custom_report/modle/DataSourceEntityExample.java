package com.crk.custom_report.modle;

import java.util.ArrayList;
import java.util.List;

public class DataSourceEntityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data_source
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data_source
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data_source
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated
     */
    public DataSourceEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated
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
     * This method corresponds to the database table data_source
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data_source
     *
     * @mbggenerated
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

        public Criteria andDataSourceIdIsNull() {
            addCriterion("data_source_id is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdIsNotNull() {
            addCriterion("data_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdEqualTo(String value) {
            addCriterion("data_source_id =", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotEqualTo(String value) {
            addCriterion("data_source_id <>", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdGreaterThan(String value) {
            addCriterion("data_source_id >", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_source_id >=", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdLessThan(String value) {
            addCriterion("data_source_id <", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdLessThanOrEqualTo(String value) {
            addCriterion("data_source_id <=", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdLike(String value) {
            addCriterion("data_source_id like", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotLike(String value) {
            addCriterion("data_source_id not like", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdIn(List<String> values) {
            addCriterion("data_source_id in", values, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotIn(List<String> values) {
            addCriterion("data_source_id not in", values, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdBetween(String value1, String value2) {
            addCriterion("data_source_id between", value1, value2, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotBetween(String value1, String value2) {
            addCriterion("data_source_id not between", value1, value2, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameIsNull() {
            addCriterion("data_source_name is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameIsNotNull() {
            addCriterion("data_source_name is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameEqualTo(String value) {
            addCriterion("data_source_name =", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotEqualTo(String value) {
            addCriterion("data_source_name <>", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameGreaterThan(String value) {
            addCriterion("data_source_name >", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("data_source_name >=", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameLessThan(String value) {
            addCriterion("data_source_name <", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameLessThanOrEqualTo(String value) {
            addCriterion("data_source_name <=", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameLike(String value) {
            addCriterion("data_source_name like", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotLike(String value) {
            addCriterion("data_source_name not like", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameIn(List<String> values) {
            addCriterion("data_source_name in", values, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotIn(List<String> values) {
            addCriterion("data_source_name not in", values, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameBetween(String value1, String value2) {
            addCriterion("data_source_name between", value1, value2, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotBetween(String value1, String value2) {
            addCriterion("data_source_name not between", value1, value2, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeIsNull() {
            addCriterion("data_source_type is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeIsNotNull() {
            addCriterion("data_source_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeEqualTo(String value) {
            addCriterion("data_source_type =", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeNotEqualTo(String value) {
            addCriterion("data_source_type <>", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeGreaterThan(String value) {
            addCriterion("data_source_type >", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_source_type >=", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeLessThan(String value) {
            addCriterion("data_source_type <", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("data_source_type <=", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeLike(String value) {
            addCriterion("data_source_type like", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeNotLike(String value) {
            addCriterion("data_source_type not like", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeIn(List<String> values) {
            addCriterion("data_source_type in", values, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeNotIn(List<String> values) {
            addCriterion("data_source_type not in", values, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeBetween(String value1, String value2) {
            addCriterion("data_source_type between", value1, value2, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeNotBetween(String value1, String value2) {
            addCriterion("data_source_type not between", value1, value2, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andConnectUrlIsNull() {
            addCriterion("connect_url is null");
            return (Criteria) this;
        }

        public Criteria andConnectUrlIsNotNull() {
            addCriterion("connect_url is not null");
            return (Criteria) this;
        }

        public Criteria andConnectUrlEqualTo(String value) {
            addCriterion("connect_url =", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlNotEqualTo(String value) {
            addCriterion("connect_url <>", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlGreaterThan(String value) {
            addCriterion("connect_url >", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlGreaterThanOrEqualTo(String value) {
            addCriterion("connect_url >=", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlLessThan(String value) {
            addCriterion("connect_url <", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlLessThanOrEqualTo(String value) {
            addCriterion("connect_url <=", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlLike(String value) {
            addCriterion("connect_url like", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlNotLike(String value) {
            addCriterion("connect_url not like", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlIn(List<String> values) {
            addCriterion("connect_url in", values, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlNotIn(List<String> values) {
            addCriterion("connect_url not in", values, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlBetween(String value1, String value2) {
            addCriterion("connect_url between", value1, value2, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlNotBetween(String value1, String value2) {
            addCriterion("connect_url not between", value1, value2, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUserIsNull() {
            addCriterion("connect_user is null");
            return (Criteria) this;
        }

        public Criteria andConnectUserIsNotNull() {
            addCriterion("connect_user is not null");
            return (Criteria) this;
        }

        public Criteria andConnectUserEqualTo(String value) {
            addCriterion("connect_user =", value, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectUserNotEqualTo(String value) {
            addCriterion("connect_user <>", value, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectUserGreaterThan(String value) {
            addCriterion("connect_user >", value, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectUserGreaterThanOrEqualTo(String value) {
            addCriterion("connect_user >=", value, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectUserLessThan(String value) {
            addCriterion("connect_user <", value, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectUserLessThanOrEqualTo(String value) {
            addCriterion("connect_user <=", value, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectUserLike(String value) {
            addCriterion("connect_user like", value, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectUserNotLike(String value) {
            addCriterion("connect_user not like", value, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectUserIn(List<String> values) {
            addCriterion("connect_user in", values, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectUserNotIn(List<String> values) {
            addCriterion("connect_user not in", values, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectUserBetween(String value1, String value2) {
            addCriterion("connect_user between", value1, value2, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectUserNotBetween(String value1, String value2) {
            addCriterion("connect_user not between", value1, value2, "connectUser");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordIsNull() {
            addCriterion("connect_password is null");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordIsNotNull() {
            addCriterion("connect_password is not null");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordEqualTo(String value) {
            addCriterion("connect_password =", value, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordNotEqualTo(String value) {
            addCriterion("connect_password <>", value, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordGreaterThan(String value) {
            addCriterion("connect_password >", value, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("connect_password >=", value, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordLessThan(String value) {
            addCriterion("connect_password <", value, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordLessThanOrEqualTo(String value) {
            addCriterion("connect_password <=", value, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordLike(String value) {
            addCriterion("connect_password like", value, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordNotLike(String value) {
            addCriterion("connect_password not like", value, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordIn(List<String> values) {
            addCriterion("connect_password in", values, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordNotIn(List<String> values) {
            addCriterion("connect_password not in", values, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordBetween(String value1, String value2) {
            addCriterion("connect_password between", value1, value2, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectPasswordNotBetween(String value1, String value2) {
            addCriterion("connect_password not between", value1, value2, "connectPassword");
            return (Criteria) this;
        }

        public Criteria andConnectDriverIsNull() {
            addCriterion("connect_driver is null");
            return (Criteria) this;
        }

        public Criteria andConnectDriverIsNotNull() {
            addCriterion("connect_driver is not null");
            return (Criteria) this;
        }

        public Criteria andConnectDriverEqualTo(String value) {
            addCriterion("connect_driver =", value, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andConnectDriverNotEqualTo(String value) {
            addCriterion("connect_driver <>", value, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andConnectDriverGreaterThan(String value) {
            addCriterion("connect_driver >", value, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andConnectDriverGreaterThanOrEqualTo(String value) {
            addCriterion("connect_driver >=", value, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andConnectDriverLessThan(String value) {
            addCriterion("connect_driver <", value, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andConnectDriverLessThanOrEqualTo(String value) {
            addCriterion("connect_driver <=", value, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andConnectDriverLike(String value) {
            addCriterion("connect_driver like", value, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andConnectDriverNotLike(String value) {
            addCriterion("connect_driver not like", value, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andConnectDriverIn(List<String> values) {
            addCriterion("connect_driver in", values, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andConnectDriverNotIn(List<String> values) {
            addCriterion("connect_driver not in", values, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andConnectDriverBetween(String value1, String value2) {
            addCriterion("connect_driver between", value1, value2, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andConnectDriverNotBetween(String value1, String value2) {
            addCriterion("connect_driver not between", value1, value2, "connectDriver");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("ext3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("ext3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("ext3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("ext3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ext3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("ext3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("ext3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("ext3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("ext3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("ext3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("ext3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("ext3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("ext3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data_source
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data_source
     *
     * @mbggenerated
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