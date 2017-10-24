package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature of the disputed collateral amount.
 */
public class DisputeResolutionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the collateral.
	 */
	public static final MMCode ReconcileCollateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileCollateral";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the collateral.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RECO";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the exposure.
	 */
	public static final MMCode ReconcileExposure = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileExposure";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the exposure.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "REEX";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the threshold.
	 */
	public static final MMCode ReconcileThreshold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileThreshold";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the threshold.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RETH";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the minimum transfer amount.
	 */
	public static final MMCode ReconcileMinimumTransferAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileMinimumTransferAmount";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the minimum transfer amount.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RMTA";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the rounding.
	 */
	public static final MMCode ReconcileRounding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileRounding";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the rounding.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RERO";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the valuation frequency.
	 */
	public static final MMCode ReconcileValuationFrequency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileValuationFrequency";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the valuation frequency.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "REVF";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the independent amount.
	 */
	public static final MMCode ReconcileNettedIndependentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileNettedIndependentAmount";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the independent amount.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RNIA";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the initial margin.
	 */
	public static final MMCode ReconcileSegregatedIndependentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileSegregatedIndependentAmount";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the initial margin.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RESA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RECO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DisputeResolutionTypeCode";
				definition = "Specifies the nature of the disputed collateral amount.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileCollateral, com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileExposure,
						com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileThreshold, com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileMinimumTransferAmount,
						com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileRounding, com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileValuationFrequency,
						com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileNettedIndependentAmount, com.tools20022.repository.codeset.DisputeResolutionTypeCode.ReconcileSegregatedIndependentAmount);
			}
		});
		return mmObject_lazy.get();
	}
}