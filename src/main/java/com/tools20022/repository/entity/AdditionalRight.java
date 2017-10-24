package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.AdditionalRightCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how the additional rights can be granted to the shareholder. These
 * rights can be exercised at shareholders meetings (for example, the right to
 * ask questions, the right to add items to the agenda or table draft
 * resolutions).
 */
public class AdditionalRight {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting for which additional rights are specified.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AdditionalRight.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which additional rights are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.AdditionalRight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	/**
	 * Specifies the additional right type.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AdditionalRight.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the additional right type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdditionalRightCode.mmObject();
		}
	};
	/**
	 * Additional right granted to specify the minimum stake in share capital or
	 * cash value or number of security holders required to table resolutions.
	 */
	public static final MMBusinessAttribute AdditionalRightThreshold = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AdditionalRight.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalRightThreshold";
			definition = "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Additional right granted to specify the minimum stake in share capital or
	 * cash value or number of security holders required to table resolutions.
	 * This minimum is expressed as a percentage.
	 */
	public static final MMBusinessAttribute AdditionalRightThresholdPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AdditionalRight.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalRightThresholdPercentage";
			definition = "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions. This minimum is expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AdditionalRight";
				definition = "Specifies how the additional rights can be granted to the shareholder. These rights can be exercised at shareholders meetings (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.AdditionalRight);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AdditionalRight.Meeting, com.tools20022.repository.entity.AdditionalRight.Type, com.tools20022.repository.entity.AdditionalRight.AdditionalRightThreshold,
						com.tools20022.repository.entity.AdditionalRight.AdditionalRightThresholdPercentage);
			}
		});
		return mmObject_lazy.get();
	}
}