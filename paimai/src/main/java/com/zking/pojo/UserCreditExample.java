package com.zking.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCreditExample() {
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

        public Criteria andUsercreditIdIsNull() {
            addCriterion("usercredit_id is null");
            return (Criteria) this;
        }

        public Criteria andUsercreditIdIsNotNull() {
            addCriterion("usercredit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsercreditIdEqualTo(Integer value) {
            addCriterion("usercredit_id =", value, "usercreditId");
            return (Criteria) this;
        }

        public Criteria andUsercreditIdNotEqualTo(Integer value) {
            addCriterion("usercredit_id <>", value, "usercreditId");
            return (Criteria) this;
        }

        public Criteria andUsercreditIdGreaterThan(Integer value) {
            addCriterion("usercredit_id >", value, "usercreditId");
            return (Criteria) this;
        }

        public Criteria andUsercreditIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usercredit_id >=", value, "usercreditId");
            return (Criteria) this;
        }

        public Criteria andUsercreditIdLessThan(Integer value) {
            addCriterion("usercredit_id <", value, "usercreditId");
            return (Criteria) this;
        }

        public Criteria andUsercreditIdLessThanOrEqualTo(Integer value) {
            addCriterion("usercredit_id <=", value, "usercreditId");
            return (Criteria) this;
        }

        public Criteria andUsercreditIdIn(List<Integer> values) {
            addCriterion("usercredit_id in", values, "usercreditId");
            return (Criteria) this;
        }

        public Criteria andUsercreditIdNotIn(List<Integer> values) {
            addCriterion("usercredit_id not in", values, "usercreditId");
            return (Criteria) this;
        }

        public Criteria andUsercreditIdBetween(Integer value1, Integer value2) {
            addCriterion("usercredit_id between", value1, value2, "usercreditId");
            return (Criteria) this;
        }

        public Criteria andUsercreditIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usercredit_id not between", value1, value2, "usercreditId");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeIsNull() {
            addCriterion("usercredit_time is null");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeIsNotNull() {
            addCriterion("usercredit_time is not null");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeEqualTo(Date value) {
            addCriterion("usercredit_time =", value, "usercreditTime");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeNotEqualTo(Date value) {
            addCriterion("usercredit_time <>", value, "usercreditTime");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeGreaterThan(Date value) {
            addCriterion("usercredit_time >", value, "usercreditTime");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("usercredit_time >=", value, "usercreditTime");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeLessThan(Date value) {
            addCriterion("usercredit_time <", value, "usercreditTime");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeLessThanOrEqualTo(Date value) {
            addCriterion("usercredit_time <=", value, "usercreditTime");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeIn(List<Date> values) {
            addCriterion("usercredit_time in", values, "usercreditTime");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeNotIn(List<Date> values) {
            addCriterion("usercredit_time not in", values, "usercreditTime");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeBetween(Date value1, Date value2) {
            addCriterion("usercredit_time between", value1, value2, "usercreditTime");
            return (Criteria) this;
        }

        public Criteria andUsercreditTimeNotBetween(Date value1, Date value2) {
            addCriterion("usercredit_time not between", value1, value2, "usercreditTime");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdIsNull() {
            addCriterion("usercreditpeople_id is null");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdIsNotNull() {
            addCriterion("usercreditpeople_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdEqualTo(Integer value) {
            addCriterion("usercreditpeople_id =", value, "usercreditpeopleId");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdNotEqualTo(Integer value) {
            addCriterion("usercreditpeople_id <>", value, "usercreditpeopleId");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdGreaterThan(Integer value) {
            addCriterion("usercreditpeople_id >", value, "usercreditpeopleId");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usercreditpeople_id >=", value, "usercreditpeopleId");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdLessThan(Integer value) {
            addCriterion("usercreditpeople_id <", value, "usercreditpeopleId");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdLessThanOrEqualTo(Integer value) {
            addCriterion("usercreditpeople_id <=", value, "usercreditpeopleId");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdIn(List<Integer> values) {
            addCriterion("usercreditpeople_id in", values, "usercreditpeopleId");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdNotIn(List<Integer> values) {
            addCriterion("usercreditpeople_id not in", values, "usercreditpeopleId");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdBetween(Integer value1, Integer value2) {
            addCriterion("usercreditpeople_id between", value1, value2, "usercreditpeopleId");
            return (Criteria) this;
        }

        public Criteria andUsercreditpeopleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usercreditpeople_id not between", value1, value2, "usercreditpeopleId");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelIsNull() {
            addCriterion("usercredit_level is null");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelIsNotNull() {
            addCriterion("usercredit_level is not null");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelEqualTo(Integer value) {
            addCriterion("usercredit_level =", value, "usercreditLevel");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelNotEqualTo(Integer value) {
            addCriterion("usercredit_level <>", value, "usercreditLevel");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelGreaterThan(Integer value) {
            addCriterion("usercredit_level >", value, "usercreditLevel");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("usercredit_level >=", value, "usercreditLevel");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelLessThan(Integer value) {
            addCriterion("usercredit_level <", value, "usercreditLevel");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelLessThanOrEqualTo(Integer value) {
            addCriterion("usercredit_level <=", value, "usercreditLevel");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelIn(List<Integer> values) {
            addCriterion("usercredit_level in", values, "usercreditLevel");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelNotIn(List<Integer> values) {
            addCriterion("usercredit_level not in", values, "usercreditLevel");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelBetween(Integer value1, Integer value2) {
            addCriterion("usercredit_level between", value1, value2, "usercreditLevel");
            return (Criteria) this;
        }

        public Criteria andUsercreditLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("usercredit_level not between", value1, value2, "usercreditLevel");
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