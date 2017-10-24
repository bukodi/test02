package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.MemberTypeCode;
import com.tools20022.repository.entity.SystemPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information about the members of a system.
 */
public class SystemMemberRole extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash balance for which a counterparty is specified.
	 */
	public static final MMBusinessAssociationEnd CashBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Cash balance for which a counterparty is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.Counterparty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}
	};
	/**
	 * Nature of the relationship a member has with a system.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the relationship a member has with a system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MemberTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the status of a member.
	 */
	public static final MMBusinessAssociationEnd MemberStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MemberStatus";
			definition = "Specifies the status of a member.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemStatus.SystemMemberRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemStatus.mmObject();
		}
	};
	/**
	 * Cash management feature limiting the maximum risk a party accepts to take
	 * with respect to a counterparty or a set of counterparties. A risk
	 * management limit is either bilateral, ie, for a counterparty, or
	 * multilateral, ie, for a set of counterparties or all other members in a
	 * system.The limit may also apply to sponsored members, ie, indirect
	 * members. In principle, a risk management limit is calculated on the net
	 * position between two members and is expressed as a credit or debit limit,
	 * from the point of view of the party setting the limit.
	 */
	public static final MMBusinessAssociationEnd Limit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "Cash management feature limiting the maximum risk a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a set of counterparties or all other members in a system.The limit may also apply to sponsored members, ie, indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.Counterparty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RiskManagementLimit.mmObject();
		}
	};
	/**
	 * Account owned by the member of a system with the system.<br>
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
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account owned by the member of a system with the system.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.SystemMember;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemMemberRole";
				definition = "Information about the members of a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.SystemMember, com.tools20022.repository.entity.RiskManagementLimit.Counterparty,
						com.tools20022.repository.entity.CashBalance.Counterparty, com.tools20022.repository.entity.SystemStatus.SystemMemberRole);
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemMemberRole.CashBalance, com.tools20022.repository.entity.SystemMemberRole.Type, com.tools20022.repository.entity.SystemMemberRole.MemberStatus,
						com.tools20022.repository.entity.SystemMemberRole.Limit, com.tools20022.repository.entity.SystemMemberRole.Account);
			}
		});
		return mmObject_lazy.get();
	}
}