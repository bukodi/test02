package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party as source of information.
 */
public class InformationPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the identification for which a party plays the issuer role.
	 */
	public static final MMBusinessAssociationEnd GenericIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericIdentification";
			definition = "Specifies the identification for which a party plays the issuer role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	/**
	 * Specifies the haircut valuation for which a party provides the
	 * information.
	 */
	public static final MMBusinessAssociationEnd HaircutValuation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HaircutValuation";
			definition = "Specifies the haircut valuation for which a party provides the information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.HaircutValuation.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmObject();
		}
	};
	/**
	 * Specifies the security price for which a party plays a role.
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Specifies the security price for which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.InformationPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Scheme for which the party is the source.
	 */
	public static final MMBusinessAssociationEnd Scheme = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Scheme for which the party is the source.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.InformationPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
		}
	};
	/**
	 * Quoting process in which an information party plays a role.
	 */
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quoting process in which an information party plays a role.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	/**
	 * Trade for which a quote is provided.<br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 */
	public static final MMBusinessAssociationEnd TreasuryTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryTrade";
			definition = "Trade for which a quote is provided.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.InformationPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InformationPartyRole";
				definition = "Role played by a party as source of information.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.PartyRole, com.tools20022.repository.entity.SecuritiesPricing.InformationPartyRole,
						com.tools20022.repository.entity.Scheme.InformationPartyRole, com.tools20022.repository.entity.TreasuryTrade.InformationPartyRole, com.tools20022.repository.entity.HaircutValuation.PartyRole,
						com.tools20022.repository.entity.Quote.PartyRole);
				subType_lazy = () -> Arrays.asList(IdentificationIssuerRole.mmObject(), SourceOfPrice.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationPartyRole.GenericIdentification, com.tools20022.repository.entity.InformationPartyRole.HaircutValuation,
						com.tools20022.repository.entity.InformationPartyRole.Price, com.tools20022.repository.entity.InformationPartyRole.Scheme, com.tools20022.repository.entity.InformationPartyRole.Quote,
						com.tools20022.repository.entity.InformationPartyRole.TreasuryTrade);
			}
		});
		return mmObject_lazy.get();
	}
}