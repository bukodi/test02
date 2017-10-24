package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates from/until when an order must be executed.
 */
public class ExecutionTimeLimitCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * A round lot order to be executed at the opening of the market.
	 */
	public static final MMCode AtTheOpening = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtTheOpening";
			definition = "A round lot order to be executed at the opening of the market.";
			owner_lazy = () -> ExecutionTimeLimitCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * An order to buy or sell at the closing price or an odd lot order to buy
	 * or sell to be filled at the closing of the round lot offer, plus a
	 * differential for a buy order or minus the differential on a sell order.
	 */
	public static final MMCode AtTheClosing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtTheClosing";
			definition = "An order to buy or sell at the closing price or an odd lot order to buy or sell to be filled at the closing of the round lot offer, plus a differential for a buy order or minus the differential on a sell order.";
			owner_lazy = () -> ExecutionTimeLimitCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * An order that remains in effect until it is either executed or cancelled.
	 */
	public static final MMCode GoodUntilCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodUntilCancelled";
			definition = "An order that remains in effect until it is either executed or cancelled.";
			owner_lazy = () -> ExecutionTimeLimitCode.mmObject();
			codeName = "GTCA";
		}
	};
	/**
	 * An order that, if not executed, expires at the end of the trading day on
	 * which the order is entered.
	 */
	public static final MMCode GoodForTheDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodForTheDay";
			definition = "An order that, if not executed, expires at the end of the trading day on which the order is entered.";
			owner_lazy = () -> ExecutionTimeLimitCode.mmObject();
			codeName = "GDAY";
		}
	};
	/**
	 * An Order that if not executed, expires at the end of the specified expiry
	 * date.
	 */
	public static final MMCode GoodThroughDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodThroughDate";
			definition = "An Order that if not executed, expires at the end of the specified expiry date.";
			owner_lazy = () -> ExecutionTimeLimitCode.mmObject();
			codeName = "GTHD";
		}
	};
	/**
	 * An order that, if not executed, expires at the end of the month on which
	 * the order is entered.
	 */
	public static final MMCode GoodForTheMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodForTheMonth";
			definition = "An order that, if not executed, expires at the end of the month on which the order is entered.";
			owner_lazy = () -> ExecutionTimeLimitCode.mmObject();
			codeName = "GTMO";
		}
	};
	/**
	 * A market or limit order that is to be executed in its entirety as soon as
	 * it is submitted; if not so executed, the order is to be cancelled.
	 */
	public static final MMCode FillOrKill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FillOrKill";
			definition = "A market or limit order that is to be executed in its entirety as soon as it is submitted; if not so executed, the order is to be cancelled.";
			owner_lazy = () -> ExecutionTimeLimitCode.mmObject();
			codeName = "FIKI";
		}
	};
	/**
	 * Indicates an order that is good until the end of next month.
	 */
	public static final MMCode GoodUntilTheEndOfNextMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodUntilTheEndOfNextMonth";
			definition = "Indicates an order that is good until the end of next month.";
			owner_lazy = () -> ExecutionTimeLimitCode.mmObject();
			codeName = "GTNM";
		}
	};
	/**
	 * Indicates an order that is good till crossed.
	 */
	public static final MMCode GoodTillCrossed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodTillCrossed";
			definition = "Indicates an order that is good till crossed.";
			owner_lazy = () -> ExecutionTimeLimitCode.mmObject();
			codeName = "GTXO";
		}
	};
	/**
	 * A market or limit order to be executed in whole or in part as soon as it
	 * is submitted; any portion not so executed is to be cancelled.
	 */
	public static final MMCode ImmediateOrCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImmediateOrCancel";
			definition = "A market or limit order to be executed in whole or in part as soon as it is submitted; any portion not so executed is to be cancelled.";
			owner_lazy = () -> ExecutionTimeLimitCode.mmObject();
			codeName = "IOCA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExecutionTimeLimitCode";
				definition = "Indicates from/until when an order must be executed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExecutionTimeLimitCode.AtTheOpening, com.tools20022.repository.codeset.ExecutionTimeLimitCode.AtTheClosing,
						com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodUntilCancelled, com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodForTheDay,
						com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodThroughDate, com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodForTheMonth,
						com.tools20022.repository.codeset.ExecutionTimeLimitCode.FillOrKill, com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodUntilTheEndOfNextMonth,
						com.tools20022.repository.codeset.ExecutionTimeLimitCode.GoodTillCrossed, com.tools20022.repository.codeset.ExecutionTimeLimitCode.ImmediateOrCancel);
			}
		});
		return mmObject_lazy.get();
	}
}