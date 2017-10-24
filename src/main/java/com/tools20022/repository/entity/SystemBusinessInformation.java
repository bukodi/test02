package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Details about business information related to a system.
 */
public class SystemBusinessInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Further information about the criticality or importance of a general
	 * business information system.
	 */
	public static final MMBusinessAssociationEnd Qualifier = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Further information about the criticality or importance of a general business information system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationQualifier.SystemBusinessInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InformationQualifier.mmObject();
		}
	};
	/**
	 * Subject line of an item of general business information, summarizing the
	 * topic and intended destination of the information.
	 */
	public static final MMBusinessAttribute Subject = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Subject";
			definition = "Subject line of an item of general business information, summarizing the topic and intended destination of the information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * General business information, in unstructured form.
	 */
	public static final MMBusinessAttribute SubjectDetails = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubjectDetails";
			definition = "General business information, in unstructured form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of a general business information
	 * system, as assigned by the system transaction administrator.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a general business information system, as assigned by the system transaction administrator.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous reference assigned to a general business
	 * information system.
	 */
	public static final MMBusinessAttribute Reference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reference";
			definition = "Unique and unambiguous reference assigned to a general business information system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * System for which business information is generated.
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which business information is generated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.SystemGeneratedInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemBusinessInformation";
				definition = "Details about business information related to a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.SystemGeneratedInformation, com.tools20022.repository.entity.InformationQualifier.SystemBusinessInformation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemBusinessInformation.Qualifier, com.tools20022.repository.entity.SystemBusinessInformation.Subject,
						com.tools20022.repository.entity.SystemBusinessInformation.SubjectDetails, com.tools20022.repository.entity.SystemBusinessInformation.Identification,
						com.tools20022.repository.entity.SystemBusinessInformation.Reference, com.tools20022.repository.entity.SystemBusinessInformation.System);
			}
		});
		return mmObject_lazy.get();
	}
}