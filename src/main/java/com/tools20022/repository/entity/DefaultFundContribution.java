package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Portion of the participation to the default fund that clearing member must
 * provide. It is the sum of the individual contributions.
 */
public class DefaultFundContribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Margin call for which a contribution to a default fund is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedMarginCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DefaultFundContribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginCall";
			definition = "Margin call for which a contribution to a default fund is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.DefaultFundContribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MarginCall.mmObject();
		}
	};
	/**
	 * Management of the assets posted by participants in a clearing fund that
	 * can be used in the event of a default by a participant to compensate
	 * non-defaulting participants for losses they suffer due to this default.
	 */
	public static final MMBusinessAssociationEnd DefaultFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DefaultFundContribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFund";
			definition = "Management of the assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFund.Contribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFund.mmObject();
		}
	};
	/**
	 * Excess amount that the CCP will restitute to the Clearing member OR
	 * deficit to be provided by the member for the guarantee fund.
	 */
	public static final MMBusinessAttribute ExcessOrDeficitAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DefaultFundContribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExcessOrDeficitAmount";
			definition = "Excess amount that the CCP will restitute to the Clearing member OR deficit to be provided by the member for the guarantee fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Sub account segregated by the central counterparty on the basis of
	 * trading venues/products or other attributes.
	 */
	public static final MMBusinessAssociationEnd ContributionAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DefaultFundContribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContributionAccount";
			definition = "Sub account segregated by the central counterparty on the basis of trading venues/products or other attributes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.DefaultFundContribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}
	};
	/**
	 * Specifies whether the amount is a deficit (debit) or an excess (credit).
	 */
	public static final MMBusinessAttribute AmountDirection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DefaultFundContribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDirection";
			definition = "Specifies whether the amount is a deficit (debit) or an excess (credit).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DefaultFundContribution";
				definition = "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.DefaultFundContribution, com.tools20022.repository.entity.MarginCall.DefaultFundContribution,
						com.tools20022.repository.entity.DefaultFund.Contribution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DefaultFundContribution.RelatedMarginCall, com.tools20022.repository.entity.DefaultFundContribution.DefaultFund,
						com.tools20022.repository.entity.DefaultFundContribution.ExcessOrDeficitAmount, com.tools20022.repository.entity.DefaultFundContribution.ContributionAccount,
						com.tools20022.repository.entity.DefaultFundContribution.AmountDirection);
			}
		});
		return mmObject_lazy.get();
	}
}