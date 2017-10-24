package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Distribution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics for a mixed cash and securities distribution event.
 */
public class SecuritiesAndCashDistribution extends Distribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of interim securities awarded for a given quantity of underlying
	 * shares.
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingDenominator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominator";
			definition = "Quantity of interim securities awarded for a given quantity of underlying shares.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Indicates the maximum quantity of financial instrument that must be held
	 * in order to be entitled to take part in the event.
	 */
	public static final MMBusinessAssociationEnd MaximumHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumHolding";
			definition = "Indicates the maximum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Indicates the maximum quantity of financial instrument that may be
	 * exercised in the event.
	 */
	public static final MMBusinessAssociationEnd MaximumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantity";
			definition = "Indicates the maximum quantity of financial instrument that may be exercised in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantityDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Minimum quantity of securities that must be exercised.
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity of securities that must be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantityDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Quantity of new securities that will be derived by the exercise of a
	 * given quantity of intermediate securities.
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingDenominator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Quantity of interim securities awarded for a given quantity of underlying
	 * shares.
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingNumerator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumerator";
			definition = "Quantity of interim securities awarded for a given quantity of underlying shares.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Indicates the minimum quantity of financial instrument that must be held
	 * in order to be entitled to take part in the event.
	 */
	public static final MMBusinessAssociationEnd MinimumHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHolding";
			definition = "Indicates the minimum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Quantity of new securities that will be derived by the exercise of a
	 * given quantity of intermediate securities.
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingNumerator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributedToUnderlyingNumerator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorDistributionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Securities distribution elements of a cash and securities distribution
	 * process.
	 */
	public static final MMBusinessAssociationEnd SecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDistribution";
			definition = "Securities distribution elements of a cash and securities distribution process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.SecuritiesAndCashDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	/**
	 * Cash distribution elements of a cash and securities distribution process.
	 */
	public static final MMBusinessAssociationEnd CashDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDistribution";
			definition = "Cash distribution elements of a cash and securities distribution process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashDistribution.SecuritiesAndCashDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAndCashDistribution";
				definition = "Characteristics for a mixed cash and securities distribution event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantityDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantityDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.CashDistribution.SecuritiesAndCashDistribution,
						com.tools20022.repository.entity.SecuritiesDistribution.SecuritiesAndCashDistribution);
				superType_lazy = () -> Distribution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumHolding,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumHolding, com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.SecuritiesDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution.CashDistribution);
			}
		});
		return mmObject_lazy.get();
	}
}