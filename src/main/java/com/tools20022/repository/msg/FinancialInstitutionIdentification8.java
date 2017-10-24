package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.OrganisationIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to identify a financial institution.
 */
public class FinancialInstitutionIdentification8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code allocated to a financial institution by the ISO 9362 Registration
	 * Authority as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 */
	public static final MMMessageAttribute BICFI = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.BICFI;
			componentContext_lazy = () -> FinancialInstitutionIdentification8.mmObject();
			isDerived = false;
			xmlTag = "BICFI";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BICFI";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	/**
	 * Information used to identify a member within a clearing system.
	 */
	public static final MMMessageAssociationEnd ClearingSystemMemberIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.ClearingSystemMemberIdentificationType;
			componentContext_lazy = () -> FinancialInstitutionIdentification8.mmObject();
			isDerived = false;
			xmlTag = "ClrSysMmbId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemMemberIdentification";
			definition = "Information used to identify a member within a clearing system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClearingSystemMemberIdentification2.mmObject();
		}
	};
	/**
	 * Name by which an agent is known and which is usually used to identify
	 * that agent.
	 */
	public static final MMMessageAttribute Name = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyName.Name;
			componentContext_lazy = () -> FinancialInstitutionIdentification8.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which an agent is known and which is usually used to identify that agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Information that locates and identifies a specific address, as defined by
	 * postal services.
	 */
	public static final MMMessageAssociationEnd PostalAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			componentContext_lazy = () -> FinancialInstitutionIdentification8.mmObject();
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress6.mmObject();
		}
	};
	/**
	 * Unique identification of an agent, as assigned by an institution, using
	 * an identification scheme.
	 */
	public static final MMMessageAssociationEnd Other = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> OrganisationIdentification.mmObject();
			componentContext_lazy = () -> FinancialInstitutionIdentification8.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Unique identification of an agent, as assigned by an institution, using an identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericFinancialIdentification1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstitutionIdentification8.BICFI, com.tools20022.repository.msg.FinancialInstitutionIdentification8.ClearingSystemMemberIdentification,
						com.tools20022.repository.msg.FinancialInstitutionIdentification8.Name, com.tools20022.repository.msg.FinancialInstitutionIdentification8.PostalAddress,
						com.tools20022.repository.msg.FinancialInstitutionIdentification8.Other);
				trace_lazy = () -> OrganisationIdentification.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitutionIdentification8";
				definition = "Set of elements used to identify a financial institution.";
			}
		});
		return mmObject_lazy.get();
	}
}