package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.POIComponentAssessmentCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Assessment for the components of a system.
 */
public class Assessment extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of assessment.
	 */
	public static final MMBusinessAttribute AssessmentType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Assessment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssessmentType";
			definition = "Type of assessment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> POIComponentAssessmentCode.mmObject();
		}
	};
	/**
	 * System for which an assessment is produced.
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Assessment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which an assessment is produced.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.Assessment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	/**
	 * Date when the assessment expires.
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Assessment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date when the assessment expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date when the assessment document was delivered.
	 */
	public static final MMBusinessAttribute DeliveryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Assessment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryDate";
			definition = "Date when the assessment document was delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Assessment";
				definition = "Assessment for the components of a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.Assessment);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Assessment.AssessmentType, com.tools20022.repository.entity.Assessment.System, com.tools20022.repository.entity.Assessment.ExpiryDate,
						com.tools20022.repository.entity.Assessment.DeliveryDate);
			}
		});
		return mmObject_lazy.get();
	}
}