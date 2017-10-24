package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.CategoryPurpose1Choice;
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.choice.MandateClassification1Choice;
import com.tools20022.repository.choice.ServiceLevel8Choice;
import com.tools20022.repository.entity.Mandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to further detail the information related to the type of
 * payment.
 */
public class MandateTypeInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agreement under which or rules under which the mandate resides.
	 */
	public static final MMMessageAssociationEnd ServiceLevel = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.ServiceLevel;
			componentContext_lazy = () -> MandateTypeInformation2.mmObject();
			isDerived = false;
			xmlTag = "SvcLvl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the mandate resides.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ServiceLevel8Choice.mmObject();
		}
	};
	/**
	 * User community specific instrument. Usage: This element is used to
	 * specify a local instrument, local clearing option and/or further qualify
	 * the service or service level.
	 */
	public static final MMMessageAssociationEnd LocalInstrument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType;
			componentContext_lazy = () -> MandateTypeInformation2.mmObject();
			isDerived = false;
			xmlTag = "LclInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LocalInstrument2Choice.mmObject();
		}
	};
	/**
	 * Specifies the high level purpose of the mandate based on a set of
	 * pre-defined categories.
	 */
	public static final MMMessageAssociationEnd CategoryPurpose = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.CategoryPurpose;
			componentContext_lazy = () -> MandateTypeInformation2.mmObject();
			isDerived = false;
			xmlTag = "CtgyPurp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the mandate based on a set of pre-defined categories.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CategoryPurpose1Choice.mmObject();
		}
	};
	/**
	 * Type of direct debit instruction.
	 */
	public static final MMMessageAssociationEnd Classification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.Classification;
			componentContext_lazy = () -> MandateTypeInformation2.mmObject();
			isDerived = false;
			xmlTag = "Clssfctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Classification";
			definition = "Type of direct debit instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateClassification1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateTypeInformation2.ServiceLevel, com.tools20022.repository.msg.MandateTypeInformation2.LocalInstrument,
						com.tools20022.repository.msg.MandateTypeInformation2.CategoryPurpose, com.tools20022.repository.msg.MandateTypeInformation2.Classification);
				trace_lazy = () -> Mandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateTypeInformation2";
				definition = "Set of elements used to further detail the information related to the type of payment.";
			}
		});
		return mmObject_lazy.get();
	}
}