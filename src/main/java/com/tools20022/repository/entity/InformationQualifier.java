package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PriorityCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Further qualifies the information provided in terms of its importance and its
 * format.
 */
public class InformationQualifier {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * System for which a qualifier is specified.
	 */
	public static final MMBusinessAssociationEnd SystemBusinessInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InformationQualifier.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemBusinessInformation";
			definition = "System for which a qualifier is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.Qualifier;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.mmObject();
		}
	};
	/**
	 * Indicates whether the information is formatted.
	 */
	public static final MMBusinessAttribute IsFormatted = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InformationQualifier.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IsFormatted";
			definition = "Indicates whether the information is formatted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Priority of the information.
	 */
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InformationQualifier.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Priority of the information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InformationQualifier";
				definition = "Further qualifies the information provided in terms of its importance and its format.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemBusinessInformation.Qualifier);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationQualifier.SystemBusinessInformation, com.tools20022.repository.entity.InformationQualifier.IsFormatted,
						com.tools20022.repository.entity.InformationQualifier.Priority);
			}
		});
		return mmObject_lazy.get();
	}
}