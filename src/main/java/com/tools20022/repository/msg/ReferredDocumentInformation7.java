package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to identify the documents referred to in the remittance
 * information.
 */
public class ReferredDocumentInformation7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of referred document.
	 */
	public static final MMMessageAssociationEnd Type = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Type;
			componentContext_lazy = () -> ReferredDocumentInformation7.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReferredDocumentType4.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of the referred document.
	 */
	public static final MMMessageAttribute Number = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			componentContext_lazy = () -> ReferredDocumentInformation7.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Unique and unambiguous identification of the referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date associated with the referred document.
	 */
	public static final MMMessageAttribute RelatedDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.IssueDate;
			componentContext_lazy = () -> ReferredDocumentInformation7.mmObject();
			isDerived = false;
			xmlTag = "RltdDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDate";
			definition = "Date associated with the referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Set of elements used to provide the content of the referred document
	 * line.
	 */
	public static final MMMessageAssociationEnd LineDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> ReferredDocumentInformation7.mmObject();
			isDerived = false;
			xmlTag = "LineDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineDetails";
			definition = "Set of elements used to provide the content of the referred document line.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentLineInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReferredDocumentInformation7.Type, com.tools20022.repository.msg.ReferredDocumentInformation7.Number,
						com.tools20022.repository.msg.ReferredDocumentInformation7.RelatedDate, com.tools20022.repository.msg.ReferredDocumentInformation7.LineDetails);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReferredDocumentInformation7";
				definition = "Set of elements used to identify the documents referred to in the remittance information.";
			}
		});
		return mmObject_lazy.get();
	}
}