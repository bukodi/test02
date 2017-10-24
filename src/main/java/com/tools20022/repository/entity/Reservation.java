package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ReservationTypeCode;
import com.tools20022.repository.entity.Limit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Liquidity set aside by the payer for specific purposes.
 */
public class Reservation extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Nature of the reservation.
	 */
	public static final MMBusinessAttribute ReservationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reservation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReservationType";
			definition = "Nature of the reservation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReservationTypeCode.mmObject();
		}
	};
	/**
	 * Transfer process for which reservation information is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedIntraPositionTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reservation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIntraPositionTransfer";
			definition = "Transfer process for which reservation information is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.Reservation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> IntraPositionTransfer.mmObject();
		}
	};
	/**
	 * Specifies the instruction which originated the reservation.
	 */
	public static final MMBusinessAssociationEnd SettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reservation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Specifies the instruction which originated the reservation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.Reservation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashSettlement.mmObject();
		}
	};
	/**
	 * Account services for which reservation information is specified.
	 */
	public static final MMBusinessAssociationEnd AccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reservation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Account services for which reservation information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.Reservation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Reservation";
				definition = "Liquidity set aside by the payer for specific purposes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountService.Reservation, com.tools20022.repository.entity.CashSettlement.Reservation,
						com.tools20022.repository.entity.IntraPositionTransfer.Reservation);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reservation.ReservationType, com.tools20022.repository.entity.Reservation.RelatedIntraPositionTransfer,
						com.tools20022.repository.entity.Reservation.SettlementInstruction, com.tools20022.repository.entity.Reservation.AccountService);
			}
		});
		return mmObject_lazy.get();
	}
}