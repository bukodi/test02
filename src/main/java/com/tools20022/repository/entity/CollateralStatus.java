package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the collateral or of an event related to collateral.
 */
public class CollateralStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the status of the response to a collateral claim, proposal or
	 * substitution proposal.
	 */
	public static final MMBusinessAttribute ResponseStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResponseStatus";
			definition = "Specifies the status of the response to a collateral claim, proposal or substitution proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResponseStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the reason for the cancellation of a message.
	 */
	public static final MMBusinessAttribute CollateralManagementCancellationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralManagementCancellationReason";
			definition = "Specifies the reason for the cancellation of a message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralManagementCancellationReasonCode.mmObject();
		}
	};
	/**
	 * Provides details about the status of the collateral substitution, either
	 * released or returned.
	 */
	public static final MMBusinessAttribute SubstitutionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubstitutionStatus";
			definition = "Provides details about the status of the collateral substitution, either released or returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralSubstitutionConfirmationCode.mmObject();
		}
	};
	/**
	 * Provides the interest rejection reason using an ISO 20022 code.
	 */
	public static final MMBusinessAttribute InterestRejectionReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestRejectionReason";
			definition = "Provides the interest rejection reason using an ISO 20022 code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRejectionReasonCode.mmObject();
		}
	};
	/**
	 * Specifies whether the margin call request was sent on a non valuation day
	 * or was received after notification time.
	 */
	public static final MMBusinessAttribute MarginCallResponse = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginCallResponse";
			definition = "Specifies whether the margin call request was sent on a non valuation day or was received after notification time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarginCallResponseCode.mmObject();
		}
	};
	/**
	 * Provides the settlement status of the collateral.
	 */
	public static final MMBusinessAttribute Settlement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Provides the settlement status of the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStatusCode.mmObject();
		}
	};
	/**
	 * Provides details about the status of the collateral cancellation.
	 */
	public static final MMBusinessAttribute CancellationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Provides details about the status of the collateral cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}
	};
	/**
	 * Collateral for which a status is provided.
	 */
	public static final MMBusinessAssociationEnd Collateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Collateral for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralStatus";
				definition = "Specifies the status of the collateral or of an event related to collateral.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.Status);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralStatus.ResponseStatus, com.tools20022.repository.entity.CollateralStatus.CollateralManagementCancellationReason,
						com.tools20022.repository.entity.CollateralStatus.SubstitutionStatus, com.tools20022.repository.entity.CollateralStatus.InterestRejectionReason, com.tools20022.repository.entity.CollateralStatus.MarginCallResponse,
						com.tools20022.repository.entity.CollateralStatus.Settlement, com.tools20022.repository.entity.CollateralStatus.CancellationReason, com.tools20022.repository.entity.CollateralStatus.Collateral);
			}
		});
		return mmObject_lazy.get();
	}
}