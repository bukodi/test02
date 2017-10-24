package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of transaction that resulted in a payment initiation.
 */
public class PaymentPurposeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is the payment of salaries.
	 */
	public static final MMCode SalaryPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SalaryPayment";
			definition = "Transaction is the payment of salaries.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "SALA";
		}
	};
	/**
	 * Transaction is related to treasury operations.
	 */
	public static final MMCode TreasuryPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryPayment";
			definition = "Transaction is related to treasury operations.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "TREA";
		}
	};
	/**
	 * Transaction is an advance payment.
	 */
	public static final MMCode AdvancePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdvancePayment";
			definition = "Transaction is an advance payment.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "ADVA";
		}
	};
	/**
	 * Transaction is related to the agricultural domain.
	 */
	public static final MMCode AgriculturalTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgriculturalTransfer";
			definition = "Transaction is related to the agricultural domain.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "AGRT";
		}
	};
	/**
	 * Transaction is the payment of alimony.
	 */
	public static final MMCode AlimonyPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AlimonyPayment";
			definition = "Transaction is the payment of alimony.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "ALMY";
		}
	};
	/**
	 * Transaction is related to a payment made to assist parent/guardian to
	 * maintain child.
	 */
	public static final MMCode ChildBenefit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChildBenefit";
			definition = "Transaction is related to a payment made to assist parent/guardian to maintain child.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "BECH";
		}
	};
	/**
	 * Transaction is related to a payment to a person who is
	 * unemployed/disabled.
	 */
	public static final MMCode UnemploymentDisabilityBenefit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnemploymentDisabilityBenefit";
			definition = "Transaction is related to a payment to a person who is unemployed/disabled.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "BENE";
		}
	};
	/**
	 * Transaction is related to payment of a bonus.
	 */
	public static final MMCode BonusPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BonusPayment";
			definition = "Transaction is related to payment of a bonus.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "BONU";
		}
	};
	/**
	 * Transaction is a general cash management instruction.
	 */
	public static final MMCode CashManagementTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashManagementTransfer";
			definition = "Transaction is a general cash management instruction.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Transaction is related to capital building fringe fortune, ie capital
	 * building for retirement.
	 */
	public static final MMCode CapitalBuilding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalBuilding";
			definition = "Transaction is related to capital building fringe fortune, ie capital building for retirement.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CBFF";
		}
	};
	/**
	 * Transaction is a payment for charity reasons.
	 */
	public static final MMCode CharityPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CharityPayment";
			definition = "Transaction is a payment for charity reasons.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Transaction is a collection of funds initiated via a credit transfer or
	 * direct debit.
	 */
	public static final MMCode CollectionPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionPayment";
			definition = "Transaction is a collection of funds initiated via a credit transfer or direct debit.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Transaction is payment of commodities.
	 */
	public static final MMCode CommodityTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommodityTransfer";
			definition = "Transaction is payment of commodities.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CMDT";
		}
	};
	/**
	 * Transaction is related to a payment of commercial credit or debit.
	 * (formerly CommercialCredit)
	 */
	public static final MMCode CommercialPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialPayment";
			definition = "Transaction is related to a payment of commercial credit or debit. (formerly CommercialCredit)";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "COMC";
		}
	};
	/**
	 * Transaction is payment of commission.
	 */
	public static final MMCode Commission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Transaction is payment of commission.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Transaction is related to payment of costs.
	 */
	public static final MMCode Costs = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Costs";
			definition = "Transaction is related to payment of costs.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "COST";
		}
	};
	/**
	 * Transaction is payment of copyright.
	 */
	public static final MMCode Copyright = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Copyright";
			definition = "Transaction is payment of copyright.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CPYR";
		}
	};
	/**
	 * Transaction is payment of dividends.
	 */
	public static final MMCode Dividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Transaction is payment of dividends.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Transaction is related to a foreign exchange operation.
	 */
	public static final MMCode ForeignExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchange";
			definition = "Transaction is related to a foreign exchange operation.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "FREX";
		}
	};
	/**
	 * Transaction is related to purchase and sale of goods.
	 */
	public static final MMCode PurchaseSaleOfGoods = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseSaleOfGoods";
			definition = "Transaction is related to purchase and sale of goods.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "GDDS";
		}
	};
	/**
	 * Transaction is a payment to or from a government department.
	 */
	public static final MMCode GovernmentPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernmentPayment";
			definition = "Transaction is a payment to or from a government department.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "GOVT";
		}
	};
	/**
	 * Transaction is payment for an installment/hire-purchase agreement.
	 */
	public static final MMCode InstalmentHirePurchaseAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstalmentHirePurchaseAgreement";
			definition = "Transaction is payment for an installment/hire-purchase agreement.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "IHRP";
		}
	};
	/**
	 * Transaction is an intra-company payment, ie, a payment between two
	 * companies belonging to the same group.
	 */
	public static final MMCode IntraCompanyPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntraCompanyPayment";
			definition = "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "INTC";
		}
	};
	/**
	 * Transaction is payment of an insurance premium.
	 */
	public static final MMCode InsurancePremium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsurancePremium";
			definition = "Transaction is payment of an insurance premium.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "INSU";
		}
	};
	/**
	 * Transaction is payment of interest.
	 */
	public static final MMCode Interest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Transaction is payment of interest.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Transaction is payment of a license fee.
	 */
	public static final MMCode LicenseFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LicenseFee";
			definition = "Transaction is payment of a license fee.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "LICF";
		}
	};
	/**
	 * Transaction is related to transfer of loan to borrower.
	 */
	public static final MMCode Loan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Loan";
			definition = "Transaction is related to transfer of loan to borrower.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Transaction is related to repayment of loan to lender.
	 */
	public static final MMCode LoanRepayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LoanRepayment";
			definition = "Transaction is related to repayment of loan to lender.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "LOAR";
		}
	};
	/**
	 * Transaction is related to a netting operation.
	 */
	public static final MMCode Netting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Transaction is related to a netting operation.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * Transaction is related to the payment of payroll.
	 */
	public static final MMCode Payroll = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payroll";
			definition = "Transaction is related to the payment of payroll.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "PAYR";
		}
	};
	/**
	 * Transaction is the payment of pension.
	 */
	public static final MMCode PensionPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PensionPayment";
			definition = "Transaction is the payment of pension.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "PENS";
		}
	};
	/**
	 * Transaction is the payment of a refund.
	 */
	public static final MMCode Refund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Transaction is the payment of a refund.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "REFU";
		}
	};
	/**
	 * Transaction is the payment of rent.
	 */
	public static final MMCode Rent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rent";
			definition = "Transaction is the payment of rent.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "RENT";
		}
	};
	/**
	 * Transaction is the payment of royalties.
	 */
	public static final MMCode Royalties = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Royalties";
			definition = "Transaction is the payment of royalties.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "ROYA";
		}
	};
	/**
	 * Transaction is related to purchase and sale of services.
	 */
	public static final MMCode PurchaseSaleOfServices = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseSaleOfServices";
			definition = "Transaction is related to purchase and sale of services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "SCVE";
		}
	};
	/**
	 * Transaction is the payment of securities.
	 */
	public static final MMCode Securities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Securities";
			definition = "Transaction is the payment of securities.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Transaction is a social security benefit, ie payment made by a government
	 * to support individuals.
	 */
	public static final MMCode SocialSecurityBenefit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityBenefit";
			definition = "Transaction is a social security benefit, ie payment made by a government to support individuals.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "SSBE";
		}
	};
	/**
	 * Transaction is related to a payment of information or entertainment
	 * services either in printed or electronic form.
	 */
	public static final MMCode Subscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "Transaction is related to a payment of information or entertainment services either in printed or electronic form.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Transaction is the payment of taxes.
	 */
	public static final MMCode TaxPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxPayment";
			definition = "Transaction is the payment of taxes.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "TAXS";
		}
	};
	/**
	 * Transaction is the payment of value added tax.
	 */
	public static final MMCode ValueAddedTaxPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTaxPayment";
			definition = "Transaction is the payment of value added tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "VATX";
		}
	};
	/**
	 * Transaction is a payment used by a third party who can collect funds to
	 * pay on behalf of consumers, ie credit counseling or bill payment
	 * companies.
	 */
	public static final MMCode ConsumerThirdPartyConsolidatedPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsumerThirdPartyConsolidatedPayment";
			definition = "Transaction is a payment used by a third party who can collect funds to pay on behalf of consumers, ie credit counseling or bill payment companies.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "COMT";
		}
	};
	/**
	 * Collection of funds initiated via a debit transfer.
	 */
	public static final MMCode DebitCollectionPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitCollectionPayment";
			definition = "Collection of funds initiated via a debit transfer.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "DBTC";
		}
	};
	/**
	 * Transaction is related to a payment to a supplier.
	 */
	public static final MMCode SupplierPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SupplierPayment";
			definition = "Transaction is related to a payment to a supplier.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "SUPP";
		}
	};
	/**
	 * Transaction is related to a hedging operation.
	 */
	public static final MMCode Hedging = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Hedging";
			definition = "Transaction is related to a hedging operation.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "HEDG";
		}
	};
	/**
	 * Transaction is related to a payment for multiple service types.
	 */
	public static final MMCode MultipleServiceTypes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultipleServiceTypes";
			definition = "Transaction is related to a payment for multiple service types.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "MSVC";
		}
	};
	/**
	 * Transaction is related to a payment for type of services not specified
	 * elsewhere.
	 */
	public static final MMCode NotOtherwiseSpecified = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotOtherwiseSpecified";
			definition = "Transaction is related to a payment for type of services not specified elsewhere.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "NOWS";
		}
	};
	/**
	 * Transaction is related to a payment of credit card account.
	 */
	public static final MMCode CardPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Transaction is related to a payment of credit card account.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CARD";
		}
	};
	/**
	 * Transaction is related to a payment of credit card bill.
	 */
	public static final MMCode CreditCardBill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditCardBill";
			definition = "Transaction is related to a payment of credit card bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CDBL";
		}
	};
	/**
	 * Transaction is a payment for ferry related business.
	 */
	public static final MMCode Ferry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Ferry";
			definition = "Transaction is a payment for ferry related business.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "FERB";
		}
	};
	/**
	 * Transaction is a payment for air transport related business.
	 */
	public static final MMCode Air = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Air";
			definition = "Transaction is a payment for air transport related business.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "AIRB";
		}
	};
	/**
	 * Transaction is a payment for bus transport related business.
	 */
	public static final MMCode Bus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bus";
			definition = "Transaction is a payment for bus transport related business.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "BUSB";
		}
	};
	/**
	 * Transaction is a payment for railway transport related business.
	 */
	public static final MMCode Railway = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Railway";
			definition = "Transaction is a payment for railway transport related business.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "RLWY";
		}
	};
	/**
	 * Transaction is a payment for convalescence care facility services.
	 */
	public static final MMCode ConvalescentCareFacility = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConvalescentCareFacility";
			definition = "Transaction is a payment for convalescence care facility services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CVCF";
		}
	};
	/**
	 * Transaction is a payment for dental services.
	 */
	public static final MMCode DentalServices = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DentalServices";
			definition = "Transaction is a payment for dental services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "DNTS";
		}
	};
	/**
	 * Transaction is a payment for anesthesia services.
	 */
	public static final MMCode AnesthesiaServices = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnesthesiaServices";
			definition = "Transaction is a payment for anesthesia services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "ANTS";
		}
	};
	/**
	 * Transaction is a payment for home health care services.
	 */
	public static final MMCode HomeHealthCare = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HomeHealthCare";
			definition = "Transaction is a payment for home health care services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "HLTC";
		}
	};
	/**
	 * Transaction is a payment for hospital care services.
	 */
	public static final MMCode HospitalCare = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HospitalCare";
			definition = "Transaction is a payment for hospital care services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "HSPC";
		}
	};
	/**
	 * Transaction is a payment for intermediate care facility services.
	 */
	public static final MMCode IntermediateCareFacility = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateCareFacility";
			definition = "Transaction is a payment for intermediate care facility services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "ICRF";
		}
	};
	/**
	 * Transaction is a payment for long-term care facility services.
	 */
	public static final MMCode LongTermCareFacility = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LongTermCareFacility";
			definition = "Transaction is a payment for long-term care facility services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "LTCF";
		}
	};
	/**
	 * Transaction is a payment for medical care services.
	 */
	public static final MMCode MedicalServices = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MedicalServices";
			definition = "Transaction is a payment for medical care services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "MDCS";
		}
	};
	/**
	 * Transaction is a payment for vision care services.
	 */
	public static final MMCode VisionCare = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VisionCare";
			definition = "Transaction is a payment for vision care services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "VIEW";
		}
	};
	/**
	 * Transaction is a payment is for use of durable medical equipment.
	 */
	public static final MMCode DurableMedicaleEquipment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DurableMedicaleEquipment";
			definition = "Transaction is a payment is for use of durable medical equipment.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "DMEQ";
		}
	};
	/**
	 * Transaction is related to a payment of cable TV bill.
	 */
	public static final MMCode CableTVBill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CableTVBill";
			definition = "Transaction is related to a payment of cable TV bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CBTV";
		}
	};
	/**
	 * Transaction is related to a payment of electricity bill.
	 */
	public static final MMCode ElectricityBill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectricityBill";
			definition = "Transaction is related to a payment of electricity bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Transaction is related to a payment of gas bill.
	 */
	public static final MMCode GasBill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GasBill";
			definition = "Transaction is related to a payment of gas bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "GASB";
		}
	};
	/**
	 * Transaction is related to a payment of telephone bill.
	 */
	public static final MMCode TelephoneBill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TelephoneBill";
			definition = "Transaction is related to a payment of telephone bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "PHON";
		}
	};
	/**
	 * Transaction is related to a payment of other telecom related bill.
	 */
	public static final MMCode OtherTelecomRelatedBill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherTelecomRelatedBill";
			definition = "Transaction is related to a payment of other telecom related bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "OTLC";
		}
	};
	/**
	 * Transaction is related to a payment of water bill.
	 */
	public static final MMCode WaterBill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WaterBill";
			definition = "Transaction is related to a payment of water bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "WTER";
		}
	};
	/**
	 * Transaction is related to a payment of study/tuition costs.
	 */
	public static final MMCode Study = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Study";
			definition = "Transaction is related to a payment of study/tuition costs.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "STDY";
		}
	};
	/**
	 * Transaction is related to a payment of a price.
	 */
	public static final MMCode PricePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PricePayment";
			definition = "Transaction is related to a payment of a price.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "PRCP";
		}
	};
	/**
	 * Transaction is related to a payment of an installment.
	 */
	public static final MMCode Installment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Installment";
			definition = "Transaction is related to a payment of an installment.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "INSM";
		}
	};
	/**
	 * Transaction is related to a payment of a recurring installment made at
	 * regular intervals.
	 */
	public static final MMCode RecurringInstallmentPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecurringInstallmentPayment";
			definition = "Transaction is related to a payment of a recurring installment made at regular intervals.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "RINP";
		}
	};
	/**
	 * Transaction is related to a payment of opening fee.
	 */
	public static final MMCode OpeningFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningFee";
			definition = "Transaction is related to a payment of opening fee.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "OFEE";
		}
	};
	/**
	 * Transaction is related to a payment of cancellation fee.
	 */
	public static final MMCode CancellationFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationFee";
			definition = "Transaction is related to a payment of cancellation fee.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CFEE";
		}
	};
	/**
	 * Transaction is related to a payment of government insurance.
	 */
	public static final MMCode GovernmentInsurance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernmentInsurance";
			definition = "Transaction is related to a payment of government insurance.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "GOVI";
		}
	};
	/**
	 * Transaction is a payment of car insurance premium.
	 */
	public static final MMCode InsurancePremiumCar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsurancePremiumCar";
			definition = "Transaction is a payment of car insurance premium.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "INPC";
		}
	};
	/**
	 * Transaction is a payment of labor insurance.
	 */
	public static final MMCode LaborInsurance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LaborInsurance";
			definition = "Transaction is a payment of labor insurance.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "LBRI";
		}
	};
	/**
	 * Transaction is a payment of life insurance.
	 */
	public static final MMCode LifeInsurance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LifeInsurance";
			definition = "Transaction is a payment of life insurance.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "LIFI";
		}
	};
	/**
	 * Transaction is a payment of property insurance.
	 */
	public static final MMCode PropertyInsurance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PropertyInsurance";
			definition = "Transaction is a payment of property insurance.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "PPTI";
		}
	};
	/**
	 * Transaction is a payment of health insurance.
	 */
	public static final MMCode HealthInsurance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HealthInsurance";
			definition = "Transaction is a payment of health insurance.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "HLTI";
		}
	};
	/**
	 * Transaction is a payment of car loan principal payment.
	 */
	public static final MMCode CarLoanPrincipalRepayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CarLoanPrincipalRepayment";
			definition = "Transaction is a payment of car loan principal payment.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CLPR";
		}
	};
	/**
	 * Transaction is related to a payment of housing loan.
	 */
	public static final MMCode HousingLoanRepayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HousingLoanRepayment";
			definition = "Transaction is related to a payment of housing loan.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "HLRP";
		}
	};
	/**
	 * Transaction is a payment by a company to a bank for financing social
	 * loans to employees.
	 */
	public static final MMCode CompanySocialLoanPaymentToBank = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CompanySocialLoanPaymentToBank";
			definition = "Transaction is a payment by a company to a bank for financing social loans to employees.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CSLP";
		}
	};
	/**
	 * Transaction is related to a payment of estate tax.
	 */
	public static final MMCode EstateTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EstateTax";
			definition = "Transaction is related to a payment of estate tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "ESTX";
		}
	};
	/**
	 * Transaction is related to a payment of housing tax.
	 */
	public static final MMCode HousingTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HousingTax";
			definition = "Transaction is related to a payment of housing tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "HSTX";
		}
	};
	/**
	 * Transaction is related to a payment of income tax.
	 */
	public static final MMCode IncomeTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomeTax";
			definition = "Transaction is related to a payment of income tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "INTX";
		}
	};
	/**
	 * Transaction is related to a payment of net income tax.
	 */
	public static final MMCode NetIncomeTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetIncomeTax";
			definition = "Transaction is related to a payment of net income tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "NITX";
		}
	};
	/**
	 * Transaction is related to a payment of business expenses.
	 */
	public static final MMCode BusinessExpenses = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessExpenses";
			definition = "Transaction is related to a payment of business expenses.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "BEXP";
		}
	};
	/**
	 * Transaction is related to a payment of a trust fund.
	 */
	public static final MMCode TrustFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TrustFund";
			definition = "Transaction is related to a payment of a trust fund.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "TRFD";
		}
	};
	/**
	 * Transaction is related to a payment of network charges.
	 */
	public static final MMCode NetworkCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetworkCharge";
			definition = "Transaction is related to a payment of network charges.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "NWCH";
		}
	};
	/**
	 * Transaction is related to a payment of network communication.
	 */
	public static final MMCode NetworkCommunication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetworkCommunication";
			definition = "Transaction is related to a payment of network communication.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "NWCM";
		}
	};
	/**
	 * Transaction is related to a payment of receipt.
	 */
	public static final MMCode ReceiptPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceiptPayment";
			definition = "Transaction is related to a payment of receipt.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "RCPT";
		}
	};
	/**
	 * Transaction is related to payment terms specifications
	 */
	public static final MMCode PaymentTerms = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentTerms";
			definition = "Transaction is related to payment terms specifications";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "PTSP";
		}
	};
	/**
	 * Other payment purpose.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Other payment purpose.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Transaction is related to a payment of withholding tax.
	 */
	public static final MMCode WithHolding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithHolding";
			definition = "Transaction is related to a payment of withholding tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "WHLD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SALA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentPurposeCode";
				definition = "Specifies the type of transaction that resulted in a payment initiation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentPurposeCode.SalaryPayment, com.tools20022.repository.codeset.PaymentPurposeCode.TreasuryPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.AdvancePayment, com.tools20022.repository.codeset.PaymentPurposeCode.AgriculturalTransfer, com.tools20022.repository.codeset.PaymentPurposeCode.AlimonyPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.ChildBenefit, com.tools20022.repository.codeset.PaymentPurposeCode.UnemploymentDisabilityBenefit,
						com.tools20022.repository.codeset.PaymentPurposeCode.BonusPayment, com.tools20022.repository.codeset.PaymentPurposeCode.CashManagementTransfer, com.tools20022.repository.codeset.PaymentPurposeCode.CapitalBuilding,
						com.tools20022.repository.codeset.PaymentPurposeCode.CharityPayment, com.tools20022.repository.codeset.PaymentPurposeCode.CollectionPayment, com.tools20022.repository.codeset.PaymentPurposeCode.CommodityTransfer,
						com.tools20022.repository.codeset.PaymentPurposeCode.CommercialPayment, com.tools20022.repository.codeset.PaymentPurposeCode.Commission, com.tools20022.repository.codeset.PaymentPurposeCode.Costs,
						com.tools20022.repository.codeset.PaymentPurposeCode.Copyright, com.tools20022.repository.codeset.PaymentPurposeCode.Dividend, com.tools20022.repository.codeset.PaymentPurposeCode.ForeignExchange,
						com.tools20022.repository.codeset.PaymentPurposeCode.PurchaseSaleOfGoods, com.tools20022.repository.codeset.PaymentPurposeCode.GovernmentPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.InstalmentHirePurchaseAgreement, com.tools20022.repository.codeset.PaymentPurposeCode.IntraCompanyPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.InsurancePremium, com.tools20022.repository.codeset.PaymentPurposeCode.Interest, com.tools20022.repository.codeset.PaymentPurposeCode.LicenseFee,
						com.tools20022.repository.codeset.PaymentPurposeCode.Loan, com.tools20022.repository.codeset.PaymentPurposeCode.LoanRepayment, com.tools20022.repository.codeset.PaymentPurposeCode.Netting,
						com.tools20022.repository.codeset.PaymentPurposeCode.Payroll, com.tools20022.repository.codeset.PaymentPurposeCode.PensionPayment, com.tools20022.repository.codeset.PaymentPurposeCode.Refund,
						com.tools20022.repository.codeset.PaymentPurposeCode.Rent, com.tools20022.repository.codeset.PaymentPurposeCode.Royalties, com.tools20022.repository.codeset.PaymentPurposeCode.PurchaseSaleOfServices,
						com.tools20022.repository.codeset.PaymentPurposeCode.Securities, com.tools20022.repository.codeset.PaymentPurposeCode.SocialSecurityBenefit, com.tools20022.repository.codeset.PaymentPurposeCode.Subscription,
						com.tools20022.repository.codeset.PaymentPurposeCode.TaxPayment, com.tools20022.repository.codeset.PaymentPurposeCode.ValueAddedTaxPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.ConsumerThirdPartyConsolidatedPayment, com.tools20022.repository.codeset.PaymentPurposeCode.DebitCollectionPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.SupplierPayment, com.tools20022.repository.codeset.PaymentPurposeCode.Hedging, com.tools20022.repository.codeset.PaymentPurposeCode.MultipleServiceTypes,
						com.tools20022.repository.codeset.PaymentPurposeCode.NotOtherwiseSpecified, com.tools20022.repository.codeset.PaymentPurposeCode.CardPayment, com.tools20022.repository.codeset.PaymentPurposeCode.CreditCardBill,
						com.tools20022.repository.codeset.PaymentPurposeCode.Ferry, com.tools20022.repository.codeset.PaymentPurposeCode.Air, com.tools20022.repository.codeset.PaymentPurposeCode.Bus,
						com.tools20022.repository.codeset.PaymentPurposeCode.Railway, com.tools20022.repository.codeset.PaymentPurposeCode.ConvalescentCareFacility, com.tools20022.repository.codeset.PaymentPurposeCode.DentalServices,
						com.tools20022.repository.codeset.PaymentPurposeCode.AnesthesiaServices, com.tools20022.repository.codeset.PaymentPurposeCode.HomeHealthCare, com.tools20022.repository.codeset.PaymentPurposeCode.HospitalCare,
						com.tools20022.repository.codeset.PaymentPurposeCode.IntermediateCareFacility, com.tools20022.repository.codeset.PaymentPurposeCode.LongTermCareFacility,
						com.tools20022.repository.codeset.PaymentPurposeCode.MedicalServices, com.tools20022.repository.codeset.PaymentPurposeCode.VisionCare, com.tools20022.repository.codeset.PaymentPurposeCode.DurableMedicaleEquipment,
						com.tools20022.repository.codeset.PaymentPurposeCode.CableTVBill, com.tools20022.repository.codeset.PaymentPurposeCode.ElectricityBill, com.tools20022.repository.codeset.PaymentPurposeCode.GasBill,
						com.tools20022.repository.codeset.PaymentPurposeCode.TelephoneBill, com.tools20022.repository.codeset.PaymentPurposeCode.OtherTelecomRelatedBill, com.tools20022.repository.codeset.PaymentPurposeCode.WaterBill,
						com.tools20022.repository.codeset.PaymentPurposeCode.Study, com.tools20022.repository.codeset.PaymentPurposeCode.PricePayment, com.tools20022.repository.codeset.PaymentPurposeCode.Installment,
						com.tools20022.repository.codeset.PaymentPurposeCode.RecurringInstallmentPayment, com.tools20022.repository.codeset.PaymentPurposeCode.OpeningFee,
						com.tools20022.repository.codeset.PaymentPurposeCode.CancellationFee, com.tools20022.repository.codeset.PaymentPurposeCode.GovernmentInsurance,
						com.tools20022.repository.codeset.PaymentPurposeCode.InsurancePremiumCar, com.tools20022.repository.codeset.PaymentPurposeCode.LaborInsurance, com.tools20022.repository.codeset.PaymentPurposeCode.LifeInsurance,
						com.tools20022.repository.codeset.PaymentPurposeCode.PropertyInsurance, com.tools20022.repository.codeset.PaymentPurposeCode.HealthInsurance,
						com.tools20022.repository.codeset.PaymentPurposeCode.CarLoanPrincipalRepayment, com.tools20022.repository.codeset.PaymentPurposeCode.HousingLoanRepayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.CompanySocialLoanPaymentToBank, com.tools20022.repository.codeset.PaymentPurposeCode.EstateTax, com.tools20022.repository.codeset.PaymentPurposeCode.HousingTax,
						com.tools20022.repository.codeset.PaymentPurposeCode.IncomeTax, com.tools20022.repository.codeset.PaymentPurposeCode.NetIncomeTax, com.tools20022.repository.codeset.PaymentPurposeCode.BusinessExpenses,
						com.tools20022.repository.codeset.PaymentPurposeCode.TrustFund, com.tools20022.repository.codeset.PaymentPurposeCode.NetworkCharge, com.tools20022.repository.codeset.PaymentPurposeCode.NetworkCommunication,
						com.tools20022.repository.codeset.PaymentPurposeCode.ReceiptPayment, com.tools20022.repository.codeset.PaymentPurposeCode.PaymentTerms, com.tools20022.repository.codeset.PaymentPurposeCode.Other,
						com.tools20022.repository.codeset.PaymentPurposeCode.WithHolding);
			}
		});
		return mmObject_lazy.get();
	}
}