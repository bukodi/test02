package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.WaivingInstructionCode;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Non-enforcement of the right to all or part of a commission by the party
 * entitled to the commission.
 */
public class CommissionWaiver {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Commission to which the waiver applies.
	 */
	public static final MMBusinessAssociationEnd Commission = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission to which the waiver applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.CommissionWaiving;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};
	/**
	 * Form of the rebate, eg, cash.
	 */
	public static final MMBusinessAttribute InstructionBasis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionBasis";
			definition = "Form of the rebate, eg, cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WaivingInstructionCode.mmObject();
		}
	};
	/**
	 * Proportion of the commission that is waived, ie, if the commission is 5%
	 * and half is waived, 2.5% should be stated in this field.
	 */
	public static final MMBusinessAttribute WaivedRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WaivedRate";
			definition = "Proportion of the commission that is waived, ie, if  the commission is 5% and half is waived, 2.5% should be stated in this field.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * New commission rate applied, after waiving.
	 */
	public static final MMBusinessAttribute NonWaivedRate = new MMBusinessAttribute() {
		{
			isDerived = true;
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonWaivedRate";
			definition = "New commission rate applied, after waiving.";
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
				name = "CommissionWaiver";
				definition = "Non-enforcement of the right to all or part of a commission by the party entitled to the commission.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.CommissionWaiving);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommissionWaiver.Commission, com.tools20022.repository.entity.CommissionWaiver.InstructionBasis,
						com.tools20022.repository.entity.CommissionWaiver.WaivedRate, com.tools20022.repository.entity.CommissionWaiver.NonWaivedRate);
			}
		});
		return mmObject_lazy.get();
	}
}