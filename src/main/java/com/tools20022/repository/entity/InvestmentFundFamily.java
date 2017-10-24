package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Group of investment funds under the same fund management company.
 */
public class InvestmentFundFamily {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name of the investment fund family.
	 */
	public static final MMBusinessAttribute FundFamilyName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundFamily.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundFamilyName";
			definition = "Name of the investment fund family.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Pool of financial instruments managed by a professional asset manager and
	 * belonging to one or several investment fund families that are part of the
	 * same investment fund network.
	 */
	public static final MMBusinessAssociationEnd InvestmentFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundFamily.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFund";
			definition = "Pool of financial instruments managed by a professional asset manager and belonging to one or several investment fund families that are part of the same investment fund network.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.Family;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundFamily";
				definition = "Group of investment funds under the same fund management company.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.Family);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundFamily.FundFamilyName, com.tools20022.repository.entity.InvestmentFundFamily.InvestmentFund);
			}
		});
		return mmObject_lazy.get();
	}
}