package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.SecuritiesTransfer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transfer of securities from one sub-balance to another or from one balance
 * status to another.
 */
public class IntraPositionTransfer extends SecuritiesTransfer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of securities set aside by a party for specific purpose.
	 */
	public static final MMBusinessAssociationEnd Reservation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> IntraPositionTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Quantity of securities set aside by a party for specific purpose.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reservation.RelatedIntraPositionTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
		}
	};
	/**
	 * Value of the collateral available for the delivery settlement process.
	 */
	public static final MMBusinessAttribute CollateralAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IntraPositionTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAmount";
			definition = "Value of the collateral available for the delivery settlement process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the securities balance or sub-balance from/to which the
	 * securities are transferred.
	 */
	public static final MMBusinessAssociationEnd SecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> IntraPositionTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Specifies the securities balance or sub-balance from/to which the securities are transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.RelatedIntraPositionTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IntraPositionTransfer";
				definition = "Transfer of securities from one sub-balance to another or from one balance status to another.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reservation.RelatedIntraPositionTransfer, com.tools20022.repository.entity.SecuritiesBalance.RelatedIntraPositionTransfer);
				superType_lazy = () -> SecuritiesTransfer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IntraPositionTransfer.Reservation, com.tools20022.repository.entity.IntraPositionTransfer.CollateralAmount,
						com.tools20022.repository.entity.IntraPositionTransfer.SecuritiesBalance);
			}
		});
		return mmObject_lazy.get();
	}
}