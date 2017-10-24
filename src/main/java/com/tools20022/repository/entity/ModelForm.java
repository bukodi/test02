package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExternalModelFormIdentificationCode;
import com.tools20022.repository.codeset.ISO2ALanguageCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of a model form.
 */
public class ModelForm {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rules governing an undertaking such as a guarantee or standby letter of
	 * credit.
	 */
	public static final MMBusinessAssociationEnd GovernanceRules = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ModelForm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernanceRules";
			definition = "Rules governing an undertaking such as a guarantee or standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GovernanceRules.ModelForm;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmObject();
		}
	};
	/**
	 * Undertaking for which the model form is used.
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ModelForm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which the model form is used.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.ModelForm;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	/**
	 * Identification of the model form.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ModelForm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the model form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalModelFormIdentificationCode.mmObject();
		}
	};
	/**
	 * Version of the model form.
	 */
	public static final MMBusinessAttribute Version = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ModelForm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Version";
			definition = "Version of the model form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Language of the standard wording provided by the issuer.
	 */
	public static final MMBusinessAttribute RequestedWordingLanguage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ModelForm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedWordingLanguage";
			definition = "Language of the standard wording provided by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}
	};
	/**
	 * Date on which the use of the model form is effective.
	 */
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ModelForm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date on which the use of the model form is effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ModelForm";
				definition = "Identification of a model form.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.ModelForm, com.tools20022.repository.entity.GovernanceRules.ModelForm);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ModelForm.GovernanceRules, com.tools20022.repository.entity.ModelForm.Undertaking, com.tools20022.repository.entity.ModelForm.Identification,
						com.tools20022.repository.entity.ModelForm.Version, com.tools20022.repository.entity.ModelForm.RequestedWordingLanguage, com.tools20022.repository.entity.ModelForm.EffectiveDate);
			}
		});
		return mmObject_lazy.get();
	}
}