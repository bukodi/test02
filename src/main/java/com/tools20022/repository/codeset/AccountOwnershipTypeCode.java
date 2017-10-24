package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of account ownership.
 */
public class AccountOwnershipTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Two or more individuals own shares of the same account. Upon the death of
	 * one of the account owners, the entire account ownership is passed onto
	 * the surviving owners.
	 */
	public static final MMCode JointAccountWithSurvivorshipRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "JointAccountWithSurvivorshipRights";
			definition = "Two or more individuals own shares of the same account. Upon the death of one of the account owners, the entire account ownership is passed onto the surviving owners.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "JOIN";
		}
	};
	/**
	 * Two or more individuals of legal age own shares of the same account. Upon
	 * the death of one of the account owners, the respective percentage of the
	 * ownership is transferred to the deceased's estate.
	 */
	public static final MMCode JointAccountInCommon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "JointAccountInCommon";
			definition = "Two or more individuals of legal age own shares of the same account. Upon the death of one of the account owners, the respective percentage of the ownership is transferred to the deceased's estate.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "COMO";
		}
	};
	/**
	 * Minor's account, registered in the minor's name. Since the minor cannot
	 * legally own property, the custodian of the account maintains control of
	 * the account.
	 */
	public static final MMCode CustodialAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustodialAccount";
			definition = "Minor's account, registered in the minor's name. Since the minor cannot legally own property,  the custodian of the account maintains control of the account.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Account has only one individual owner.
	 */
	public static final MMCode SingleOwnerAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SingleOwnerAccount";
			definition = "Account has only one individual owner.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "SIGL";
		}
	};
	/**
	 * Two or more individuals of legal age own shares of the same account.
	 */
	public static final MMCode JointAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "JointAccount";
			definition = "Two or more individuals of legal age own shares of the same account.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "JOIT";
		}
	};
	/**
	 * Account owner is a corporate.
	 */
	public static final MMCode Corporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Corporation";
			definition = "Account owner is a corporate.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Account owner is a contractual business organisation in which two or more
	 * individuals agree to pool their funds to manage and operate a business.
	 */
	public static final MMCode FormalPartnership = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FormalPartnership";
			definition = "Account owner is a contractual business organisation in which two or more individuals agree to pool their funds to manage and operate a business.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Account owner is an organisation which is engaged as a trustee for
	 * individuals or businesses in the administration of services such as stock
	 * transfer, registration, trust funds.
	 */
	public static final MMCode FormalTrust = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FormalTrust";
			definition = "Account owner is an organisation which is engaged as a trustee for individuals or businesses in the administration of services such as stock transfer, registration, trust funds.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "TRUS";
		}
	};
	/**
	 * Account owner is a person or firm into whose name securities or other
	 * properties are transferred in order to facilitate transactions whilst
	 * leaving the customer as the actual owner.
	 */
	public static final MMCode Nominee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Nominee";
			definition = "Account owner is a person or firm into whose name securities or other properties are transferred in order to facilitate transactions whilst leaving the customer as the actual owner.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "NOMI";
		}
	};
	/**
	 * Account owner is an association that is given tax-free status due to the
	 * nature of their activities such as charity organisation.
	 */
	public static final MMCode NonProfitOrganisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonProfitOrganisation";
			definition = "Account owner is an association that is given tax-free status due to the nature of their activities such as charity organisation.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "NFPO";
		}
	};
	/**
	 * Account owner is another type of non individual organisation.
	 */
	public static final MMCode OtherNonIndividual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherNonIndividual";
			definition = "Account owner is another type of non individual organisation.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "ONIS";
		}
	};
	/**
	 * Account owner is an entity located in the European Union which can be
	 * considered neither as a legal entity (for example, company, corporate),
	 * nor as an individual person, nor as a UCITS (Undertakings for Collective
	 * Investment of Transferable Securities) fund.
	 */
	public static final MMCode EUResidualEntity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EUResidualEntity";
			definition = "Account owner is an entity located in the European Union which can be considered neither as a legal entity (for example, company, corporate), nor as an individual person, nor as a UCITS (Undertakings for Collective Investment of Transferable Securities) fund.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "EURE";
		}
	};
	/**
	 * Account owner is a government organisation.
	 */
	public static final MMCode GovernmentOrganisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernmentOrganisation";
			definition = "Account owner is a government organisation.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "GOVO";
		}
	};
	/**
	 * Account is for a limited liability company.
	 */
	public static final MMCode LimitedLiabilityCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitedLiabilityCompany";
			definition = "Account is for a limited liability company.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "LLCO";
		}
	};
	/**
	 * Account is for a registered investment company.
	 */
	public static final MMCode RegisteredInvestmentCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredInvestmentCompany";
			definition = "Account is for a registered investment company.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "RGIC";
		}
	};
	/**
	 * Entrepreneurial account.
	 */
	public static final MMCode Entrepreneurial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entrepreneurial";
			definition = "Entrepreneurial account.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "ENTR";
		}
	};
	/**
	 * Account owner is an unincorporated partnership or is of sole
	 * proprietorship.
	 */
	public static final MMCode Unincorporated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unincorporated";
			definition = "Account owner is an unincorporated partnership or is of sole proprietorship. ";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "UNCO";
		}
	};
	/**
	 * Account owner is a limited partnership or is of sole proprietorship.
	 */
	public static final MMCode LimitedPartnership = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitedPartnership";
			definition = "Account owner is a limited partnership or is of sole proprietorship.";
			owner_lazy = () -> AccountOwnershipTypeCode.mmObject();
			codeName = "LIPA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("JOIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountOwnershipTypeCode";
				definition = "Specifies the type of account ownership.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountOwnershipTypeCode.JointAccountWithSurvivorshipRights, com.tools20022.repository.codeset.AccountOwnershipTypeCode.JointAccountInCommon,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.CustodialAccount, com.tools20022.repository.codeset.AccountOwnershipTypeCode.SingleOwnerAccount,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.JointAccount, com.tools20022.repository.codeset.AccountOwnershipTypeCode.Corporation,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.FormalPartnership, com.tools20022.repository.codeset.AccountOwnershipTypeCode.FormalTrust,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.Nominee, com.tools20022.repository.codeset.AccountOwnershipTypeCode.NonProfitOrganisation,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.OtherNonIndividual, com.tools20022.repository.codeset.AccountOwnershipTypeCode.EUResidualEntity,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.GovernmentOrganisation, com.tools20022.repository.codeset.AccountOwnershipTypeCode.LimitedLiabilityCompany,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.RegisteredInvestmentCompany, com.tools20022.repository.codeset.AccountOwnershipTypeCode.Entrepreneurial,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.Unincorporated, com.tools20022.repository.codeset.AccountOwnershipTypeCode.LimitedPartnership);
			}
		});
		return mmObject_lazy.get();
	}
}