package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BookingTypeCode;
import com.tools20022.repository.codeset.BookingUnitCode;
import com.tools20022.repository.codeset.DayBookingInstructionCode;
import com.tools20022.repository.codeset.PreAllocationMethodCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information used to book the executions of a trade.
 */
public class SecuritiesPostTradeBooking {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether or not automatic booking can occur.
	 */
	public static final MMBusinessAttribute DayBooking = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPostTradeBooking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DayBooking";
			definition = "Indicates whether or not automatic booking can occur.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DayBookingInstructionCode.mmObject();
		}
	};
	/**
	 * Indicates what constitutes a bookable unit, ie, a partial execution, or
	 * an aggregated execution.
	 */
	public static final MMBusinessAttribute BookingUnit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPostTradeBooking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookingUnit";
			definition = "Indicates what constitutes a bookable unit, ie, a partial execution, or an aggregated execution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BookingUnitCode.mmObject();
		}
	};
	/**
	 * Indicates the method of preallocation.
	 */
	public static final MMBusinessAttribute PreAllocationMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPostTradeBooking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAllocationMethod";
			definition = "Indicates the method of preallocation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreAllocationMethodCode.mmObject();
		}
	};
	/**
	 * Method for booking out an order.
	 */
	public static final MMBusinessAttribute BookingType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPostTradeBooking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookingType";
			definition = "Method for booking out an order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BookingTypeCode.mmObject();
		}
	};
	/**
	 * Order for which booking instructions are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPostTradeBooking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which booking instructions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.BookingInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPostTradeBooking";
				definition = "Information used to book the executions of a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.BookingInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPostTradeBooking.DayBooking, com.tools20022.repository.entity.SecuritiesPostTradeBooking.BookingUnit,
						com.tools20022.repository.entity.SecuritiesPostTradeBooking.PreAllocationMethod, com.tools20022.repository.entity.SecuritiesPostTradeBooking.BookingType,
						com.tools20022.repository.entity.SecuritiesPostTradeBooking.RelatedOrder);
			}
		});
		return mmObject_lazy.get();
	}
}