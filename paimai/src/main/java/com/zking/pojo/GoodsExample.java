package com.zking.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceIsNull() {
            addCriterion("goods_place is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceIsNotNull() {
            addCriterion("goods_place is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceEqualTo(String value) {
            addCriterion("goods_place =", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceNotEqualTo(String value) {
            addCriterion("goods_place <>", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceGreaterThan(String value) {
            addCriterion("goods_place >", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("goods_place >=", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceLessThan(String value) {
            addCriterion("goods_place <", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceLessThanOrEqualTo(String value) {
            addCriterion("goods_place <=", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceLike(String value) {
            addCriterion("goods_place like", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceNotLike(String value) {
            addCriterion("goods_place not like", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceIn(List<String> values) {
            addCriterion("goods_place in", values, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceNotIn(List<String> values) {
            addCriterion("goods_place not in", values, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceBetween(String value1, String value2) {
            addCriterion("goods_place between", value1, value2, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceNotBetween(String value1, String value2) {
            addCriterion("goods_place not between", value1, value2, "goodsPlace");
            return (Criteria) this;
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(Integer value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(Integer value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(Integer value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(Integer value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<Integer> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<Integer> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(Integer value1, Integer value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGodsInfoIsNull() {
            addCriterion("gods_info is null");
            return (Criteria) this;
        }

        public Criteria andGodsInfoIsNotNull() {
            addCriterion("gods_info is not null");
            return (Criteria) this;
        }

        public Criteria andGodsInfoEqualTo(String value) {
            addCriterion("gods_info =", value, "godsInfo");
            return (Criteria) this;
        }

        public Criteria andGodsInfoNotEqualTo(String value) {
            addCriterion("gods_info <>", value, "godsInfo");
            return (Criteria) this;
        }

        public Criteria andGodsInfoGreaterThan(String value) {
            addCriterion("gods_info >", value, "godsInfo");
            return (Criteria) this;
        }

        public Criteria andGodsInfoGreaterThanOrEqualTo(String value) {
            addCriterion("gods_info >=", value, "godsInfo");
            return (Criteria) this;
        }

        public Criteria andGodsInfoLessThan(String value) {
            addCriterion("gods_info <", value, "godsInfo");
            return (Criteria) this;
        }

        public Criteria andGodsInfoLessThanOrEqualTo(String value) {
            addCriterion("gods_info <=", value, "godsInfo");
            return (Criteria) this;
        }

        public Criteria andGodsInfoLike(String value) {
            addCriterion("gods_info like", value, "godsInfo");
            return (Criteria) this;
        }

        public Criteria andGodsInfoNotLike(String value) {
            addCriterion("gods_info not like", value, "godsInfo");
            return (Criteria) this;
        }

        public Criteria andGodsInfoIn(List<String> values) {
            addCriterion("gods_info in", values, "godsInfo");
            return (Criteria) this;
        }

        public Criteria andGodsInfoNotIn(List<String> values) {
            addCriterion("gods_info not in", values, "godsInfo");
            return (Criteria) this;
        }

        public Criteria andGodsInfoBetween(String value1, String value2) {
            addCriterion("gods_info between", value1, value2, "godsInfo");
            return (Criteria) this;
        }

        public Criteria andGodsInfoNotBetween(String value1, String value2) {
            addCriterion("gods_info not between", value1, value2, "godsInfo");
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