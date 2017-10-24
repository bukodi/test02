package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CommissionTypeV2Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TaxationBasisCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money due to a party as compensation for a service.
 */
public class Commission extends Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Voluntary non-enforcement of the right to all or part of a commission.
	 */
	public static final MMBusinessAssociationEnd CommissionWaiving = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionWaiving";
			definition = "Voluntary non-enforcement of the right to all or part of a commission.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommissionWaiver.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CommissionWaiver.mmObject();
		}
	};
	/**
	 * Trade for which commission parameters are specified.
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which commission parameters are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.TradeCommission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	/**
	 * Service for which the commission is asked or paid.
	 */
	public static final MMBusinessAttribute CommissionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionType";
			definition = "Service for which the commission is asked or paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommissionTypeV2Code.mmObject();
		}
	};
	/**
	 * Basis upon which a commission is charged, eg, flat fee.
	 */
	public static final MMBusinessAttribute Basis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Basis";
			definition = "Basis upon which a commission is charged, eg, flat fee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}
	};
	/**
	 * Reference to the agreement established between the fund and another
	 * party. This element, amongst others, defines the conditions of the
	 * commissions.
	 */
	public static final MMBusinessAttribute CommercialAgreementReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialAgreementReference";
			definition = "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date/time at which the commission is calculated.
	 */
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date/time at which the commission is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Commission expressed as a percentage.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Commission expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Commission expressed as an amount of money.
	 */
	public static final MMBusinessAttribute CommissionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionAmount";
			definition = "Commission expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Broker to which a commission is paid.
	 */
	public static final MMBusinessAssociationEnd Broker = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Broker";
			definition = "Broker to which a commission is paid.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Broker.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Broker.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of commissions.
	 */
	public static final MMBusinessAssociationEnd CommissionPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionPartyRole";
			definition = "Role played by a party in the context of commissions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommissionPartyRole.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommissionPartyRole.mmObject();
		}
	};
	/**
	 * Account used for the commission fees.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account used for the commission fees.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}
	};
	/**
	 * Quote which includes a commission.
	 */
	public static final MMBusinessAssociationEnd RelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote which includes a commission.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}
	};
	/**
	 * Percentage of the total commission received by an intermediary.
	 */
	public static final MMBusinessAttribute SplitRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitRate";
			definition = "Percentage of the total commission received by an intermediary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Currency in which the commission has to be settled.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency in which the commission has to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Corporate action fees to which commission fees are added.
	 */
	public static final MMBusinessAssociationEnd CorporateActionFeesAndCharges = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Commission.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionFeesAndCharges";
			definition = "Corporate action fees to which commission fees are added.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Commission";
				definition = "Amount of money due to a party as compensation for a service.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.Commission, com.tools20022.repository.entity.Trade.TradeCommission, com.tools20022.repository.entity.CommissionWaiver.Commission,
						com.tools20022.repository.entity.CorporateActionFeesAndCharges.Commission, com.tools20022.repository.entity.Broker.Commission, com.tools20022.repository.entity.CommissionPartyRole.Commission,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.Commission);
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.CommissionWaiving, com.tools20022.repository.entity.Commission.Trade, com.tools20022.repository.entity.Commission.CommissionType,
						com.tools20022.repository.entity.Commission.Basis, com.tools20022.repository.entity.Commission.CommercialAgreementReference, com.tools20022.repository.entity.Commission.CalculationDate,
						com.tools20022.repository.entity.Commission.Rate, com.tools20022.repository.entity.Commission.CommissionAmount, com.tools20022.repository.entity.Commission.Broker,
						com.tools20022.repository.entity.Commission.CommissionPartyRole, com.tools20022.repository.entity.Commission.Account, com.tools20022.repository.entity.Commission.RelatedQuote,
						com.tools20022.repository.entity.Commission.SplitRate, com.tools20022.repository.entity.Commission.Currency, com.tools20022.repository.entity.Commission.CorporateActionFeesAndCharges);
			}
		});
		return mmObject_lazy.get();
	}
}