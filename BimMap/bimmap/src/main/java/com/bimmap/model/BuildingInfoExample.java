package com.bimmap.model;

import java.util.ArrayList;
import java.util.List;

public class BuildingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuildingInfoExample() {
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

        public Criteria andBuildingnameIsNull() {
            addCriterion("BuildingName is null");
            return (Criteria) this;
        }

        public Criteria andBuildingnameIsNotNull() {
            addCriterion("BuildingName is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingnameEqualTo(String value) {
            addCriterion("BuildingName =", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameNotEqualTo(String value) {
            addCriterion("BuildingName <>", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameGreaterThan(String value) {
            addCriterion("BuildingName >", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameGreaterThanOrEqualTo(String value) {
            addCriterion("BuildingName >=", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameLessThan(String value) {
            addCriterion("BuildingName <", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameLessThanOrEqualTo(String value) {
            addCriterion("BuildingName <=", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameLike(String value) {
            addCriterion("BuildingName like", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameNotLike(String value) {
            addCriterion("BuildingName not like", value, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameIn(List<String> values) {
            addCriterion("BuildingName in", values, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameNotIn(List<String> values) {
            addCriterion("BuildingName not in", values, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameBetween(String value1, String value2) {
            addCriterion("BuildingName between", value1, value2, "buildingname");
            return (Criteria) this;
        }

        public Criteria andBuildingnameNotBetween(String value1, String value2) {
            addCriterion("BuildingName not between", value1, value2, "buildingname");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andGislatIsNull() {
            addCriterion("GISLat is null");
            return (Criteria) this;
        }

        public Criteria andGislatIsNotNull() {
            addCriterion("GISLat is not null");
            return (Criteria) this;
        }

        public Criteria andGislatEqualTo(Double value) {
            addCriterion("GISLat =", value, "gislat");
            return (Criteria) this;
        }

        public Criteria andGislatNotEqualTo(Double value) {
            addCriterion("GISLat <>", value, "gislat");
            return (Criteria) this;
        }

        public Criteria andGislatGreaterThan(Double value) {
            addCriterion("GISLat >", value, "gislat");
            return (Criteria) this;
        }

        public Criteria andGislatGreaterThanOrEqualTo(Double value) {
            addCriterion("GISLat >=", value, "gislat");
            return (Criteria) this;
        }

        public Criteria andGislatLessThan(Double value) {
            addCriterion("GISLat <", value, "gislat");
            return (Criteria) this;
        }

        public Criteria andGislatLessThanOrEqualTo(Double value) {
            addCriterion("GISLat <=", value, "gislat");
            return (Criteria) this;
        }

        public Criteria andGislatIn(List<Double> values) {
            addCriterion("GISLat in", values, "gislat");
            return (Criteria) this;
        }

        public Criteria andGislatNotIn(List<Double> values) {
            addCriterion("GISLat not in", values, "gislat");
            return (Criteria) this;
        }

        public Criteria andGislatBetween(Double value1, Double value2) {
            addCriterion("GISLat between", value1, value2, "gislat");
            return (Criteria) this;
        }

        public Criteria andGislatNotBetween(Double value1, Double value2) {
            addCriterion("GISLat not between", value1, value2, "gislat");
            return (Criteria) this;
        }

        public Criteria andGislonIsNull() {
            addCriterion("GISLon is null");
            return (Criteria) this;
        }

        public Criteria andGislonIsNotNull() {
            addCriterion("GISLon is not null");
            return (Criteria) this;
        }

        public Criteria andGislonEqualTo(Double value) {
            addCriterion("GISLon =", value, "gislon");
            return (Criteria) this;
        }

        public Criteria andGislonNotEqualTo(Double value) {
            addCriterion("GISLon <>", value, "gislon");
            return (Criteria) this;
        }

        public Criteria andGislonGreaterThan(Double value) {
            addCriterion("GISLon >", value, "gislon");
            return (Criteria) this;
        }

        public Criteria andGislonGreaterThanOrEqualTo(Double value) {
            addCriterion("GISLon >=", value, "gislon");
            return (Criteria) this;
        }

        public Criteria andGislonLessThan(Double value) {
            addCriterion("GISLon <", value, "gislon");
            return (Criteria) this;
        }

        public Criteria andGislonLessThanOrEqualTo(Double value) {
            addCriterion("GISLon <=", value, "gislon");
            return (Criteria) this;
        }

        public Criteria andGislonIn(List<Double> values) {
            addCriterion("GISLon in", values, "gislon");
            return (Criteria) this;
        }

        public Criteria andGislonNotIn(List<Double> values) {
            addCriterion("GISLon not in", values, "gislon");
            return (Criteria) this;
        }

        public Criteria andGislonBetween(Double value1, Double value2) {
            addCriterion("GISLon between", value1, value2, "gislon");
            return (Criteria) this;
        }

        public Criteria andGislonNotBetween(Double value1, Double value2) {
            addCriterion("GISLon not between", value1, value2, "gislon");
            return (Criteria) this;
        }

        public Criteria andGisaltIsNull() {
            addCriterion("GISAlt is null");
            return (Criteria) this;
        }

        public Criteria andGisaltIsNotNull() {
            addCriterion("GISAlt is not null");
            return (Criteria) this;
        }

        public Criteria andGisaltEqualTo(Double value) {
            addCriterion("GISAlt =", value, "gisalt");
            return (Criteria) this;
        }

        public Criteria andGisaltNotEqualTo(Double value) {
            addCriterion("GISAlt <>", value, "gisalt");
            return (Criteria) this;
        }

        public Criteria andGisaltGreaterThan(Double value) {
            addCriterion("GISAlt >", value, "gisalt");
            return (Criteria) this;
        }

        public Criteria andGisaltGreaterThanOrEqualTo(Double value) {
            addCriterion("GISAlt >=", value, "gisalt");
            return (Criteria) this;
        }

        public Criteria andGisaltLessThan(Double value) {
            addCriterion("GISAlt <", value, "gisalt");
            return (Criteria) this;
        }

        public Criteria andGisaltLessThanOrEqualTo(Double value) {
            addCriterion("GISAlt <=", value, "gisalt");
            return (Criteria) this;
        }

        public Criteria andGisaltIn(List<Double> values) {
            addCriterion("GISAlt in", values, "gisalt");
            return (Criteria) this;
        }

        public Criteria andGisaltNotIn(List<Double> values) {
            addCriterion("GISAlt not in", values, "gisalt");
            return (Criteria) this;
        }

        public Criteria andGisaltBetween(Double value1, Double value2) {
            addCriterion("GISAlt between", value1, value2, "gisalt");
            return (Criteria) this;
        }

        public Criteria andGisaltNotBetween(Double value1, Double value2) {
            addCriterion("GISAlt not between", value1, value2, "gisalt");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNull() {
            addCriterion("Authority is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNotNull() {
            addCriterion("Authority is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEqualTo(Integer value) {
            addCriterion("Authority =", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotEqualTo(Integer value) {
            addCriterion("Authority <>", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThan(Integer value) {
            addCriterion("Authority >", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Authority >=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThan(Integer value) {
            addCriterion("Authority <", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("Authority <=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityIn(List<Integer> values) {
            addCriterion("Authority in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotIn(List<Integer> values) {
            addCriterion("Authority not in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("Authority between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("Authority not between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("Area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("Area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Double value) {
            addCriterion("Area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Double value) {
            addCriterion("Area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Double value) {
            addCriterion("Area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("Area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Double value) {
            addCriterion("Area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Double value) {
            addCriterion("Area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Double> values) {
            addCriterion("Area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Double> values) {
            addCriterion("Area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Double value1, Double value2) {
            addCriterion("Area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Double value1, Double value2) {
            addCriterion("Area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeIsNull() {
            addCriterion("BuildingType is null");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeIsNotNull() {
            addCriterion("BuildingType is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeEqualTo(Integer value) {
            addCriterion("BuildingType =", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeNotEqualTo(Integer value) {
            addCriterion("BuildingType <>", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeGreaterThan(Integer value) {
            addCriterion("BuildingType >", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BuildingType >=", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeLessThan(Integer value) {
            addCriterion("BuildingType <", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeLessThanOrEqualTo(Integer value) {
            addCriterion("BuildingType <=", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeIn(List<Integer> values) {
            addCriterion("BuildingType in", values, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeNotIn(List<Integer> values) {
            addCriterion("BuildingType not in", values, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeBetween(Integer value1, Integer value2) {
            addCriterion("BuildingType between", value1, value2, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BuildingType not between", value1, value2, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andStructuretypeIsNull() {
            addCriterion("StructureType is null");
            return (Criteria) this;
        }

        public Criteria andStructuretypeIsNotNull() {
            addCriterion("StructureType is not null");
            return (Criteria) this;
        }

        public Criteria andStructuretypeEqualTo(Integer value) {
            addCriterion("StructureType =", value, "structuretype");
            return (Criteria) this;
        }

        public Criteria andStructuretypeNotEqualTo(Integer value) {
            addCriterion("StructureType <>", value, "structuretype");
            return (Criteria) this;
        }

        public Criteria andStructuretypeGreaterThan(Integer value) {
            addCriterion("StructureType >", value, "structuretype");
            return (Criteria) this;
        }

        public Criteria andStructuretypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("StructureType >=", value, "structuretype");
            return (Criteria) this;
        }

        public Criteria andStructuretypeLessThan(Integer value) {
            addCriterion("StructureType <", value, "structuretype");
            return (Criteria) this;
        }

        public Criteria andStructuretypeLessThanOrEqualTo(Integer value) {
            addCriterion("StructureType <=", value, "structuretype");
            return (Criteria) this;
        }

        public Criteria andStructuretypeIn(List<Integer> values) {
            addCriterion("StructureType in", values, "structuretype");
            return (Criteria) this;
        }

        public Criteria andStructuretypeNotIn(List<Integer> values) {
            addCriterion("StructureType not in", values, "structuretype");
            return (Criteria) this;
        }

        public Criteria andStructuretypeBetween(Integer value1, Integer value2) {
            addCriterion("StructureType between", value1, value2, "structuretype");
            return (Criteria) this;
        }

        public Criteria andStructuretypeNotBetween(Integer value1, Integer value2) {
            addCriterion("StructureType not between", value1, value2, "structuretype");
            return (Criteria) this;
        }

        public Criteria andUpfloornumIsNull() {
            addCriterion("UpFloorNum is null");
            return (Criteria) this;
        }

        public Criteria andUpfloornumIsNotNull() {
            addCriterion("UpFloorNum is not null");
            return (Criteria) this;
        }

        public Criteria andUpfloornumEqualTo(Integer value) {
            addCriterion("UpFloorNum =", value, "upfloornum");
            return (Criteria) this;
        }

        public Criteria andUpfloornumNotEqualTo(Integer value) {
            addCriterion("UpFloorNum <>", value, "upfloornum");
            return (Criteria) this;
        }

        public Criteria andUpfloornumGreaterThan(Integer value) {
            addCriterion("UpFloorNum >", value, "upfloornum");
            return (Criteria) this;
        }

        public Criteria andUpfloornumGreaterThanOrEqualTo(Integer value) {
            addCriterion("UpFloorNum >=", value, "upfloornum");
            return (Criteria) this;
        }

        public Criteria andUpfloornumLessThan(Integer value) {
            addCriterion("UpFloorNum <", value, "upfloornum");
            return (Criteria) this;
        }

        public Criteria andUpfloornumLessThanOrEqualTo(Integer value) {
            addCriterion("UpFloorNum <=", value, "upfloornum");
            return (Criteria) this;
        }

        public Criteria andUpfloornumIn(List<Integer> values) {
            addCriterion("UpFloorNum in", values, "upfloornum");
            return (Criteria) this;
        }

        public Criteria andUpfloornumNotIn(List<Integer> values) {
            addCriterion("UpFloorNum not in", values, "upfloornum");
            return (Criteria) this;
        }

        public Criteria andUpfloornumBetween(Integer value1, Integer value2) {
            addCriterion("UpFloorNum between", value1, value2, "upfloornum");
            return (Criteria) this;
        }

        public Criteria andUpfloornumNotBetween(Integer value1, Integer value2) {
            addCriterion("UpFloorNum not between", value1, value2, "upfloornum");
            return (Criteria) this;
        }

        public Criteria andSubfloornumIsNull() {
            addCriterion("SubFloorNum is null");
            return (Criteria) this;
        }

        public Criteria andSubfloornumIsNotNull() {
            addCriterion("SubFloorNum is not null");
            return (Criteria) this;
        }

        public Criteria andSubfloornumEqualTo(Integer value) {
            addCriterion("SubFloorNum =", value, "subfloornum");
            return (Criteria) this;
        }

        public Criteria andSubfloornumNotEqualTo(Integer value) {
            addCriterion("SubFloorNum <>", value, "subfloornum");
            return (Criteria) this;
        }

        public Criteria andSubfloornumGreaterThan(Integer value) {
            addCriterion("SubFloorNum >", value, "subfloornum");
            return (Criteria) this;
        }

        public Criteria andSubfloornumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SubFloorNum >=", value, "subfloornum");
            return (Criteria) this;
        }

        public Criteria andSubfloornumLessThan(Integer value) {
            addCriterion("SubFloorNum <", value, "subfloornum");
            return (Criteria) this;
        }

        public Criteria andSubfloornumLessThanOrEqualTo(Integer value) {
            addCriterion("SubFloorNum <=", value, "subfloornum");
            return (Criteria) this;
        }

        public Criteria andSubfloornumIn(List<Integer> values) {
            addCriterion("SubFloorNum in", values, "subfloornum");
            return (Criteria) this;
        }

        public Criteria andSubfloornumNotIn(List<Integer> values) {
            addCriterion("SubFloorNum not in", values, "subfloornum");
            return (Criteria) this;
        }

        public Criteria andSubfloornumBetween(Integer value1, Integer value2) {
            addCriterion("SubFloorNum between", value1, value2, "subfloornum");
            return (Criteria) this;
        }

        public Criteria andSubfloornumNotBetween(Integer value1, Integer value2) {
            addCriterion("SubFloorNum not between", value1, value2, "subfloornum");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNull() {
            addCriterion("Developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("Developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("Developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("Developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("Developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("Developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("Developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("Developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("Developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("Developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("Developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("Developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("Developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("Developer not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andBuilderIsNull() {
            addCriterion("Builder is null");
            return (Criteria) this;
        }

        public Criteria andBuilderIsNotNull() {
            addCriterion("Builder is not null");
            return (Criteria) this;
        }

        public Criteria andBuilderEqualTo(String value) {
            addCriterion("Builder =", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotEqualTo(String value) {
            addCriterion("Builder <>", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderGreaterThan(String value) {
            addCriterion("Builder >", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderGreaterThanOrEqualTo(String value) {
            addCriterion("Builder >=", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderLessThan(String value) {
            addCriterion("Builder <", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderLessThanOrEqualTo(String value) {
            addCriterion("Builder <=", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderLike(String value) {
            addCriterion("Builder like", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotLike(String value) {
            addCriterion("Builder not like", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderIn(List<String> values) {
            addCriterion("Builder in", values, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotIn(List<String> values) {
            addCriterion("Builder not in", values, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderBetween(String value1, String value2) {
            addCriterion("Builder between", value1, value2, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotBetween(String value1, String value2) {
            addCriterion("Builder not between", value1, value2, "builder");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNull() {
            addCriterion("Supervisor is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNotNull() {
            addCriterion("Supervisor is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorEqualTo(String value) {
            addCriterion("Supervisor =", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotEqualTo(String value) {
            addCriterion("Supervisor <>", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThan(String value) {
            addCriterion("Supervisor >", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThanOrEqualTo(String value) {
            addCriterion("Supervisor >=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThan(String value) {
            addCriterion("Supervisor <", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThanOrEqualTo(String value) {
            addCriterion("Supervisor <=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLike(String value) {
            addCriterion("Supervisor like", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotLike(String value) {
            addCriterion("Supervisor not like", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorIn(List<String> values) {
            addCriterion("Supervisor in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotIn(List<String> values) {
            addCriterion("Supervisor not in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorBetween(String value1, String value2) {
            addCriterion("Supervisor between", value1, value2, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotBetween(String value1, String value2) {
            addCriterion("Supervisor not between", value1, value2, "supervisor");
            return (Criteria) this;
        }

        public Criteria andModeldrawerIsNull() {
            addCriterion("ModelDrawer is null");
            return (Criteria) this;
        }

        public Criteria andModeldrawerIsNotNull() {
            addCriterion("ModelDrawer is not null");
            return (Criteria) this;
        }

        public Criteria andModeldrawerEqualTo(String value) {
            addCriterion("ModelDrawer =", value, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andModeldrawerNotEqualTo(String value) {
            addCriterion("ModelDrawer <>", value, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andModeldrawerGreaterThan(String value) {
            addCriterion("ModelDrawer >", value, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andModeldrawerGreaterThanOrEqualTo(String value) {
            addCriterion("ModelDrawer >=", value, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andModeldrawerLessThan(String value) {
            addCriterion("ModelDrawer <", value, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andModeldrawerLessThanOrEqualTo(String value) {
            addCriterion("ModelDrawer <=", value, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andModeldrawerLike(String value) {
            addCriterion("ModelDrawer like", value, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andModeldrawerNotLike(String value) {
            addCriterion("ModelDrawer not like", value, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andModeldrawerIn(List<String> values) {
            addCriterion("ModelDrawer in", values, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andModeldrawerNotIn(List<String> values) {
            addCriterion("ModelDrawer not in", values, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andModeldrawerBetween(String value1, String value2) {
            addCriterion("ModelDrawer between", value1, value2, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andModeldrawerNotBetween(String value1, String value2) {
            addCriterion("ModelDrawer not between", value1, value2, "modeldrawer");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("UploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("UploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(String value) {
            addCriterion("UploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(String value) {
            addCriterion("UploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(String value) {
            addCriterion("UploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(String value) {
            addCriterion("UploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(String value) {
            addCriterion("UploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(String value) {
            addCriterion("UploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLike(String value) {
            addCriterion("UploadTime like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotLike(String value) {
            addCriterion("UploadTime not like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<String> values) {
            addCriterion("UploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<String> values) {
            addCriterion("UploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(String value1, String value2) {
            addCriterion("UploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(String value1, String value2) {
            addCriterion("UploadTime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploaduseridIsNull() {
            addCriterion("UploadUserID is null");
            return (Criteria) this;
        }

        public Criteria andUploaduseridIsNotNull() {
            addCriterion("UploadUserID is not null");
            return (Criteria) this;
        }

        public Criteria andUploaduseridEqualTo(Integer value) {
            addCriterion("UploadUserID =", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridNotEqualTo(Integer value) {
            addCriterion("UploadUserID <>", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridGreaterThan(Integer value) {
            addCriterion("UploadUserID >", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UploadUserID >=", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridLessThan(Integer value) {
            addCriterion("UploadUserID <", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridLessThanOrEqualTo(Integer value) {
            addCriterion("UploadUserID <=", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridIn(List<Integer> values) {
            addCriterion("UploadUserID in", values, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridNotIn(List<Integer> values) {
            addCriterion("UploadUserID not in", values, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridBetween(Integer value1, Integer value2) {
            addCriterion("UploadUserID between", value1, value2, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UploadUserID not between", value1, value2, "uploaduserid");
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