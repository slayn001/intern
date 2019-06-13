package com.migrationdashboard.demo.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class MetLife360Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mId;
    private Integer mPolicyNumber;
    private String mPolicyNumberSuffix;
    private String mLineofBusiness;
    private String mState;
    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern="MM-dd-yy")
    private Date mRenewalEffectiveDate;
    private String mWritingCompany;
    private Float mTotalPremium;
    private Integer mAgentId;
    private String mReferralAgent1;
    private String mReferralAgent2;
    private Integer mGpcCode;
    private String mBillMode;
    private String mPayPlan;
    private Integer mNumberDrivers;
    private Integer mNumberVehicles;
    private Integer mNumberExposures;
    private String mNamedInsured;
    private String mMailingAdress;
    private String mHomeAdress;
    private String mMcGIndicator;
    private String mRateCapFactor;
    private Float mStateFees;
    private Float mCompanyFees;
    private String mStatus;

    public Long getId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }
    public Integer getmPolicyNumber() {
        return mPolicyNumber;
    }

    public void setmPolicyNumber(Integer mPolicyNumber) {
        this.mPolicyNumber = mPolicyNumber;
    }

    public String getmPolicyNumberSuffix() {
        return mPolicyNumberSuffix;
    }

    public void setmPolicyNumberSuffix(String mPolicyNumberSuffix) {
        this.mPolicyNumberSuffix = mPolicyNumberSuffix;
    }

    public String getmLineofBusiness() {
        return mLineofBusiness;
    }

    public void setmLineofBusiness(String mLineofBusiness) {
        this.mLineofBusiness = mLineofBusiness;
    }

    public String getmState() {
        return mState;
    }

    public void setmState(String mState) {
        this.mState = mState;
    }

    public Date getmRenewalEffectiveDate() {
        return mRenewalEffectiveDate;
    }

    public void setmRenewalEffectiveDate(Date mRenewalEffectiveDate) {
        this.mRenewalEffectiveDate = mRenewalEffectiveDate;
    }

    public String getmWritingCompany() {
        return mWritingCompany;
    }

    public void setmWritingCompany(String mWritingCompany) {
        this.mWritingCompany = mWritingCompany;
    }

    public Float getmTotalPremium() {
        return mTotalPremium;
    }

    public void setmTotalPremium(Float mTotalPremium) {
        this.mTotalPremium = mTotalPremium;
    }

    public Integer getmAgentId() {
        return mAgentId;
    }

    public void setmAgentId(Integer mAgentId) {
        this.mAgentId = mAgentId;
    }

    public String getmReferralAgent1() {
        return mReferralAgent1;
    }

    public void setmReferralAgent1(String mReferralAgent1) {
        this.mReferralAgent1 = mReferralAgent1;
    }

    public String getmReferralAgent2() {
        return mReferralAgent2;
    }

    public void setmReferralAgent2(String mReferralAgent2) {
        this.mReferralAgent2 = mReferralAgent2;
    }

    public Integer getmGpcCode() {
        return mGpcCode;
    }

    public void setmGpcCode(Integer mGpcCode) {
        this.mGpcCode = mGpcCode;
    }

    public String getmBillMode() {
        return mBillMode;
    }

    public void setmBillMode(String mBillMode) {
        this.mBillMode = mBillMode;
    }

    public String getmPayPlan() {
        return mPayPlan;
    }

    public void setmPayPlan(String mPayPlan) {
        this.mPayPlan = mPayPlan;
    }

    public Integer getmNumberDrivers() {
        return mNumberDrivers;
    }

    public void setmNumberDrivers(Integer mNumberDrivers) {
        this.mNumberDrivers = mNumberDrivers;
    }

    public Integer getmNumberVehicles() {
        return mNumberVehicles;
    }

    public void setmNumberVehicles(Integer mNumberVehicles) {
        this.mNumberVehicles = mNumberVehicles;
    }

    public Integer getmNumberExposures() {
        return mNumberExposures;
    }

    public void setmNumberExposures(Integer mNumberExposures) {
        this.mNumberExposures = mNumberExposures;
    }

    public String getmNamedInsured() {
        return mNamedInsured;
    }

    public void setmNamedInsured(String mNamedInsured) {
        this.mNamedInsured = mNamedInsured;
    }

    public String getmMailingAdress() {
        return mMailingAdress;
    }

    public void setmMailingAdress(String mMailingAdress) {
        this.mMailingAdress = mMailingAdress;
    }

    public String getmHomeAdress() {
        return mHomeAdress;
    }

    public void setmHomeAdress(String mHomeAdress) {
        this.mHomeAdress = mHomeAdress;
    }

    public String getmMcGIndicator() {
        return mMcGIndicator;
    }

    public void setmMcGIndicator(String mMcGIndicator) {
        this.mMcGIndicator = mMcGIndicator;
    }

    public String getmRateCapFactor() {
        return mRateCapFactor;
    }

    public void setmRateCapFactor(String mRateCapFactor) {
        this.mRateCapFactor = mRateCapFactor;
    }

    public Float getmStateFees() {
        return mStateFees;
    }

    public void setmStateFees(Float mStateFees) {
        this.mStateFees = mStateFees;
    }

    public Float getmCompanyFees() {
        return mCompanyFees;
    }

    public void setmCompanyFees(Float mCompanyFees) {
        this.mCompanyFees = mCompanyFees;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }
}




