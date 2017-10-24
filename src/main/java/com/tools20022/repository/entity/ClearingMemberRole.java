package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ClearingSideCode;
import com.tools20022.repository.entity.SystemPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Member of an exchange's clearing corporation, responsible for executing
 * client trades and involved in the clearing of trades.
 */
public class ClearingMemberRole extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identifier of a clearing system member, assigned
	 * by the system or system administrator.
	 */
	public static final MMBusinessAssociationEnd ClearingSystemMemberIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentification";
			definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.ClearingMember;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashClearingSystemMember.mmObject();
		}
	};
	/**
	 * Specifies the side of the clearing member.
	 */
	public static final MMBusinessAttribute Side = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Side";
			definition = "Specifies the side of the clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingSideCode.mmObject();
		}
	};
	/**
	 * Identifies the clearing member account at the CCP through which the trade
	 * must be cleared (sometimes called position account).
	 */
	public static final MMBusinessAssociationEnd ClearingAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingAccount";
			definition = "Identifies the clearing member account at the CCP through which the trade must be cleared (sometimes called position account).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.ClearingAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Margin account where the negociation and liquidation risks will be
	 * calculated.
	 */
	public static final MMBusinessAssociationEnd MarginAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginAccount";
			definition = "Margin account where the negociation and liquidation risks will be calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.MarginAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Account opened by the central counterparty in the name of the clearing
	 * member within the account structure, for settlement purposes (gives
	 * information about the clearing member account at central counterparty).
	 */
	public static final MMBusinessAssociationEnd DeliveryAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryAccount";
			definition = "Account opened by the central counterparty in the name of the clearing member within the account structure, for settlement purposes (gives information about the clearing member account at central counterparty).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.DeliveryAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Specifies the account identification of the clearing member at the ICSD
	 * (International Central Securities Depository) or at the Central Bank.
	 */
	public static final MMBusinessAssociationEnd DefaultFundAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultFundAccount";
			definition = "Specifies the account identification of the clearing member at the ICSD (International Central Securities Depository) or at the Central Bank.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.DefaultFundAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}
	};
	/**
	 * Clearing segment within a clearing organisation that allows the
	 * segregation of flows coming from clearing counterparty's clearing system.
	 */
	public static final MMBusinessAssociationEnd ClearingSegment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSegment";
			definition = "Clearing segment within a clearing organisation that allows the segregation of flows coming from clearing counterparty's clearing system. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.RelatedClearingMemberRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}
	};
	/**
	 * Clearing member for which a clearing segment is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedClearingMemberRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedClearingMemberRole";
			definition = "Clearing member for which a clearing segment is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.ClearingSegment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingMemberRole";
				definition = "Member of an exchange's clearing corporation, responsible for executing client trades and involved in the clearing of trades.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.DefaultFundAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.ClearingAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.MarginAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.DeliveryAccountOwner,
						com.tools20022.repository.entity.CashClearingSystemMember.ClearingMember, com.tools20022.repository.entity.ClearingMemberRole.ClearingSegment,
						com.tools20022.repository.entity.ClearingMemberRole.RelatedClearingMemberRole);
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingMemberRole.ClearingSystemMemberIdentification, com.tools20022.repository.entity.ClearingMemberRole.Side,
						com.tools20022.repository.entity.ClearingMemberRole.ClearingAccount, com.tools20022.repository.entity.ClearingMemberRole.MarginAccount, com.tools20022.repository.entity.ClearingMemberRole.DeliveryAccount,
						com.tools20022.repository.entity.ClearingMemberRole.DefaultFundAccount, com.tools20022.repository.entity.ClearingMemberRole.ClearingSegment,
						com.tools20022.repository.entity.ClearingMemberRole.RelatedClearingMemberRole);
			}
		});
		return mmObject_lazy.get();
	}
}