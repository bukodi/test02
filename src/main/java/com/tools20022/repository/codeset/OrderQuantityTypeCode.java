package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how the order is placed, eg by quantity of units or by amount of
 * money.
 */
public class OrderQuantityTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order is placed by unit.
	 */
	public static final MMCode Unit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unit";
			definition = "Order is placed by unit.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "UNIT";
		}
	};
	/**
	 * Order is placed by amount of money.
	 */
	public static final MMCode Amount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Order is placed by amount of money.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Transaction is another type of transaction.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Transaction is another type of transaction.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * For futures - units of Measure per Time Unit (if used - must specify
	 * UnitofMeasure and TimeUnit.
	 */
	public static final MMCode UnitsOfMeasurePerTimeUnit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsOfMeasurePerTimeUnit";
			definition = "For futures - units of Measure per Time Unit (if used - must specify UnitofMeasure and TimeUnit.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "UMPU";
		}
	};
	/**
	 * Quantity of the financial instrument effectively cancelled (for CPRC
	 * status only).
	 */
	public static final MMCode CancelledQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledQuantity";
			definition = "Quantity of the financial instrument effectively cancelled (for CPRC status only).";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "AFCA";
		}
	};
	/**
	 * Quantity of financial instrument confirmed.
	 */
	public static final MMCode Confirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			definition = "Quantity of financial instrument confirmed.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Minimum quantity that applies to every execution. The order may still
	 * fill against smaller orders, but the cumulative quantity of the execution
	 * must be in multiples of the Match Increment.
	 */
	public static final MMCode MatchIncrement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIncrement";
			definition = "Minimum quantity that applies to every execution. The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the Match Increment. ";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "MAIN";
		}
	};
	/**
	 * Quantity of financial instrument ordered.
	 */
	public static final MMCode OriginalOrdered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrdered";
			definition = "Quantity of financial instrument ordered.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "ORDR";
		}
	};
	/**
	 * Quantity of financial instrument that has been previously executed.
	 */
	public static final MMCode PreviouslyExecuted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyExecuted";
			definition = "Quantity of financial instrument that has been previously executed.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "PREX";
		}
	};
	/**
	 * Quantity of financial instrument that is remaining on order.
	 */
	public static final MMCode RemainingOnOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingOnOrder";
			definition = "Quantity of financial instrument that is remaining on order.";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "REMI";
		}
	};
	/**
	 * Quantity of the financial instrument effectively replaced (For RPRC
	 * status only).
	 */
	public static final MMCode ReplacedQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplacedQuantity";
			definition = "Quantity of the financial instrument effectively replaced (For RPRC status only).";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "REMA";
		}
	};
	/**
	 * Quantity of the financial instrument requested to be cancelled (for CPRC
	 * Status only).
	 */
	public static final MMCode RequestedToBeCancelledQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedToBeCancelledQuantity";
			definition = "Quantity of the financial instrument requested to be cancelled (for CPRC Status only).";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Quantity of the financial instrument requested to be replaced (for RPRC
	 * Status only).
	 */
	public static final MMCode RequestedToBeReplacedQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedToBeReplacedQuantity";
			definition = "Quantity of the financial instrument requested to be replaced (for RPRC Status only).";
			owner_lazy = () -> OrderQuantityTypeCode.mmObject();
			codeName = "REPL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UNIT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderQuantityTypeCode";
				definition = "Specifies how the order is placed, eg by quantity of units or by amount of money.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderQuantityTypeCode.Unit, com.tools20022.repository.codeset.OrderQuantityTypeCode.Amount, com.tools20022.repository.codeset.OrderQuantityTypeCode.Other,
						com.tools20022.repository.codeset.OrderQuantityTypeCode.UnitsOfMeasurePerTimeUnit, com.tools20022.repository.codeset.OrderQuantityTypeCode.CancelledQuantity,
						com.tools20022.repository.codeset.OrderQuantityTypeCode.Confirmed, com.tools20022.repository.codeset.OrderQuantityTypeCode.MatchIncrement, com.tools20022.repository.codeset.OrderQuantityTypeCode.OriginalOrdered,
						com.tools20022.repository.codeset.OrderQuantityTypeCode.PreviouslyExecuted, com.tools20022.repository.codeset.OrderQuantityTypeCode.RemainingOnOrder,
						com.tools20022.repository.codeset.OrderQuantityTypeCode.ReplacedQuantity, com.tools20022.repository.codeset.OrderQuantityTypeCode.RequestedToBeCancelledQuantity,
						com.tools20022.repository.codeset.OrderQuantityTypeCode.RequestedToBeReplacedQuantity);
			}
		});
		return mmObject_lazy.get();
	}
}