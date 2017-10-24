package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.PaymentCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ProceedsDefinition;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Definition of the cash proceeds for a corporate action in generic terms; that
 * is, before applying it to specific securities holding. An example would be
 * the definition of a dividend payment where all the information will be given
 * in general on a per share basis.
 */
public class CashProceedsDefinition extends ProceedsDefinition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash premium made available if the securities holder consents or
	 * participates to an event, e.g. consent fees.
	 */
	public static final MMBusinessAttribute CashIncentiveRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashIncentiveRate";
			definition = "Cash premium made available if the securities holder consents or participates to an event, e.g. consent fees.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates exceptions to contractual payment service.
	 */
	public static final MMBusinessAttribute ContractualPaymentIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractualPaymentIndicator";
			definition = "Indicates exceptions to contractual payment service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentCode.mmObject();
		}
	};
	/**
	 * Specifies the type of income.<br>
	 * The lists of income type codes to be used, are available on the SMPG
	 * website at www.smpg.info.
	 */
	public static final MMBusinessAssociationEnd IncomeType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomeType";
			definition = "Specifies the type of income.\r\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForCashProceedsIncome;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * (Unique to France) Amount due to a buyer of securities dealt prior to ex
	 * date which may be subject to different rate of taxation.
	 */
	public static final MMBusinessAttribute IndemnityAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndemnityAmount";
			definition = "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate of the cash premium made available if the securities holder consents
	 * or participates to an event, e.g. consent fees.
	 */
	public static final MMBusinessAttribute CashIncentiveAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashIncentiveAmount";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, e.g. consent fees.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money representing a distribution of a bond's principal, eg,
	 * repayment of outstanding debt.
	 */
	public static final MMBusinessAttribute PrincipalOrCorpus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrincipalOrCorpus";
			definition = "Amount of money representing a distribution of a bond's principal, eg, repayment of outstanding debt.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money (not interest) in addition to the principal at the
	 * redemption of a bond.
	 */
	public static final MMBusinessAttribute RedemptionPremiumAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionPremiumAmount";
			definition = "Amount of money (not interest) in addition to the principal at the redemption of a bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount relating to the underlying security for which income is
	 * distributed.
	 */
	public static final MMBusinessAttribute IncomePortion = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomePortion";
			definition = "Amount relating to the underlying security for which income is distributed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Interest paid as the proceeds of a CA event.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest paid as the proceeds of a CA event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedCashProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	/**
	 * Cash amount which is posted.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Cash amount which is posted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Distribution of earnings to shareholders, paid for in cash, stock, scrip
	 * issue or, rarely, in kind, eg, company products or property. The dividend
	 * amount is decided by the board of directors.
	 */
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, eg, company products or property. The dividend amount is decided by the board of directors.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.CashProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	/**
	 * Currency for the payment of the cash proceeds.
	 */
	public static final MMBusinessAttribute PaymentCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCurrency";
			definition = "Currency for the payment of the cash proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashProceedsDefinition";
				definition = "Definition of the cash proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a dividend payment where all the information will be given in general on a per share basis.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForCashProceedsIncome, com.tools20022.repository.entity.Dividend.CashProceeds,
						com.tools20022.repository.entity.Interest.RelatedCashProceedsDefinition);
				superType_lazy = () -> ProceedsDefinition.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashProceedsDefinition.CashIncentiveRate, com.tools20022.repository.entity.CashProceedsDefinition.ContractualPaymentIndicator,
						com.tools20022.repository.entity.CashProceedsDefinition.IncomeType, com.tools20022.repository.entity.CashProceedsDefinition.IndemnityAmount,
						com.tools20022.repository.entity.CashProceedsDefinition.CashIncentiveAmount, com.tools20022.repository.entity.CashProceedsDefinition.PrincipalOrCorpus,
						com.tools20022.repository.entity.CashProceedsDefinition.RedemptionPremiumAmount, com.tools20022.repository.entity.CashProceedsDefinition.IncomePortion,
						com.tools20022.repository.entity.CashProceedsDefinition.Interest, com.tools20022.repository.entity.CashProceedsDefinition.Amount, com.tools20022.repository.entity.CashProceedsDefinition.Dividend,
						com.tools20022.repository.entity.CashProceedsDefinition.PaymentCurrency);
			}
		});
		return mmObject_lazy.get();
	}
}