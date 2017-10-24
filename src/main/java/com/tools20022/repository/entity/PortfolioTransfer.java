package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ISATypeCode;
import com.tools20022.repository.codeset.PEPISACode;
import com.tools20022.repository.datatype.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transfer by the delivering account servicer to the receiving account servicer
 * of a retail or institutional client portfolio. A portfolio can be any
 * grouping of investments, for example stocks, bonds, options, warrants. held
 * by an institution or an individual.
 */
public class PortfolioTransfer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the year during which the investment plan to be transferred was
	 * issued.
	 */
	public static final MMBusinessAttribute TransferredYear = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredYear";
			definition = "Specifies the year during which the investment plan to be transferred was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYear.mmObject();
		}
	};
	/**
	 * Indicates whether an ISA investment plan contains a cash component asset
	 * for transfer.
	 */
	public static final MMBusinessAttribute CashComponentIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashComponentIndicator";
			definition = "Indicates whether an ISA investment plan contains a cash component asset for transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the account owned by an investor and from which the assets are
	 * transferred.
	 */
	public static final MMBusinessAssociationEnd AccountFrom = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountFrom";
			definition = "Specifies the account owned by an investor and from which the assets are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.DebitPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}
	};
	/**
	 * Specifies the account owned by an investor and to which the assets are
	 * transferred.
	 */
	public static final MMBusinessAssociationEnd AccountTo = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountTo";
			definition = "Specifies the account owned by an investor and to which the assets are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.CreditPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}
	};
	/**
	 * Specifies the cash amount to be transferred in relation with a portfolio
	 * transfer.
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the cash amount to be transferred in relation with a portfolio transfer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentSourcePortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	/**
	 * Specifies the portfolio which has to be transferred.
	 */
	public static final MMBusinessAssociationEnd TransferredPortfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredPortfolio";
			definition = "Specifies the portfolio which has to be transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.Transfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Portfolio.mmObject();
		}
	};
	/**
	 * Specifies the financial instrument to be transferred in relation with a
	 * portfolio transfer.
	 */
	public static final MMBusinessAssociationEnd SecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Specifies the financial instrument to be transferred in relation with a portfolio transfer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}
	};
	/**
	 * Quantity of financial instrument to transfer expressed as an amount of
	 * money.
	 */
	public static final MMBusinessAttribute TransferredAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredAmount";
			definition = "Quantity of financial instrument to transfer expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity of financial instrument to transfer expressed as a percentage of
	 * the investor's total holding.
	 */
	public static final MMBusinessAttribute TransferredPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredPercentage";
			definition = "Quantity of financial instrument to transfer expressed as a percentage of the investor's total holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Execution date of the transfer instruction.
	 */
	public static final MMBusinessAttribute TransferDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferDate";
			definition = "Execution date of the transfer instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Account held in the name of a party that is not the name of the
	 * beneficial owner of the shares.
	 */
	public static final MMBusinessAssociationEnd NomineeAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.RelatedPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}
	};
	/**
	 * Specifies whether the investment plan is a PEP or ISA type.
	 */
	public static final MMBusinessAttribute PEPOrISAPlan = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PEPOrISAPlan";
			definition = "Specifies whether the investment plan is a PEP or ISA type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PEPISACode.mmObject();
		}
	};
	/**
	 * Current year ISA is an ISA that was issued during the current fiscal
	 * year.
	 */
	public static final MMBusinessAttribute CurrentYearISAType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrentYearISAType";
			definition = "Current year ISA is an ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISATypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PortfolioTransfer";
				definition = "Transfer by the delivering account servicer to the receiving account servicer of a retail or institutional client portfolio. A portfolio can be any grouping of  investments, for example  stocks, bonds, options, warrants. held by an institution or an individual.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.DebitPortfolioTransfer, com.tools20022.repository.entity.InvestmentAccount.CreditPortfolioTransfer,
						com.tools20022.repository.entity.InvestmentAccount.RelatedPortfolioTransfer, com.tools20022.repository.entity.PaymentObligation.PaymentSourcePortfolioTransfer, com.tools20022.repository.entity.Portfolio.Transfer,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedPortfolioTransfer);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioTransfer.TransferredYear, com.tools20022.repository.entity.PortfolioTransfer.CashComponentIndicator,
						com.tools20022.repository.entity.PortfolioTransfer.AccountFrom, com.tools20022.repository.entity.PortfolioTransfer.AccountTo, com.tools20022.repository.entity.PortfolioTransfer.PaymentObligation,
						com.tools20022.repository.entity.PortfolioTransfer.TransferredPortfolio, com.tools20022.repository.entity.PortfolioTransfer.SecuritiesDeliveryObligation,
						com.tools20022.repository.entity.PortfolioTransfer.TransferredAmount, com.tools20022.repository.entity.PortfolioTransfer.TransferredPercentage, com.tools20022.repository.entity.PortfolioTransfer.TransferDate,
						com.tools20022.repository.entity.PortfolioTransfer.NomineeAccount, com.tools20022.repository.entity.PortfolioTransfer.PEPOrISAPlan, com.tools20022.repository.entity.PortfolioTransfer.CurrentYearISAType);
			}
		});
		return mmObject_lazy.get();
	}
}