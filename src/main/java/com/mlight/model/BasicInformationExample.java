package com.mlight.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasicInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicInformationExample() {
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

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andAreaDmIsNull() {
            addCriterion("area_dm is null");
            return (Criteria) this;
        }

        public Criteria andAreaDmIsNotNull() {
            addCriterion("area_dm is not null");
            return (Criteria) this;
        }

        public Criteria andAreaDmEqualTo(String value) {
            addCriterion("area_dm =", value, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaDmNotEqualTo(String value) {
            addCriterion("area_dm <>", value, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaDmGreaterThan(String value) {
            addCriterion("area_dm >", value, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaDmGreaterThanOrEqualTo(String value) {
            addCriterion("area_dm >=", value, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaDmLessThan(String value) {
            addCriterion("area_dm <", value, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaDmLessThanOrEqualTo(String value) {
            addCriterion("area_dm <=", value, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaDmLike(String value) {
            addCriterion("area_dm like", value, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaDmNotLike(String value) {
            addCriterion("area_dm not like", value, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaDmIn(List<String> values) {
            addCriterion("area_dm in", values, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaDmNotIn(List<String> values) {
            addCriterion("area_dm not in", values, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaDmBetween(String value1, String value2) {
            addCriterion("area_dm between", value1, value2, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaDmNotBetween(String value1, String value2) {
            addCriterion("area_dm not between", value1, value2, "areaDm");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andProductionAddressIsNull() {
            addCriterion("production_address is null");
            return (Criteria) this;
        }

        public Criteria andProductionAddressIsNotNull() {
            addCriterion("production_address is not null");
            return (Criteria) this;
        }

        public Criteria andProductionAddressEqualTo(String value) {
            addCriterion("production_address =", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressNotEqualTo(String value) {
            addCriterion("production_address <>", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressGreaterThan(String value) {
            addCriterion("production_address >", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressGreaterThanOrEqualTo(String value) {
            addCriterion("production_address >=", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressLessThan(String value) {
            addCriterion("production_address <", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressLessThanOrEqualTo(String value) {
            addCriterion("production_address <=", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressLike(String value) {
            addCriterion("production_address like", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressNotLike(String value) {
            addCriterion("production_address not like", value, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressIn(List<String> values) {
            addCriterion("production_address in", values, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressNotIn(List<String> values) {
            addCriterion("production_address not in", values, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressBetween(String value1, String value2) {
            addCriterion("production_address between", value1, value2, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andProductionAddressNotBetween(String value1, String value2) {
            addCriterion("production_address not between", value1, value2, "productionAddress");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmIsNull() {
            addCriterion("area_property_dm is null");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmIsNotNull() {
            addCriterion("area_property_dm is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmEqualTo(String value) {
            addCriterion("area_property_dm =", value, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmNotEqualTo(String value) {
            addCriterion("area_property_dm <>", value, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmGreaterThan(String value) {
            addCriterion("area_property_dm >", value, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmGreaterThanOrEqualTo(String value) {
            addCriterion("area_property_dm >=", value, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmLessThan(String value) {
            addCriterion("area_property_dm <", value, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmLessThanOrEqualTo(String value) {
            addCriterion("area_property_dm <=", value, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmLike(String value) {
            addCriterion("area_property_dm like", value, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmNotLike(String value) {
            addCriterion("area_property_dm not like", value, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmIn(List<String> values) {
            addCriterion("area_property_dm in", values, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmNotIn(List<String> values) {
            addCriterion("area_property_dm not in", values, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmBetween(String value1, String value2) {
            addCriterion("area_property_dm between", value1, value2, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyDmNotBetween(String value1, String value2) {
            addCriterion("area_property_dm not between", value1, value2, "areaPropertyDm");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyIsNull() {
            addCriterion("area_property is null");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyIsNotNull() {
            addCriterion("area_property is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyEqualTo(String value) {
            addCriterion("area_property =", value, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyNotEqualTo(String value) {
            addCriterion("area_property <>", value, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyGreaterThan(String value) {
            addCriterion("area_property >", value, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("area_property >=", value, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyLessThan(String value) {
            addCriterion("area_property <", value, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyLessThanOrEqualTo(String value) {
            addCriterion("area_property <=", value, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyLike(String value) {
            addCriterion("area_property like", value, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyNotLike(String value) {
            addCriterion("area_property not like", value, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyIn(List<String> values) {
            addCriterion("area_property in", values, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyNotIn(List<String> values) {
            addCriterion("area_property not in", values, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyBetween(String value1, String value2) {
            addCriterion("area_property between", value1, value2, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andAreaPropertyNotBetween(String value1, String value2) {
            addCriterion("area_property not between", value1, value2, "areaProperty");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNull() {
            addCriterion("legal_representative is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNotNull() {
            addCriterion("legal_representative is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeEqualTo(String value) {
            addCriterion("legal_representative =", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotEqualTo(String value) {
            addCriterion("legal_representative <>", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThan(String value) {
            addCriterion("legal_representative >", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative >=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThan(String value) {
            addCriterion("legal_representative <", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThanOrEqualTo(String value) {
            addCriterion("legal_representative <=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLike(String value) {
            addCriterion("legal_representative like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotLike(String value) {
            addCriterion("legal_representative not like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIn(List<String> values) {
            addCriterion("legal_representative in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotIn(List<String> values) {
            addCriterion("legal_representative not in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeBetween(String value1, String value2) {
            addCriterion("legal_representative between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotBetween(String value1, String value2) {
            addCriterion("legal_representative not between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneIsNull() {
            addCriterion("legal_representative_phone is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneIsNotNull() {
            addCriterion("legal_representative_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneEqualTo(String value) {
            addCriterion("legal_representative_phone =", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotEqualTo(String value) {
            addCriterion("legal_representative_phone <>", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneGreaterThan(String value) {
            addCriterion("legal_representative_phone >", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_phone >=", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneLessThan(String value) {
            addCriterion("legal_representative_phone <", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_phone <=", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneLike(String value) {
            addCriterion("legal_representative_phone like", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotLike(String value) {
            addCriterion("legal_representative_phone not like", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneIn(List<String> values) {
            addCriterion("legal_representative_phone in", values, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotIn(List<String> values) {
            addCriterion("legal_representative_phone not in", values, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneBetween(String value1, String value2) {
            addCriterion("legal_representative_phone between", value1, value2, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotBetween(String value1, String value2) {
            addCriterion("legal_representative_phone not between", value1, value2, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerIsNull() {
            addCriterion("security_officer is null");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerIsNotNull() {
            addCriterion("security_officer is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerEqualTo(String value) {
            addCriterion("security_officer =", value, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerNotEqualTo(String value) {
            addCriterion("security_officer <>", value, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerGreaterThan(String value) {
            addCriterion("security_officer >", value, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerGreaterThanOrEqualTo(String value) {
            addCriterion("security_officer >=", value, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerLessThan(String value) {
            addCriterion("security_officer <", value, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerLessThanOrEqualTo(String value) {
            addCriterion("security_officer <=", value, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerLike(String value) {
            addCriterion("security_officer like", value, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerNotLike(String value) {
            addCriterion("security_officer not like", value, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerIn(List<String> values) {
            addCriterion("security_officer in", values, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerNotIn(List<String> values) {
            addCriterion("security_officer not in", values, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerBetween(String value1, String value2) {
            addCriterion("security_officer between", value1, value2, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerNotBetween(String value1, String value2) {
            addCriterion("security_officer not between", value1, value2, "securityOfficer");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneIsNull() {
            addCriterion("security_officer_phone is null");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneIsNotNull() {
            addCriterion("security_officer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneEqualTo(String value) {
            addCriterion("security_officer_phone =", value, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneNotEqualTo(String value) {
            addCriterion("security_officer_phone <>", value, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneGreaterThan(String value) {
            addCriterion("security_officer_phone >", value, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("security_officer_phone >=", value, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneLessThan(String value) {
            addCriterion("security_officer_phone <", value, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneLessThanOrEqualTo(String value) {
            addCriterion("security_officer_phone <=", value, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneLike(String value) {
            addCriterion("security_officer_phone like", value, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneNotLike(String value) {
            addCriterion("security_officer_phone not like", value, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneIn(List<String> values) {
            addCriterion("security_officer_phone in", values, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneNotIn(List<String> values) {
            addCriterion("security_officer_phone not in", values, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneBetween(String value1, String value2) {
            addCriterion("security_officer_phone between", value1, value2, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityOfficerPhoneNotBetween(String value1, String value2) {
            addCriterion("security_officer_phone not between", value1, value2, "securityOfficerPhone");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNull() {
            addCriterion("establish_date is null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNotNull() {
            addCriterion("establish_date is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateEqualTo(Date value) {
            addCriterion("establish_date =", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotEqualTo(Date value) {
            addCriterion("establish_date <>", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThan(Date value) {
            addCriterion("establish_date >", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("establish_date >=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThan(Date value) {
            addCriterion("establish_date <", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThanOrEqualTo(Date value) {
            addCriterion("establish_date <=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIn(List<Date> values) {
            addCriterion("establish_date in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotIn(List<Date> values) {
            addCriterion("establish_date not in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateBetween(Date value1, Date value2) {
            addCriterion("establish_date between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotBetween(Date value1, Date value2) {
            addCriterion("establish_date not between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(String value) {
            addCriterion("registered_capital =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(String value) {
            addCriterion("registered_capital <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(String value) {
            addCriterion("registered_capital >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("registered_capital >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(String value) {
            addCriterion("registered_capital <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(String value) {
            addCriterion("registered_capital <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLike(String value) {
            addCriterion("registered_capital like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotLike(String value) {
            addCriterion("registered_capital not like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<String> values) {
            addCriterion("registered_capital in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<String> values) {
            addCriterion("registered_capital not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(String value1, String value2) {
            addCriterion("registered_capital between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(String value1, String value2) {
            addCriterion("registered_capital not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmIsNull() {
            addCriterion("economic_type_dm is null");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmIsNotNull() {
            addCriterion("economic_type_dm is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmEqualTo(String value) {
            addCriterion("economic_type_dm =", value, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmNotEqualTo(String value) {
            addCriterion("economic_type_dm <>", value, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmGreaterThan(String value) {
            addCriterion("economic_type_dm >", value, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmGreaterThanOrEqualTo(String value) {
            addCriterion("economic_type_dm >=", value, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmLessThan(String value) {
            addCriterion("economic_type_dm <", value, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmLessThanOrEqualTo(String value) {
            addCriterion("economic_type_dm <=", value, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmLike(String value) {
            addCriterion("economic_type_dm like", value, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmNotLike(String value) {
            addCriterion("economic_type_dm not like", value, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmIn(List<String> values) {
            addCriterion("economic_type_dm in", values, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmNotIn(List<String> values) {
            addCriterion("economic_type_dm not in", values, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmBetween(String value1, String value2) {
            addCriterion("economic_type_dm between", value1, value2, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeDmNotBetween(String value1, String value2) {
            addCriterion("economic_type_dm not between", value1, value2, "economicTypeDm");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeIsNull() {
            addCriterion("economic_type is null");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeIsNotNull() {
            addCriterion("economic_type is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeEqualTo(String value) {
            addCriterion("economic_type =", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeNotEqualTo(String value) {
            addCriterion("economic_type <>", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeGreaterThan(String value) {
            addCriterion("economic_type >", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("economic_type >=", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeLessThan(String value) {
            addCriterion("economic_type <", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeLessThanOrEqualTo(String value) {
            addCriterion("economic_type <=", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeLike(String value) {
            addCriterion("economic_type like", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeNotLike(String value) {
            addCriterion("economic_type not like", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeIn(List<String> values) {
            addCriterion("economic_type in", values, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeNotIn(List<String> values) {
            addCriterion("economic_type not in", values, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeBetween(String value1, String value2) {
            addCriterion("economic_type between", value1, value2, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeNotBetween(String value1, String value2) {
            addCriterion("economic_type not between", value1, value2, "economicType");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginIsNull() {
            addCriterion("operation_period_begin is null");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginIsNotNull() {
            addCriterion("operation_period_begin is not null");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginEqualTo(Date value) {
            addCriterion("operation_period_begin =", value, "operationPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginNotEqualTo(Date value) {
            addCriterion("operation_period_begin <>", value, "operationPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginGreaterThan(Date value) {
            addCriterion("operation_period_begin >", value, "operationPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("operation_period_begin >=", value, "operationPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginLessThan(Date value) {
            addCriterion("operation_period_begin <", value, "operationPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginLessThanOrEqualTo(Date value) {
            addCriterion("operation_period_begin <=", value, "operationPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginIn(List<Date> values) {
            addCriterion("operation_period_begin in", values, "operationPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginNotIn(List<Date> values) {
            addCriterion("operation_period_begin not in", values, "operationPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginBetween(Date value1, Date value2) {
            addCriterion("operation_period_begin between", value1, value2, "operationPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodBeginNotBetween(Date value1, Date value2) {
            addCriterion("operation_period_begin not between", value1, value2, "operationPeriodBegin");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndIsNull() {
            addCriterion("operation_period_end is null");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndIsNotNull() {
            addCriterion("operation_period_end is not null");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndEqualTo(Date value) {
            addCriterion("operation_period_end =", value, "operationPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndNotEqualTo(Date value) {
            addCriterion("operation_period_end <>", value, "operationPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndGreaterThan(Date value) {
            addCriterion("operation_period_end >", value, "operationPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndGreaterThanOrEqualTo(Date value) {
            addCriterion("operation_period_end >=", value, "operationPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndLessThan(Date value) {
            addCriterion("operation_period_end <", value, "operationPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndLessThanOrEqualTo(Date value) {
            addCriterion("operation_period_end <=", value, "operationPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndIn(List<Date> values) {
            addCriterion("operation_period_end in", values, "operationPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndNotIn(List<Date> values) {
            addCriterion("operation_period_end not in", values, "operationPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndBetween(Date value1, Date value2) {
            addCriterion("operation_period_end between", value1, value2, "operationPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andOperationPeriodEndNotBetween(Date value1, Date value2) {
            addCriterion("operation_period_end not between", value1, value2, "operationPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationIsNull() {
            addCriterion("scope_of_operation is null");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationIsNotNull() {
            addCriterion("scope_of_operation is not null");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationEqualTo(String value) {
            addCriterion("scope_of_operation =", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationNotEqualTo(String value) {
            addCriterion("scope_of_operation <>", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationGreaterThan(String value) {
            addCriterion("scope_of_operation >", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationGreaterThanOrEqualTo(String value) {
            addCriterion("scope_of_operation >=", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationLessThan(String value) {
            addCriterion("scope_of_operation <", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationLessThanOrEqualTo(String value) {
            addCriterion("scope_of_operation <=", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationLike(String value) {
            addCriterion("scope_of_operation like", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationNotLike(String value) {
            addCriterion("scope_of_operation not like", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationIn(List<String> values) {
            addCriterion("scope_of_operation in", values, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationNotIn(List<String> values) {
            addCriterion("scope_of_operation not in", values, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationBetween(String value1, String value2) {
            addCriterion("scope_of_operation between", value1, value2, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationNotBetween(String value1, String value2) {
            addCriterion("scope_of_operation not between", value1, value2, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmIsNull() {
            addCriterion("industry_nature_dm is null");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmIsNotNull() {
            addCriterion("industry_nature_dm is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmEqualTo(String value) {
            addCriterion("industry_nature_dm =", value, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmNotEqualTo(String value) {
            addCriterion("industry_nature_dm <>", value, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmGreaterThan(String value) {
            addCriterion("industry_nature_dm >", value, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmGreaterThanOrEqualTo(String value) {
            addCriterion("industry_nature_dm >=", value, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmLessThan(String value) {
            addCriterion("industry_nature_dm <", value, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmLessThanOrEqualTo(String value) {
            addCriterion("industry_nature_dm <=", value, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmLike(String value) {
            addCriterion("industry_nature_dm like", value, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmNotLike(String value) {
            addCriterion("industry_nature_dm not like", value, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmIn(List<String> values) {
            addCriterion("industry_nature_dm in", values, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmNotIn(List<String> values) {
            addCriterion("industry_nature_dm not in", values, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmBetween(String value1, String value2) {
            addCriterion("industry_nature_dm between", value1, value2, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureDmNotBetween(String value1, String value2) {
            addCriterion("industry_nature_dm not between", value1, value2, "industryNatureDm");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureIsNull() {
            addCriterion("industry_nature is null");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureIsNotNull() {
            addCriterion("industry_nature is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureEqualTo(String value) {
            addCriterion("industry_nature =", value, "industryNature");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureNotEqualTo(String value) {
            addCriterion("industry_nature <>", value, "industryNature");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureGreaterThan(String value) {
            addCriterion("industry_nature >", value, "industryNature");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureGreaterThanOrEqualTo(String value) {
            addCriterion("industry_nature >=", value, "industryNature");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureLessThan(String value) {
            addCriterion("industry_nature <", value, "industryNature");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureLessThanOrEqualTo(String value) {
            addCriterion("industry_nature <=", value, "industryNature");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureLike(String value) {
            addCriterion("industry_nature like", value, "industryNature");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureNotLike(String value) {
            addCriterion("industry_nature not like", value, "industryNature");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureIn(List<String> values) {
            addCriterion("industry_nature in", values, "industryNature");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureNotIn(List<String> values) {
            addCriterion("industry_nature not in", values, "industryNature");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureBetween(String value1, String value2) {
            addCriterion("industry_nature between", value1, value2, "industryNature");
            return (Criteria) this;
        }

        public Criteria andIndustryNatureNotBetween(String value1, String value2) {
            addCriterion("industry_nature not between", value1, value2, "industryNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmIsNull() {
            addCriterion("enterprise_scale_dm is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmIsNotNull() {
            addCriterion("enterprise_scale_dm is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmEqualTo(String value) {
            addCriterion("enterprise_scale_dm =", value, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmNotEqualTo(String value) {
            addCriterion("enterprise_scale_dm <>", value, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmGreaterThan(String value) {
            addCriterion("enterprise_scale_dm >", value, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_scale_dm >=", value, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmLessThan(String value) {
            addCriterion("enterprise_scale_dm <", value, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmLessThanOrEqualTo(String value) {
            addCriterion("enterprise_scale_dm <=", value, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmLike(String value) {
            addCriterion("enterprise_scale_dm like", value, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmNotLike(String value) {
            addCriterion("enterprise_scale_dm not like", value, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmIn(List<String> values) {
            addCriterion("enterprise_scale_dm in", values, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmNotIn(List<String> values) {
            addCriterion("enterprise_scale_dm not in", values, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmBetween(String value1, String value2) {
            addCriterion("enterprise_scale_dm between", value1, value2, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleDmNotBetween(String value1, String value2) {
            addCriterion("enterprise_scale_dm not between", value1, value2, "enterpriseScaleDm");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleIsNull() {
            addCriterion("enterprise_scale is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleIsNotNull() {
            addCriterion("enterprise_scale is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleEqualTo(String value) {
            addCriterion("enterprise_scale =", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleNotEqualTo(String value) {
            addCriterion("enterprise_scale <>", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleGreaterThan(String value) {
            addCriterion("enterprise_scale >", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_scale >=", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleLessThan(String value) {
            addCriterion("enterprise_scale <", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleLessThanOrEqualTo(String value) {
            addCriterion("enterprise_scale <=", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleLike(String value) {
            addCriterion("enterprise_scale like", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleNotLike(String value) {
            addCriterion("enterprise_scale not like", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleIn(List<String> values) {
            addCriterion("enterprise_scale in", values, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleNotIn(List<String> values) {
            addCriterion("enterprise_scale not in", values, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleBetween(String value1, String value2) {
            addCriterion("enterprise_scale between", value1, value2, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleNotBetween(String value1, String value2) {
            addCriterion("enterprise_scale not between", value1, value2, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaIsNull() {
            addCriterion("covering_area is null");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaIsNotNull() {
            addCriterion("covering_area is not null");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaEqualTo(String value) {
            addCriterion("covering_area =", value, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaNotEqualTo(String value) {
            addCriterion("covering_area <>", value, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaGreaterThan(String value) {
            addCriterion("covering_area >", value, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaGreaterThanOrEqualTo(String value) {
            addCriterion("covering_area >=", value, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaLessThan(String value) {
            addCriterion("covering_area <", value, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaLessThanOrEqualTo(String value) {
            addCriterion("covering_area <=", value, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaLike(String value) {
            addCriterion("covering_area like", value, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaNotLike(String value) {
            addCriterion("covering_area not like", value, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaIn(List<String> values) {
            addCriterion("covering_area in", values, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaNotIn(List<String> values) {
            addCriterion("covering_area not in", values, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaBetween(String value1, String value2) {
            addCriterion("covering_area between", value1, value2, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andCoveringAreaNotBetween(String value1, String value2) {
            addCriterion("covering_area not between", value1, value2, "coveringArea");
            return (Criteria) this;
        }

        public Criteria andMainMaterialIsNull() {
            addCriterion("main_material is null");
            return (Criteria) this;
        }

        public Criteria andMainMaterialIsNotNull() {
            addCriterion("main_material is not null");
            return (Criteria) this;
        }

        public Criteria andMainMaterialEqualTo(String value) {
            addCriterion("main_material =", value, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNotEqualTo(String value) {
            addCriterion("main_material <>", value, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainMaterialGreaterThan(String value) {
            addCriterion("main_material >", value, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("main_material >=", value, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainMaterialLessThan(String value) {
            addCriterion("main_material <", value, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainMaterialLessThanOrEqualTo(String value) {
            addCriterion("main_material <=", value, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainMaterialLike(String value) {
            addCriterion("main_material like", value, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNotLike(String value) {
            addCriterion("main_material not like", value, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainMaterialIn(List<String> values) {
            addCriterion("main_material in", values, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNotIn(List<String> values) {
            addCriterion("main_material not in", values, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainMaterialBetween(String value1, String value2) {
            addCriterion("main_material between", value1, value2, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainMaterialNotBetween(String value1, String value2) {
            addCriterion("main_material not between", value1, value2, "mainMaterial");
            return (Criteria) this;
        }

        public Criteria andMainProductIsNull() {
            addCriterion("main_product is null");
            return (Criteria) this;
        }

        public Criteria andMainProductIsNotNull() {
            addCriterion("main_product is not null");
            return (Criteria) this;
        }

        public Criteria andMainProductEqualTo(String value) {
            addCriterion("main_product =", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductNotEqualTo(String value) {
            addCriterion("main_product <>", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductGreaterThan(String value) {
            addCriterion("main_product >", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductGreaterThanOrEqualTo(String value) {
            addCriterion("main_product >=", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductLessThan(String value) {
            addCriterion("main_product <", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductLessThanOrEqualTo(String value) {
            addCriterion("main_product <=", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductLike(String value) {
            addCriterion("main_product like", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductNotLike(String value) {
            addCriterion("main_product not like", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductIn(List<String> values) {
            addCriterion("main_product in", values, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductNotIn(List<String> values) {
            addCriterion("main_product not in", values, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductBetween(String value1, String value2) {
            addCriterion("main_product between", value1, value2, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductNotBetween(String value1, String value2) {
            addCriterion("main_product not between", value1, value2, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffIsNull() {
            addCriterion("number_of_staff is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffIsNotNull() {
            addCriterion("number_of_staff is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffEqualTo(String value) {
            addCriterion("number_of_staff =", value, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffNotEqualTo(String value) {
            addCriterion("number_of_staff <>", value, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffGreaterThan(String value) {
            addCriterion("number_of_staff >", value, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffGreaterThanOrEqualTo(String value) {
            addCriterion("number_of_staff >=", value, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffLessThan(String value) {
            addCriterion("number_of_staff <", value, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffLessThanOrEqualTo(String value) {
            addCriterion("number_of_staff <=", value, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffLike(String value) {
            addCriterion("number_of_staff like", value, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffNotLike(String value) {
            addCriterion("number_of_staff not like", value, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffIn(List<String> values) {
            addCriterion("number_of_staff in", values, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffNotIn(List<String> values) {
            addCriterion("number_of_staff not in", values, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffBetween(String value1, String value2) {
            addCriterion("number_of_staff between", value1, value2, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andNumberOfStaffNotBetween(String value1, String value2) {
            addCriterion("number_of_staff not between", value1, value2, "numberOfStaff");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueIsNull() {
            addCriterion("annual_revenue is null");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueIsNotNull() {
            addCriterion("annual_revenue is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueEqualTo(String value) {
            addCriterion("annual_revenue =", value, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueNotEqualTo(String value) {
            addCriterion("annual_revenue <>", value, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueGreaterThan(String value) {
            addCriterion("annual_revenue >", value, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueGreaterThanOrEqualTo(String value) {
            addCriterion("annual_revenue >=", value, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueLessThan(String value) {
            addCriterion("annual_revenue <", value, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueLessThanOrEqualTo(String value) {
            addCriterion("annual_revenue <=", value, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueLike(String value) {
            addCriterion("annual_revenue like", value, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueNotLike(String value) {
            addCriterion("annual_revenue not like", value, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueIn(List<String> values) {
            addCriterion("annual_revenue in", values, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueNotIn(List<String> values) {
            addCriterion("annual_revenue not in", values, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueBetween(String value1, String value2) {
            addCriterion("annual_revenue between", value1, value2, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andAnnualRevenueNotBetween(String value1, String value2) {
            addCriterion("annual_revenue not between", value1, value2, "annualRevenue");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmIsNull() {
            addCriterion("safety_management_dm is null");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmIsNotNull() {
            addCriterion("safety_management_dm is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmEqualTo(String value) {
            addCriterion("safety_management_dm =", value, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmNotEqualTo(String value) {
            addCriterion("safety_management_dm <>", value, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmGreaterThan(String value) {
            addCriterion("safety_management_dm >", value, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmGreaterThanOrEqualTo(String value) {
            addCriterion("safety_management_dm >=", value, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmLessThan(String value) {
            addCriterion("safety_management_dm <", value, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmLessThanOrEqualTo(String value) {
            addCriterion("safety_management_dm <=", value, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmLike(String value) {
            addCriterion("safety_management_dm like", value, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmNotLike(String value) {
            addCriterion("safety_management_dm not like", value, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmIn(List<String> values) {
            addCriterion("safety_management_dm in", values, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmNotIn(List<String> values) {
            addCriterion("safety_management_dm not in", values, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmBetween(String value1, String value2) {
            addCriterion("safety_management_dm between", value1, value2, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementDmNotBetween(String value1, String value2) {
            addCriterion("safety_management_dm not between", value1, value2, "safetyManagementDm");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementIsNull() {
            addCriterion("safety_management is null");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementIsNotNull() {
            addCriterion("safety_management is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementEqualTo(String value) {
            addCriterion("safety_management =", value, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementNotEqualTo(String value) {
            addCriterion("safety_management <>", value, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementGreaterThan(String value) {
            addCriterion("safety_management >", value, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementGreaterThanOrEqualTo(String value) {
            addCriterion("safety_management >=", value, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementLessThan(String value) {
            addCriterion("safety_management <", value, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementLessThanOrEqualTo(String value) {
            addCriterion("safety_management <=", value, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementLike(String value) {
            addCriterion("safety_management like", value, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementNotLike(String value) {
            addCriterion("safety_management not like", value, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementIn(List<String> values) {
            addCriterion("safety_management in", values, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementNotIn(List<String> values) {
            addCriterion("safety_management not in", values, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementBetween(String value1, String value2) {
            addCriterion("safety_management between", value1, value2, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andSafetyManagementNotBetween(String value1, String value2) {
            addCriterion("safety_management not between", value1, value2, "safetyManagement");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoIsNull() {
            addCriterion("production_equipment_no is null");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoIsNotNull() {
            addCriterion("production_equipment_no is not null");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoEqualTo(String value) {
            addCriterion("production_equipment_no =", value, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoNotEqualTo(String value) {
            addCriterion("production_equipment_no <>", value, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoGreaterThan(String value) {
            addCriterion("production_equipment_no >", value, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoGreaterThanOrEqualTo(String value) {
            addCriterion("production_equipment_no >=", value, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoLessThan(String value) {
            addCriterion("production_equipment_no <", value, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoLessThanOrEqualTo(String value) {
            addCriterion("production_equipment_no <=", value, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoLike(String value) {
            addCriterion("production_equipment_no like", value, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoNotLike(String value) {
            addCriterion("production_equipment_no not like", value, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoIn(List<String> values) {
            addCriterion("production_equipment_no in", values, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoNotIn(List<String> values) {
            addCriterion("production_equipment_no not in", values, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoBetween(String value1, String value2) {
            addCriterion("production_equipment_no between", value1, value2, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andProductionEquipmentNoNotBetween(String value1, String value2) {
            addCriterion("production_equipment_no not between", value1, value2, "productionEquipmentNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoIsNull() {
            addCriterion("security_manager_no is null");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoIsNotNull() {
            addCriterion("security_manager_no is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoEqualTo(String value) {
            addCriterion("security_manager_no =", value, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoNotEqualTo(String value) {
            addCriterion("security_manager_no <>", value, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoGreaterThan(String value) {
            addCriterion("security_manager_no >", value, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoGreaterThanOrEqualTo(String value) {
            addCriterion("security_manager_no >=", value, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoLessThan(String value) {
            addCriterion("security_manager_no <", value, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoLessThanOrEqualTo(String value) {
            addCriterion("security_manager_no <=", value, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoLike(String value) {
            addCriterion("security_manager_no like", value, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoNotLike(String value) {
            addCriterion("security_manager_no not like", value, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoIn(List<String> values) {
            addCriterion("security_manager_no in", values, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoNotIn(List<String> values) {
            addCriterion("security_manager_no not in", values, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoBetween(String value1, String value2) {
            addCriterion("security_manager_no between", value1, value2, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNoNotBetween(String value1, String value2) {
            addCriterion("security_manager_no not between", value1, value2, "securityManagerNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoIsNull() {
            addCriterion("special_operator_no is null");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoIsNotNull() {
            addCriterion("special_operator_no is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoEqualTo(String value) {
            addCriterion("special_operator_no =", value, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoNotEqualTo(String value) {
            addCriterion("special_operator_no <>", value, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoGreaterThan(String value) {
            addCriterion("special_operator_no >", value, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoGreaterThanOrEqualTo(String value) {
            addCriterion("special_operator_no >=", value, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoLessThan(String value) {
            addCriterion("special_operator_no <", value, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoLessThanOrEqualTo(String value) {
            addCriterion("special_operator_no <=", value, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoLike(String value) {
            addCriterion("special_operator_no like", value, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoNotLike(String value) {
            addCriterion("special_operator_no not like", value, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoIn(List<String> values) {
            addCriterion("special_operator_no in", values, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoNotIn(List<String> values) {
            addCriterion("special_operator_no not in", values, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoBetween(String value1, String value2) {
            addCriterion("special_operator_no between", value1, value2, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSpecialOperatorNoNotBetween(String value1, String value2) {
            addCriterion("special_operator_no not between", value1, value2, "specialOperatorNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmIsNull() {
            addCriterion("safety_production_permit_dm is null");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmIsNotNull() {
            addCriterion("safety_production_permit_dm is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmEqualTo(String value) {
            addCriterion("safety_production_permit_dm =", value, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmNotEqualTo(String value) {
            addCriterion("safety_production_permit_dm <>", value, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmGreaterThan(String value) {
            addCriterion("safety_production_permit_dm >", value, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmGreaterThanOrEqualTo(String value) {
            addCriterion("safety_production_permit_dm >=", value, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmLessThan(String value) {
            addCriterion("safety_production_permit_dm <", value, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmLessThanOrEqualTo(String value) {
            addCriterion("safety_production_permit_dm <=", value, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmLike(String value) {
            addCriterion("safety_production_permit_dm like", value, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmNotLike(String value) {
            addCriterion("safety_production_permit_dm not like", value, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmIn(List<String> values) {
            addCriterion("safety_production_permit_dm in", values, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmNotIn(List<String> values) {
            addCriterion("safety_production_permit_dm not in", values, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmBetween(String value1, String value2) {
            addCriterion("safety_production_permit_dm between", value1, value2, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitDmNotBetween(String value1, String value2) {
            addCriterion("safety_production_permit_dm not between", value1, value2, "safetyProductionPermitDm");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitIsNull() {
            addCriterion("safety_production_permit is null");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitIsNotNull() {
            addCriterion("safety_production_permit is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEqualTo(String value) {
            addCriterion("safety_production_permit =", value, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNotEqualTo(String value) {
            addCriterion("safety_production_permit <>", value, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitGreaterThan(String value) {
            addCriterion("safety_production_permit >", value, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitGreaterThanOrEqualTo(String value) {
            addCriterion("safety_production_permit >=", value, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitLessThan(String value) {
            addCriterion("safety_production_permit <", value, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitLessThanOrEqualTo(String value) {
            addCriterion("safety_production_permit <=", value, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitLike(String value) {
            addCriterion("safety_production_permit like", value, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNotLike(String value) {
            addCriterion("safety_production_permit not like", value, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitIn(List<String> values) {
            addCriterion("safety_production_permit in", values, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNotIn(List<String> values) {
            addCriterion("safety_production_permit not in", values, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBetween(String value1, String value2) {
            addCriterion("safety_production_permit between", value1, value2, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNotBetween(String value1, String value2) {
            addCriterion("safety_production_permit not between", value1, value2, "safetyProductionPermit");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoIsNull() {
            addCriterion("safety_production_permit_no is null");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoIsNotNull() {
            addCriterion("safety_production_permit_no is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoEqualTo(String value) {
            addCriterion("safety_production_permit_no =", value, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoNotEqualTo(String value) {
            addCriterion("safety_production_permit_no <>", value, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoGreaterThan(String value) {
            addCriterion("safety_production_permit_no >", value, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoGreaterThanOrEqualTo(String value) {
            addCriterion("safety_production_permit_no >=", value, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoLessThan(String value) {
            addCriterion("safety_production_permit_no <", value, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoLessThanOrEqualTo(String value) {
            addCriterion("safety_production_permit_no <=", value, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoLike(String value) {
            addCriterion("safety_production_permit_no like", value, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoNotLike(String value) {
            addCriterion("safety_production_permit_no not like", value, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoIn(List<String> values) {
            addCriterion("safety_production_permit_no in", values, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoNotIn(List<String> values) {
            addCriterion("safety_production_permit_no not in", values, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoBetween(String value1, String value2) {
            addCriterion("safety_production_permit_no between", value1, value2, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitNoNotBetween(String value1, String value2) {
            addCriterion("safety_production_permit_no not between", value1, value2, "safetyProductionPermitNo");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginIsNull() {
            addCriterion("safety_production_permit_begin is null");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginIsNotNull() {
            addCriterion("safety_production_permit_begin is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginEqualTo(Date value) {
            addCriterion("safety_production_permit_begin =", value, "safetyProductionPermitBegin");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginNotEqualTo(Date value) {
            addCriterion("safety_production_permit_begin <>", value, "safetyProductionPermitBegin");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginGreaterThan(Date value) {
            addCriterion("safety_production_permit_begin >", value, "safetyProductionPermitBegin");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("safety_production_permit_begin >=", value, "safetyProductionPermitBegin");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginLessThan(Date value) {
            addCriterion("safety_production_permit_begin <", value, "safetyProductionPermitBegin");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginLessThanOrEqualTo(Date value) {
            addCriterion("safety_production_permit_begin <=", value, "safetyProductionPermitBegin");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginIn(List<Date> values) {
            addCriterion("safety_production_permit_begin in", values, "safetyProductionPermitBegin");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginNotIn(List<Date> values) {
            addCriterion("safety_production_permit_begin not in", values, "safetyProductionPermitBegin");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginBetween(Date value1, Date value2) {
            addCriterion("safety_production_permit_begin between", value1, value2, "safetyProductionPermitBegin");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitBeginNotBetween(Date value1, Date value2) {
            addCriterion("safety_production_permit_begin not between", value1, value2, "safetyProductionPermitBegin");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndIsNull() {
            addCriterion("safety_production_permit_end is null");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndIsNotNull() {
            addCriterion("safety_production_permit_end is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndEqualTo(Date value) {
            addCriterion("safety_production_permit_end =", value, "safetyProductionPermitEnd");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndNotEqualTo(Date value) {
            addCriterion("safety_production_permit_end <>", value, "safetyProductionPermitEnd");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndGreaterThan(Date value) {
            addCriterion("safety_production_permit_end >", value, "safetyProductionPermitEnd");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndGreaterThanOrEqualTo(Date value) {
            addCriterion("safety_production_permit_end >=", value, "safetyProductionPermitEnd");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndLessThan(Date value) {
            addCriterion("safety_production_permit_end <", value, "safetyProductionPermitEnd");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndLessThanOrEqualTo(Date value) {
            addCriterion("safety_production_permit_end <=", value, "safetyProductionPermitEnd");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndIn(List<Date> values) {
            addCriterion("safety_production_permit_end in", values, "safetyProductionPermitEnd");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndNotIn(List<Date> values) {
            addCriterion("safety_production_permit_end not in", values, "safetyProductionPermitEnd");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndBetween(Date value1, Date value2) {
            addCriterion("safety_production_permit_end between", value1, value2, "safetyProductionPermitEnd");
            return (Criteria) this;
        }

        public Criteria andSafetyProductionPermitEndNotBetween(Date value1, Date value2) {
            addCriterion("safety_production_permit_end not between", value1, value2, "safetyProductionPermitEnd");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmIsNull() {
            addCriterion("standardization_dm is null");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmIsNotNull() {
            addCriterion("standardization_dm is not null");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmEqualTo(String value) {
            addCriterion("standardization_dm =", value, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmNotEqualTo(String value) {
            addCriterion("standardization_dm <>", value, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmGreaterThan(String value) {
            addCriterion("standardization_dm >", value, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmGreaterThanOrEqualTo(String value) {
            addCriterion("standardization_dm >=", value, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmLessThan(String value) {
            addCriterion("standardization_dm <", value, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmLessThanOrEqualTo(String value) {
            addCriterion("standardization_dm <=", value, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmLike(String value) {
            addCriterion("standardization_dm like", value, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmNotLike(String value) {
            addCriterion("standardization_dm not like", value, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmIn(List<String> values) {
            addCriterion("standardization_dm in", values, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmNotIn(List<String> values) {
            addCriterion("standardization_dm not in", values, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmBetween(String value1, String value2) {
            addCriterion("standardization_dm between", value1, value2, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationDmNotBetween(String value1, String value2) {
            addCriterion("standardization_dm not between", value1, value2, "standardizationDm");
            return (Criteria) this;
        }

        public Criteria andStandardizationIsNull() {
            addCriterion("standardization is null");
            return (Criteria) this;
        }

        public Criteria andStandardizationIsNotNull() {
            addCriterion("standardization is not null");
            return (Criteria) this;
        }

        public Criteria andStandardizationEqualTo(String value) {
            addCriterion("standardization =", value, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationNotEqualTo(String value) {
            addCriterion("standardization <>", value, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationGreaterThan(String value) {
            addCriterion("standardization >", value, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationGreaterThanOrEqualTo(String value) {
            addCriterion("standardization >=", value, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationLessThan(String value) {
            addCriterion("standardization <", value, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationLessThanOrEqualTo(String value) {
            addCriterion("standardization <=", value, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationLike(String value) {
            addCriterion("standardization like", value, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationNotLike(String value) {
            addCriterion("standardization not like", value, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationIn(List<String> values) {
            addCriterion("standardization in", values, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationNotIn(List<String> values) {
            addCriterion("standardization not in", values, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationBetween(String value1, String value2) {
            addCriterion("standardization between", value1, value2, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationNotBetween(String value1, String value2) {
            addCriterion("standardization not between", value1, value2, "standardization");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoIsNull() {
            addCriterion("standardization_card_no is null");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoIsNotNull() {
            addCriterion("standardization_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoEqualTo(String value) {
            addCriterion("standardization_card_no =", value, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoNotEqualTo(String value) {
            addCriterion("standardization_card_no <>", value, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoGreaterThan(String value) {
            addCriterion("standardization_card_no >", value, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("standardization_card_no >=", value, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoLessThan(String value) {
            addCriterion("standardization_card_no <", value, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoLessThanOrEqualTo(String value) {
            addCriterion("standardization_card_no <=", value, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoLike(String value) {
            addCriterion("standardization_card_no like", value, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoNotLike(String value) {
            addCriterion("standardization_card_no not like", value, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoIn(List<String> values) {
            addCriterion("standardization_card_no in", values, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoNotIn(List<String> values) {
            addCriterion("standardization_card_no not in", values, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoBetween(String value1, String value2) {
            addCriterion("standardization_card_no between", value1, value2, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardNoNotBetween(String value1, String value2) {
            addCriterion("standardization_card_no not between", value1, value2, "standardizationCardNo");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateIsNull() {
            addCriterion("standardization_card_date is null");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateIsNotNull() {
            addCriterion("standardization_card_date is not null");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateEqualTo(Date value) {
            addCriterion("standardization_card_date =", value, "standardizationCardDate");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateNotEqualTo(Date value) {
            addCriterion("standardization_card_date <>", value, "standardizationCardDate");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateGreaterThan(Date value) {
            addCriterion("standardization_card_date >", value, "standardizationCardDate");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateGreaterThanOrEqualTo(Date value) {
            addCriterion("standardization_card_date >=", value, "standardizationCardDate");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateLessThan(Date value) {
            addCriterion("standardization_card_date <", value, "standardizationCardDate");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateLessThanOrEqualTo(Date value) {
            addCriterion("standardization_card_date <=", value, "standardizationCardDate");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateIn(List<Date> values) {
            addCriterion("standardization_card_date in", values, "standardizationCardDate");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateNotIn(List<Date> values) {
            addCriterion("standardization_card_date not in", values, "standardizationCardDate");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateBetween(Date value1, Date value2) {
            addCriterion("standardization_card_date between", value1, value2, "standardizationCardDate");
            return (Criteria) this;
        }

        public Criteria andStandardizationCardDateNotBetween(Date value1, Date value2) {
            addCriterion("standardization_card_date not between", value1, value2, "standardizationCardDate");
            return (Criteria) this;
        }

        public Criteria andRecordDmIsNull() {
            addCriterion("record_dm is null");
            return (Criteria) this;
        }

        public Criteria andRecordDmIsNotNull() {
            addCriterion("record_dm is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDmEqualTo(String value) {
            addCriterion("record_dm =", value, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordDmNotEqualTo(String value) {
            addCriterion("record_dm <>", value, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordDmGreaterThan(String value) {
            addCriterion("record_dm >", value, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordDmGreaterThanOrEqualTo(String value) {
            addCriterion("record_dm >=", value, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordDmLessThan(String value) {
            addCriterion("record_dm <", value, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordDmLessThanOrEqualTo(String value) {
            addCriterion("record_dm <=", value, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordDmLike(String value) {
            addCriterion("record_dm like", value, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordDmNotLike(String value) {
            addCriterion("record_dm not like", value, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordDmIn(List<String> values) {
            addCriterion("record_dm in", values, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordDmNotIn(List<String> values) {
            addCriterion("record_dm not in", values, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordDmBetween(String value1, String value2) {
            addCriterion("record_dm between", value1, value2, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordDmNotBetween(String value1, String value2) {
            addCriterion("record_dm not between", value1, value2, "recordDm");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("record is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("record is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(String value) {
            addCriterion("record =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(String value) {
            addCriterion("record <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(String value) {
            addCriterion("record >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(String value) {
            addCriterion("record >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(String value) {
            addCriterion("record <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(String value) {
            addCriterion("record <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLike(String value) {
            addCriterion("record like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotLike(String value) {
            addCriterion("record not like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<String> values) {
            addCriterion("record in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<String> values) {
            addCriterion("record not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(String value1, String value2) {
            addCriterion("record between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(String value1, String value2) {
            addCriterion("record not between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNoIsNull() {
            addCriterion("record_no is null");
            return (Criteria) this;
        }

        public Criteria andRecordNoIsNotNull() {
            addCriterion("record_no is not null");
            return (Criteria) this;
        }

        public Criteria andRecordNoEqualTo(String value) {
            addCriterion("record_no =", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotEqualTo(String value) {
            addCriterion("record_no <>", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoGreaterThan(String value) {
            addCriterion("record_no >", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoGreaterThanOrEqualTo(String value) {
            addCriterion("record_no >=", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoLessThan(String value) {
            addCriterion("record_no <", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoLessThanOrEqualTo(String value) {
            addCriterion("record_no <=", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoLike(String value) {
            addCriterion("record_no like", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotLike(String value) {
            addCriterion("record_no not like", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoIn(List<String> values) {
            addCriterion("record_no in", values, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotIn(List<String> values) {
            addCriterion("record_no not in", values, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoBetween(String value1, String value2) {
            addCriterion("record_no between", value1, value2, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotBetween(String value1, String value2) {
            addCriterion("record_no not between", value1, value2, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNull() {
            addCriterion("record_date is null");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNotNull() {
            addCriterion("record_date is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDateEqualTo(Date value) {
            addCriterion("record_date =", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotEqualTo(Date value) {
            addCriterion("record_date <>", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThan(Date value) {
            addCriterion("record_date >", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterion("record_date >=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThan(Date value) {
            addCriterion("record_date <", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThanOrEqualTo(Date value) {
            addCriterion("record_date <=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateIn(List<Date> values) {
            addCriterion("record_date in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotIn(List<Date> values) {
            addCriterion("record_date not in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateBetween(Date value1, Date value2) {
            addCriterion("record_date between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotBetween(Date value1, Date value2) {
            addCriterion("record_date not between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andDeclareDmIsNull() {
            addCriterion("declare_dm is null");
            return (Criteria) this;
        }

        public Criteria andDeclareDmIsNotNull() {
            addCriterion("declare_dm is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareDmEqualTo(String value) {
            addCriterion("declare_dm =", value, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareDmNotEqualTo(String value) {
            addCriterion("declare_dm <>", value, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareDmGreaterThan(String value) {
            addCriterion("declare_dm >", value, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareDmGreaterThanOrEqualTo(String value) {
            addCriterion("declare_dm >=", value, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareDmLessThan(String value) {
            addCriterion("declare_dm <", value, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareDmLessThanOrEqualTo(String value) {
            addCriterion("declare_dm <=", value, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareDmLike(String value) {
            addCriterion("declare_dm like", value, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareDmNotLike(String value) {
            addCriterion("declare_dm not like", value, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareDmIn(List<String> values) {
            addCriterion("declare_dm in", values, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareDmNotIn(List<String> values) {
            addCriterion("declare_dm not in", values, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareDmBetween(String value1, String value2) {
            addCriterion("declare_dm between", value1, value2, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareDmNotBetween(String value1, String value2) {
            addCriterion("declare_dm not between", value1, value2, "declareDm");
            return (Criteria) this;
        }

        public Criteria andDeclareMcIsNull() {
            addCriterion("declare_mc is null");
            return (Criteria) this;
        }

        public Criteria andDeclareMcIsNotNull() {
            addCriterion("declare_mc is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareMcEqualTo(String value) {
            addCriterion("declare_mc =", value, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareMcNotEqualTo(String value) {
            addCriterion("declare_mc <>", value, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareMcGreaterThan(String value) {
            addCriterion("declare_mc >", value, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareMcGreaterThanOrEqualTo(String value) {
            addCriterion("declare_mc >=", value, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareMcLessThan(String value) {
            addCriterion("declare_mc <", value, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareMcLessThanOrEqualTo(String value) {
            addCriterion("declare_mc <=", value, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareMcLike(String value) {
            addCriterion("declare_mc like", value, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareMcNotLike(String value) {
            addCriterion("declare_mc not like", value, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareMcIn(List<String> values) {
            addCriterion("declare_mc in", values, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareMcNotIn(List<String> values) {
            addCriterion("declare_mc not in", values, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareMcBetween(String value1, String value2) {
            addCriterion("declare_mc between", value1, value2, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareMcNotBetween(String value1, String value2) {
            addCriterion("declare_mc not between", value1, value2, "declareMc");
            return (Criteria) this;
        }

        public Criteria andDeclareNoIsNull() {
            addCriterion("declare_no is null");
            return (Criteria) this;
        }

        public Criteria andDeclareNoIsNotNull() {
            addCriterion("declare_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareNoEqualTo(String value) {
            addCriterion("declare_no =", value, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNoNotEqualTo(String value) {
            addCriterion("declare_no <>", value, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNoGreaterThan(String value) {
            addCriterion("declare_no >", value, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNoGreaterThanOrEqualTo(String value) {
            addCriterion("declare_no >=", value, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNoLessThan(String value) {
            addCriterion("declare_no <", value, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNoLessThanOrEqualTo(String value) {
            addCriterion("declare_no <=", value, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNoLike(String value) {
            addCriterion("declare_no like", value, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNoNotLike(String value) {
            addCriterion("declare_no not like", value, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNoIn(List<String> values) {
            addCriterion("declare_no in", values, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNoNotIn(List<String> values) {
            addCriterion("declare_no not in", values, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNoBetween(String value1, String value2) {
            addCriterion("declare_no between", value1, value2, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNoNotBetween(String value1, String value2) {
            addCriterion("declare_no not between", value1, value2, "declareNo");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberIsNull() {
            addCriterion("declare_number is null");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberIsNotNull() {
            addCriterion("declare_number is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberEqualTo(String value) {
            addCriterion("declare_number =", value, "declareNumber");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberNotEqualTo(String value) {
            addCriterion("declare_number <>", value, "declareNumber");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberGreaterThan(String value) {
            addCriterion("declare_number >", value, "declareNumber");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberGreaterThanOrEqualTo(String value) {
            addCriterion("declare_number >=", value, "declareNumber");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberLessThan(String value) {
            addCriterion("declare_number <", value, "declareNumber");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberLessThanOrEqualTo(String value) {
            addCriterion("declare_number <=", value, "declareNumber");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberLike(String value) {
            addCriterion("declare_number like", value, "declareNumber");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberNotLike(String value) {
            addCriterion("declare_number not like", value, "declareNumber");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberIn(List<String> values) {
            addCriterion("declare_number in", values, "declareNumber");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberNotIn(List<String> values) {
            addCriterion("declare_number not in", values, "declareNumber");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberBetween(String value1, String value2) {
            addCriterion("declare_number between", value1, value2, "declareNumber");
            return (Criteria) this;
        }

        public Criteria andDeclareNumberNotBetween(String value1, String value2) {
            addCriterion("declare_number not between", value1, value2, "declareNumber");
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