package com.zking.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ButListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ButListExample() {
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

        public Criteria andBuylistIdIsNull() {
            addCriterion("buylist_id is null");
            return (Criteria) this;
        }

        public Criteria andBuylistIdIsNotNull() {
            addCriterion("buylist_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuylistIdEqualTo(Integer value) {
            addCriterion("buylist_id =", value, "buylistId");
            return (Criteria) this;
        }

        public Criteria andBuylistIdNotEqualTo(Integer value) {
            addCriterion("buylist_id <>", value, "buylistId");
            return (Criteria) this;
        }

        public Criteria andBuylistIdGreaterThan(Integer value) {
            addCriterion("buylist_id >", value, "buylistId");
            return (Criteria) this;
        }

        public Criteria andBuylistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buylist_id >=", value, "buylistId");
            return (Criteria) this;
        }

        public Criteria andBuylistIdLessThan(Integer value) {
            addCriterion("buylist_id <", value, "buylistId");
            return (Criteria) this;
        }

        public Criteria andBuylistIdLessThanOrEqualTo(Integer value) {
            addCriterion("buylist_id <=", value, "buylistId");
            return (Criteria) this;
        }

        public Criteria andBuylistIdIn(List<Integer> values) {
            addCriterion("buylist_id in", values, "buylistId");
            return (Criteria) this;
        }

        public Criteria andBuylistIdNotIn(List<Integer> values) {
            addCriterion("buylist_id not in", values, "buylistId");
            return (Criteria) this;
        }

        public Criteria andBuylistIdBetween(Integer value1, Integer value2) {
            addCriterion("buylist_id between", value1, value2, "buylistId");
            return (Criteria) this;
        }

        public Criteria andBuylistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buylist_id not between", value1, value2, "buylistId");
            return (Criteria) this;
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

        public Criteria andBuylistPriceIsNull() {
            addCriterion("buylist_price is null");
            return (Criteria) this;
        }

        public Criteria andBuylistPriceIsNotNull() {
            addCriterion("buylist_price is not null");
            return (Criteria) this;
        }

        public Criteria andBuylistPriceEqualTo(Double value) {
            addCriterion("buylist_price =", value, "buylistPrice");
            return (Criteria) this;
        }

        public Criteria andBuylistPriceNotEqualTo(Double value) {
            addCriterion("buylist_price <>", value, "buylistPrice");
            return (Criteria) this;
        }

        public Criteria andBuylistPriceGreaterThan(Double value) {
            addCriterion("buylist_price >", value, "buylistPrice");
            return (Criteria) this;
        }

        public Criteria andBuylistPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("buylist_price >=", value, "buylistPrice");
            return (Criteria) this;
        }

        public Criteria andBuylistPriceLessThan(Double value) {
            addCriterion("buylist_price <", value, "buylistPrice");
            return (Criteria) this;
        }

        public Criteria andBuylistPriceLessThanOrEqualTo(Double value) {
            addCriterion("buylist_price <=", value, "buylistPrice");
            return (Criteria) this;
        }

        public Criteria andBuylistPriceIn(List<Double> values) {
            addCriterion("buylist_price in", values, "buylistPrice");
            return (Criteria) this;
        }

        public Criteria andBuylistPriceNotIn(List<Double> values) {
            addCriterion("buylist_price not in", values, "buylistPrice");
            return (Criteria) this;
        }

        public Criteria andBuylistPriceBetween(Double value1, Double value2) {
            addCriterion("buylist_price between", value1, value2, "buylistPrice");
            return (Criteria) this;
        }

        public Criteria andBuylistPriceNotBetween(Double value1, Double value2) {
            addCriterion("buylist_price not between", value1, value2, "buylistPrice");
            return (Criteria) this;
        }

        public Criteria andBuylistManIsNull() {
            addCriterion("buylist_man is null");
            return (Criteria) this;
        }

        public Criteria andBuylistManIsNotNull() {
            addCriterion("buylist_man is not null");
            return (Criteria) this;
        }

        public Criteria andBuylistManEqualTo(Integer value) {
            addCriterion("buylist_man =", value, "buylistMan");
            return (Criteria) this;
        }

        public Criteria andBuylistManNotEqualTo(Integer value) {
            addCriterion("buylist_man <>", value, "buylistMan");
            return (Criteria) this;
        }

        public Criteria andBuylistManGreaterThan(Integer value) {
            addCriterion("buylist_man >", value, "buylistMan");
            return (Criteria) this;
        }

        public Criteria andBuylistManGreaterThanOrEqualTo(Integer value) {
            addCriterion("buylist_man >=", value, "buylistMan");
            return (Criteria) this;
        }

        public Criteria andBuylistManLessThan(Integer value) {
            addCriterion("buylist_man <", value, "buylistMan");
            return (Criteria) this;
        }

        public Criteria andBuylistManLessThanOrEqualTo(Integer value) {
            addCriterion("buylist_man <=", value, "buylistMan");
            return (Criteria) this;
        }

        public Criteria andBuylistManIn(List<Integer> values) {
            addCriterion("buylist_man in", values, "buylistMan");
            return (Criteria) this;
        }

        public Criteria andBuylistManNotIn(List<Integer> values) {
            addCriterion("buylist_man not in", values, "buylistMan");
            return (Criteria) this;
        }

        public Criteria andBuylistManBetween(Integer value1, Integer value2) {
            addCriterion("buylist_man between", value1, value2, "buylistMan");
            return (Criteria) this;
        }

        public Criteria andBuylistManNotBetween(Integer value1, Integer value2) {
            addCriterion("buylist_man not between", value1, value2, "buylistMan");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeIsNull() {
            addCriterion("buylist_starttime is null");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeIsNotNull() {
            addCriterion("buylist_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeEqualTo(Date value) {
            addCriterion("buylist_starttime =", value, "buylistStarttime");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeNotEqualTo(Date value) {
            addCriterion("buylist_starttime <>", value, "buylistStarttime");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeGreaterThan(Date value) {
            addCriterion("buylist_starttime >", value, "buylistStarttime");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buylist_starttime >=", value, "buylistStarttime");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeLessThan(Date value) {
            addCriterion("buylist_starttime <", value, "buylistStarttime");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("buylist_starttime <=", value, "buylistStarttime");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeIn(List<Date> values) {
            addCriterion("buylist_starttime in", values, "buylistStarttime");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeNotIn(List<Date> values) {
            addCriterion("buylist_starttime not in", values, "buylistStarttime");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeBetween(Date value1, Date value2) {
            addCriterion("buylist_starttime between", value1, value2, "buylistStarttime");
            return (Criteria) this;
        }

        public Criteria andBuylistStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("buylist_starttime not between", value1, value2, "buylistStarttime");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeIsNull() {
            addCriterion("buylist_buytime is null");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeIsNotNull() {
            addCriterion("buylist_buytime is not null");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeEqualTo(Date value) {
            addCriterion("buylist_buytime =", value, "buylistBuytime");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeNotEqualTo(Date value) {
            addCriterion("buylist_buytime <>", value, "buylistBuytime");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeGreaterThan(Date value) {
            addCriterion("buylist_buytime >", value, "buylistBuytime");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buylist_buytime >=", value, "buylistBuytime");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeLessThan(Date value) {
            addCriterion("buylist_buytime <", value, "buylistBuytime");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeLessThanOrEqualTo(Date value) {
            addCriterion("buylist_buytime <=", value, "buylistBuytime");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeIn(List<Date> values) {
            addCriterion("buylist_buytime in", values, "buylistBuytime");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeNotIn(List<Date> values) {
            addCriterion("buylist_buytime not in", values, "buylistBuytime");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeBetween(Date value1, Date value2) {
            addCriterion("buylist_buytime between", value1, value2, "buylistBuytime");
            return (Criteria) this;
        }

        public Criteria andBuylistBuytimeNotBetween(Date value1, Date value2) {
            addCriterion("buylist_buytime not between", value1, value2, "buylistBuytime");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeIsNull() {
            addCriterion("buylist_endtime is null");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeIsNotNull() {
            addCriterion("buylist_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeEqualTo(Date value) {
            addCriterion("buylist_endtime =", value, "buylistEndtime");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeNotEqualTo(Date value) {
            addCriterion("buylist_endtime <>", value, "buylistEndtime");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeGreaterThan(Date value) {
            addCriterion("buylist_endtime >", value, "buylistEndtime");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buylist_endtime >=", value, "buylistEndtime");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeLessThan(Date value) {
            addCriterion("buylist_endtime <", value, "buylistEndtime");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("buylist_endtime <=", value, "buylistEndtime");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeIn(List<Date> values) {
            addCriterion("buylist_endtime in", values, "buylistEndtime");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeNotIn(List<Date> values) {
            addCriterion("buylist_endtime not in", values, "buylistEndtime");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeBetween(Date value1, Date value2) {
            addCriterion("buylist_endtime between", value1, value2, "buylistEndtime");
            return (Criteria) this;
        }

        public Criteria andBuylistEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("buylist_endtime not between", value1, value2, "buylistEndtime");
            return (Criteria) this;
        }

        public Criteria andBuylistOverIsNull() {
            addCriterion("buylist_over is null");
            return (Criteria) this;
        }

        public Criteria andBuylistOverIsNotNull() {
            addCriterion("buylist_over is not null");
            return (Criteria) this;
        }

        public Criteria andBuylistOverEqualTo(Integer value) {
            addCriterion("buylist_over =", value, "buylistOver");
            return (Criteria) this;
        }

        public Criteria andBuylistOverNotEqualTo(Integer value) {
            addCriterion("buylist_over <>", value, "buylistOver");
            return (Criteria) this;
        }

        public Criteria andBuylistOverGreaterThan(Integer value) {
            addCriterion("buylist_over >", value, "buylistOver");
            return (Criteria) this;
        }

        public Criteria andBuylistOverGreaterThanOrEqualTo(Integer value) {
            addCriterion("buylist_over >=", value, "buylistOver");
            return (Criteria) this;
        }

        public Criteria andBuylistOverLessThan(Integer value) {
            addCriterion("buylist_over <", value, "buylistOver");
            return (Criteria) this;
        }

        public Criteria andBuylistOverLessThanOrEqualTo(Integer value) {
            addCriterion("buylist_over <=", value, "buylistOver");
            return (Criteria) this;
        }

        public Criteria andBuylistOverIn(List<Integer> values) {
            addCriterion("buylist_over in", values, "buylistOver");
            return (Criteria) this;
        }

        public Criteria andBuylistOverNotIn(List<Integer> values) {
            addCriterion("buylist_over not in", values, "buylistOver");
            return (Criteria) this;
        }

        public Criteria andBuylistOverBetween(Integer value1, Integer value2) {
            addCriterion("buylist_over between", value1, value2, "buylistOver");
            return (Criteria) this;
        }

        public Criteria andBuylistOverNotBetween(Integer value1, Integer value2) {
            addCriterion("buylist_over not between", value1, value2, "buylistOver");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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