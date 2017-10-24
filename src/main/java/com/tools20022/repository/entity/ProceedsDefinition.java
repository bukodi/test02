package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Definition of exchanges of cash and/or securities available in the processing
 * of corporate actions.
 */
public class ProceedsDefinition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of drawdown or other reduction from or in addition to the deal
	 * price.
	 */
	public static final MMBusinessAttribute SpecialConcessionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialConcessionAmount";
			definition = "Amount of drawdown or other reduction from or in addition to the deal price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the value is a debit or credit.
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the value is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Date on which a payment can be made, eg, if payment date is a
	 * non-business day or to indicate the first payment date of an offer.
	 */
	public static final MMBusinessAttribute EarliestPaymentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date on which a payment can be made, eg, if payment date is a non-business day or to indicate the first payment date of an offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which assets become available to the account owner (in a
	 * credit entry), or cease to be available to the account owner (in a debit
	 * entry).
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time at which assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies information regarding outturn resources that cannot be
	 * processed by the CSD. Special delivery instruction is required from the
	 * account owner for the CA outcome to be credited.
	 */
	public static final MMBusinessAttribute NonEligibleProceedsIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonEligibleProceedsIndicator";
			definition = "Specifies information regarding outturn resources that cannot be processed by the CSD. Special delivery instruction is required from the account owner for the CA outcome to be credited.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NonEligibleProceedsIndicatorCode.mmObject();
		}
	};
	/**
	 * Proceeds are taxable according to the information provided by the issuer
	 * / offeror.
	 */
	public static final MMBusinessAttribute IssuerOfferorTaxabilityIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuerOfferorTaxabilityIndicator";
			definition = "Proceeds are taxable according to the information provided by the issuer / offeror.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date/time at which an offer price is determined (as compared to its reset
	 * date if applicable).
	 */
	public static final MMBusinessAttribute OfferPriceFixingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPriceFixingDate";
			definition = "Date/time at which an offer price is determined (as compared to its reset date if applicable).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Option for which proceeds are specified.
	 */
	public static final MMBusinessAssociationEnd Option = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option for which proceeds are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.ProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionOption.mmObject();
		}
	};
	/**
	 * Corporate action for which the proceeds are specified.
	 */
	public static final MMBusinessAssociationEnd CorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Corporate action for which the proceeds are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.ProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Indicates the country from which the income originates.
	 */
	public static final MMBusinessAttribute CountryOfIncomeSource = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryOfIncomeSource";
			definition = "Indicates the country from which the income originates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProceedsDefinition";
				definition = "Definition of exchanges of cash and/or securities available in the processing of corporate actions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.ProceedsDefinition, com.tools20022.repository.entity.CorporateActionOption.ProceedsDefinition);
				subType_lazy = () -> Arrays.asList(SecuritiesProceedsDefinition.mmObject(), CashProceedsDefinition.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProceedsDefinition.SpecialConcessionAmount, com.tools20022.repository.entity.ProceedsDefinition.CreditDebitIndicator,
						com.tools20022.repository.entity.ProceedsDefinition.EarliestPaymentDate, com.tools20022.repository.entity.ProceedsDefinition.ValueDate,
						com.tools20022.repository.entity.ProceedsDefinition.NonEligibleProceedsIndicator, com.tools20022.repository.entity.ProceedsDefinition.IssuerOfferorTaxabilityIndicator,
						com.tools20022.repository.entity.ProceedsDefinition.OfferPriceFixingDate, com.tools20022.repository.entity.ProceedsDefinition.Option, com.tools20022.repository.entity.ProceedsDefinition.CorporateAction,
						com.tools20022.repository.entity.ProceedsDefinition.CountryOfIncomeSource);
			}
		});
		return mmObject_lazy.get();
	}
}