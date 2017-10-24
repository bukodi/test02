package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExposureTypeCode;
import com.tools20022.repository.codeset.RoundingMethodCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the terms used to calculate a risk exposure and its coverage.
 */
public class ExposureTerm {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the underlying business area/type of trade causing the
	 * collateral movement.
	 */
	public static final MMBusinessAttribute ExposureType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureTerm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExposureTypeCode.mmObject();
		}
	};
	/**
	 * Minimum amount to pay/receive as specified in the agreement in the base
	 * currency (to avoid the need to transfer an inconveniently small amount of
	 * variation margin).
	 */
	public static final MMBusinessAttribute MinimumTransferAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureTerm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTransferAmount";
			definition = "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of variation margin).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount specified to avoid the need to transfer uneven amounts of
	 * collateral.
	 */
	public static final MMBusinessAttribute RoundingAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureTerm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingAmount";
			definition = "Amount specified to avoid the need to transfer uneven amounts of collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Defines how the rounding amount is applied in the calculation to avoid
	 * the need to transfer uneven amounts of collateral. For example, should
	 * the amount of collateral required be rounded up, down, to the closer
	 * integral multiple specified or not rounded.
	 */
	public static final MMBusinessAttribute RoundingMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureTerm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingMethod";
			definition = "Defines how the rounding amount is applied in the calculation to avoid the need to transfer uneven amounts of collateral. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingMethodCode.mmObject();
		}
	};
	/**
	 * Agreement in which the exposure terms are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureTerm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralAgreement";
			definition = "Agreement in which the exposure terms are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.ExposureTerm;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralAgreement.mmObject();
		}
	};
	/**
	 * Minimum requirement for a participant if their requirement falls below a
	 * specific amount set by the central counterparty.
	 */
	public static final MMBusinessAttribute MinimumRequirementDeposit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureTerm.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumRequirementDeposit";
			definition = "Minimum requirement for a participant if their requirement falls below a specific amount set by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExposureTerm";
				definition = "Specifies the terms used to calculate a risk exposure and its coverage.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralAgreement.ExposureTerm);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureTerm.ExposureType, com.tools20022.repository.entity.ExposureTerm.MinimumTransferAmount,
						com.tools20022.repository.entity.ExposureTerm.RoundingAmount, com.tools20022.repository.entity.ExposureTerm.RoundingMethod, com.tools20022.repository.entity.ExposureTerm.RelatedCollateralAgreement,
						com.tools20022.repository.entity.ExposureTerm.MinimumRequirementDeposit);
			}
		});
		return mmObject_lazy.get();
	}
}