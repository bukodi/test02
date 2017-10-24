package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Evidence;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional security provision attached to a contract. A (numeric) signature
 * can be used as evidence of origin and integrity, i.e., authenticity of the
 * signed data. A judge can accept this evidence as proof.
 */
public class Signature extends Evidence {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Parameters related to the signature provided.
	 */
	public static final MMBusinessAssociationEnd Conditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Signature.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Conditions";
			definition = "Parameters related to the signature provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SignatureCondition.Signature;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SignatureCondition.mmObject();
		}
	};
	/**
	 * Validation of a payment by card for which a signeture is specified.
	 */
	public static final MMBusinessAssociationEnd CardPaymentValidation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Signature.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentValidation";
			definition = "Validation of a payment by card for which a signeture is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.Signature;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Signature";
				definition = "Additional security provision attached to a contract. A (numeric) signature can be used as evidence of origin and integrity, i.e., authenticity of the signed data. A judge can accept this evidence as proof.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SignatureCondition.Signature, com.tools20022.repository.entity.CardPaymentValidation.Signature);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.Signature);
				subType_lazy = () -> Arrays.asList(ElectronicSignature.mmObject());
				superType_lazy = () -> Evidence.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Signature.Conditions, com.tools20022.repository.entity.Signature.CardPaymentValidation);
			}
		});
		return mmObject_lazy.get();
	}
}