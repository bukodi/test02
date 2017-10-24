package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.TransactionChannelCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Contract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement between an account servicer and an account owner about the services
 * linked to an account.
 */
public class AccountContract extends Contract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which the account and related services are expected to cease to
	 * be operational for the account owner.
	 */
	public static final MMBusinessAttribute TargetClosingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TargetClosingDate";
			definition = "Date on which the account and related services are expected to cease to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicator that the change to the contract needs to be treated urgently.
	 */
	public static final MMBusinessAttribute UrgencyFlag = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UrgencyFlag";
			definition = "Indicator that the change to the contract needs to be treated urgently.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates removal of the account. After removal, an account will not
	 * appear anymore in reports.
	 */
	public static final MMBusinessAttribute RemovalIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemovalIndicator";
			definition = "Indicates removal of the account. After removal, an account will not appear anymore in reports.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date on which the account and related services are expected to cease/to
	 * be operational for the account owner.
	 */
	public static final MMBusinessAttribute TargetGoLiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TargetGoLiveDate";
			definition = "Date on which the account and related services are expected to cease/to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Operations on a bank account that are allowed as part of the services
	 * offered to the owners of a bank account,
	 */
	public static final MMBusinessAssociationEnd AccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account,";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.AccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
		}
	};
	/**
	 * Specifies the account which is managed by a contract.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Specifies the account which is managed by a contract.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.AccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	/**
	 * Interest that applies to the account.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Interest that applies to the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	/**
	 * Date of the request.
	 */
	public static final MMBusinessAttribute RequestDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestDate";
			definition = "Date of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the services which are assigned to another party.
	 */
	public static final MMBusinessAssociationEnd AccountAuthorisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountAuthorisation";
			definition = "Specifies the services which are assigned to another party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.AccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Mandate.mmObject();
		}
	};
	/**
	 * Specifies the means by which the account owner submits the open account
	 * form.
	 */
	public static final MMBusinessAttribute TransactionChannel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionChannel";
			definition = "Specifies the means by which the account owner submits the open account form. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionChannelCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountContract";
				definition = "Agreement between an account servicer and an account owner about the services linked to an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.AccountContract, com.tools20022.repository.entity.AccountService.AccountContract,
						com.tools20022.repository.entity.Interest.RelatedAccountContract, com.tools20022.repository.entity.Mandate.AccountContract);
				subType_lazy = () -> Arrays.asList(InvestmentAccountContract.mmObject(), CashAccountContract.mmObject());
				superType_lazy = () -> Contract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountContract.TargetClosingDate, com.tools20022.repository.entity.AccountContract.UrgencyFlag,
						com.tools20022.repository.entity.AccountContract.RemovalIndicator, com.tools20022.repository.entity.AccountContract.TargetGoLiveDate, com.tools20022.repository.entity.AccountContract.AccountService,
						com.tools20022.repository.entity.AccountContract.Account, com.tools20022.repository.entity.AccountContract.Interest, com.tools20022.repository.entity.AccountContract.RequestDate,
						com.tools20022.repository.entity.AccountContract.AccountAuthorisation, com.tools20022.repository.entity.AccountContract.TransactionChannel);
			}
		});
		return mmObject_lazy.get();
	}
}