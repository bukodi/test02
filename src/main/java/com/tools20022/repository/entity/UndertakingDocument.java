package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExternalDocumentFormatCode;
import com.tools20022.repository.codeset.ExternalUndertakingDocumentTypeCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document presented.
 */
public class UndertakingDocument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of document.
	 */
	public static final MMBusinessAttribute DocumentType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingDocument.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DocumentType";
			definition = "Type of document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingDocumentTypeCode.mmObject();
		}
	};
	/**
	 * Format of the document.
	 */
	public static final MMBusinessAttribute Format = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingDocument.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Format";
			definition = "Format of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalDocumentFormatCode.mmObject();
		}
	};
	/**
	 * Undertaking for which document content is specified.
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingDocument.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which document content is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.SpecifiedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	/**
	 * Indicates whether the document is a copy.
	 */
	public static final MMBusinessAttribute CopyIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingDocument.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CopyIndicator";
			definition = "Indicates whether the document is a copy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Demand for which associated documents are specified.
	 */
	public static final MMBusinessAssociationEnd Demand = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingDocument.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Demand";
			definition = "Demand for which associated documents are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Demand.AssociatedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingDocument";
				definition = "Document presented.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.SpecifiedDocument, com.tools20022.repository.entity.Demand.AssociatedDocument);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingDocument.DocumentType, com.tools20022.repository.entity.UndertakingDocument.Format,
						com.tools20022.repository.entity.UndertakingDocument.Undertaking, com.tools20022.repository.entity.UndertakingDocument.CopyIndicator, com.tools20022.repository.entity.UndertakingDocument.Demand);
			}
		});
		return mmObject_lazy.get();
	}
}