package com.mlight.model;

import java.util.ArrayList;
import java.util.List;

public class HazardCharacteristicsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HazardCharacteristicsExample() {
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

        public Criteria andBasicIdIsNull() {
            addCriterion("basic_id is null");
            return (Criteria) this;
        }

        public Criteria andBasicIdIsNotNull() {
            addCriterion("basic_id is not null");
            return (Criteria) this;
        }

        public Criteria andBasicIdEqualTo(Integer value) {
            addCriterion("basic_id =", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotEqualTo(Integer value) {
            addCriterion("basic_id <>", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThan(Integer value) {
            addCriterion("basic_id >", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_id >=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThan(Integer value) {
            addCriterion("basic_id <", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThanOrEqualTo(Integer value) {
            addCriterion("basic_id <=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdIn(List<Integer> values) {
            addCriterion("basic_id in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotIn(List<Integer> values) {
            addCriterion("basic_id not in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdBetween(Integer value1, Integer value2) {
            addCriterion("basic_id between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_id not between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmIsNull() {
            addCriterion("hazardous_chemicals_dm is null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmIsNotNull() {
            addCriterion("hazardous_chemicals_dm is not null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmEqualTo(String value) {
            addCriterion("hazardous_chemicals_dm =", value, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmNotEqualTo(String value) {
            addCriterion("hazardous_chemicals_dm <>", value, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmGreaterThan(String value) {
            addCriterion("hazardous_chemicals_dm >", value, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmGreaterThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_dm >=", value, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmLessThan(String value) {
            addCriterion("hazardous_chemicals_dm <", value, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmLessThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_dm <=", value, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmLike(String value) {
            addCriterion("hazardous_chemicals_dm like", value, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmNotLike(String value) {
            addCriterion("hazardous_chemicals_dm not like", value, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmIn(List<String> values) {
            addCriterion("hazardous_chemicals_dm in", values, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmNotIn(List<String> values) {
            addCriterion("hazardous_chemicals_dm not in", values, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_dm between", value1, value2, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsDmNotBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_dm not between", value1, value2, "hazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsIsNull() {
            addCriterion("hazardous_chemicals is null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsIsNotNull() {
            addCriterion("hazardous_chemicals is not null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsEqualTo(String value) {
            addCriterion("hazardous_chemicals =", value, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsNotEqualTo(String value) {
            addCriterion("hazardous_chemicals <>", value, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsGreaterThan(String value) {
            addCriterion("hazardous_chemicals >", value, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsGreaterThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals >=", value, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsLessThan(String value) {
            addCriterion("hazardous_chemicals <", value, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsLessThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals <=", value, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsLike(String value) {
            addCriterion("hazardous_chemicals like", value, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsNotLike(String value) {
            addCriterion("hazardous_chemicals not like", value, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsIn(List<String> values) {
            addCriterion("hazardous_chemicals in", values, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsNotIn(List<String> values) {
            addCriterion("hazardous_chemicals not in", values, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals between", value1, value2, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsNotBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals not between", value1, value2, "hazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmIsNull() {
            addCriterion("hazardous_chemicals_type_dm is null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmIsNotNull() {
            addCriterion("hazardous_chemicals_type_dm is not null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_dm =", value, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmNotEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_dm <>", value, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmGreaterThan(String value) {
            addCriterion("hazardous_chemicals_type_dm >", value, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmGreaterThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_dm >=", value, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmLessThan(String value) {
            addCriterion("hazardous_chemicals_type_dm <", value, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmLessThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_dm <=", value, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmLike(String value) {
            addCriterion("hazardous_chemicals_type_dm like", value, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmNotLike(String value) {
            addCriterion("hazardous_chemicals_type_dm not like", value, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmIn(List<String> values) {
            addCriterion("hazardous_chemicals_type_dm in", values, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmNotIn(List<String> values) {
            addCriterion("hazardous_chemicals_type_dm not in", values, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_type_dm between", value1, value2, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDmNotBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_type_dm not between", value1, value2, "hazardousChemicalsTypeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeIsNull() {
            addCriterion("hazardous_chemicals_type is null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeIsNotNull() {
            addCriterion("hazardous_chemicals_type is not null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeEqualTo(String value) {
            addCriterion("hazardous_chemicals_type =", value, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeNotEqualTo(String value) {
            addCriterion("hazardous_chemicals_type <>", value, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeGreaterThan(String value) {
            addCriterion("hazardous_chemicals_type >", value, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_type >=", value, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeLessThan(String value) {
            addCriterion("hazardous_chemicals_type <", value, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeLessThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_type <=", value, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeLike(String value) {
            addCriterion("hazardous_chemicals_type like", value, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeNotLike(String value) {
            addCriterion("hazardous_chemicals_type not like", value, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeIn(List<String> values) {
            addCriterion("hazardous_chemicals_type in", values, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeNotIn(List<String> values) {
            addCriterion("hazardous_chemicals_type not in", values, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_type between", value1, value2, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeNotBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_type not between", value1, value2, "hazardousChemicalsType");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmIsNull() {
            addCriterion("hazardous_chemicals_type_describe_dm is null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmIsNotNull() {
            addCriterion("hazardous_chemicals_type_describe_dm is not null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_describe_dm =", value, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmNotEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_describe_dm <>", value, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmGreaterThan(String value) {
            addCriterion("hazardous_chemicals_type_describe_dm >", value, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmGreaterThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_describe_dm >=", value, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmLessThan(String value) {
            addCriterion("hazardous_chemicals_type_describe_dm <", value, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmLessThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_describe_dm <=", value, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmLike(String value) {
            addCriterion("hazardous_chemicals_type_describe_dm like", value, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmNotLike(String value) {
            addCriterion("hazardous_chemicals_type_describe_dm not like", value, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmIn(List<String> values) {
            addCriterion("hazardous_chemicals_type_describe_dm in", values, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmNotIn(List<String> values) {
            addCriterion("hazardous_chemicals_type_describe_dm not in", values, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_type_describe_dm between", value1, value2, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeDmNotBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_type_describe_dm not between", value1, value2, "hazardousChemicalsTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeIsNull() {
            addCriterion("hazardous_chemicals_type_describe is null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeIsNotNull() {
            addCriterion("hazardous_chemicals_type_describe is not null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_describe =", value, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeNotEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_describe <>", value, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeGreaterThan(String value) {
            addCriterion("hazardous_chemicals_type_describe >", value, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_describe >=", value, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeLessThan(String value) {
            addCriterion("hazardous_chemicals_type_describe <", value, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeLessThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_describe <=", value, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeLike(String value) {
            addCriterion("hazardous_chemicals_type_describe like", value, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeNotLike(String value) {
            addCriterion("hazardous_chemicals_type_describe not like", value, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeIn(List<String> values) {
            addCriterion("hazardous_chemicals_type_describe in", values, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeNotIn(List<String> values) {
            addCriterion("hazardous_chemicals_type_describe not in", values, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_type_describe between", value1, value2, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeDescribeNotBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_type_describe not between", value1, value2, "hazardousChemicalsTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherIsNull() {
            addCriterion("hazardous_chemicals_type_other is null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherIsNotNull() {
            addCriterion("hazardous_chemicals_type_other is not null");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_other =", value, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherNotEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_other <>", value, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherGreaterThan(String value) {
            addCriterion("hazardous_chemicals_type_other >", value, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherGreaterThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_other >=", value, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherLessThan(String value) {
            addCriterion("hazardous_chemicals_type_other <", value, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherLessThanOrEqualTo(String value) {
            addCriterion("hazardous_chemicals_type_other <=", value, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherLike(String value) {
            addCriterion("hazardous_chemicals_type_other like", value, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherNotLike(String value) {
            addCriterion("hazardous_chemicals_type_other not like", value, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherIn(List<String> values) {
            addCriterion("hazardous_chemicals_type_other in", values, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherNotIn(List<String> values) {
            addCriterion("hazardous_chemicals_type_other not in", values, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_type_other between", value1, value2, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andHazardousChemicalsTypeOtherNotBetween(String value1, String value2) {
            addCriterion("hazardous_chemicals_type_other not between", value1, value2, "hazardousChemicalsTypeOther");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmIsNull() {
            addCriterion("major_hazard_sources_dm is null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmIsNotNull() {
            addCriterion("major_hazard_sources_dm is not null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmEqualTo(String value) {
            addCriterion("major_hazard_sources_dm =", value, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmNotEqualTo(String value) {
            addCriterion("major_hazard_sources_dm <>", value, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmGreaterThan(String value) {
            addCriterion("major_hazard_sources_dm >", value, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmGreaterThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources_dm >=", value, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmLessThan(String value) {
            addCriterion("major_hazard_sources_dm <", value, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmLessThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources_dm <=", value, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmLike(String value) {
            addCriterion("major_hazard_sources_dm like", value, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmNotLike(String value) {
            addCriterion("major_hazard_sources_dm not like", value, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmIn(List<String> values) {
            addCriterion("major_hazard_sources_dm in", values, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmNotIn(List<String> values) {
            addCriterion("major_hazard_sources_dm not in", values, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmBetween(String value1, String value2) {
            addCriterion("major_hazard_sources_dm between", value1, value2, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesDmNotBetween(String value1, String value2) {
            addCriterion("major_hazard_sources_dm not between", value1, value2, "majorHazardSourcesDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesIsNull() {
            addCriterion("major_hazard_sources is null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesIsNotNull() {
            addCriterion("major_hazard_sources is not null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesEqualTo(String value) {
            addCriterion("major_hazard_sources =", value, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesNotEqualTo(String value) {
            addCriterion("major_hazard_sources <>", value, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesGreaterThan(String value) {
            addCriterion("major_hazard_sources >", value, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesGreaterThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources >=", value, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLessThan(String value) {
            addCriterion("major_hazard_sources <", value, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLessThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources <=", value, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLike(String value) {
            addCriterion("major_hazard_sources like", value, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesNotLike(String value) {
            addCriterion("major_hazard_sources not like", value, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesIn(List<String> values) {
            addCriterion("major_hazard_sources in", values, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesNotIn(List<String> values) {
            addCriterion("major_hazard_sources not in", values, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesBetween(String value1, String value2) {
            addCriterion("major_hazard_sources between", value1, value2, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesNotBetween(String value1, String value2) {
            addCriterion("major_hazard_sources not between", value1, value2, "majorHazardSources");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmIsNull() {
            addCriterion("major_hazard_sources_type_dm is null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmIsNotNull() {
            addCriterion("major_hazard_sources_type_dm is not null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmEqualTo(String value) {
            addCriterion("major_hazard_sources_type_dm =", value, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmNotEqualTo(String value) {
            addCriterion("major_hazard_sources_type_dm <>", value, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmGreaterThan(String value) {
            addCriterion("major_hazard_sources_type_dm >", value, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmGreaterThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources_type_dm >=", value, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmLessThan(String value) {
            addCriterion("major_hazard_sources_type_dm <", value, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmLessThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources_type_dm <=", value, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmLike(String value) {
            addCriterion("major_hazard_sources_type_dm like", value, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmNotLike(String value) {
            addCriterion("major_hazard_sources_type_dm not like", value, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmIn(List<String> values) {
            addCriterion("major_hazard_sources_type_dm in", values, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmNotIn(List<String> values) {
            addCriterion("major_hazard_sources_type_dm not in", values, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmBetween(String value1, String value2) {
            addCriterion("major_hazard_sources_type_dm between", value1, value2, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeDmNotBetween(String value1, String value2) {
            addCriterion("major_hazard_sources_type_dm not between", value1, value2, "majorHazardSourcesTypeDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeIsNull() {
            addCriterion("major_hazard_sources_type is null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeIsNotNull() {
            addCriterion("major_hazard_sources_type is not null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeEqualTo(String value) {
            addCriterion("major_hazard_sources_type =", value, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeNotEqualTo(String value) {
            addCriterion("major_hazard_sources_type <>", value, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeGreaterThan(String value) {
            addCriterion("major_hazard_sources_type >", value, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources_type >=", value, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeLessThan(String value) {
            addCriterion("major_hazard_sources_type <", value, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeLessThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources_type <=", value, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeLike(String value) {
            addCriterion("major_hazard_sources_type like", value, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeNotLike(String value) {
            addCriterion("major_hazard_sources_type not like", value, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeIn(List<String> values) {
            addCriterion("major_hazard_sources_type in", values, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeNotIn(List<String> values) {
            addCriterion("major_hazard_sources_type not in", values, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeBetween(String value1, String value2) {
            addCriterion("major_hazard_sources_type between", value1, value2, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesTypeNotBetween(String value1, String value2) {
            addCriterion("major_hazard_sources_type not between", value1, value2, "majorHazardSourcesType");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmIsNull() {
            addCriterion("major_hazard_sources_leval_dm is null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmIsNotNull() {
            addCriterion("major_hazard_sources_leval_dm is not null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmEqualTo(String value) {
            addCriterion("major_hazard_sources_leval_dm =", value, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmNotEqualTo(String value) {
            addCriterion("major_hazard_sources_leval_dm <>", value, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmGreaterThan(String value) {
            addCriterion("major_hazard_sources_leval_dm >", value, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmGreaterThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources_leval_dm >=", value, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmLessThan(String value) {
            addCriterion("major_hazard_sources_leval_dm <", value, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmLessThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources_leval_dm <=", value, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmLike(String value) {
            addCriterion("major_hazard_sources_leval_dm like", value, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmNotLike(String value) {
            addCriterion("major_hazard_sources_leval_dm not like", value, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmIn(List<String> values) {
            addCriterion("major_hazard_sources_leval_dm in", values, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmNotIn(List<String> values) {
            addCriterion("major_hazard_sources_leval_dm not in", values, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmBetween(String value1, String value2) {
            addCriterion("major_hazard_sources_leval_dm between", value1, value2, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalDmNotBetween(String value1, String value2) {
            addCriterion("major_hazard_sources_leval_dm not between", value1, value2, "majorHazardSourcesLevalDm");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalIsNull() {
            addCriterion("major_hazard_sources_leval is null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalIsNotNull() {
            addCriterion("major_hazard_sources_leval is not null");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalEqualTo(String value) {
            addCriterion("major_hazard_sources_leval =", value, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalNotEqualTo(String value) {
            addCriterion("major_hazard_sources_leval <>", value, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalGreaterThan(String value) {
            addCriterion("major_hazard_sources_leval >", value, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalGreaterThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources_leval >=", value, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalLessThan(String value) {
            addCriterion("major_hazard_sources_leval <", value, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalLessThanOrEqualTo(String value) {
            addCriterion("major_hazard_sources_leval <=", value, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalLike(String value) {
            addCriterion("major_hazard_sources_leval like", value, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalNotLike(String value) {
            addCriterion("major_hazard_sources_leval not like", value, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalIn(List<String> values) {
            addCriterion("major_hazard_sources_leval in", values, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalNotIn(List<String> values) {
            addCriterion("major_hazard_sources_leval not in", values, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalBetween(String value1, String value2) {
            addCriterion("major_hazard_sources_leval between", value1, value2, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andMajorHazardSourcesLevalNotBetween(String value1, String value2) {
            addCriterion("major_hazard_sources_leval not between", value1, value2, "majorHazardSourcesLeval");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmIsNull() {
            addCriterion("technics_dm is null");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmIsNotNull() {
            addCriterion("technics_dm is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmEqualTo(String value) {
            addCriterion("technics_dm =", value, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmNotEqualTo(String value) {
            addCriterion("technics_dm <>", value, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmGreaterThan(String value) {
            addCriterion("technics_dm >", value, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmGreaterThanOrEqualTo(String value) {
            addCriterion("technics_dm >=", value, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmLessThan(String value) {
            addCriterion("technics_dm <", value, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmLessThanOrEqualTo(String value) {
            addCriterion("technics_dm <=", value, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmLike(String value) {
            addCriterion("technics_dm like", value, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmNotLike(String value) {
            addCriterion("technics_dm not like", value, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmIn(List<String> values) {
            addCriterion("technics_dm in", values, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmNotIn(List<String> values) {
            addCriterion("technics_dm not in", values, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmBetween(String value1, String value2) {
            addCriterion("technics_dm between", value1, value2, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsDmNotBetween(String value1, String value2) {
            addCriterion("technics_dm not between", value1, value2, "technicsDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsIsNull() {
            addCriterion("technics is null");
            return (Criteria) this;
        }

        public Criteria andTechnicsIsNotNull() {
            addCriterion("technics is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicsEqualTo(String value) {
            addCriterion("technics =", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsNotEqualTo(String value) {
            addCriterion("technics <>", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsGreaterThan(String value) {
            addCriterion("technics >", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsGreaterThanOrEqualTo(String value) {
            addCriterion("technics >=", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsLessThan(String value) {
            addCriterion("technics <", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsLessThanOrEqualTo(String value) {
            addCriterion("technics <=", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsLike(String value) {
            addCriterion("technics like", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsNotLike(String value) {
            addCriterion("technics not like", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsIn(List<String> values) {
            addCriterion("technics in", values, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsNotIn(List<String> values) {
            addCriterion("technics not in", values, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsBetween(String value1, String value2) {
            addCriterion("technics between", value1, value2, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsNotBetween(String value1, String value2) {
            addCriterion("technics not between", value1, value2, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmIsNull() {
            addCriterion("technics_type_dm is null");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmIsNotNull() {
            addCriterion("technics_type_dm is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmEqualTo(String value) {
            addCriterion("technics_type_dm =", value, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmNotEqualTo(String value) {
            addCriterion("technics_type_dm <>", value, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmGreaterThan(String value) {
            addCriterion("technics_type_dm >", value, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmGreaterThanOrEqualTo(String value) {
            addCriterion("technics_type_dm >=", value, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmLessThan(String value) {
            addCriterion("technics_type_dm <", value, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmLessThanOrEqualTo(String value) {
            addCriterion("technics_type_dm <=", value, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmLike(String value) {
            addCriterion("technics_type_dm like", value, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmNotLike(String value) {
            addCriterion("technics_type_dm not like", value, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmIn(List<String> values) {
            addCriterion("technics_type_dm in", values, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmNotIn(List<String> values) {
            addCriterion("technics_type_dm not in", values, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmBetween(String value1, String value2) {
            addCriterion("technics_type_dm between", value1, value2, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeDmNotBetween(String value1, String value2) {
            addCriterion("technics_type_dm not between", value1, value2, "technicsTypeDm");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeIsNull() {
            addCriterion("technics_type is null");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeIsNotNull() {
            addCriterion("technics_type is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeEqualTo(String value) {
            addCriterion("technics_type =", value, "technicsType");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeNotEqualTo(String value) {
            addCriterion("technics_type <>", value, "technicsType");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeGreaterThan(String value) {
            addCriterion("technics_type >", value, "technicsType");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("technics_type >=", value, "technicsType");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeLessThan(String value) {
            addCriterion("technics_type <", value, "technicsType");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeLessThanOrEqualTo(String value) {
            addCriterion("technics_type <=", value, "technicsType");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeLike(String value) {
            addCriterion("technics_type like", value, "technicsType");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeNotLike(String value) {
            addCriterion("technics_type not like", value, "technicsType");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeIn(List<String> values) {
            addCriterion("technics_type in", values, "technicsType");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeNotIn(List<String> values) {
            addCriterion("technics_type not in", values, "technicsType");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeBetween(String value1, String value2) {
            addCriterion("technics_type between", value1, value2, "technicsType");
            return (Criteria) this;
        }

        public Criteria andTechnicsTypeNotBetween(String value1, String value2) {
            addCriterion("technics_type not between", value1, value2, "technicsType");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmIsNull() {
            addCriterion("emphasis_hazardous_chemicals_dm is null");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmIsNotNull() {
            addCriterion("emphasis_hazardous_chemicals_dm is not null");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals_dm =", value, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmNotEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals_dm <>", value, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmGreaterThan(String value) {
            addCriterion("emphasis_hazardous_chemicals_dm >", value, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmGreaterThanOrEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals_dm >=", value, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmLessThan(String value) {
            addCriterion("emphasis_hazardous_chemicals_dm <", value, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmLessThanOrEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals_dm <=", value, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmLike(String value) {
            addCriterion("emphasis_hazardous_chemicals_dm like", value, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmNotLike(String value) {
            addCriterion("emphasis_hazardous_chemicals_dm not like", value, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmIn(List<String> values) {
            addCriterion("emphasis_hazardous_chemicals_dm in", values, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmNotIn(List<String> values) {
            addCriterion("emphasis_hazardous_chemicals_dm not in", values, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmBetween(String value1, String value2) {
            addCriterion("emphasis_hazardous_chemicals_dm between", value1, value2, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsDmNotBetween(String value1, String value2) {
            addCriterion("emphasis_hazardous_chemicals_dm not between", value1, value2, "emphasisHazardousChemicalsDm");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsIsNull() {
            addCriterion("emphasis_hazardous_chemicals is null");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsIsNotNull() {
            addCriterion("emphasis_hazardous_chemicals is not null");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals =", value, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNotEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals <>", value, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsGreaterThan(String value) {
            addCriterion("emphasis_hazardous_chemicals >", value, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsGreaterThanOrEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals >=", value, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsLessThan(String value) {
            addCriterion("emphasis_hazardous_chemicals <", value, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsLessThanOrEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals <=", value, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsLike(String value) {
            addCriterion("emphasis_hazardous_chemicals like", value, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNotLike(String value) {
            addCriterion("emphasis_hazardous_chemicals not like", value, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsIn(List<String> values) {
            addCriterion("emphasis_hazardous_chemicals in", values, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNotIn(List<String> values) {
            addCriterion("emphasis_hazardous_chemicals not in", values, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsBetween(String value1, String value2) {
            addCriterion("emphasis_hazardous_chemicals between", value1, value2, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNotBetween(String value1, String value2) {
            addCriterion("emphasis_hazardous_chemicals not between", value1, value2, "emphasisHazardousChemicals");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesIsNull() {
            addCriterion("emphasis_hazardous_chemicals_names is null");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesIsNotNull() {
            addCriterion("emphasis_hazardous_chemicals_names is not null");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals_names =", value, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesNotEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals_names <>", value, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesGreaterThan(String value) {
            addCriterion("emphasis_hazardous_chemicals_names >", value, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesGreaterThanOrEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals_names >=", value, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesLessThan(String value) {
            addCriterion("emphasis_hazardous_chemicals_names <", value, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesLessThanOrEqualTo(String value) {
            addCriterion("emphasis_hazardous_chemicals_names <=", value, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesLike(String value) {
            addCriterion("emphasis_hazardous_chemicals_names like", value, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesNotLike(String value) {
            addCriterion("emphasis_hazardous_chemicals_names not like", value, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesIn(List<String> values) {
            addCriterion("emphasis_hazardous_chemicals_names in", values, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesNotIn(List<String> values) {
            addCriterion("emphasis_hazardous_chemicals_names not in", values, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesBetween(String value1, String value2) {
            addCriterion("emphasis_hazardous_chemicals_names between", value1, value2, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andEmphasisHazardousChemicalsNamesNotBetween(String value1, String value2) {
            addCriterion("emphasis_hazardous_chemicals_names not between", value1, value2, "emphasisHazardousChemicalsNames");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmIsNull() {
            addCriterion("special_equipment_dm is null");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmIsNotNull() {
            addCriterion("special_equipment_dm is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmEqualTo(String value) {
            addCriterion("special_equipment_dm =", value, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmNotEqualTo(String value) {
            addCriterion("special_equipment_dm <>", value, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmGreaterThan(String value) {
            addCriterion("special_equipment_dm >", value, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmGreaterThanOrEqualTo(String value) {
            addCriterion("special_equipment_dm >=", value, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmLessThan(String value) {
            addCriterion("special_equipment_dm <", value, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmLessThanOrEqualTo(String value) {
            addCriterion("special_equipment_dm <=", value, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmLike(String value) {
            addCriterion("special_equipment_dm like", value, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmNotLike(String value) {
            addCriterion("special_equipment_dm not like", value, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmIn(List<String> values) {
            addCriterion("special_equipment_dm in", values, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmNotIn(List<String> values) {
            addCriterion("special_equipment_dm not in", values, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmBetween(String value1, String value2) {
            addCriterion("special_equipment_dm between", value1, value2, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentDmNotBetween(String value1, String value2) {
            addCriterion("special_equipment_dm not between", value1, value2, "specialEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentIsNull() {
            addCriterion("special_equipment is null");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentIsNotNull() {
            addCriterion("special_equipment is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentEqualTo(String value) {
            addCriterion("special_equipment =", value, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentNotEqualTo(String value) {
            addCriterion("special_equipment <>", value, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentGreaterThan(String value) {
            addCriterion("special_equipment >", value, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("special_equipment >=", value, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentLessThan(String value) {
            addCriterion("special_equipment <", value, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentLessThanOrEqualTo(String value) {
            addCriterion("special_equipment <=", value, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentLike(String value) {
            addCriterion("special_equipment like", value, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentNotLike(String value) {
            addCriterion("special_equipment not like", value, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentIn(List<String> values) {
            addCriterion("special_equipment in", values, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentNotIn(List<String> values) {
            addCriterion("special_equipment not in", values, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentBetween(String value1, String value2) {
            addCriterion("special_equipment between", value1, value2, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentNotBetween(String value1, String value2) {
            addCriterion("special_equipment not between", value1, value2, "specialEquipment");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmIsNull() {
            addCriterion("special_equipment_type_dm is null");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmIsNotNull() {
            addCriterion("special_equipment_type_dm is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmEqualTo(String value) {
            addCriterion("special_equipment_type_dm =", value, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmNotEqualTo(String value) {
            addCriterion("special_equipment_type_dm <>", value, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmGreaterThan(String value) {
            addCriterion("special_equipment_type_dm >", value, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmGreaterThanOrEqualTo(String value) {
            addCriterion("special_equipment_type_dm >=", value, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmLessThan(String value) {
            addCriterion("special_equipment_type_dm <", value, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmLessThanOrEqualTo(String value) {
            addCriterion("special_equipment_type_dm <=", value, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmLike(String value) {
            addCriterion("special_equipment_type_dm like", value, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmNotLike(String value) {
            addCriterion("special_equipment_type_dm not like", value, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmIn(List<String> values) {
            addCriterion("special_equipment_type_dm in", values, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmNotIn(List<String> values) {
            addCriterion("special_equipment_type_dm not in", values, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmBetween(String value1, String value2) {
            addCriterion("special_equipment_type_dm between", value1, value2, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeDmNotBetween(String value1, String value2) {
            addCriterion("special_equipment_type_dm not between", value1, value2, "specialEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeIsNull() {
            addCriterion("special_equipment_type is null");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeIsNotNull() {
            addCriterion("special_equipment_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeEqualTo(String value) {
            addCriterion("special_equipment_type =", value, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeNotEqualTo(String value) {
            addCriterion("special_equipment_type <>", value, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeGreaterThan(String value) {
            addCriterion("special_equipment_type >", value, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("special_equipment_type >=", value, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeLessThan(String value) {
            addCriterion("special_equipment_type <", value, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeLessThanOrEqualTo(String value) {
            addCriterion("special_equipment_type <=", value, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeLike(String value) {
            addCriterion("special_equipment_type like", value, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeNotLike(String value) {
            addCriterion("special_equipment_type not like", value, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeIn(List<String> values) {
            addCriterion("special_equipment_type in", values, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeNotIn(List<String> values) {
            addCriterion("special_equipment_type not in", values, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeBetween(String value1, String value2) {
            addCriterion("special_equipment_type between", value1, value2, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andSpecialEquipmentTypeNotBetween(String value1, String value2) {
            addCriterion("special_equipment_type not between", value1, value2, "specialEquipmentType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmIsNull() {
            addCriterion("combustible_dust_dm is null");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmIsNotNull() {
            addCriterion("combustible_dust_dm is not null");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmEqualTo(String value) {
            addCriterion("combustible_dust_dm =", value, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmNotEqualTo(String value) {
            addCriterion("combustible_dust_dm <>", value, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmGreaterThan(String value) {
            addCriterion("combustible_dust_dm >", value, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmGreaterThanOrEqualTo(String value) {
            addCriterion("combustible_dust_dm >=", value, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmLessThan(String value) {
            addCriterion("combustible_dust_dm <", value, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmLessThanOrEqualTo(String value) {
            addCriterion("combustible_dust_dm <=", value, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmLike(String value) {
            addCriterion("combustible_dust_dm like", value, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmNotLike(String value) {
            addCriterion("combustible_dust_dm not like", value, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmIn(List<String> values) {
            addCriterion("combustible_dust_dm in", values, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmNotIn(List<String> values) {
            addCriterion("combustible_dust_dm not in", values, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmBetween(String value1, String value2) {
            addCriterion("combustible_dust_dm between", value1, value2, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustDmNotBetween(String value1, String value2) {
            addCriterion("combustible_dust_dm not between", value1, value2, "combustibleDustDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustIsNull() {
            addCriterion("combustible_dust is null");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustIsNotNull() {
            addCriterion("combustible_dust is not null");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustEqualTo(String value) {
            addCriterion("combustible_dust =", value, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustNotEqualTo(String value) {
            addCriterion("combustible_dust <>", value, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustGreaterThan(String value) {
            addCriterion("combustible_dust >", value, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustGreaterThanOrEqualTo(String value) {
            addCriterion("combustible_dust >=", value, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustLessThan(String value) {
            addCriterion("combustible_dust <", value, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustLessThanOrEqualTo(String value) {
            addCriterion("combustible_dust <=", value, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustLike(String value) {
            addCriterion("combustible_dust like", value, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustNotLike(String value) {
            addCriterion("combustible_dust not like", value, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustIn(List<String> values) {
            addCriterion("combustible_dust in", values, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustNotIn(List<String> values) {
            addCriterion("combustible_dust not in", values, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustBetween(String value1, String value2) {
            addCriterion("combustible_dust between", value1, value2, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustNotBetween(String value1, String value2) {
            addCriterion("combustible_dust not between", value1, value2, "combustibleDust");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmIsNull() {
            addCriterion("combustible_dust_type_dm is null");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmIsNotNull() {
            addCriterion("combustible_dust_type_dm is not null");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmEqualTo(String value) {
            addCriterion("combustible_dust_type_dm =", value, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmNotEqualTo(String value) {
            addCriterion("combustible_dust_type_dm <>", value, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmGreaterThan(String value) {
            addCriterion("combustible_dust_type_dm >", value, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmGreaterThanOrEqualTo(String value) {
            addCriterion("combustible_dust_type_dm >=", value, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmLessThan(String value) {
            addCriterion("combustible_dust_type_dm <", value, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmLessThanOrEqualTo(String value) {
            addCriterion("combustible_dust_type_dm <=", value, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmLike(String value) {
            addCriterion("combustible_dust_type_dm like", value, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmNotLike(String value) {
            addCriterion("combustible_dust_type_dm not like", value, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmIn(List<String> values) {
            addCriterion("combustible_dust_type_dm in", values, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmNotIn(List<String> values) {
            addCriterion("combustible_dust_type_dm not in", values, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmBetween(String value1, String value2) {
            addCriterion("combustible_dust_type_dm between", value1, value2, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeDmNotBetween(String value1, String value2) {
            addCriterion("combustible_dust_type_dm not between", value1, value2, "combustibleDustTypeDm");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeIsNull() {
            addCriterion("combustible_dust_type is null");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeIsNotNull() {
            addCriterion("combustible_dust_type is not null");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeEqualTo(String value) {
            addCriterion("combustible_dust_type =", value, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeNotEqualTo(String value) {
            addCriterion("combustible_dust_type <>", value, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeGreaterThan(String value) {
            addCriterion("combustible_dust_type >", value, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeGreaterThanOrEqualTo(String value) {
            addCriterion("combustible_dust_type >=", value, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeLessThan(String value) {
            addCriterion("combustible_dust_type <", value, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeLessThanOrEqualTo(String value) {
            addCriterion("combustible_dust_type <=", value, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeLike(String value) {
            addCriterion("combustible_dust_type like", value, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeNotLike(String value) {
            addCriterion("combustible_dust_type not like", value, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeIn(List<String> values) {
            addCriterion("combustible_dust_type in", values, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeNotIn(List<String> values) {
            addCriterion("combustible_dust_type not in", values, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeBetween(String value1, String value2) {
            addCriterion("combustible_dust_type between", value1, value2, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andCombustibleDustTypeNotBetween(String value1, String value2) {
            addCriterion("combustible_dust_type not between", value1, value2, "combustibleDustType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmIsNull() {
            addCriterion("dangerous_equipment_dm is null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmIsNotNull() {
            addCriterion("dangerous_equipment_dm is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmEqualTo(String value) {
            addCriterion("dangerous_equipment_dm =", value, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmNotEqualTo(String value) {
            addCriterion("dangerous_equipment_dm <>", value, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmGreaterThan(String value) {
            addCriterion("dangerous_equipment_dm >", value, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_dm >=", value, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmLessThan(String value) {
            addCriterion("dangerous_equipment_dm <", value, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmLessThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_dm <=", value, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmLike(String value) {
            addCriterion("dangerous_equipment_dm like", value, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmNotLike(String value) {
            addCriterion("dangerous_equipment_dm not like", value, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmIn(List<String> values) {
            addCriterion("dangerous_equipment_dm in", values, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmNotIn(List<String> values) {
            addCriterion("dangerous_equipment_dm not in", values, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_dm between", value1, value2, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentDmNotBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_dm not between", value1, value2, "dangerousEquipmentDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentIsNull() {
            addCriterion("dangerous_equipment is null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentIsNotNull() {
            addCriterion("dangerous_equipment is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentEqualTo(String value) {
            addCriterion("dangerous_equipment =", value, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentNotEqualTo(String value) {
            addCriterion("dangerous_equipment <>", value, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentGreaterThan(String value) {
            addCriterion("dangerous_equipment >", value, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment >=", value, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentLessThan(String value) {
            addCriterion("dangerous_equipment <", value, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentLessThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment <=", value, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentLike(String value) {
            addCriterion("dangerous_equipment like", value, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentNotLike(String value) {
            addCriterion("dangerous_equipment not like", value, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentIn(List<String> values) {
            addCriterion("dangerous_equipment in", values, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentNotIn(List<String> values) {
            addCriterion("dangerous_equipment not in", values, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentBetween(String value1, String value2) {
            addCriterion("dangerous_equipment between", value1, value2, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentNotBetween(String value1, String value2) {
            addCriterion("dangerous_equipment not between", value1, value2, "dangerousEquipment");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmIsNull() {
            addCriterion("dangerous_equipment_type_dm is null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmIsNotNull() {
            addCriterion("dangerous_equipment_type_dm is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmEqualTo(String value) {
            addCriterion("dangerous_equipment_type_dm =", value, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmNotEqualTo(String value) {
            addCriterion("dangerous_equipment_type_dm <>", value, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmGreaterThan(String value) {
            addCriterion("dangerous_equipment_type_dm >", value, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type_dm >=", value, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmLessThan(String value) {
            addCriterion("dangerous_equipment_type_dm <", value, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmLessThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type_dm <=", value, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmLike(String value) {
            addCriterion("dangerous_equipment_type_dm like", value, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmNotLike(String value) {
            addCriterion("dangerous_equipment_type_dm not like", value, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmIn(List<String> values) {
            addCriterion("dangerous_equipment_type_dm in", values, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmNotIn(List<String> values) {
            addCriterion("dangerous_equipment_type_dm not in", values, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type_dm between", value1, value2, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDmNotBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type_dm not between", value1, value2, "dangerousEquipmentTypeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeIsNull() {
            addCriterion("dangerous_equipment_type is null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeIsNotNull() {
            addCriterion("dangerous_equipment_type is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeEqualTo(String value) {
            addCriterion("dangerous_equipment_type =", value, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeNotEqualTo(String value) {
            addCriterion("dangerous_equipment_type <>", value, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeGreaterThan(String value) {
            addCriterion("dangerous_equipment_type >", value, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type >=", value, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeLessThan(String value) {
            addCriterion("dangerous_equipment_type <", value, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeLessThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type <=", value, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeLike(String value) {
            addCriterion("dangerous_equipment_type like", value, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeNotLike(String value) {
            addCriterion("dangerous_equipment_type not like", value, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeIn(List<String> values) {
            addCriterion("dangerous_equipment_type in", values, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeNotIn(List<String> values) {
            addCriterion("dangerous_equipment_type not in", values, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type between", value1, value2, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeNotBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type not between", value1, value2, "dangerousEquipmentType");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmIsNull() {
            addCriterion("dangerous_equipment_type_describe_dm is null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmIsNotNull() {
            addCriterion("dangerous_equipment_type_describe_dm is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmEqualTo(String value) {
            addCriterion("dangerous_equipment_type_describe_dm =", value, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmNotEqualTo(String value) {
            addCriterion("dangerous_equipment_type_describe_dm <>", value, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmGreaterThan(String value) {
            addCriterion("dangerous_equipment_type_describe_dm >", value, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type_describe_dm >=", value, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmLessThan(String value) {
            addCriterion("dangerous_equipment_type_describe_dm <", value, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmLessThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type_describe_dm <=", value, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmLike(String value) {
            addCriterion("dangerous_equipment_type_describe_dm like", value, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmNotLike(String value) {
            addCriterion("dangerous_equipment_type_describe_dm not like", value, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmIn(List<String> values) {
            addCriterion("dangerous_equipment_type_describe_dm in", values, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmNotIn(List<String> values) {
            addCriterion("dangerous_equipment_type_describe_dm not in", values, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type_describe_dm between", value1, value2, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeDmNotBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type_describe_dm not between", value1, value2, "dangerousEquipmentTypeDescribeDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeIsNull() {
            addCriterion("dangerous_equipment_type_describe is null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeIsNotNull() {
            addCriterion("dangerous_equipment_type_describe is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeEqualTo(String value) {
            addCriterion("dangerous_equipment_type_describe =", value, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeNotEqualTo(String value) {
            addCriterion("dangerous_equipment_type_describe <>", value, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeGreaterThan(String value) {
            addCriterion("dangerous_equipment_type_describe >", value, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type_describe >=", value, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeLessThan(String value) {
            addCriterion("dangerous_equipment_type_describe <", value, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeLessThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type_describe <=", value, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeLike(String value) {
            addCriterion("dangerous_equipment_type_describe like", value, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeNotLike(String value) {
            addCriterion("dangerous_equipment_type_describe not like", value, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeIn(List<String> values) {
            addCriterion("dangerous_equipment_type_describe in", values, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeNotIn(List<String> values) {
            addCriterion("dangerous_equipment_type_describe not in", values, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type_describe between", value1, value2, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeDescribeNotBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type_describe not between", value1, value2, "dangerousEquipmentTypeDescribe");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineIsNull() {
            addCriterion("punching_press_machine is null");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineIsNotNull() {
            addCriterion("punching_press_machine is not null");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineEqualTo(String value) {
            addCriterion("punching_press_machine =", value, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineNotEqualTo(String value) {
            addCriterion("punching_press_machine <>", value, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineGreaterThan(String value) {
            addCriterion("punching_press_machine >", value, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineGreaterThanOrEqualTo(String value) {
            addCriterion("punching_press_machine >=", value, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineLessThan(String value) {
            addCriterion("punching_press_machine <", value, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineLessThanOrEqualTo(String value) {
            addCriterion("punching_press_machine <=", value, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineLike(String value) {
            addCriterion("punching_press_machine like", value, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineNotLike(String value) {
            addCriterion("punching_press_machine not like", value, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineIn(List<String> values) {
            addCriterion("punching_press_machine in", values, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineNotIn(List<String> values) {
            addCriterion("punching_press_machine not in", values, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineBetween(String value1, String value2) {
            addCriterion("punching_press_machine between", value1, value2, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineNotBetween(String value1, String value2) {
            addCriterion("punching_press_machine not between", value1, value2, "punchingPressMachine");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmIsNull() {
            addCriterion("punching_press_machine_dm is null");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmIsNotNull() {
            addCriterion("punching_press_machine_dm is not null");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmEqualTo(String value) {
            addCriterion("punching_press_machine_dm =", value, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmNotEqualTo(String value) {
            addCriterion("punching_press_machine_dm <>", value, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmGreaterThan(String value) {
            addCriterion("punching_press_machine_dm >", value, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmGreaterThanOrEqualTo(String value) {
            addCriterion("punching_press_machine_dm >=", value, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmLessThan(String value) {
            addCriterion("punching_press_machine_dm <", value, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmLessThanOrEqualTo(String value) {
            addCriterion("punching_press_machine_dm <=", value, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmLike(String value) {
            addCriterion("punching_press_machine_dm like", value, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmNotLike(String value) {
            addCriterion("punching_press_machine_dm not like", value, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmIn(List<String> values) {
            addCriterion("punching_press_machine_dm in", values, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmNotIn(List<String> values) {
            addCriterion("punching_press_machine_dm not in", values, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmBetween(String value1, String value2) {
            addCriterion("punching_press_machine_dm between", value1, value2, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andPunchingPressMachineDmNotBetween(String value1, String value2) {
            addCriterion("punching_press_machine_dm not between", value1, value2, "punchingPressMachineDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmIsNull() {
            addCriterion("dangerous_equipment_type_other_dm is null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmIsNotNull() {
            addCriterion("dangerous_equipment_type_other_dm is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmEqualTo(String value) {
            addCriterion("dangerous_equipment_type_other_dm =", value, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmNotEqualTo(String value) {
            addCriterion("dangerous_equipment_type_other_dm <>", value, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmGreaterThan(String value) {
            addCriterion("dangerous_equipment_type_other_dm >", value, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type_other_dm >=", value, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmLessThan(String value) {
            addCriterion("dangerous_equipment_type_other_dm <", value, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmLessThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type_other_dm <=", value, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmLike(String value) {
            addCriterion("dangerous_equipment_type_other_dm like", value, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmNotLike(String value) {
            addCriterion("dangerous_equipment_type_other_dm not like", value, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmIn(List<String> values) {
            addCriterion("dangerous_equipment_type_other_dm in", values, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmNotIn(List<String> values) {
            addCriterion("dangerous_equipment_type_other_dm not in", values, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type_other_dm between", value1, value2, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherDmNotBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type_other_dm not between", value1, value2, "dangerousEquipmentTypeOtherDm");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherIsNull() {
            addCriterion("dangerous_equipment_type_other is null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherIsNotNull() {
            addCriterion("dangerous_equipment_type_other is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherEqualTo(String value) {
            addCriterion("dangerous_equipment_type_other =", value, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherNotEqualTo(String value) {
            addCriterion("dangerous_equipment_type_other <>", value, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherGreaterThan(String value) {
            addCriterion("dangerous_equipment_type_other >", value, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type_other >=", value, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherLessThan(String value) {
            addCriterion("dangerous_equipment_type_other <", value, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherLessThanOrEqualTo(String value) {
            addCriterion("dangerous_equipment_type_other <=", value, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherLike(String value) {
            addCriterion("dangerous_equipment_type_other like", value, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherNotLike(String value) {
            addCriterion("dangerous_equipment_type_other not like", value, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherIn(List<String> values) {
            addCriterion("dangerous_equipment_type_other in", values, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherNotIn(List<String> values) {
            addCriterion("dangerous_equipment_type_other not in", values, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type_other between", value1, value2, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andDangerousEquipmentTypeOtherNotBetween(String value1, String value2) {
            addCriterion("dangerous_equipment_type_other not between", value1, value2, "dangerousEquipmentTypeOther");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmIsNull() {
            addCriterion("finite_space_dm is null");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmIsNotNull() {
            addCriterion("finite_space_dm is not null");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmEqualTo(String value) {
            addCriterion("finite_space_dm =", value, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmNotEqualTo(String value) {
            addCriterion("finite_space_dm <>", value, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmGreaterThan(String value) {
            addCriterion("finite_space_dm >", value, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmGreaterThanOrEqualTo(String value) {
            addCriterion("finite_space_dm >=", value, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmLessThan(String value) {
            addCriterion("finite_space_dm <", value, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmLessThanOrEqualTo(String value) {
            addCriterion("finite_space_dm <=", value, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmLike(String value) {
            addCriterion("finite_space_dm like", value, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmNotLike(String value) {
            addCriterion("finite_space_dm not like", value, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmIn(List<String> values) {
            addCriterion("finite_space_dm in", values, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmNotIn(List<String> values) {
            addCriterion("finite_space_dm not in", values, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmBetween(String value1, String value2) {
            addCriterion("finite_space_dm between", value1, value2, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceDmNotBetween(String value1, String value2) {
            addCriterion("finite_space_dm not between", value1, value2, "finiteSpaceDm");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceIsNull() {
            addCriterion("finite_space is null");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceIsNotNull() {
            addCriterion("finite_space is not null");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceEqualTo(String value) {
            addCriterion("finite_space =", value, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceNotEqualTo(String value) {
            addCriterion("finite_space <>", value, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceGreaterThan(String value) {
            addCriterion("finite_space >", value, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("finite_space >=", value, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceLessThan(String value) {
            addCriterion("finite_space <", value, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceLessThanOrEqualTo(String value) {
            addCriterion("finite_space <=", value, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceLike(String value) {
            addCriterion("finite_space like", value, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceNotLike(String value) {
            addCriterion("finite_space not like", value, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceIn(List<String> values) {
            addCriterion("finite_space in", values, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceNotIn(List<String> values) {
            addCriterion("finite_space not in", values, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceBetween(String value1, String value2) {
            addCriterion("finite_space between", value1, value2, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andFiniteSpaceNotBetween(String value1, String value2) {
            addCriterion("finite_space not between", value1, value2, "finiteSpace");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmIsNull() {
            addCriterion("ammonia_refrigeration_dm is null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmIsNotNull() {
            addCriterion("ammonia_refrigeration_dm is not null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmEqualTo(String value) {
            addCriterion("ammonia_refrigeration_dm =", value, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmNotEqualTo(String value) {
            addCriterion("ammonia_refrigeration_dm <>", value, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmGreaterThan(String value) {
            addCriterion("ammonia_refrigeration_dm >", value, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmGreaterThanOrEqualTo(String value) {
            addCriterion("ammonia_refrigeration_dm >=", value, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmLessThan(String value) {
            addCriterion("ammonia_refrigeration_dm <", value, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmLessThanOrEqualTo(String value) {
            addCriterion("ammonia_refrigeration_dm <=", value, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmLike(String value) {
            addCriterion("ammonia_refrigeration_dm like", value, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmNotLike(String value) {
            addCriterion("ammonia_refrigeration_dm not like", value, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmIn(List<String> values) {
            addCriterion("ammonia_refrigeration_dm in", values, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmNotIn(List<String> values) {
            addCriterion("ammonia_refrigeration_dm not in", values, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmBetween(String value1, String value2) {
            addCriterion("ammonia_refrigeration_dm between", value1, value2, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationDmNotBetween(String value1, String value2) {
            addCriterion("ammonia_refrigeration_dm not between", value1, value2, "ammoniaRefrigerationDm");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationIsNull() {
            addCriterion("ammonia_refrigeration is null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationIsNotNull() {
            addCriterion("ammonia_refrigeration is not null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationEqualTo(String value) {
            addCriterion("ammonia_refrigeration =", value, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationNotEqualTo(String value) {
            addCriterion("ammonia_refrigeration <>", value, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationGreaterThan(String value) {
            addCriterion("ammonia_refrigeration >", value, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationGreaterThanOrEqualTo(String value) {
            addCriterion("ammonia_refrigeration >=", value, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationLessThan(String value) {
            addCriterion("ammonia_refrigeration <", value, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationLessThanOrEqualTo(String value) {
            addCriterion("ammonia_refrigeration <=", value, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationLike(String value) {
            addCriterion("ammonia_refrigeration like", value, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationNotLike(String value) {
            addCriterion("ammonia_refrigeration not like", value, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationIn(List<String> values) {
            addCriterion("ammonia_refrigeration in", values, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationNotIn(List<String> values) {
            addCriterion("ammonia_refrigeration not in", values, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationBetween(String value1, String value2) {
            addCriterion("ammonia_refrigeration between", value1, value2, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andAmmoniaRefrigerationNotBetween(String value1, String value2) {
            addCriterion("ammonia_refrigeration not between", value1, value2, "ammoniaRefrigeration");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmIsNull() {
            addCriterion("drying_room_dm is null");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmIsNotNull() {
            addCriterion("drying_room_dm is not null");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmEqualTo(String value) {
            addCriterion("drying_room_dm =", value, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmNotEqualTo(String value) {
            addCriterion("drying_room_dm <>", value, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmGreaterThan(String value) {
            addCriterion("drying_room_dm >", value, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmGreaterThanOrEqualTo(String value) {
            addCriterion("drying_room_dm >=", value, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmLessThan(String value) {
            addCriterion("drying_room_dm <", value, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmLessThanOrEqualTo(String value) {
            addCriterion("drying_room_dm <=", value, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmLike(String value) {
            addCriterion("drying_room_dm like", value, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmNotLike(String value) {
            addCriterion("drying_room_dm not like", value, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmIn(List<String> values) {
            addCriterion("drying_room_dm in", values, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmNotIn(List<String> values) {
            addCriterion("drying_room_dm not in", values, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmBetween(String value1, String value2) {
            addCriterion("drying_room_dm between", value1, value2, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomDmNotBetween(String value1, String value2) {
            addCriterion("drying_room_dm not between", value1, value2, "dryingRoomDm");
            return (Criteria) this;
        }

        public Criteria andDryingRoomIsNull() {
            addCriterion("drying_room is null");
            return (Criteria) this;
        }

        public Criteria andDryingRoomIsNotNull() {
            addCriterion("drying_room is not null");
            return (Criteria) this;
        }

        public Criteria andDryingRoomEqualTo(String value) {
            addCriterion("drying_room =", value, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andDryingRoomNotEqualTo(String value) {
            addCriterion("drying_room <>", value, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andDryingRoomGreaterThan(String value) {
            addCriterion("drying_room >", value, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andDryingRoomGreaterThanOrEqualTo(String value) {
            addCriterion("drying_room >=", value, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andDryingRoomLessThan(String value) {
            addCriterion("drying_room <", value, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andDryingRoomLessThanOrEqualTo(String value) {
            addCriterion("drying_room <=", value, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andDryingRoomLike(String value) {
            addCriterion("drying_room like", value, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andDryingRoomNotLike(String value) {
            addCriterion("drying_room not like", value, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andDryingRoomIn(List<String> values) {
            addCriterion("drying_room in", values, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andDryingRoomNotIn(List<String> values) {
            addCriterion("drying_room not in", values, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andDryingRoomBetween(String value1, String value2) {
            addCriterion("drying_room between", value1, value2, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andDryingRoomNotBetween(String value1, String value2) {
            addCriterion("drying_room not between", value1, value2, "dryingRoom");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmIsNull() {
            addCriterion("clean_workshop_dm is null");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmIsNotNull() {
            addCriterion("clean_workshop_dm is not null");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmEqualTo(String value) {
            addCriterion("clean_workshop_dm =", value, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmNotEqualTo(String value) {
            addCriterion("clean_workshop_dm <>", value, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmGreaterThan(String value) {
            addCriterion("clean_workshop_dm >", value, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmGreaterThanOrEqualTo(String value) {
            addCriterion("clean_workshop_dm >=", value, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmLessThan(String value) {
            addCriterion("clean_workshop_dm <", value, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmLessThanOrEqualTo(String value) {
            addCriterion("clean_workshop_dm <=", value, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmLike(String value) {
            addCriterion("clean_workshop_dm like", value, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmNotLike(String value) {
            addCriterion("clean_workshop_dm not like", value, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmIn(List<String> values) {
            addCriterion("clean_workshop_dm in", values, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmNotIn(List<String> values) {
            addCriterion("clean_workshop_dm not in", values, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmBetween(String value1, String value2) {
            addCriterion("clean_workshop_dm between", value1, value2, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopDmNotBetween(String value1, String value2) {
            addCriterion("clean_workshop_dm not between", value1, value2, "cleanWorkshopDm");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopIsNull() {
            addCriterion("clean_workshop is null");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopIsNotNull() {
            addCriterion("clean_workshop is not null");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopEqualTo(String value) {
            addCriterion("clean_workshop =", value, "cleanWorkshop");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopNotEqualTo(String value) {
            addCriterion("clean_workshop <>", value, "cleanWorkshop");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopGreaterThan(String value) {
            addCriterion("clean_workshop >", value, "cleanWorkshop");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopGreaterThanOrEqualTo(String value) {
            addCriterion("clean_workshop >=", value, "cleanWorkshop");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopLessThan(String value) {
            addCriterion("clean_workshop <", value, "cleanWorkshop");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopLessThanOrEqualTo(String value) {
            addCriterion("clean_workshop <=", value, "cleanWorkshop");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopLike(String value) {
            addCriterion("clean_workshop like", value, "cleanWorkshop");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopNotLike(String value) {
            addCriterion("clean_workshop not like", value, "cleanWorkshop");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopIn(List<String> values) {
            addCriterion("clean_workshop in", values, "cleanWorkshop");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopNotIn(List<String> values) {
            addCriterion("clean_workshop not in", values, "cleanWorkshop");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopBetween(String value1, String value2) {
            addCriterion("clean_workshop between", value1, value2, "cleanWorkshop");
            return (Criteria) this;
        }

        public Criteria andCleanWorkshopNotBetween(String value1, String value2) {
            addCriterion("clean_workshop not between", value1, value2, "cleanWorkshop");
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