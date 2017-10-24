package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max15PlusSignedNumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the signature requirements for managing an account.
 */
public class SignatureCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of account owners or related parties required to authorise
	 * transactions on the account.
	 */
	public static final MMBusinessAttribute RequiredSignatureNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SignatureCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequiredSignatureNumber";
			definition = "Number of account owners or related parties required to authorise transactions on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates whether the signature of the account owner is required to
	 * authorise transactions on the account.
	 */
	public static final MMBusinessAttribute SignatoryRightIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SignatureCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the signature of the account owner is required to authorise transactions on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Mandate for which signature conditions are provided.
	 */
	public static final MMBusinessAssociationEnd Mandate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SignatureCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mandate";
			definition = "Mandate for which signature conditions are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.SignatureConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
		}
	};
	/**
	 * Indicator whether a certain order of signatures has to be respected or
	 * not.
	 */
	public static final MMBusinessAttribute SignatureOrderIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SignatureCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureOrderIndicator";
			definition = "Indicator whether a certain order of signatures has to be respected or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates the order in which the mandate holders are allowed to sign.
	 */
	public static final MMBusinessAttribute SignatureOrder = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SignatureCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureOrder";
			definition = "Indicates the order in which the mandate holders are allowed to sign.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15PlusSignedNumericText.mmObject();
		}
	};
	/**
	 * Manual or digital signature added as security provision by each party
	 * involved in the business covered by the document.
	 */
	public static final MMBusinessAssociationEnd Signature = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SignatureCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Signature";
			definition = "Manual or digital signature added as security provision by each party involved in the business covered by the document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Signature.Conditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SignatureCondition";
				definition = "Specifies the signature requirements for managing an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Signature.Conditions, com.tools20022.repository.entity.Mandate.SignatureConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SignatureCondition.RequiredSignatureNumber, com.tools20022.repository.entity.SignatureCondition.SignatoryRightIndicator,
						com.tools20022.repository.entity.SignatureCondition.Mandate, com.tools20022.repository.entity.SignatureCondition.SignatureOrderIndicator, com.tools20022.repository.entity.SignatureCondition.SignatureOrder,
						com.tools20022.repository.entity.SignatureCondition.Signature);
			}
		});
		return mmObject_lazy.get();
	}
}