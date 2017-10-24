package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ResponseCode;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Response of a requested service.
 */
public class Response {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Detailed result of the transaction.
	 */
	public static final MMBusinessAttribute ResponseReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Response.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResponseReason";
			definition = "Detailed result of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Validation process to which a response is given.
	 */
	public static final MMBusinessAssociationEnd RelatedCardPaymentValidation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Response.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPaymentValidation";
			definition = "Validation process to which a response is given.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.Response;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardPaymentValidation.mmObject();
		}
	};
	/**
	 * Response from the issuer to the authorisation.
	 */
	public static final MMBusinessAttribute ResponseToAuthorisation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Response.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResponseToAuthorisation";
			definition = "Response from the issuer to the authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResponseCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Response";
				definition = "Response of a requested service.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentValidation.Response);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Response.ResponseReason, com.tools20022.repository.entity.Response.RelatedCardPaymentValidation,
						com.tools20022.repository.entity.Response.ResponseToAuthorisation);
			}
		});
		return mmObject_lazy.get();
	}
}