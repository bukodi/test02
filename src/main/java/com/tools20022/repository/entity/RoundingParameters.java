package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.DecimalNumber;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters applied to a fractional number.
 */
public class RoundingParameters {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment account services for which rounding parameters are specified.
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RoundingParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountService";
			definition = "Investment account services for which rounding parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.RoundingMethod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
		}
	};
	/**
	 * Float value specifying the value to which rounding is required, eg, 10
	 * means round to a multiple of 10 units/shares, 0.5 means round to a
	 * multiple of 0.5 units/shares.
	 */
	public static final MMBusinessAttribute RoundingModulus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RoundingParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundingModulus";
			definition = "Float value specifying the value to which rounding is required, eg, 10 means round to a multiple of 10 units/shares, 0.5 means round to a multiple of 0.5 units/shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Rounding direction applied to fractional numbers, eg, round up.
	 */
	public static final MMBusinessAttribute RoundingDirection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RoundingParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundingDirection";
			definition = "Rounding direction applied to fractional numbers, eg, round up.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}
	};
	/**
	 * Peg order for which a rounding direction is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedPegOrderInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RoundingParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPegOrderInstruction";
			definition = "Peg order for which a rounding direction is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.RoundDirection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RoundingParameters";
				definition = "Parameters applied to a fractional number.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountService.RoundingMethod, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.RoundDirection);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RoundingParameters.InvestmentAccountService, com.tools20022.repository.entity.RoundingParameters.RoundingModulus,
						com.tools20022.repository.entity.RoundingParameters.RoundingDirection, com.tools20022.repository.entity.RoundingParameters.RelatedPegOrderInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}