package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Principal entity appointed by the fund to which orders should be submitted.
 */
public class FundOrderDesk extends InvestmentFundPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the fund order desk is the principal entity appointed
	 * by the fund to which orders should be submitted.
	 */
	public static final MMBusinessAttribute MainFundOrderDeskIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FundOrderDesk.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MainFundOrderDeskIndicator";
			definition = "Indicates whether the fund order desk is the principal entity appointed by the fund to which orders should be submitted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Settlement details for the main fund order desk as defined in the
	 * prospectus of the investment fund class.
	 */
	public static final MMBusinessAssociationEnd MainFundOrderDeskAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FundOrderDesk.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MainFundOrderDeskAccount";
			definition = "Settlement details for the main fund order desk as defined in the prospectus of the investment fund class.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.AccountForInvestmentFundProcessing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FundOrderDesk";
				definition = "Principal entity appointed by the fund to which orders should be submitted.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.AccountForInvestmentFundProcessing);
				superType_lazy = () -> InvestmentFundPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FundOrderDesk.MainFundOrderDeskIndicator, com.tools20022.repository.entity.FundOrderDesk.MainFundOrderDeskAccount);
			}
		});
		return mmObject_lazy.get();
	}
}