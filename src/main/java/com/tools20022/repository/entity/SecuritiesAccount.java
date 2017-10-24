package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ClearingAccountTypeCode;
import com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode;
import com.tools20022.repository.entity.Account;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account to or from which a securities entry is made.
 */
public class SecuritiesAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of securities account.
	 */
	public static final MMBusinessAttribute SecuritiesAccountType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccountType";
			definition = "Specifies the type of securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
		}
	};
	/**
	 * Investment account which contains a securities account to make securities
	 * movements.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccount";
			definition = "Investment account which contains a securities account to make securities movements.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}
	};
	/**
	 * Specifies the process which moves securities out of an account to another
	 * one.
	 */
	public static final MMBusinessAssociationEnd RelatedTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransfer";
			definition = "Specifies the process which moves securities out of an account to another one.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTransfer.mmObject();
		}
	};
	/**
	 * Specifies the role which uses a securities account.
	 */
	public static final MMBusinessAssociationEnd SecuritiesPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPartyRole";
			definition = "Specifies the role which uses a securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
		}
	};
	/**
	 * Security which is held on the securities account.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is held on the securities account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Specifies where the financial instruments are registered.
	 */
	public static final MMBusinessAssociationEnd RelatedRegistrar = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRegistrar";
			definition = "Specifies where the financial instruments are registered.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RegistrarRole.RegistrarAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegistrarRole.mmObject();
		}
	};
	/**
	 * Location where the financial instruments are safekept.
	 */
	public static final MMBusinessAssociationEnd SafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Location where the financial instruments are safekept.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.RelatedSecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}
	};
	/**
	 * Value of financial assets held by a person or an organisation. It is
	 * derived from the association between Account and Balance.
	 */
	public static final MMBusinessAssociationEnd SecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Value of financial assets held by a person or an organisation. It is derived from the association between Account and Balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	/**
	 * Actions taken in relation with the securities account in the context of
	 * the corporate action.
	 */
	public static final MMBusinessAssociationEnd CorporateActionServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionServicing";
			definition = "Actions taken in relation with the securities account in the context of the corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
		}
	};
	/**
	 * Allocation process for which an account is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAllocation";
			definition = "Allocation process for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.AllocationAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Allocation.mmObject();
		}
	};
	/**
	 * Record of the movements into or out of an account.
	 */
	public static final MMBusinessAssociationEnd SecuritiesEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
		}
	};
	/**
	 * Clearing member which holds a clearing account at a CCP.
	 */
	public static final MMBusinessAssociationEnd ClearingAccountOwner = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountOwner";
			definition = "Clearing member which holds a clearing account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.ClearingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}
	};
	/**
	 * Clearing member which holds a margin account at a CCP.
	 */
	public static final MMBusinessAssociationEnd MarginAccountOwner = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginAccountOwner";
			definition = "Clearing member which holds a margin account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.MarginAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}
	};
	/**
	 * Clearing member which holds a delivery account at a CCP.
	 */
	public static final MMBusinessAssociationEnd DeliveryAccountOwner = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryAccountOwner";
			definition = "Clearing member which holds a delivery account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.DeliveryAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}
	};
	/**
	 * Power of attorney related to the securities account.
	 */
	public static final MMBusinessAssociationEnd RelatedPowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPowerOfAttorney";
			definition = "Power of attorney related to the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.AuthorisedAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PowerOfAttorney.mmObject();
		}
	};
	/**
	 * Meeting instruction which specifies an account.
	 */
	public static final MMBusinessAssociationEnd RelatedMeetingInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingInstruction";
			definition = "Meeting instruction which specifies an account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.SafekeepingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InstructionForMeeting.mmObject();
		}
	};
	/**
	 * Specifies the clearing account type.
	 */
	public static final MMBusinessAttribute ClearingAccountType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountType";
			definition = "Specifies the clearing account type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingAccountTypeCode.mmObject();
		}
	};
	/**
	 * Order process for which an ordering account is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order process for which an ordering account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Disclosed list trading process for which a trading account is specified.
	 */
	public static final MMBusinessAssociationEnd DisclosedListTrading = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisclosedListTrading";
			definition = "Disclosed list trading process for which a trading account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.DisclosedListTradingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmObject();
		}
	};
	/**
	 * Defines the link between a cash account and a securities account.
	 */
	public static final MMBusinessAssociationEnd AccountLink = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between a cash account and a securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccount";
				definition = "Account to or from which a securities entry is made.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesAccount, com.tools20022.repository.entity.InvestmentAccount.SecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesTransfer.Account, com.tools20022.repository.entity.ClearingMemberRole.ClearingAccount, com.tools20022.repository.entity.ClearingMemberRole.MarginAccount,
						com.tools20022.repository.entity.ClearingMemberRole.DeliveryAccount, com.tools20022.repository.entity.SecuritiesPartyRole.SecuritiesAccount, com.tools20022.repository.entity.SecuritiesEntry.SecuritiesAccount,
						com.tools20022.repository.entity.SafekeepingPlace.RelatedSecuritiesAccount, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesAccount, com.tools20022.repository.entity.RegistrarRole.RegistrarAccount,
						com.tools20022.repository.entity.CorporateActionServicing.SecuritiesAccount, com.tools20022.repository.entity.SecuritiesOrder.OrderingAccount, com.tools20022.repository.entity.Allocation.AllocationAccount,
						com.tools20022.repository.entity.InstructionForMeeting.SafekeepingAccount, com.tools20022.repository.entity.PowerOfAttorney.AuthorisedAccount, com.tools20022.repository.entity.AccountLink.SecuritiesAccount,
						com.tools20022.repository.entity.DisclosedListTrading.DisclosedListTradingAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.SecuritiesAccountType, com.tools20022.repository.entity.SecuritiesAccount.RelatedInvestmentAccount,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedTransfer, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesPartyRole, com.tools20022.repository.entity.SecuritiesAccount.Security,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedRegistrar, com.tools20022.repository.entity.SecuritiesAccount.SafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesAccount.CorporateActionServicing, com.tools20022.repository.entity.SecuritiesAccount.RelatedAllocation, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesEntry,
						com.tools20022.repository.entity.SecuritiesAccount.ClearingAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.MarginAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.DeliveryAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.RelatedPowerOfAttorney,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedMeetingInstruction, com.tools20022.repository.entity.SecuritiesAccount.ClearingAccountType, com.tools20022.repository.entity.SecuritiesAccount.RelatedOrder,
						com.tools20022.repository.entity.SecuritiesAccount.DisclosedListTrading, com.tools20022.repository.entity.SecuritiesAccount.AccountLink);
			}
		});
		return mmObject_lazy.get();
	}
}