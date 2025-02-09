/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.Address;
import com.xero.models.accounting.Attachment;
import com.xero.models.accounting.Balances;
import com.xero.models.accounting.BatchPaymentDetails;
import com.xero.models.accounting.BrandingTheme;
import com.xero.models.accounting.ContactGroup;
import com.xero.models.accounting.ContactPerson;
import com.xero.models.accounting.CurrencyCode;
import com.xero.models.accounting.PaymentTerm;
import com.xero.models.accounting.Phone;
import com.xero.models.accounting.SalesTrackingCategory;
import com.xero.models.accounting.ValidationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Contact
 */

public class Contact {
  
  @JsonProperty("ContactID")
  private UUID contactID;

  
  @JsonProperty("ContactNumber")
  private String contactNumber;

  
  @JsonProperty("AccountNumber")
  private String accountNumber;

  /**
   * Current status of a contact – see contact status types
   */
  public enum ContactStatusEnum {
    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED"),
    
    GDPRREQUEST("GDPRREQUEST");

    private String value;

    ContactStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContactStatusEnum fromValue(String value) {
      for (ContactStatusEnum b : ContactStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  
  @JsonProperty("ContactStatus")
  private ContactStatusEnum contactStatus;

  
  @JsonProperty("Name")
  private String name;

  
  @JsonProperty("FirstName")
  private String firstName;

  
  @JsonProperty("LastName")
  private String lastName;

  
  @JsonProperty("EmailAddress")
  private String emailAddress;

  
  @JsonProperty("SkypeUserName")
  private String skypeUserName;

  
  @JsonProperty("ContactPersons")
  private List<ContactPerson> contactPersons = new ArrayList<ContactPerson>();

  
  @JsonProperty("BankAccountDetails")
  private String bankAccountDetails;

  
  @JsonProperty("TaxNumber")
  private String taxNumber;

  
  @JsonProperty("AccountsReceivableTaxType")
  private String accountsReceivableTaxType;

  
  @JsonProperty("AccountsPayableTaxType")
  private String accountsPayableTaxType;

  
  @JsonProperty("Addresses")
  private List<Address> addresses = new ArrayList<Address>();

  
  @JsonProperty("Phones")
  private List<Phone> phones = new ArrayList<Phone>();

  
  @JsonProperty("IsSupplier")
  private Boolean isSupplier;

  
  @JsonProperty("IsCustomer")
  private Boolean isCustomer;

  
  @JsonProperty("DefaultCurrency")
  private CurrencyCode defaultCurrency;

  
  @JsonProperty("XeroNetworkKey")
  private String xeroNetworkKey;

  
  @JsonProperty("SalesDefaultAccountCode")
  private String salesDefaultAccountCode;

  
  @JsonProperty("PurchasesDefaultAccountCode")
  private String purchasesDefaultAccountCode;

  
  @JsonProperty("SalesTrackingCategories")
  private List<SalesTrackingCategory> salesTrackingCategories = new ArrayList<SalesTrackingCategory>();

  
  @JsonProperty("PurchasesTrackingCategories")
  private List<SalesTrackingCategory> purchasesTrackingCategories = new ArrayList<SalesTrackingCategory>();

  
  @JsonProperty("TrackingCategoryName")
  private String trackingCategoryName;

  
  @JsonProperty("TrackingCategoryOption")
  private String trackingCategoryOption;

  
  @JsonProperty("PaymentTerms")
  private PaymentTerm paymentTerms = null;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("UpdatedDateUTC")
  private OffsetDateTime updatedDateUTC;

  
  @JsonProperty("ContactGroups")
  private List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();

  
  @JsonProperty("Website")
  private String website;

  
  @JsonProperty("BrandingTheme")
  private BrandingTheme brandingTheme = null;

  
  @JsonProperty("BatchPayments")
  private BatchPaymentDetails batchPayments = null;

  
  @JsonProperty("Discount")
  private Double discount;

  
  @JsonProperty("Balances")
  private Balances balances = null;

  
  @JsonProperty("Attachments")
  private List<Attachment> attachments = new ArrayList<Attachment>();

  
  @JsonProperty("HasAttachments")
  private Boolean hasAttachments;

  
  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  
  @JsonProperty("HasValidationErrors")
  private Boolean hasValidationErrors;

  public Contact contactID(UUID contactID) {
    this.contactID = contactID;
    return this;
  }

   /**
   * Xero identifier
   * @return contactID
  **/
  @ApiModelProperty(value = "Xero identifier")
  public UUID getContactID() {
    return contactID;
  }

  public void setContactID(UUID contactID) {
    this.contactID = contactID;
  }

  public Contact contactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
    return this;
  }

   /**
   * This can be updated via the API only i.e. This field is read only on the Xero contact screen, used to identify contacts in external systems (max length &#x3D; 50). If the Contact Number is used, this is displayed as Contact Code in the Contacts UI in Xero.
   * @return contactNumber
  **/
  @ApiModelProperty(value = "This can be updated via the API only i.e. This field is read only on the Xero contact screen, used to identify contacts in external systems (max length = 50). If the Contact Number is used, this is displayed as Contact Code in the Contacts UI in Xero.")
  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  public Contact accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * A user defined account number. This can be updated via the API and the Xero UI (max length &#x3D; 50)
   * @return accountNumber
  **/
  @ApiModelProperty(value = "A user defined account number. This can be updated via the API and the Xero UI (max length = 50)")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Contact contactStatus(ContactStatusEnum contactStatus) {
    this.contactStatus = contactStatus;
    return this;
  }

   /**
   * Current status of a contact – see contact status types
   * @return contactStatus
  **/
  @ApiModelProperty(value = "Current status of a contact – see contact status types")
  public ContactStatusEnum getContactStatus() {
    return contactStatus;
  }

  public void setContactStatus(ContactStatusEnum contactStatus) {
    this.contactStatus = contactStatus;
  }

  public Contact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Full name of contact/organisation (max length &#x3D; 255)
   * @return name
  **/
  @ApiModelProperty(value = "Full name of contact/organisation (max length = 255)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Contact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of contact person (max length &#x3D; 255)
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of contact person (max length = 255)")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Contact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of contact person (max length &#x3D; 255)
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of contact person (max length = 255)")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Contact emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address of contact person (umlauts not supported) (max length  &#x3D; 255)
   * @return emailAddress
  **/
  @ApiModelProperty(value = "Email address of contact person (umlauts not supported) (max length  = 255)")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Contact skypeUserName(String skypeUserName) {
    this.skypeUserName = skypeUserName;
    return this;
  }

   /**
   * Skype user name of contact
   * @return skypeUserName
  **/
  @ApiModelProperty(value = "Skype user name of contact")
  public String getSkypeUserName() {
    return skypeUserName;
  }

  public void setSkypeUserName(String skypeUserName) {
    this.skypeUserName = skypeUserName;
  }

  public Contact contactPersons(List<ContactPerson> contactPersons) {
    this.contactPersons = contactPersons;
    return this;
  }

  public Contact addContactPersonsItem(ContactPerson contactPersonsItem) {
    if (this.contactPersons == null) {
      this.contactPersons = new ArrayList<ContactPerson>();
    }
    this.contactPersons.add(contactPersonsItem);
    return this;
  }

   /**
   * See contact persons
   * @return contactPersons
  **/
  @ApiModelProperty(value = "See contact persons")
  public List<ContactPerson> getContactPersons() {
    return contactPersons;
  }

  public void setContactPersons(List<ContactPerson> contactPersons) {
    this.contactPersons = contactPersons;
  }

  public Contact bankAccountDetails(String bankAccountDetails) {
    this.bankAccountDetails = bankAccountDetails;
    return this;
  }

   /**
   * Bank account number of contact
   * @return bankAccountDetails
  **/
  @ApiModelProperty(value = "Bank account number of contact")
  public String getBankAccountDetails() {
    return bankAccountDetails;
  }

  public void setBankAccountDetails(String bankAccountDetails) {
    this.bankAccountDetails = bankAccountDetails;
  }

  public Contact taxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
    return this;
  }

   /**
   * Tax number of contact – this is also known as the ABN (Australia), GST Number (New Zealand), VAT Number (UK) or Tax ID Number (US and global) in the Xero UI depending on which regionalized version of Xero you are using (max length &#x3D; 50)
   * @return taxNumber
  **/
  @ApiModelProperty(value = "Tax number of contact – this is also known as the ABN (Australia), GST Number (New Zealand), VAT Number (UK) or Tax ID Number (US and global) in the Xero UI depending on which regionalized version of Xero you are using (max length = 50)")
  public String getTaxNumber() {
    return taxNumber;
  }

  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }

  public Contact accountsReceivableTaxType(String accountsReceivableTaxType) {
    this.accountsReceivableTaxType = accountsReceivableTaxType;
    return this;
  }

   /**
   * The tax type from TaxRates
   * @return accountsReceivableTaxType
  **/
  @ApiModelProperty(value = "The tax type from TaxRates")
  public String getAccountsReceivableTaxType() {
    return accountsReceivableTaxType;
  }

  public void setAccountsReceivableTaxType(String accountsReceivableTaxType) {
    this.accountsReceivableTaxType = accountsReceivableTaxType;
  }

  public Contact accountsPayableTaxType(String accountsPayableTaxType) {
    this.accountsPayableTaxType = accountsPayableTaxType;
    return this;
  }

   /**
   * The tax type from TaxRates
   * @return accountsPayableTaxType
  **/
  @ApiModelProperty(value = "The tax type from TaxRates")
  public String getAccountsPayableTaxType() {
    return accountsPayableTaxType;
  }

  public void setAccountsPayableTaxType(String accountsPayableTaxType) {
    this.accountsPayableTaxType = accountsPayableTaxType;
  }

  public Contact addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Contact addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<Address>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Store certain address types for a contact – see address types
   * @return addresses
  **/
  @ApiModelProperty(value = "Store certain address types for a contact – see address types")
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public Contact phones(List<Phone> phones) {
    this.phones = phones;
    return this;
  }

  public Contact addPhonesItem(Phone phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<Phone>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * Store certain phone types for a contact – see phone types
   * @return phones
  **/
  @ApiModelProperty(value = "Store certain phone types for a contact – see phone types")
  public List<Phone> getPhones() {
    return phones;
  }

  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }

  public Contact isSupplier(Boolean isSupplier) {
    this.isSupplier = isSupplier;
    return this;
  }

   /**
   * true or false – Boolean that describes if a contact that has any AP  invoices entered against them. Cannot be set via PUT or POST – it is automatically set when an accounts payable invoice is generated against this contact.
   * @return isSupplier
  **/
  @ApiModelProperty(value = "true or false – Boolean that describes if a contact that has any AP  invoices entered against them. Cannot be set via PUT or POST – it is automatically set when an accounts payable invoice is generated against this contact.")
  public Boolean getIsSupplier() {
    return isSupplier;
  }

  public void setIsSupplier(Boolean isSupplier) {
    this.isSupplier = isSupplier;
  }

  public Contact isCustomer(Boolean isCustomer) {
    this.isCustomer = isCustomer;
    return this;
  }

   /**
   * true or false – Boolean that describes if a contact has any AR invoices entered against them. Cannot be set via PUT or POST – it is automatically set when an accounts receivable invoice is generated against this contact.
   * @return isCustomer
  **/
  @ApiModelProperty(value = "true or false – Boolean that describes if a contact has any AR invoices entered against them. Cannot be set via PUT or POST – it is automatically set when an accounts receivable invoice is generated against this contact.")
  public Boolean getIsCustomer() {
    return isCustomer;
  }

  public void setIsCustomer(Boolean isCustomer) {
    this.isCustomer = isCustomer;
  }

  public Contact defaultCurrency(CurrencyCode defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Get defaultCurrency
   * @return defaultCurrency
  **/
  @ApiModelProperty(value = "")
  public CurrencyCode getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(CurrencyCode defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public Contact xeroNetworkKey(String xeroNetworkKey) {
    this.xeroNetworkKey = xeroNetworkKey;
    return this;
  }

   /**
   * Store XeroNetworkKey for contacts.
   * @return xeroNetworkKey
  **/
  @ApiModelProperty(value = "Store XeroNetworkKey for contacts.")
  public String getXeroNetworkKey() {
    return xeroNetworkKey;
  }

  public void setXeroNetworkKey(String xeroNetworkKey) {
    this.xeroNetworkKey = xeroNetworkKey;
  }

  public Contact salesDefaultAccountCode(String salesDefaultAccountCode) {
    this.salesDefaultAccountCode = salesDefaultAccountCode;
    return this;
  }

   /**
   * The default sales account code for contacts
   * @return salesDefaultAccountCode
  **/
  @ApiModelProperty(value = "The default sales account code for contacts")
  public String getSalesDefaultAccountCode() {
    return salesDefaultAccountCode;
  }

  public void setSalesDefaultAccountCode(String salesDefaultAccountCode) {
    this.salesDefaultAccountCode = salesDefaultAccountCode;
  }

  public Contact purchasesDefaultAccountCode(String purchasesDefaultAccountCode) {
    this.purchasesDefaultAccountCode = purchasesDefaultAccountCode;
    return this;
  }

   /**
   * The default purchases account code for contacts
   * @return purchasesDefaultAccountCode
  **/
  @ApiModelProperty(value = "The default purchases account code for contacts")
  public String getPurchasesDefaultAccountCode() {
    return purchasesDefaultAccountCode;
  }

  public void setPurchasesDefaultAccountCode(String purchasesDefaultAccountCode) {
    this.purchasesDefaultAccountCode = purchasesDefaultAccountCode;
  }

  public Contact salesTrackingCategories(List<SalesTrackingCategory> salesTrackingCategories) {
    this.salesTrackingCategories = salesTrackingCategories;
    return this;
  }

  public Contact addSalesTrackingCategoriesItem(SalesTrackingCategory salesTrackingCategoriesItem) {
    if (this.salesTrackingCategories == null) {
      this.salesTrackingCategories = new ArrayList<SalesTrackingCategory>();
    }
    this.salesTrackingCategories.add(salesTrackingCategoriesItem);
    return this;
  }

   /**
   * The default sales tracking categories for contacts
   * @return salesTrackingCategories
  **/
  @ApiModelProperty(value = "The default sales tracking categories for contacts")
  public List<SalesTrackingCategory> getSalesTrackingCategories() {
    return salesTrackingCategories;
  }

  public void setSalesTrackingCategories(List<SalesTrackingCategory> salesTrackingCategories) {
    this.salesTrackingCategories = salesTrackingCategories;
  }

  public Contact purchasesTrackingCategories(List<SalesTrackingCategory> purchasesTrackingCategories) {
    this.purchasesTrackingCategories = purchasesTrackingCategories;
    return this;
  }

  public Contact addPurchasesTrackingCategoriesItem(SalesTrackingCategory purchasesTrackingCategoriesItem) {
    if (this.purchasesTrackingCategories == null) {
      this.purchasesTrackingCategories = new ArrayList<SalesTrackingCategory>();
    }
    this.purchasesTrackingCategories.add(purchasesTrackingCategoriesItem);
    return this;
  }

   /**
   * The default purchases tracking categories for contacts
   * @return purchasesTrackingCategories
  **/
  @ApiModelProperty(value = "The default purchases tracking categories for contacts")
  public List<SalesTrackingCategory> getPurchasesTrackingCategories() {
    return purchasesTrackingCategories;
  }

  public void setPurchasesTrackingCategories(List<SalesTrackingCategory> purchasesTrackingCategories) {
    this.purchasesTrackingCategories = purchasesTrackingCategories;
  }

  public Contact trackingCategoryName(String trackingCategoryName) {
    this.trackingCategoryName = trackingCategoryName;
    return this;
  }

   /**
   * The name of the Tracking Category assigned to the contact under SalesTrackingCategories and PurchasesTrackingCategories
   * @return trackingCategoryName
  **/
  @ApiModelProperty(value = "The name of the Tracking Category assigned to the contact under SalesTrackingCategories and PurchasesTrackingCategories")
  public String getTrackingCategoryName() {
    return trackingCategoryName;
  }

  public void setTrackingCategoryName(String trackingCategoryName) {
    this.trackingCategoryName = trackingCategoryName;
  }

  public Contact trackingCategoryOption(String trackingCategoryOption) {
    this.trackingCategoryOption = trackingCategoryOption;
    return this;
  }

   /**
   * The name of the Tracking Option assigned to the contact under SalesTrackingCategories and PurchasesTrackingCategories
   * @return trackingCategoryOption
  **/
  @ApiModelProperty(value = "The name of the Tracking Option assigned to the contact under SalesTrackingCategories and PurchasesTrackingCategories")
  public String getTrackingCategoryOption() {
    return trackingCategoryOption;
  }

  public void setTrackingCategoryOption(String trackingCategoryOption) {
    this.trackingCategoryOption = trackingCategoryOption;
  }

  public Contact paymentTerms(PaymentTerm paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * Get paymentTerms
   * @return paymentTerms
  **/
  @ApiModelProperty(value = "")
  public PaymentTerm getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerm paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public Contact updatedDateUTC(OffsetDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * UTC timestamp of last update to contact
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of last update to contact")
  public OffsetDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(OffsetDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  public Contact contactGroups(List<ContactGroup> contactGroups) {
    this.contactGroups = contactGroups;
    return this;
  }

  public Contact addContactGroupsItem(ContactGroup contactGroupsItem) {
    if (this.contactGroups == null) {
      this.contactGroups = new ArrayList<ContactGroup>();
    }
    this.contactGroups.add(contactGroupsItem);
    return this;
  }

   /**
   * Displays which contact groups a contact is included in
   * @return contactGroups
  **/
  @ApiModelProperty(value = "Displays which contact groups a contact is included in")
  public List<ContactGroup> getContactGroups() {
    return contactGroups;
  }

  public void setContactGroups(List<ContactGroup> contactGroups) {
    this.contactGroups = contactGroups;
  }

   /**
   * Website address for contact (read only)
   * @return website
  **/
  @ApiModelProperty(value = "Website address for contact (read only)")
  public String getWebsite() {
    return website;
  }

  public Contact brandingTheme(BrandingTheme brandingTheme) {
    this.brandingTheme = brandingTheme;
    return this;
  }

   /**
   * Get brandingTheme
   * @return brandingTheme
  **/
  @ApiModelProperty(value = "")
  public BrandingTheme getBrandingTheme() {
    return brandingTheme;
  }

  public void setBrandingTheme(BrandingTheme brandingTheme) {
    this.brandingTheme = brandingTheme;
  }

  public Contact batchPayments(BatchPaymentDetails batchPayments) {
    this.batchPayments = batchPayments;
    return this;
  }

   /**
   * Get batchPayments
   * @return batchPayments
  **/
  @ApiModelProperty(value = "")
  public BatchPaymentDetails getBatchPayments() {
    return batchPayments;
  }

  public void setBatchPayments(BatchPaymentDetails batchPayments) {
    this.batchPayments = batchPayments;
  }

   /**
   * The default discount rate for the contact (read only)
   * @return discount
  **/
  @ApiModelProperty(value = "The default discount rate for the contact (read only)")
  public Double getDiscount() {
    return discount;
  }

  public Contact balances(Balances balances) {
    this.balances = balances;
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")
  public Balances getBalances() {
    return balances;
  }

  public void setBalances(Balances balances) {
    this.balances = balances;
  }

  public Contact attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Contact addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Displays array of attachments from the API
   * @return attachments
  **/
  @ApiModelProperty(value = "Displays array of attachments from the API")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public Contact hasAttachments(Boolean hasAttachments) {
    this.hasAttachments = hasAttachments;
    return this;
  }

   /**
   * A boolean to indicate if a contact has an attachment
   * @return hasAttachments
  **/
  @ApiModelProperty(value = "A boolean to indicate if a contact has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  public void setHasAttachments(Boolean hasAttachments) {
    this.hasAttachments = hasAttachments;
  }

  public Contact validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Contact addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Displays validation errors returned from the API
   * @return validationErrors
  **/
  @ApiModelProperty(value = "Displays validation errors returned from the API")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  public Contact hasValidationErrors(Boolean hasValidationErrors) {
    this.hasValidationErrors = hasValidationErrors;
    return this;
  }

   /**
   * A boolean to indicate if a contact has an validation errors
   * @return hasValidationErrors
  **/
  @ApiModelProperty(value = "A boolean to indicate if a contact has an validation errors")
  public Boolean getHasValidationErrors() {
    return hasValidationErrors;
  }

  public void setHasValidationErrors(Boolean hasValidationErrors) {
    this.hasValidationErrors = hasValidationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.contactID, contact.contactID) &&
        Objects.equals(this.contactNumber, contact.contactNumber) &&
        Objects.equals(this.accountNumber, contact.accountNumber) &&
        Objects.equals(this.contactStatus, contact.contactStatus) &&
        Objects.equals(this.name, contact.name) &&
        Objects.equals(this.firstName, contact.firstName) &&
        Objects.equals(this.lastName, contact.lastName) &&
        Objects.equals(this.emailAddress, contact.emailAddress) &&
        Objects.equals(this.skypeUserName, contact.skypeUserName) &&
        Objects.equals(this.contactPersons, contact.contactPersons) &&
        Objects.equals(this.bankAccountDetails, contact.bankAccountDetails) &&
        Objects.equals(this.taxNumber, contact.taxNumber) &&
        Objects.equals(this.accountsReceivableTaxType, contact.accountsReceivableTaxType) &&
        Objects.equals(this.accountsPayableTaxType, contact.accountsPayableTaxType) &&
        Objects.equals(this.addresses, contact.addresses) &&
        Objects.equals(this.phones, contact.phones) &&
        Objects.equals(this.isSupplier, contact.isSupplier) &&
        Objects.equals(this.isCustomer, contact.isCustomer) &&
        Objects.equals(this.defaultCurrency, contact.defaultCurrency) &&
        Objects.equals(this.xeroNetworkKey, contact.xeroNetworkKey) &&
        Objects.equals(this.salesDefaultAccountCode, contact.salesDefaultAccountCode) &&
        Objects.equals(this.purchasesDefaultAccountCode, contact.purchasesDefaultAccountCode) &&
        Objects.equals(this.salesTrackingCategories, contact.salesTrackingCategories) &&
        Objects.equals(this.purchasesTrackingCategories, contact.purchasesTrackingCategories) &&
        Objects.equals(this.trackingCategoryName, contact.trackingCategoryName) &&
        Objects.equals(this.trackingCategoryOption, contact.trackingCategoryOption) &&
        Objects.equals(this.paymentTerms, contact.paymentTerms) &&
        Objects.equals(this.updatedDateUTC, contact.updatedDateUTC) &&
        Objects.equals(this.contactGroups, contact.contactGroups) &&
        Objects.equals(this.website, contact.website) &&
        Objects.equals(this.brandingTheme, contact.brandingTheme) &&
        Objects.equals(this.batchPayments, contact.batchPayments) &&
        Objects.equals(this.discount, contact.discount) &&
        Objects.equals(this.balances, contact.balances) &&
        Objects.equals(this.attachments, contact.attachments) &&
        Objects.equals(this.hasAttachments, contact.hasAttachments) &&
        Objects.equals(this.validationErrors, contact.validationErrors) &&
        Objects.equals(this.hasValidationErrors, contact.hasValidationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactID, contactNumber, accountNumber, contactStatus, name, firstName, lastName, emailAddress, skypeUserName, contactPersons, bankAccountDetails, taxNumber, accountsReceivableTaxType, accountsPayableTaxType, addresses, phones, isSupplier, isCustomer, defaultCurrency, xeroNetworkKey, salesDefaultAccountCode, purchasesDefaultAccountCode, salesTrackingCategories, purchasesTrackingCategories, trackingCategoryName, trackingCategoryOption, paymentTerms, updatedDateUTC, contactGroups, website, brandingTheme, batchPayments, discount, balances, attachments, hasAttachments, validationErrors, hasValidationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    contactID: ").append(toIndentedString(contactID)).append("\n");
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    contactStatus: ").append(toIndentedString(contactStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    skypeUserName: ").append(toIndentedString(skypeUserName)).append("\n");
    sb.append("    contactPersons: ").append(toIndentedString(contactPersons)).append("\n");
    sb.append("    bankAccountDetails: ").append(toIndentedString(bankAccountDetails)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("    accountsReceivableTaxType: ").append(toIndentedString(accountsReceivableTaxType)).append("\n");
    sb.append("    accountsPayableTaxType: ").append(toIndentedString(accountsPayableTaxType)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    isSupplier: ").append(toIndentedString(isSupplier)).append("\n");
    sb.append("    isCustomer: ").append(toIndentedString(isCustomer)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    xeroNetworkKey: ").append(toIndentedString(xeroNetworkKey)).append("\n");
    sb.append("    salesDefaultAccountCode: ").append(toIndentedString(salesDefaultAccountCode)).append("\n");
    sb.append("    purchasesDefaultAccountCode: ").append(toIndentedString(purchasesDefaultAccountCode)).append("\n");
    sb.append("    salesTrackingCategories: ").append(toIndentedString(salesTrackingCategories)).append("\n");
    sb.append("    purchasesTrackingCategories: ").append(toIndentedString(purchasesTrackingCategories)).append("\n");
    sb.append("    trackingCategoryName: ").append(toIndentedString(trackingCategoryName)).append("\n");
    sb.append("    trackingCategoryOption: ").append(toIndentedString(trackingCategoryOption)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    contactGroups: ").append(toIndentedString(contactGroups)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    brandingTheme: ").append(toIndentedString(brandingTheme)).append("\n");
    sb.append("    batchPayments: ").append(toIndentedString(batchPayments)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    hasValidationErrors: ").append(toIndentedString(hasValidationErrors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

