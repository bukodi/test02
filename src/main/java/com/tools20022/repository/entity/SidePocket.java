package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Separate account containing illiquid assets of a hedge fund portfolio. Only
 * the present participants in the hedge fund will be entitled to a share of it.
 */
public class SidePocket {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the investor wants to participate in the optional side
	 * pocket.
	 */
	public static final MMBusinessAttribute SidePocketInclusionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SidePocket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SidePocketInclusionIndicator";
			definition = "Indicates whether the investor wants to participate in the optional side pocket.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies the side pocket.<br>
	 * Type of account used in hedge funds to separate illiquid assets from
	 * other more liquid investments. <br>
	 * Once an asset is designated for inclusion in a side pocket, new investors
	 * do not share in it, and when existing investors redeem from the hedge
	 * fund, they remain as investors in the side pocket until it is liquidated.
	 */
	public static final MMBusinessAttribute SidePocketIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SidePocket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SidePocketIdentification";
			definition = "Identifies the side pocket.\r\nType of account used in hedge funds to separate illiquid assets from other more liquid investments. \r\nOnce an asset is designated for inclusion in a side pocket, new investors do not share in it, and when existing investors redeem from the hedge fund, they remain as investors in the side pocket until it is liquidated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Investment account which contains the liquid assets of a hedge fund.
	 */
	public static final MMBusinessAssociationEnd InvestmentAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SidePocket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Investment account which contains the liquid assets of a hedge fund.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.SidePocket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	/**
	 * Quantity of the side pocket.
	 */
	public static final MMBusinessAssociationEnd SidePocketQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SidePocket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SidePocketQuantity";
			definition = "Quantity of the side pocket.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SidePocket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SidePocket";
				definition = "Separate account containing illiquid assets of a hedge fund portfolio. Only the present participants in the hedge fund will be entitled to a share of it.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.SidePocket, com.tools20022.repository.entity.SecuritiesQuantity.SidePocket);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SidePocket.SidePocketInclusionIndicator, com.tools20022.repository.entity.SidePocket.SidePocketIdentification,
						com.tools20022.repository.entity.SidePocket.InvestmentAccount, com.tools20022.repository.entity.SidePocket.SidePocketQuantity);
			}
		});
		return mmObject_lazy.get();
	}
}