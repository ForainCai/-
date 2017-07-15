package com.zking.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAssetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAssetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUserassetIdIsNull() {
            addCriterion("userasset_id is null");
            return (Criteria) this;
        }

        public Criteria andUserassetIdIsNotNull() {
            addCriterion("userasset_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserassetIdEqualTo(Integer value) {
            addCriterion("userasset_id =", value, "userassetId");
            return (Criteria) this;
        }

        public Criteria andUserassetIdNotEqualTo(Integer value) {
            addCriterion("userasset_id <>", value, "userassetId");
            return (Criteria) this;
        }

        public Criteria andUserassetIdGreaterThan(Integer value) {
            addCriterion("userasset_id >", value, "userassetId");
            return (Criteria) this;
        }

        public Criteria andUserassetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userasset_id >=", value, "userassetId");
            return (Criteria) this;
        }

        public Criteria andUserassetIdLessThan(Integer value) {
            addCriterion("userasset_id <", value, "userassetId");
            return (Criteria) this;
        }

        public Criteria andUserassetIdLessThanOrEqualTo(Integer value) {
            addCriterion("userasset_id <=", value, "userassetId");
            return (Criteria) this;
        }

        public Criteria andUserassetIdIn(List<Integer> values) {
            addCriterion("userasset_id in", values, "userassetId");
            return (Criteria) this;
        }

        public Criteria andUserassetIdNotIn(List<Integer> values) {
            addCriterion("userasset_id not in", values, "userassetId");
            return (Criteria) this;
        }

        public Criteria andUserassetIdBetween(Integer value1, Integer value2) {
            addCriterion("userasset_id between", value1, value2, "userassetId");
            return (Criteria) this;
        }

        public Criteria andUserassetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userasset_id not between", value1, value2, "userassetId");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeIsNull() {
            addCriterion("userasset_time is null");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeIsNotNull() {
            addCriterion("userasset_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeEqualTo(Date value) {
            addCriterion("userasset_time =", value, "userassetTime");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeNotEqualTo(Date value) {
            addCriterion("userasset_time <>", value, "userassetTime");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeGreaterThan(Date value) {
            addCriterion("userasset_time >", value, "userassetTime");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userasset_time >=", value, "userassetTime");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeLessThan(Date value) {
            addCriterion("userasset_time <", value, "userassetTime");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeLessThanOrEqualTo(Date value) {
            addCriterion("userasset_time <=", value, "userassetTime");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeIn(List<Date> values) {
            addCriterion("userasset_time in", values, "userassetTime");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeNotIn(List<Date> values) {
            addCriterion("userasset_time not in", values, "userassetTime");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeBetween(Date value1, Date value2) {
            addCriterion("userasset_time between", value1, value2, "userassetTime");
            return (Criteria) this;
        }

        public Criteria andUserassetTimeNotBetween(Date value1, Date value2) {
            addCriterion("userasset_time not between", value1, value2, "userassetTime");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdIsNull() {
            addCriterion("userassetpeople_id is null");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdIsNotNull() {
            addCriterion("userassetpeople_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdEqualTo(Integer value) {
            addCriterion("userassetpeople_id =", value, "userassetpeopleId");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdNotEqualTo(Integer value) {
            addCriterion("userassetpeople_id <>", value, "userassetpeopleId");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdGreaterThan(Integer value) {
            addCriterion("userassetpeople_id >", value, "userassetpeopleId");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userassetpeople_id >=", value, "userassetpeopleId");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdLessThan(Integer value) {
            addCriterion("userassetpeople_id <", value, "userassetpeopleId");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdLessThanOrEqualTo(Integer value) {
            addCriterion("userassetpeople_id <=", value, "userassetpeopleId");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdIn(List<Integer> values) {
            addCriterion("userassetpeople_id in", values, "userassetpeopleId");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdNotIn(List<Integer> values) {
            addCriterion("userassetpeople_id not in", values, "userassetpeopleId");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdBetween(Integer value1, Integer value2) {
            addCriterion("userassetpeople_id between", value1, value2, "userassetpeopleId");
            return (Criteria) this;
        }

        public Criteria andUserassetpeopleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userassetpeople_id not between", value1, value2, "userassetpeopleId");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelIsNull() {
            addCriterion("userasset_level is null");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelIsNotNull() {
            addCriterion("userasset_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelEqualTo(Integer value) {
            addCriterion("userasset_level =", value, "userassetLevel");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelNotEqualTo(Integer value) {
            addCriterion("userasset_level <>", value, "userassetLevel");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelGreaterThan(Integer value) {
            addCriterion("userasset_level >", value, "userassetLevel");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("userasset_level >=", value, "userassetLevel");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelLessThan(Integer value) {
            addCriterion("userasset_level <", value, "userassetLevel");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelLessThanOrEqualTo(Integer value) {
            addCriterion("userasset_level <=", value, "userassetLevel");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelIn(List<Integer> values) {
            addCriterion("userasset_level in", values, "userassetLevel");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelNotIn(List<Integer> values) {
            addCriterion("userasset_level not in", values, "userassetLevel");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelBetween(Integer value1, Integer value2) {
            addCriterion("userasset_level between", value1, value2, "userassetLevel");
            return (Criteria) this;
        }

        public Criteria andUserassetLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("userasset_level not between", value1, value2, "userassetLevel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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