package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.DocumentTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a type of financial or commercial document.
 */
public class DocumentType3Code extends DocumentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode RemittanceAdviceMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceAdviceMessage";
			owner_lazy = () -> DocumentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode RelatedPaymentInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPaymentInstruction";
			owner_lazy = () -> DocumentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode ForeignExchangeDealReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDealReference";
			owner_lazy = () -> DocumentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode DispatchAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DispatchAdvice";
			owner_lazy = () -> DocumentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode PurchaseOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrder";
			owner_lazy = () -> DocumentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode StructuredCommunicationReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredCommunicationReference";
			owner_lazy = () -> DocumentType3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RADM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentType3Code";
				definition = "Specifies a type of financial or commercial document.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DocumentType3Code.RemittanceAdviceMessage, com.tools20022.repository.codeset.DocumentType3Code.RelatedPaymentInstruction,
						com.tools20022.repository.codeset.DocumentType3Code.ForeignExchangeDealReference, com.tools20022.repository.codeset.DocumentType3Code.DispatchAdvice,
						com.tools20022.repository.codeset.DocumentType3Code.PurchaseOrder, com.tools20022.repository.codeset.DocumentType3Code.StructuredCommunicationReference);
				trace_lazy = () -> DocumentTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}