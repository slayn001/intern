package org.raspen.sqlitetest.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "policies")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer policyNumber;
    private String policyNumberSuffix;
    private String lineOfBusiness;
    private String state;
    private Date policyEffectiveDate;
    private Date extractedDate; //not in 360
    private String writingCompany;
    private Float totalPremium;
    private Integer sourceCode; //not in 360
    private Integer agentIdea;
    private String referralAgent1;
    private String referralAgent2;
    private String gpcCode;
    private String billMode;
    private String payPlan;
    private Integer numberDrivers;
    private Integer numberVehicles;
    private Integer numberExposures;
    private String namedInsured;
    private String mailingAddress;
    private String homeAddress;
    private String distributionCode;
    private String mcgIndicator;
    private Float stateFees;
    private Float companyFees;
    private String migrationStatusIndicator;
    private String transformationError; //error field y or n could make boolean?
    private Date transformationErrorDate; //error field
    private String transformationErrorCodes; //error field
    private String transformationErrorDescription; //error field
    private String policyCreated; //y or n could make boolean?
    private Date policyCreatedDate;
    private String policyLoadFailed; //y or n could make boolean;
    private Date policyFailedDate;
    private String policyLoaded; //y or n could make boolean;
    private Date policyLoadedDate;
    private String policyLoadedWithError; //y or n could make boolean;
    private Date policyLoadedWithErrorDate;
    private String policyLoadedWithReferral; //y or n could make boolean
    private Date policyLoadedWithReferralDate;
    private Integer batchNumber;
    private String policyRenewed; //y or n could make boolean
    private Date policyRenewedDate;
    private Float premiumDiffCategory;
    private String accountPublicId;
    private Integer accountNumber;
    private String accountHolderName;
    private Integer metRefIdNumber;
    private Integer gcAccountNumber;
    private Integer cpCustomerNumber;

    public String getPolicyCreated() { return policyCreated; }

    public void setPolicyCreated(String policyCreated) { this.policyCreated = policyCreated; }

    public Date getPolicyCreatedDate() { return policyCreatedDate; }

    public void setPolicyCreatedDate(Date policyCreatedDate) { this.policyCreatedDate = policyCreatedDate; }

    public String getPolicyLoadFailed() { return policyLoadFailed; }

    public void setPolicyLoadFailed(String policyLoadFailed) { this.policyLoadFailed = policyLoadFailed; }

    public Date getPolicyFailedDate() { return policyFailedDate; }

    public void setPolicyFailedDate(Date policyFailedDate) { this.policyFailedDate = policyFailedDate; }

    public String getPolicyLoaded() { return policyLoaded; }

    public void setPolicyLoaded(String policyLoaded) { this.policyLoaded = policyLoaded; }

    public Date getPolicyLoadedDate() { return policyLoadedDate; }

    public void setPolicyLoadedDate(Date policyLoadedDate) { this.policyLoadedDate = policyLoadedDate; }

    public String getPolicyLoadedWithError() { return policyLoadedWithError; }

    public void setPolicyLoadedWithError(String policyLoadedWithError) { this.policyLoadedWithError = policyLoadedWithError; }

    public Date getPolicyLoadedWithErrorDate() { return policyLoadedWithErrorDate; }

    public void setPolicyLoadedWithErrorDate(Date policyLoadedWithErrorDate) { this.policyLoadedWithErrorDate = policyLoadedWithErrorDate; }

    public String getPolicyLoadedWithReferral() { return policyLoadedWithReferral; }

    public void setPolicyLoadedWithReferral(String policyLoadedWithReferral) { this.policyLoadedWithReferral = policyLoadedWithReferral; }

    public Date getPolicyLoadedWithReferralDate() { return policyLoadedWithReferralDate; }

    public void setPolicyLoadedWithReferralDate(Date policyLoadedWithReferralDate) { this.policyLoadedWithReferralDate = policyLoadedWithReferralDate; }

    public Integer getBatchNumber() { return batchNumber; }

    public void setBatchNumber(Integer batchNumber) { this.batchNumber = batchNumber; }

    public String getPolicyRenewed() { return policyRenewed; }

    public void setPolicyRenewed(String policyRenewed) { this.policyRenewed = policyRenewed; }

    public Date getPolicyRenewedDate() { return policyRenewedDate; }

    public void setPolicyRenewedDate(Date policyRenewedDate) { this.policyRenewedDate = policyRenewedDate; }

    public Float getPremiumDiffCategory() { return premiumDiffCategory; }

    public void setPremiumDiffCategory(Float premiumDiffCategory) { this.premiumDiffCategory = premiumDiffCategory; }

    public String getAccountPublicId() { return accountPublicId; }

    public void setAccountPublicId(String accountPublicId) { this.accountPublicId = accountPublicId; }

    public Integer getAccountNumber() { return accountNumber; }

    public void setAccountNumber(Integer accountNumber) { this.accountNumber = accountNumber; }

    public String getAccountHolderName() { return accountHolderName; }

    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }

    public Integer getMetRefIdNumber() { return metRefIdNumber; }

    public void setMetRefIdNumber(Integer metRefIdNumber) { this.metRefIdNumber = metRefIdNumber; }

    public Integer getGcAccountNumber() { return gcAccountNumber; }

    public void setGcAccountNumber(Integer gcAccountNumber) { this.gcAccountNumber = gcAccountNumber; }

    public Integer getCpCustomerNumber() { return cpCustomerNumber; }

    public void setCpCustomerNumber(Integer cpCustomerNumber) { this.cpCustomerNumber = cpCustomerNumber; }

    public Integer getPolicyNumber() { return policyNumber; }

    public void setPolicyNumber(Integer PolicyNumber) { this.policyNumber = PolicyNumber; }

    public String getPolicyNumberSuffix() { return policyNumberSuffix; }

    public void setPolicyNumberSuffix(String PolicyNumberSuffix) { this.policyNumberSuffix = PolicyNumberSuffix; }

    public String getLineOfBusiness() { return lineOfBusiness; }

    public void setLineOfBusiness(String LineOfBusiness) { this.lineOfBusiness = LineOfBusiness; }



    public Date getPolicyEffectiveDate() { return policyEffectiveDate; }

    public void setPolicyEffectiveDate(Date PolicyEffectiveDate) { this.policyEffectiveDate = PolicyEffectiveDate; }

    public Date getExtractedDate() { return extractedDate; }

    public void setExtractedDate(Date ExtractedDate) { this.extractedDate = ExtractedDate; }

    public String getWritingCompany() { return writingCompany; }

    public void setWritingCompany(String WritingCompany) { this.writingCompany = WritingCompany; }

    public Float getTotalPremium() { return totalPremium; }

    public void setTotalPremium(Float TotalPremium) { this.totalPremium = TotalPremium; }

    public Integer getSourceCode() { return sourceCode; }

    public void setSourceCode(Integer SourceCode) { this.sourceCode = SourceCode; }

    public Integer getAgentIdea() { return agentIdea; }

    public void setAgentIdea(Integer AgentIdea) { this.agentIdea = AgentIdea; }

    public String getReferralAgent1() { return referralAgent1; }

    public void setReferralAgent1(String ReferralAgent1) { this.referralAgent1 = ReferralAgent1; }

    public String getReferralAgent2() { return referralAgent2; }

    public void setReferralAgent2(String ReferralAgent2) { this.referralAgent2 = ReferralAgent2; }

    public String getGPCcode() { return gpcCode; }

    public void setGPCcode(String GPCcode) { this.gpcCode = gpcCode; }

    public String getBillMode() { return billMode; }

    public void setBillMode(String BillMode) { this.billMode = BillMode; }

    public String getPayPlan() { return payPlan; }

    public void setPayPlan(String PayPlan) { this.payPlan = PayPlan; }

    public Integer getNumberDrivers() { return numberDrivers; }

    public void setNumberDrivers(Integer lNumberDrivers) { this.numberDrivers = lNumberDrivers; }

    public Integer getNumberVehicles() { return numberVehicles; }

    public void setNumberVehicles(Integer lNumberVehicles) { this.numberVehicles = numberVehicles; }

    public Integer getNumberExposures() { return numberExposures; }

    public void setNumberExposures(Integer NumberExposures) { this.numberExposures = NumberExposures; }

    public String getNamedInsured() { return namedInsured; }

    public void setNamedInsured(String NamedInsured) { this.namedInsured = NamedInsured; }

    public String getMailingAddress() { return mailingAddress; }

    public void setMailingAddress(String MailingAddress) { this.mailingAddress = MailingAddress; }

    public String getHomeAddress() { return homeAddress; }

    public void setHomeAddress(String HomeAddress) { this.homeAddress = HomeAddress; }

    public String getDistributionCode() { return distributionCode; }

    public void setDistributionCode(String DistributionCode) { this.distributionCode = DistributionCode; }

    public String getmcgIndicator() { return mcgIndicator; }

    public void setmcgIndicator(String mcgIndicator) { this.mcgIndicator = mcgIndicator; }

    public Float getStateFees() { return stateFees; }

    public void setStateFees(Float StateFees) { this.stateFees = StateFees; }

    public Float getCompanyFees() { return companyFees; }

    public void setCompanyFees(Float CompanyFees) { this.companyFees = CompanyFees; }

    public String getMigrationStatusIndicator() { return migrationStatusIndicator; }

    public void setMigrationStatusIndicator(String MigrationStatusIndicator) { this.migrationStatusIndicator = MigrationStatusIndicator; }

    public String getTransformationError() { return transformationError; }

    public void setTransformationError(String transformationError) { this.transformationError = transformationError; }

    public Date getTransformationErrorDate() { return transformationErrorDate; }

    public void setTransformationErrorDate(Date transformationErrorDate) { this.transformationErrorDate = transformationErrorDate; }

    public String getTransformationErrorCodes() { return transformationErrorCodes; }

    public void setTransformationErrorCodes(String transformationErrorCodes) { this.transformationErrorCodes = transformationErrorCodes; }

    public String getTransformationErrorDescription() { return transformationErrorDescription; }

    public void setTransformationErrorDescription(String transformationErrorDescription) { this.transformationErrorDescription = transformationErrorDescription; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

}
