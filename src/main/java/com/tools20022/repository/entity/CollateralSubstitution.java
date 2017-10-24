package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CollateralSubstitutionTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Substitution of collateral by specifying the collateral to be returned and
 * proposing the new type(s) of collateral to be delivered.
 */
public class CollateralSubstitution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies if the collateral that is substituted was posted against the
	 * variation margin or the independent amount.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralSubstitution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralSubstitutionTypeCode.mmObject();
		}
	};
	/**
	 * Provides the accepted collateral substitution amount.
	 */
	public static final MMBusinessAttribute AcceptedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralSubstitution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedAmount";
			definition = "Provides the accepted collateral substitution amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the collateral substitution amount that is rejected.
	 */
	public static final MMBusinessAttribute RejectedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralSubstitution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedAmount";
			definition = "Specifies the collateral substitution amount that is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 */
	public static final MMBusinessAssociationEnd RelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralSubstitution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.CollateralSubstitution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}
	};
	/**
	 * Specifies the collateral which is replacing the returned one.
	 */
	public static final MMBusinessAssociationEnd NewCollateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralSubstitution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewCollateral";
			definition = "Specifies the collateral which is replacing the returned one.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.RelatedCollateralSubstitution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Collateral.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralSubstitution";
				definition = "Substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.RelatedCollateralSubstitution, com.tools20022.repository.entity.CollateralManagement.CollateralSubstitution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralSubstitution.Type, com.tools20022.repository.entity.CollateralSubstitution.AcceptedAmount,
						com.tools20022.repository.entity.CollateralSubstitution.RejectedAmount, com.tools20022.repository.entity.CollateralSubstitution.RelatedManagementProcess,
						com.tools20022.repository.entity.CollateralSubstitution.NewCollateral);
			}
		});
		return mmObject_lazy.get();
	}
}