package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InterestTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Consideration, such as amount of money, paid or received in exchange for an
 * asset that has been invested, loaned or borrowed for a certain period. The
 * interest is expressed as a fixed amount or percentage of the amount upon
 * which the interest is applied.
 */
public class Interest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Interest amount that has accrued in between coupon payment periods.
	 */
	public static final MMBusinessAttribute AccruedInterestAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Calculation parameters used to obtain the interest amount.
	 */
	public static final MMBusinessAssociationEnd InterestCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Calculation parameters used to obtain the interest amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};
	/**
	 * Amount of money representing interest payments.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money representing interest payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * The actual interest rate used for the payment of the interest for the
	 * specified interest period.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Cash proceeds definition for which an interest is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedCashProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashProceedsDefinition";
			definition = "Cash proceeds definition for which an interest is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashProceedsDefinition.mmObject();
		}
	};
	/**
	 * Specifies the financing trade on which this interest apply.
	 */
	public static final MMBusinessAssociationEnd SecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancing";
			definition = "Specifies the financing trade on which this interest apply.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	/**
	 * Specifies the tax on interest.
	 */
	public static final MMBusinessAssociationEnd InterestTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestTax";
			definition = "Specifies the tax on interest.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}
	};
	/**
	 * Indicates whether the interest is a debit or credit.
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the interest is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Entry which contains the interest.
	 */
	public static final MMBusinessAssociationEnd CashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	/**
	 * Date of the next interest payment.
	 */
	public static final MMBusinessAttribute PaymentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date of the next interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Management of interest which consists into calculating the interest,
	 * requesting its payment or distributing the interest proceeds.
	 */
	public static final MMBusinessAssociationEnd RelatedInterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InterestManagement.mmObject();
		}
	};
	/**
	 * Undertaking amount for which an interest is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedUndertakingAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedUndertakingAmount";
			definition = "Undertaking amount for which an interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> UndertakingAmount.mmObject();
		}
	};
	/**
	 * Debit and credit facilities on which the interest applies.
	 */
	public static final MMBusinessAssociationEnd RelatedDebitCreditFacility = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Debit and credit facilities on which the interest applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.CashAccountInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DebitCreditFacility.mmObject();
		}
	};
	/**
	 * Securities settlement process for which an accrued interest is specified.
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Securities settlement process for which an accrued interest is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.AccruedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	/**
	 * Interest rate expressed as a rate name.
	 */
	public static final MMBusinessAssociationEnd InterestName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestName";
			definition = "Interest rate expressed as a rate name.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForInterestName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Asset holding on which interest is paid.
	 */
	public static final MMBusinessAssociationEnd RelatedAssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAssetHolding";
			definition = "Asset holding on which interest is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AssetHolding.mmObject();
		}
	};
	/**
	 * Deposit for which an interest is specified.
	 */
	public static final MMBusinessAssociationEnd Deposit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deposit";
			definition = "Deposit for which an interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Deposit.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Deposit.mmObject();
		}
	};
	/**
	 * Balance for which an interest is calculated.
	 */
	public static final MMBusinessAssociationEnd AccountBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountBalance";
			definition = "Balance for which an interest is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Balance.mmObject();
		}
	};
	/**
	 * Account contract for which interest parameters are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountContract";
			definition = "Account contract for which interest parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AccountContract.mmObject();
		}
	};
	/**
	 * Net asset value calculation for which an accrued interest is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedNetAssetValueCalculation";
			definition = "Net asset value calculation for which an accrued interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
		}
	};
	/**
	 * Specifies the type of interest associated with a trade.
	 */
	public static final MMBusinessAttribute TypeOfInterest = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfInterest";
			definition = "Specifies the type of interest associated with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestTypeCode.mmObject();
		}
	};
	/**
	 * Payment card for which interest on due amounts is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Interest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which interest on due amounts is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentCard.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Interest";
				definition = "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForInterestName, com.tools20022.repository.entity.NetAssetValueCalculation.Interest,
						com.tools20022.repository.entity.Tax.Interest, com.tools20022.repository.entity.AccountContract.Interest, com.tools20022.repository.entity.PaymentCard.Interest, com.tools20022.repository.entity.CashEntry.Interest,
						com.tools20022.repository.entity.AssetHolding.Interest, com.tools20022.repository.entity.Balance.Interest, com.tools20022.repository.entity.SecuritiesSettlement.AccruedInterest,
						com.tools20022.repository.entity.InterestCalculation.Interest, com.tools20022.repository.entity.SecuritiesFinancing.Interest, com.tools20022.repository.entity.CashProceedsDefinition.Interest,
						com.tools20022.repository.entity.DebitCreditFacility.CashAccountInterest, com.tools20022.repository.entity.UndertakingAmount.Interest, com.tools20022.repository.entity.Deposit.Interest,
						com.tools20022.repository.entity.InterestManagement.Interest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Interest.AccruedInterestAmount, com.tools20022.repository.entity.Interest.InterestCalculation, com.tools20022.repository.entity.Interest.Amount,
						com.tools20022.repository.entity.Interest.Rate, com.tools20022.repository.entity.Interest.RelatedCashProceedsDefinition, com.tools20022.repository.entity.Interest.SecuritiesFinancing,
						com.tools20022.repository.entity.Interest.InterestTax, com.tools20022.repository.entity.Interest.CreditDebitIndicator, com.tools20022.repository.entity.Interest.CashEntry,
						com.tools20022.repository.entity.Interest.PaymentDate, com.tools20022.repository.entity.Interest.RelatedInterestManagement, com.tools20022.repository.entity.Interest.RelatedUndertakingAmount,
						com.tools20022.repository.entity.Interest.RelatedDebitCreditFacility, com.tools20022.repository.entity.Interest.SecuritiesSettlement, com.tools20022.repository.entity.Interest.InterestName,
						com.tools20022.repository.entity.Interest.RelatedAssetHolding, com.tools20022.repository.entity.Interest.Deposit, com.tools20022.repository.entity.Interest.AccountBalance,
						com.tools20022.repository.entity.Interest.RelatedAccountContract, com.tools20022.repository.entity.Interest.RelatedNetAssetValueCalculation, com.tools20022.repository.entity.Interest.TypeOfInterest,
						com.tools20022.repository.entity.Interest.RelatedPaymentCard);
			}
		});
		return mmObject_lazy.get();
	}
}