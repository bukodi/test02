package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PartyRoleCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role of a party in an activity.
 */
public class Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Entity which plays a role in the context of the business domain in which
	 * the role is defined.
	 */
	public static final MMBusinessAssociationEnd Player = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Role.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Player";
			definition = "Entity which plays a role in the context of the business domain in which the role is defined.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RolePlayer.Role;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RolePlayer.mmObject();
		}
	};
	/**
	 * Contact person in the context of a role played by an organisation.
	 */
	public static final MMBusinessAssociationEnd ContactPersonRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Role.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPersonRole";
			definition = "Contact person in the context of a role played by an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.Role;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
		}
	};
	/**
	 * Specifies the role of the party in the transaction.
	 */
	public static final MMBusinessAttribute PartyRole = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Role.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role of the party in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyRoleCode.mmObject();
		}
	};
	/**
	 * Specifies the risk which is related to the role played by a party.
	 */
	public static final MMBusinessAssociationEnd CounterpartyRisk = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Role.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyRisk";
			definition = "Specifies the risk which is related to the role played by a party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.Party;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmObject();
		}
	};
	/**
	 * Entry for which a role is specified.
	 */
	public static final MMBusinessAssociationEnd Entry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Role.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Entry for which a role is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.Role;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Role";
				definition = "Role of a party in an activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RolePlayer.Role, com.tools20022.repository.entity.Entry.Role, com.tools20022.repository.entity.ContactPersonRole.Role,
						com.tools20022.repository.entity.CounterpartyRisk.Party);
				subType_lazy = () -> Arrays.asList(InformationPartyRole.mmObject(), AccountPartyRole.mmObject(), EmployingPartyRole.mmObject(), DocumentPartyRole.mmObject(), MandatePartyRole.mmObject(), CardPaymentPartyRole.mmObject(),
						InvestmentFundPartyRole.mmObject(), TradePartyRole.mmObject(), SystemPartyRole.mmObject(), PaymentPartyRole.mmObject(), AssetPartyRole.mmObject(), SettlementPartyRole.mmObject(),
						com.tools20022.repository.entity.ContactPersonRole.mmObject(), SecuritiesOrderPartyRole.mmObject(), SecurityCertificatePartyRole.mmObject(), InvoicePartyRole.mmObject(), TaxPartyRole.mmObject(),
						InvestigationPartyRole.mmObject(), ChargePartyRole.mmObject(), RegulatoryAuthorityRole.mmObject(), UndertakingPartyRole.mmObject(), CorporateActionPartyRole.mmObject(), TransportPartyRole.mmObject(),
						InsurancePartyRole.mmObject(), CollateralPartyRole.mmObject(), ReportingPartyRole.mmObject(), ChequePartyRole.mmObject(), CommissionPartyRole.mmObject(), GoodsPartyRole.mmObject(),
						TradeCertificatePartyRole.mmObject(), MarketInfrastructure.mmObject(), GuaranteePartyRole.mmObject(), PaymentObligationPartyRole.mmObject(), RegulatoryReportingRole.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.Player, com.tools20022.repository.entity.Role.ContactPersonRole, com.tools20022.repository.entity.Role.PartyRole,
						com.tools20022.repository.entity.Role.CounterpartyRisk, com.tools20022.repository.entity.Role.Entry);
			}
		});
		return mmObject_lazy.get();
	}
}