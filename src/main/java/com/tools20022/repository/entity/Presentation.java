package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CommunicationMethodCode;
import com.tools20022.repository.codeset.ExternalChannelCode;
import com.tools20022.repository.codeset.PresentationMediumCode;
import com.tools20022.repository.datatype.ISODate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Presentation of documents.
 */
public class Presentation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method by which the document is to be delivered.
	 */
	public static final MMBusinessAttribute CommunicationMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Presentation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommunicationMethod";
			definition = "Method by which the document is to be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalChannelCode.mmObject();
		}
	};
	/**
	 * Specifies the undertaking which is presented and its associated
	 * documents.
	 */
	public static final MMBusinessAssociationEnd PresentedUndertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Presentation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PresentedUndertaking";
			definition = "Specifies the undertaking which is presented and its associated documents.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.Presentation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Undertaking.mmObject();
		}
	};
	/**
	 * Medium through which the presentation can be submitted such as paper,
	 * electronic or both.
	 */
	public static final MMBusinessAttribute Medium = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Presentation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Medium";
			definition = "Medium through which the presentation can be submitted such as paper, electronic or both.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PresentationMediumCode.mmObject();
		}
	};
	/**
	 * Documents which are presented.
	 */
	public static final MMBusinessAssociationEnd PresentedDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Presentation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PresentedDocument";
			definition = "Documents which are presented.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.Presentation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}
	};
	/**
	 * Electronic address for the presentation of documents.
	 */
	public static final MMBusinessAssociationEnd ElectronicPresentationAddress = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Presentation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicPresentationAddress";
			definition = "Electronic address for the presentation of documents.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.RelatedPresentation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ElectronicAddress.mmObject();
		}
	};
	/**
	 * Date on which the presentation is made.
	 */
	public static final MMBusinessAttribute PresentationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Presentation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PresentationDate";
			definition = "Date on which the presentation is made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Channel used for the transmission of a document.
	 */
	public static final MMBusinessAttribute ApplicableChannel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Presentation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicableChannel";
			definition = "Channel used for the transmission of a document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommunicationMethodCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Presentation";
				definition = "Presentation of documents.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicAddress.RelatedPresentation, com.tools20022.repository.entity.Document.Presentation,
						com.tools20022.repository.entity.Undertaking.Presentation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Presentation.CommunicationMethod, com.tools20022.repository.entity.Presentation.PresentedUndertaking, com.tools20022.repository.entity.Presentation.Medium,
						com.tools20022.repository.entity.Presentation.PresentedDocument, com.tools20022.repository.entity.Presentation.ElectronicPresentationAddress, com.tools20022.repository.entity.Presentation.PresentationDate,
						com.tools20022.repository.entity.Presentation.ApplicableChannel);
			}
		});
		return mmObject_lazy.get();
	}
}