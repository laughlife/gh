package com.mlight.model;

import com.mlight.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BasicInformation {
    private Integer id;

    private String enterpriseName;

    private String areaDm;

    private String area;

    private String postCode;

    private String productionAddress;

    private String areaPropertyDm;

    private String areaProperty;

    private String legalRepresentative;

    private String legalRepresentativePhone;

    private String securityOfficer;

    private String securityOfficerPhone;
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date establishDate;

    private String registeredCapital;

    private String economicTypeDm;

    private String economicType;
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date operationPeriodBegin;
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date operationPeriodEnd;

    private String scopeOfOperation;

    private String industryNatureDm;

    private String industryNature;

    private String enterpriseScaleDm;

    private String enterpriseScale;

    private String coveringArea;

    private String mainMaterial;

    private String mainProduct;

    private String numberOfStaff;

    private String annualRevenue;

    private String safetyManagementDm;

    private String safetyManagement;

    private String productionEquipmentNo;

    private String securityManagerNo;

    private String specialOperatorNo;

    private String safetyProductionPermitDm;

    private String safetyProductionPermit;

    private String safetyProductionPermitNo;
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date safetyProductionPermitBegin;
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date safetyProductionPermitEnd;

    private String standardizationDm;

    private String standardization;

    private String standardizationCardNo;
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date standardizationCardDate;

    private String recordDm;

    private String record;

    private String recordNo;
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date recordDate;

    private String declareDm;

    private String declareMc;

    private String declareNo;

    private String declareNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getAreaDm() {
        return areaDm;
    }

    public void setAreaDm(String areaDm) {
        this.areaDm = areaDm == null ? null : areaDm.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getProductionAddress() {
        return productionAddress;
    }

    public void setProductionAddress(String productionAddress) {
        this.productionAddress = productionAddress == null ? null : productionAddress.trim();
    }

    public String getAreaPropertyDm() {
        return areaPropertyDm;
    }

    public void setAreaPropertyDm(String areaPropertyDm) {
        this.areaPropertyDm = areaPropertyDm == null ? null : areaPropertyDm.trim();
    }

    public String getAreaProperty() {
        return areaProperty;
    }

    public void setAreaProperty(String areaProperty) {
        this.areaProperty = areaProperty == null ? null : areaProperty.trim();
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative == null ? null : legalRepresentative.trim();
    }

    public String getLegalRepresentativePhone() {
        return legalRepresentativePhone;
    }

    public void setLegalRepresentativePhone(String legalRepresentativePhone) {
        this.legalRepresentativePhone = legalRepresentativePhone == null ? null : legalRepresentativePhone.trim();
    }

    public String getSecurityOfficer() {
        return securityOfficer;
    }

    public void setSecurityOfficer(String securityOfficer) {
        this.securityOfficer = securityOfficer == null ? null : securityOfficer.trim();
    }

    public String getSecurityOfficerPhone() {
        return securityOfficerPhone;
    }

    public void setSecurityOfficerPhone(String securityOfficerPhone) {
        this.securityOfficerPhone = securityOfficerPhone == null ? null : securityOfficerPhone.trim();
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public String getEstablishDateFormat() {
        return DateUtils.formatDate(establishDate,"yyyy/MM/dd");
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital == null ? null : registeredCapital.trim();
    }

    public String getEconomicTypeDm() {
        return economicTypeDm;
    }

    public void setEconomicTypeDm(String economicTypeDm) {
        this.economicTypeDm = economicTypeDm == null ? null : economicTypeDm.trim();
    }

    public String getEconomicType() {
        return economicType;
    }

    public void setEconomicType(String economicType) {
        this.economicType = economicType == null ? null : economicType.trim();
    }

    public Date getOperationPeriodBegin() {
        return operationPeriodBegin;
    }
    public String getOperationPeriodBeginFormat() {
        return DateUtils.formatDate(operationPeriodBegin,"yyyy/MM/dd");
    }

    public void setOperationPeriodBegin(Date operationPeriodBegin) {
        this.operationPeriodBegin = operationPeriodBegin;
    }

    public Date getOperationPeriodEnd() {
        return operationPeriodEnd;
    }

    public String getOperationPeriodEndFormat() {
        return DateUtils.formatDate(operationPeriodEnd,"yyyy/MM/dd");
    }

    public void setOperationPeriodEnd(Date operationPeriodEnd) {
        this.operationPeriodEnd = operationPeriodEnd;
    }

    public String getScopeOfOperation() {
        return scopeOfOperation;
    }

    public void setScopeOfOperation(String scopeOfOperation) {
        this.scopeOfOperation = scopeOfOperation == null ? null : scopeOfOperation.trim();
    }

    public String getIndustryNatureDm() {
        return industryNatureDm;
    }

    public void setIndustryNatureDm(String industryNatureDm) {
        this.industryNatureDm = industryNatureDm == null ? null : industryNatureDm.trim();
    }

    public String getIndustryNature() {
        return industryNature;
    }

    public void setIndustryNature(String industryNature) {
        this.industryNature = industryNature == null ? null : industryNature.trim();
    }

    public String getEnterpriseScaleDm() {
        return enterpriseScaleDm;
    }

    public void setEnterpriseScaleDm(String enterpriseScaleDm) {
        this.enterpriseScaleDm = enterpriseScaleDm == null ? null : enterpriseScaleDm.trim();
    }

    public String getEnterpriseScale() {
        return enterpriseScale;
    }

    public void setEnterpriseScale(String enterpriseScale) {
        this.enterpriseScale = enterpriseScale == null ? null : enterpriseScale.trim();
    }

    public String getCoveringArea() {
        return coveringArea;
    }

    public void setCoveringArea(String coveringArea) {
        this.coveringArea = coveringArea == null ? null : coveringArea.trim();
    }

    public String getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(String mainMaterial) {
        this.mainMaterial = mainMaterial == null ? null : mainMaterial.trim();
    }

    public String getMainProduct() {
        return mainProduct;
    }

    public void setMainProduct(String mainProduct) {
        this.mainProduct = mainProduct == null ? null : mainProduct.trim();
    }

    public String getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(String numberOfStaff) {
        this.numberOfStaff = numberOfStaff == null ? null : numberOfStaff.trim();
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue == null ? null : annualRevenue.trim();
    }

    public String getSafetyManagementDm() {
        return safetyManagementDm;
    }

    public void setSafetyManagementDm(String safetyManagementDm) {
        this.safetyManagementDm = safetyManagementDm == null ? null : safetyManagementDm.trim();
    }

    public String getSafetyManagement() {
        return safetyManagement;
    }

    public void setSafetyManagement(String safetyManagement) {
        this.safetyManagement = safetyManagement == null ? null : safetyManagement.trim();
    }

    public String getProductionEquipmentNo() {
        return productionEquipmentNo;
    }

    public void setProductionEquipmentNo(String productionEquipmentNo) {
        this.productionEquipmentNo = productionEquipmentNo == null ? null : productionEquipmentNo.trim();
    }

    public String getSecurityManagerNo() {
        return securityManagerNo;
    }

    public void setSecurityManagerNo(String securityManagerNo) {
        this.securityManagerNo = securityManagerNo == null ? null : securityManagerNo.trim();
    }

    public String getSpecialOperatorNo() {
        return specialOperatorNo;
    }

    public void setSpecialOperatorNo(String specialOperatorNo) {
        this.specialOperatorNo = specialOperatorNo == null ? null : specialOperatorNo.trim();
    }

    public String getSafetyProductionPermitDm() {
        return safetyProductionPermitDm;
    }

    public void setSafetyProductionPermitDm(String safetyProductionPermitDm) {
        this.safetyProductionPermitDm = safetyProductionPermitDm == null ? null : safetyProductionPermitDm.trim();
    }

    public String getSafetyProductionPermit() {
        return safetyProductionPermit;
    }

    public void setSafetyProductionPermit(String safetyProductionPermit) {
        this.safetyProductionPermit = safetyProductionPermit == null ? null : safetyProductionPermit.trim();
    }

    public String getSafetyProductionPermitNo() {
        return safetyProductionPermitNo;
    }

    public void setSafetyProductionPermitNo(String safetyProductionPermitNo) {
        this.safetyProductionPermitNo = safetyProductionPermitNo == null ? null : safetyProductionPermitNo.trim();
    }

    public Date getSafetyProductionPermitBegin() {
        return safetyProductionPermitBegin;
    }

    public String getSafetyProductionPermitBeginFormat() {
        return DateUtils.formatDate(safetyProductionPermitBegin,"yyyy/MM/dd");
    }

    public void setSafetyProductionPermitBegin(Date safetyProductionPermitBegin) {
        this.safetyProductionPermitBegin = safetyProductionPermitBegin;
    }


    public Date getSafetyProductionPermitEnd() {
        return safetyProductionPermitEnd;
    }

    public String getSafetyProductionPermitEndFormat() {
        return DateUtils.formatDate(safetyProductionPermitEnd,"yyyy/MM/dd");
    }

    public void setSafetyProductionPermitEnd(Date safetyProductionPermitEnd) {
        this.safetyProductionPermitEnd = safetyProductionPermitEnd;
    }

    public String getStandardizationDm() {
        return standardizationDm;
    }

    public void setStandardizationDm(String standardizationDm) {
        this.standardizationDm = standardizationDm == null ? null : standardizationDm.trim();
    }

    public String getStandardization() {
        return standardization;
    }

    public void setStandardization(String standardization) {
        this.standardization = standardization == null ? null : standardization.trim();
    }

    public String getStandardizationCardNo() {
        return standardizationCardNo;
    }

    public void setStandardizationCardNo(String standardizationCardNo) {
        this.standardizationCardNo = standardizationCardNo == null ? null : standardizationCardNo.trim();
    }

    public Date getStandardizationCardDate() {
        return standardizationCardDate;
    }

    public String getStandardizationCardDateFormat() {
        return DateUtils.formatDate(standardizationCardDate,"yyyy/MM/dd");
    }


    public void setStandardizationCardDate(Date standardizationCardDate) {
        this.standardizationCardDate = standardizationCardDate;
    }

    public String getRecordDm() {
        return recordDm;
    }

    public void setRecordDm(String recordDm) {
        this.recordDm = recordDm == null ? null : recordDm.trim();
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo == null ? null : recordNo.trim();
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public String getRecordDateFormat() {
        return DateUtils.formatDate(recordDate,"yyyy/MM/dd");
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getDeclareDm() {
        return declareDm;
    }

    public void setDeclareDm(String declareDm) {
        this.declareDm = declareDm == null ? null : declareDm.trim();
    }

    public String getDeclareMc() {
        return declareMc;
    }

    public void setDeclareMc(String declareMc) {
        this.declareMc = declareMc == null ? null : declareMc.trim();
    }

    public String getDeclareNo() {
        return declareNo;
    }

    public void setDeclareNo(String declareNo) {
        this.declareNo = declareNo == null ? null : declareNo.trim();
    }

    public String getDeclareNumber() {
        return declareNumber;
    }

    public void setDeclareNumber(String declareNumber) {
        this.declareNumber = declareNumber == null ? null : declareNumber.trim();
    }
}