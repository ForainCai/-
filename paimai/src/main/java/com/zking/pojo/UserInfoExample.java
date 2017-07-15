package com.zking.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserinfoIdIsNull() {
            addCriterion("userinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIsNotNull() {
            addCriterion("userinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdEqualTo(Integer value) {
            addCriterion("userinfo_id =", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotEqualTo(Integer value) {
            addCriterion("userinfo_id <>", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThan(Integer value) {
            addCriterion("userinfo_id >", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id >=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThan(Integer value) {
            addCriterion("userinfo_id <", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id <=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIn(List<Integer> values) {
            addCriterion("userinfo_id in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotIn(List<Integer> values) {
            addCriterion("userinfo_id not in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id not between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeIsNull() {
            addCriterion("userinfo_time is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeIsNotNull() {
            addCriterion("userinfo_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeEqualTo(Date value) {
            addCriterion("userinfo_time =", value, "userinfoTime");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeNotEqualTo(Date value) {
            addCriterion("userinfo_time <>", value, "userinfoTime");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeGreaterThan(Date value) {
            addCriterion("userinfo_time >", value, "userinfoTime");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userinfo_time >=", value, "userinfoTime");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeLessThan(Date value) {
            addCriterion("userinfo_time <", value, "userinfoTime");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeLessThanOrEqualTo(Date value) {
            addCriterion("userinfo_time <=", value, "userinfoTime");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeIn(List<Date> values) {
            addCriterion("userinfo_time in", values, "userinfoTime");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeNotIn(List<Date> values) {
            addCriterion("userinfo_time not in", values, "userinfoTime");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeBetween(Date value1, Date value2) {
            addCriterion("userinfo_time between", value1, value2, "userinfoTime");
            return (Criteria) this;
        }

        public Criteria andUserinfoTimeNotBetween(Date value1, Date value2) {
            addCriterion("userinfo_time not between", value1, value2, "userinfoTime");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardIsNull() {
            addCriterion("userinfo_card is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardIsNotNull() {
            addCriterion("userinfo_card is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardEqualTo(String value) {
            addCriterion("userinfo_card =", value, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardNotEqualTo(String value) {
            addCriterion("userinfo_card <>", value, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardGreaterThan(String value) {
            addCriterion("userinfo_card >", value, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_card >=", value, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardLessThan(String value) {
            addCriterion("userinfo_card <", value, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardLessThanOrEqualTo(String value) {
            addCriterion("userinfo_card <=", value, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardLike(String value) {
            addCriterion("userinfo_card like", value, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardNotLike(String value) {
            addCriterion("userinfo_card not like", value, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardIn(List<String> values) {
            addCriterion("userinfo_card in", values, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardNotIn(List<String> values) {
            addCriterion("userinfo_card not in", values, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardBetween(String value1, String value2) {
            addCriterion("userinfo_card between", value1, value2, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoCardNotBetween(String value1, String value2) {
            addCriterion("userinfo_card not between", value1, value2, "userinfoCard");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailIsNull() {
            addCriterion("userinfo_mail is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailIsNotNull() {
            addCriterion("userinfo_mail is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailEqualTo(String value) {
            addCriterion("userinfo_mail =", value, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailNotEqualTo(String value) {
            addCriterion("userinfo_mail <>", value, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailGreaterThan(String value) {
            addCriterion("userinfo_mail >", value, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_mail >=", value, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailLessThan(String value) {
            addCriterion("userinfo_mail <", value, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailLessThanOrEqualTo(String value) {
            addCriterion("userinfo_mail <=", value, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailLike(String value) {
            addCriterion("userinfo_mail like", value, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailNotLike(String value) {
            addCriterion("userinfo_mail not like", value, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailIn(List<String> values) {
            addCriterion("userinfo_mail in", values, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailNotIn(List<String> values) {
            addCriterion("userinfo_mail not in", values, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailBetween(String value1, String value2) {
            addCriterion("userinfo_mail between", value1, value2, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoMailNotBetween(String value1, String value2) {
            addCriterion("userinfo_mail not between", value1, value2, "userinfoMail");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneIsNull() {
            addCriterion("userinfo_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneIsNotNull() {
            addCriterion("userinfo_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneEqualTo(String value) {
            addCriterion("userinfo_phone =", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotEqualTo(String value) {
            addCriterion("userinfo_phone <>", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneGreaterThan(String value) {
            addCriterion("userinfo_phone >", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_phone >=", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneLessThan(String value) {
            addCriterion("userinfo_phone <", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneLessThanOrEqualTo(String value) {
            addCriterion("userinfo_phone <=", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneLike(String value) {
            addCriterion("userinfo_phone like", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotLike(String value) {
            addCriterion("userinfo_phone not like", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneIn(List<String> values) {
            addCriterion("userinfo_phone in", values, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotIn(List<String> values) {
            addCriterion("userinfo_phone not in", values, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneBetween(String value1, String value2) {
            addCriterion("userinfo_phone between", value1, value2, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotBetween(String value1, String value2) {
            addCriterion("userinfo_phone not between", value1, value2, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexIsNull() {
            addCriterion("userinfo_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexIsNotNull() {
            addCriterion("userinfo_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexEqualTo(String value) {
            addCriterion("userinfo_sex =", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotEqualTo(String value) {
            addCriterion("userinfo_sex <>", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexGreaterThan(String value) {
            addCriterion("userinfo_sex >", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_sex >=", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexLessThan(String value) {
            addCriterion("userinfo_sex <", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexLessThanOrEqualTo(String value) {
            addCriterion("userinfo_sex <=", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexLike(String value) {
            addCriterion("userinfo_sex like", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotLike(String value) {
            addCriterion("userinfo_sex not like", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexIn(List<String> values) {
            addCriterion("userinfo_sex in", values, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotIn(List<String> values) {
            addCriterion("userinfo_sex not in", values, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexBetween(String value1, String value2) {
            addCriterion("userinfo_sex between", value1, value2, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotBetween(String value1, String value2) {
            addCriterion("userinfo_sex not between", value1, value2, "userinfoSex");
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