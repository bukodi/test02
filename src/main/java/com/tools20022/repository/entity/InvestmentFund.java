package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.FundLegalFormCode;
import com.tools20022.repository.codeset.FundStructureCode;
import com.tools20022.repository.datatype.BICNonFIIdentifier;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Distinct pool of financial instruments managed by a single investment policy.
 * May or not be part of an umbrella fund. The pool is issued in at least one
 * investment fund class.
 */
public class InvestmentFund {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Country in which the investment fund is domiciled.
	 */
	public static final MMBusinessAssociationEnd DomicileCountry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomicileCountry";
			definition = "Country in which the investment fund is domiciled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.DomiciledFunds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}
	};
	/**
	 * Entity appointed by the fund, to which orders should be submitted.
	 */
	public static final MMBusinessAssociationEnd OrderDesk = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderDesk";
			definition = "Entity appointed by the fund, to which orders should be submitted.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedInvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Sub-set of an investment fund.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Sub-set of an investment fund.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.InvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	/**
	 * Legal form of the fund, eg, UCITS, SICAV, OEIC, Unit Trust, and FCP.
	 */
	public static final MMBusinessAttribute FundType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundType";
			definition = "Legal form of the fund, eg, UCITS, SICAV, OEIC, Unit Trust, and FCP.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Party which executes a treasury trade on behalf of an investment fund.
	 */
	public static final MMBusinessAssociationEnd TreasuryTradingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryTradingParty";
			definition = "Party which executes a treasury trade on behalf of an investment fund.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTradingParty.InvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTradingParty.mmObject();
		}
	};
	/**
	 * Identification of the investment fund.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the investment fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICNonFIIdentifier.mmObject();
		}
	};
	/**
	 * Party which settles the trades for the account of the fund.
	 */
	public static final MMBusinessAssociationEnd Custodian = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Custodian";
			definition = "Party which settles the trades for the account of the fund.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CustodianRole.InvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CustodianRole.mmObject();
		}
	};
	/**
	 * Specifies each role linked to an investment fund and played by a party in
	 * that context.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to an investment fund and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.InvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundPartyRole.mmObject();
		}
	};
	/**
	 * Family to which the investment fund belongs.
	 */
	public static final MMBusinessAssociationEnd Family = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Family";
			definition = "Family to which the investment fund belongs.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundFamily.InvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundFamily.mmObject();
		}
	};
	/**
	 * Structure of the subfund, eg, single fund, multi-class.
	 */
	public static final MMBusinessAttribute Structure = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Structure";
			definition = "Structure of the subfund, eg, single fund, multi-class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FundStructureCode.mmObject();
		}
	};
	/**
	 * Legal form of a fund, eg, corporation or trust.
	 */
	public static final MMBusinessAttribute LegalForm = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalForm";
			definition = "Legal form of a fund, eg, corporation or trust.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FundLegalFormCode.mmObject();
		}
	};
	/**
	 * Indicates whether the investment fund is a subfund, when it is a
	 * compartment of an umbrella fund. In this case, subfund is a synonym of
	 * investment fund and therefore has the same attributes as investment fund.
	 */
	public static final MMBusinessAttribute SubFundIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubFundIndicator";
			definition = "Indicates whether the investment fund is a subfund, when it is a compartment of an umbrella fund. In this case, subfund is a synonym of investment fund and therefore has the same attributes as investment fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date at which the books are closed and profit and loss is determined.
	 */
	public static final MMBusinessAttribute EndOfFiscalYear = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndOfFiscalYear";
			definition = "Date at which the books are closed and profit and loss is determined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Last day of the accounting year for the fund.
	 */
	public static final MMBusinessAttribute AccountingYearEndDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountingYearEndDate";
			definition = "Last day of the accounting year for the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Last day of the first accounting year for the fund.
	 */
	public static final MMBusinessAttribute FirstAccountingYearEndDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstAccountingYearEndDate";
			definition = "Last day of the first accounting year for the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Umbrella fund for which compartments are specified.
	 */
	public static final MMBusinessAssociationEnd UmbrellaFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UmbrellaFund";
			definition = "Umbrella fund for which compartments are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UmbrellaFund.SubFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UmbrellaFund.mmObject();
		}
	};
	/**
	 * Country in which it is authorised to commercialise the fund.
	 */
	public static final MMBusinessAttribute AuthorisedCountry = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisedCountry";
			definition = "Country in which it is authorised to commercialise the fund.";
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
				name = "InvestmentFund";
				definition = "Distinct pool of financial instruments managed by a single investment policy. May or not be part of an umbrella fund. The pool is issued in at least one investment fund class.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.InvestmentFund, com.tools20022.repository.entity.UmbrellaFund.SubFund,
						com.tools20022.repository.entity.Country.DomiciledFunds, com.tools20022.repository.entity.ContactPoint.RelatedInvestmentFund, com.tools20022.repository.entity.InvestmentFundFamily.InvestmentFund,
						com.tools20022.repository.entity.InvestmentFundPartyRole.InvestmentFund, com.tools20022.repository.entity.TreasuryTradingParty.InvestmentFund, com.tools20022.repository.entity.CustodianRole.InvestmentFund);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.DomicileCountry, com.tools20022.repository.entity.InvestmentFund.OrderDesk,
						com.tools20022.repository.entity.InvestmentFund.InvestmentFundClass, com.tools20022.repository.entity.InvestmentFund.FundType, com.tools20022.repository.entity.InvestmentFund.TreasuryTradingParty,
						com.tools20022.repository.entity.InvestmentFund.Identification, com.tools20022.repository.entity.InvestmentFund.Custodian, com.tools20022.repository.entity.InvestmentFund.PartyRole,
						com.tools20022.repository.entity.InvestmentFund.Family, com.tools20022.repository.entity.InvestmentFund.Structure, com.tools20022.repository.entity.InvestmentFund.LegalForm,
						com.tools20022.repository.entity.InvestmentFund.SubFundIndicator, com.tools20022.repository.entity.InvestmentFund.EndOfFiscalYear, com.tools20022.repository.entity.InvestmentFund.AccountingYearEndDate,
						com.tools20022.repository.entity.InvestmentFund.FirstAccountingYearEndDate, com.tools20022.repository.entity.InvestmentFund.UmbrellaFund, com.tools20022.repository.entity.InvestmentFund.AuthorisedCountry);
			}
		});
		return mmObject_lazy.get();
	}
}