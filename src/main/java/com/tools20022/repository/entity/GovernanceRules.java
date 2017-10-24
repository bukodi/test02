package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.GovernanceIdentificationCode;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Rules governing an undertaking such as a guarantee or standby letter of
 * credit.
 */
public class GovernanceRules {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Model form to which the governance rules apply.
	 */
	public static final MMBusinessAssociationEnd ModelForm = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GovernanceRules.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ModelForm";
			definition = "Model form to which the governance rules apply.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ModelForm.GovernanceRules;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ModelForm.mmObject();
		}
	};
	/**
	 * Identification of the governance rules.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> GovernanceRules.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the governance rules.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GovernanceIdentificationCode.mmObject();
		}
	};
	/**
	 * Law under which the undertaking has been issued.
	 */
	public static final MMBusinessAttribute ApplicableLaw = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> GovernanceRules.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicableLaw";
			definition = "Law under which the undertaking has been issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Jurisdiction which applies to the governance rules.
	 */
	public static final MMBusinessAssociationEnd Jurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GovernanceRules.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction which applies to the governance rules.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.GovernanceRules;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};
	/**
	 * Agency that publishes the governance rules.
	 */
	public static final MMBusinessAttribute PublicationAgency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> GovernanceRules.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicationAgency";
			definition = "Agency that publishes the governance rules.";
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
				name = "GovernanceRules";
				definition = "Rules governing an undertaking such as a guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ModelForm.GovernanceRules, com.tools20022.repository.entity.Jurisdiction.GovernanceRules);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GovernanceRules.ModelForm, com.tools20022.repository.entity.GovernanceRules.Identification, com.tools20022.repository.entity.GovernanceRules.ApplicableLaw,
						com.tools20022.repository.entity.GovernanceRules.Jurisdiction, com.tools20022.repository.entity.GovernanceRules.PublicationAgency);
			}
		});
		return mmObject_lazy.get();
	}
}