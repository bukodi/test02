package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.GenericAccountIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique identifier of an account, as assigned by the account servicer.
 */
public class AccountIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account for which an identification is provided.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	/**
	 * International Bank Account Number (IBAN) - identifier used
	 * internationally by financial institutions to uniquely identify the
	 * account of a customer. Further specifications of the format and content
	 * of the IBAN can be found in the standard ISO 13616
	 * "Banking and related financial services - International Bank Account Number (IBAN)"
	 * version 1997-10-01, or later revisions.
	 */
	public static final MMBusinessAttribute IBAN = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification4Choice.IBAN, com.tools20022.repository.choice.AccountIdentification4Choice.Other);
			isDerived = false;
			elementContext_lazy = () -> AccountIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IBAN";
			definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IBAN2007Identifier.mmObject();
		}
	};
	/**
	 * Basic Bank Account Number (BBAN) - identifier used nationally by
	 * financial institutions, ie, in individual countries, generally as part of
	 * a National Account Numbering Scheme(s), to uniquely identify the account
	 * of a customer.
	 */
	public static final MMBusinessAttribute BBAN = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BBAN";
			definition = "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BBANIdentifier.mmObject();
		}
	};
	/**
	 * Universal Payment Identification Code (UPIC) - identifier used by the New
	 * York Clearing House to mask confidential data, such as bank accounts and
	 * bank routing numbers. UPIC numbers remain with business customers,
	 * regardless of banking relationship changes.
	 */
	public static final MMBusinessAttribute UPIC = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UPIC";
			definition = "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UPICIdentifier.mmObject();
		}
	};
	/**
	 * Unique identifier for an account. It is assigned by the account servicer
	 * using a proprietary identification scheme.
	 */
	public static final MMBusinessAssociationEnd ProprietaryIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Name of the account. It provides an additional means of identification,
	 * and is designated by the account servicer in agreement with the account
	 * owner.
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount24.Name);
			isDerived = false;
			elementContext_lazy = () -> AccountIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Template describing the mask of the structure for the format of the
	 * accounting account identifier; for example "AABBBBCC" where AA represents
	 * the country, BBBB the service classification, CC the sales area.
	 */
	public static final MMBusinessAssociationEnd CostReferencePattern = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CostReferencePattern";
			definition = "Template describing the mask of the structure for the format of the accounting account identifier; for example \"AABBBBCC\" where AA represents the country, BBBB the service classification, CC the sales area.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForAccountCostReferencePattern;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * String of characters (mainly numbers) used to identify an account.
	 */
	public static final MMBusinessAttribute Number = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "String of characters (mainly numbers) used to identify an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountIdentification";
				definition = "Unique identifier of an account, as assigned by the account servicer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForAccount,
						com.tools20022.repository.entity.GenericIdentification.IdentificationForAccountCostReferencePattern, com.tools20022.repository.entity.Account.Identification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountIdentification.Account, com.tools20022.repository.entity.AccountIdentification.IBAN, com.tools20022.repository.entity.AccountIdentification.BBAN,
						com.tools20022.repository.entity.AccountIdentification.UPIC, com.tools20022.repository.entity.AccountIdentification.ProprietaryIdentification, com.tools20022.repository.entity.AccountIdentification.Name,
						com.tools20022.repository.entity.AccountIdentification.CostReferencePattern, com.tools20022.repository.entity.AccountIdentification.Number);
				derivationComponent_lazy = () -> Arrays.asList(GenericAccountIdentification1.mmObject(), AccountIdentification4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}