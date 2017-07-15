package com.zking.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodStypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodStypeExample() {
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

        public Criteria andGoodstypeIdIsNull() {
            addCriterion("goodstype_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdIsNotNull() {
            addCriterion("goodstype_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdEqualTo(Integer value) {
            addCriterion("goodstype_id =", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdNotEqualTo(Integer value) {
            addCriterion("goodstype_id <>", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdGreaterThan(Integer value) {
            addCriterion("goodstype_id >", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodstype_id >=", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdLessThan(Integer value) {
            addCriterion("goodstype_id <", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("goodstype_id <=", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdIn(List<Integer> values) {
            addCriterion("goodstype_id in", values, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdNotIn(List<Integer> values) {
            addCriterion("goodstype_id not in", values, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdBetween(Integer value1, Integer value2) {
            addCriterion("goodstype_id between", value1, value2, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goodstype_id not between", value1, value2, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameIsNull() {
            addCriterion("goodstype_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameIsNotNull() {
            addCriterion("goodstype_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameEqualTo(String value) {
            addCriterion("goodstype_name =", value, "goodstypeName");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameNotEqualTo(String value) {
            addCriterion("goodstype_name <>", value, "goodstypeName");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameGreaterThan(String value) {
            addCriterion("goodstype_name >", value, "goodstypeName");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("goodstype_name >=", value, "goodstypeName");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameLessThan(String value) {
            addCriterion("goodstype_name <", value, "goodstypeName");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameLessThanOrEqualTo(String value) {
            addCriterion("goodstype_name <=", value, "goodstypeName");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameLike(String value) {
            addCriterion("goodstype_name like", value, "goodstypeName");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameNotLike(String value) {
            addCriterion("goodstype_name not like", value, "goodstypeName");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameIn(List<String> values) {
            addCriterion("goodstype_name in", values, "goodstypeName");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameNotIn(List<String> values) {
            addCriterion("goodstype_name not in", values, "goodstypeName");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameBetween(String value1, String value2) {
            addCriterion("goodstype_name between", value1, value2, "goodstypeName");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNameNotBetween(String value1, String value2) {
            addCriterion("goodstype_name not between", value1, value2, "goodstypeName");
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