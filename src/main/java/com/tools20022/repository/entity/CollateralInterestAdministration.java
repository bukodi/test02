package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.InterestManagement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Calculation and request of interest linked to collateral.
 */
public class CollateralInterestAdministration extends InterestManagement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Collateral processes that interest management is part of.
	 */
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralInterestAdministration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Collateral processes that interest management is part of.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.InterestManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	/**
	 * Specifies the opening collateral balance for the calculation of interest.
	 */
	public static final MMBusinessAssociationEnd ClosingCollateralBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralInterestAdministration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingCollateralBalance";
			definition = "Specifies the opening collateral balance for the calculation of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.CollateralInterestManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralBalance.mmObject();
		}
	};
	/**
	 * Specifies the opening collateral balance for the calculation of interest.
	 */
	public static final MMBusinessAssociationEnd OpeningCollateralBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralInterestAdministration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningCollateralBalance";
			definition = "Specifies the opening collateral balance for the calculation of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.RelatedCollateralInterestManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralBalance.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralInterestAdministration";
				definition = "Calculation and request of interest linked to collateral.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.InterestManagement, com.tools20022.repository.entity.CollateralBalance.RelatedCollateralInterestManagement,
						com.tools20022.repository.entity.CollateralBalance.CollateralInterestManagement);
				superType_lazy = () -> InterestManagement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralInterestAdministration.CollateralManagement, com.tools20022.repository.entity.CollateralInterestAdministration.ClosingCollateralBalance,
						com.tools20022.repository.entity.CollateralInterestAdministration.OpeningCollateralBalance);
			}
		});
		return mmObject_lazy.get();
	}
}