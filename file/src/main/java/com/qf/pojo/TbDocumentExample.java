package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbDocumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDocumentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleIsNull() {
            addCriterion("document_title is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleIsNotNull() {
            addCriterion("document_title is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleEqualTo(String value) {
            addCriterion("document_title =", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleNotEqualTo(String value) {
            addCriterion("document_title <>", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleGreaterThan(String value) {
            addCriterion("document_title >", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleGreaterThanOrEqualTo(String value) {
            addCriterion("document_title >=", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleLessThan(String value) {
            addCriterion("document_title <", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleLessThanOrEqualTo(String value) {
            addCriterion("document_title <=", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleLike(String value) {
            addCriterion("document_title like", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleNotLike(String value) {
            addCriterion("document_title not like", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleIn(List<String> values) {
            addCriterion("document_title in", values, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleNotIn(List<String> values) {
            addCriterion("document_title not in", values, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleBetween(String value1, String value2) {
            addCriterion("document_title between", value1, value2, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleNotBetween(String value1, String value2) {
            addCriterion("document_title not between", value1, value2, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentContextIsNull() {
            addCriterion("document_context is null");
            return (Criteria) this;
        }

        public Criteria andDocumentContextIsNotNull() {
            addCriterion("document_context is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentContextEqualTo(String value) {
            addCriterion("document_context =", value, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentContextNotEqualTo(String value) {
            addCriterion("document_context <>", value, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentContextGreaterThan(String value) {
            addCriterion("document_context >", value, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentContextGreaterThanOrEqualTo(String value) {
            addCriterion("document_context >=", value, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentContextLessThan(String value) {
            addCriterion("document_context <", value, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentContextLessThanOrEqualTo(String value) {
            addCriterion("document_context <=", value, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentContextLike(String value) {
            addCriterion("document_context like", value, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentContextNotLike(String value) {
            addCriterion("document_context not like", value, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentContextIn(List<String> values) {
            addCriterion("document_context in", values, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentContextNotIn(List<String> values) {
            addCriterion("document_context not in", values, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentContextBetween(String value1, String value2) {
            addCriterion("document_context between", value1, value2, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentContextNotBetween(String value1, String value2) {
            addCriterion("document_context not between", value1, value2, "documentContext");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorIsNull() {
            addCriterion("document_author is null");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorIsNotNull() {
            addCriterion("document_author is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorEqualTo(String value) {
            addCriterion("document_author =", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorNotEqualTo(String value) {
            addCriterion("document_author <>", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorGreaterThan(String value) {
            addCriterion("document_author >", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("document_author >=", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorLessThan(String value) {
            addCriterion("document_author <", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorLessThanOrEqualTo(String value) {
            addCriterion("document_author <=", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorLike(String value) {
            addCriterion("document_author like", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorNotLike(String value) {
            addCriterion("document_author not like", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorIn(List<String> values) {
            addCriterion("document_author in", values, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorNotIn(List<String> values) {
            addCriterion("document_author not in", values, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorBetween(String value1, String value2) {
            addCriterion("document_author between", value1, value2, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorNotBetween(String value1, String value2) {
            addCriterion("document_author not between", value1, value2, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentDateIsNull() {
            addCriterion("document_date is null");
            return (Criteria) this;
        }

        public Criteria andDocumentDateIsNotNull() {
            addCriterion("document_date is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("document_date =", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("document_date <>", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("document_date >", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("document_date >=", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("document_date <", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("document_date <=", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("document_date in", values, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("document_date not in", values, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("document_date between", value1, value2, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("document_date not between", value1, value2, "documentDate");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
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