package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides information on the requested settlement time(s) of the payment
 * instruction.
 */
public class SettlementTimeRequest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment for which settlement times are specified.
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SettlementTimeRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which settlement times are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.SettlementTimeRequest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	/**
	 * Time by which the amount of money must be credited, with confirmation, to
	 * the CLS Bank's account at the central bank.<br>
	 * Usage: Time must be expressed in Central European Time (CET).
	 */
	public static final MMBusinessAttribute CLSTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SettlementTimeRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CLSTime";
			definition = "Time by which the amount of money must be credited, with confirmation, to the CLS Bank's account at the central bank.\r\nUsage: Time must be expressed in Central European Time (CET).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Time until when the payment may be settled.
	 */
	public static final MMBusinessAttribute TillTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SettlementTimeRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TillTime";
			definition = "Time until when the payment may be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Time as from when the payment may be settled.
	 */
	public static final MMBusinessAttribute FromTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SettlementTimeRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FromTime";
			definition = "Time as from when the payment may be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Time by when the payment must be settled to avoid rejection.
	 */
	public static final MMBusinessAttribute RejectTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SettlementTimeRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectTime";
			definition = "Time by when the payment must be settled to avoid rejection.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementTimeRequest";
				definition = "Provides information on the requested settlement time(s) of the payment instruction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.SettlementTimeRequest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SettlementTimeRequest.Payment, com.tools20022.repository.entity.SettlementTimeRequest.CLSTime,
						com.tools20022.repository.entity.SettlementTimeRequest.TillTime, com.tools20022.repository.entity.SettlementTimeRequest.FromTime, com.tools20022.repository.entity.SettlementTimeRequest.RejectTime);
			}
		});
		return mmObject_lazy.get();
	}
}