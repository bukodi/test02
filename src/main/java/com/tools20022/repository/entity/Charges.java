package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.msg.Charges2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money associated with a service.
 */
public class Charges extends Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of service for which a charge is asked or paid.
	 */
	public static final MMBusinessAttribute ChargeType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeType";
			definition = "Type of service for which a charge is asked or paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeTypeCode.mmObject();
		}
	};
	/**
	 * Calculation basis for the charge or fee.
	 */
	public static final MMBusinessAttribute CalculationBasis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationBasis";
			definition = "Calculation basis for the charge or fee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationBasisCode.mmObject();
		}
	};
	/**
	 * Specifies which party/parties will bear the charges associated with the
	 * processing of the payment transaction.
	 */
	public static final MMBusinessAttribute BearerType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction26.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransaction22.ChargeBearer,
					com.tools20022.repository.msg.PaymentInstruction21.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction23.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction22.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransaction77.ChargeBearer, com.tools20022.repository.msg.DirectDebitTransactionInformation22.ChargeBearer);
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BearerType";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeBearerTypeCode.mmObject();
		}
	};
	/**
	 * Account from which a charge is debited.
	 */
	public static final MMBusinessAssociationEnd ChargesDebitAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction21.ChargesAccount, com.tools20022.repository.msg.PaymentInstruction22.ChargesAccount);
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesDebitAccount";
			definition = "Account from which a charge is debited.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}
	};
	/**
	 * Entry which contains the charges.
	 */
	public static final MMBusinessAssociationEnd CashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the charges.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	/**
	 * Indicates whether a charge is a credit or a debit.
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether a charge is a credit or a debit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Maximum amount of money asked or paid for the charge for example
	 * depending on the type of investors.
	 */
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount of money asked or paid for the charge for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Investment fund transaction for which charges are specified.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Investment fund transaction for which charges are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.TransactionCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	/**
	 * Specifies the line item to which the logistics charge applies.
	 */
	public static final MMBusinessAssociationEnd LogisticsChargeLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LogisticsChargeLineItem";
			definition = "Specifies the line item to which the logistics charge applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.LogisticsCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	/**
	 * Specifies the transport process to which the charges apply.
	 */
	public static final MMBusinessAssociationEnd Transport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Specifies the transport process to which the charges apply.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.TransportCharges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	/**
	 * Account services for which account administration charges are specified.
	 */
	public static final MMBusinessAssociationEnd Services = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Account services for which account administration charges are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.AccountAdministrationCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AccountService.mmObject();
		}
	};
	/**
	 * Undertaking for which charges are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedUndertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedUndertaking";
			definition = "Undertaking for which charges are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Undertaking.mmObject();
		}
	};
	/**
	 * Line item for which charges are specified
	 */
	public static final MMBusinessAssociationEnd LineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Line item for which charges are specified";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	/**
	 * Specifies the line item to which the net price charge applies.
	 */
	public static final MMBusinessAssociationEnd NetPriceChargeLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceChargeLineItem";
			definition = "Specifies the line item to which the net price charge applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.NetPriceCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	/**
	 * Amount on which the charges are calculated.
	 */
	public static final MMBusinessAttribute BaseAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseAmount";
			definition = "Amount on which the charges are calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum rate used to calculate the amount of the charge or fee for
	 * example depending on the type of investors.
	 */
	public static final MMBusinessAttribute MaximumRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumRate";
			definition = "Maximum rate used to calculate the amount of the charge or fee for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Minimum rate used to calculate the amount of the charge or fee for
	 * example depending on the type of investors.
	 */
	public static final MMBusinessAttribute MinimumRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumRate";
			definition = "Minimum rate used to calculate the amount of the charge or fee for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Minimum amount of money asked or paid for the charge for example
	 * depending on the type of investors.
	 */
	public static final MMBusinessAttribute MinimumAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumAmount";
			definition = "Minimum amount of money asked or paid for the charge for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Interest on which charges are applied.
	 */
	public static final MMBusinessAssociationEnd RelatedInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest on which charges are applied.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}
	};
	/**
	 * Specifies how charges are paid.
	 */
	public static final MMBusinessAttribute ChargePaymentMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Charges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargePaymentMethod";
			definition = "Specifies how charges are paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargePaymentMethodCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Charges";
				definition = "Amount of money associated with a service.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.Charges, com.tools20022.repository.entity.AccountService.AccountAdministrationCharge,
						com.tools20022.repository.entity.CashEntry.Charges, com.tools20022.repository.entity.InvestmentFundTransaction.TransactionCharge, com.tools20022.repository.entity.InterestCalculation.Charges,
						com.tools20022.repository.entity.Undertaking.Charges, com.tools20022.repository.entity.LineItem.LogisticsCharge, com.tools20022.repository.entity.LineItem.Charges,
						com.tools20022.repository.entity.LineItem.NetPriceCharge, com.tools20022.repository.entity.Transport.TransportCharges);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransaction83.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction82.ChargesInformation);
				subType_lazy = () -> Arrays.asList(SecuritiesRelatedFees.mmObject(), CorporateActionFeesAndCharges.mmObject());
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Charges.ChargeType, com.tools20022.repository.entity.Charges.CalculationBasis, com.tools20022.repository.entity.Charges.BearerType,
						com.tools20022.repository.entity.Charges.ChargesDebitAccount, com.tools20022.repository.entity.Charges.CashEntry, com.tools20022.repository.entity.Charges.CreditDebitIndicator,
						com.tools20022.repository.entity.Charges.MaximumAmount, com.tools20022.repository.entity.Charges.InvestmentFundTransaction, com.tools20022.repository.entity.Charges.LogisticsChargeLineItem,
						com.tools20022.repository.entity.Charges.Transport, com.tools20022.repository.entity.Charges.Services, com.tools20022.repository.entity.Charges.RelatedUndertaking, com.tools20022.repository.entity.Charges.LineItem,
						com.tools20022.repository.entity.Charges.NetPriceChargeLineItem, com.tools20022.repository.entity.Charges.BaseAmount, com.tools20022.repository.entity.Charges.MaximumRate,
						com.tools20022.repository.entity.Charges.MinimumRate, com.tools20022.repository.entity.Charges.MinimumAmount, com.tools20022.repository.entity.Charges.RelatedInterest,
						com.tools20022.repository.entity.Charges.ChargePaymentMethod);
				derivationComponent_lazy = () -> Arrays.asList(Charges2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}