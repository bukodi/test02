package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of cross being submitted to a market.
 */
public class CrossTradeExecutionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies a cross trade which is executed completely or not. Both sides
	 * are treated in the same manner.
	 */
	public static final MMCode Executed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Executed";
			definition = "Identifies a cross trade which is executed completely or not. Both sides are treated in the same manner.";
			owner_lazy = () -> CrossTradeExecutionCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * Identifies a cross trade which is executed partially and the rest is
	 * cancelled. One side is fully executed, the other side is partially
	 * executed with the remainder being cancelled. This is equivalent to an
	 * Immediate or Cancel on the other side.
	 */
	public static final MMCode PartialCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialCancel";
			definition = "Identifies a cross trade which is executed partially and the rest is cancelled. One side is fully executed, the other side is partially executed with the remainder being cancelled. This is equivalent to an Immediate or Cancel on the other side.";
			owner_lazy = () -> CrossTradeExecutionCode.mmObject();
			codeName = "PACA";
		}
	};
	/**
	 * Identifies a cross trade which is partially executed with the unfilled
	 * portions remaining active. One side of the cross is fully executed but
	 * the unfilled portion remains active.
	 */
	public static final MMCode PartialActive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialActive";
			definition = "Identifies a cross trade which is partially executed with the unfilled portions remaining active. One side of the cross is fully executed but the unfilled portion remains active.";
			owner_lazy = () -> CrossTradeExecutionCode.mmObject();
			codeName = "PAAC";
		}
	};
	/**
	 * Identifies a cross trade which is executed with existing orders with the
	 * same price. In the case other orders exist with the same price, the
	 * quantity of the cross is executed against the existing orders and quotes,
	 * the remainder of the cross is executed against the other side of the
	 * cross. The two sides potentially have different quantities.
	 */
	public static final MMCode ExecutedWithExisting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutedWithExisting";
			definition = "Identifies a cross trade which is executed with existing orders with the same price. In the case other orders exist with the same price, the quantity of the cross is executed against the existing orders and quotes, the remainder of the cross is executed against the other side of the cross. The two sides potentially have different quantities.";
			owner_lazy = () -> CrossTradeExecutionCode.mmObject();
			codeName = "EXWI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EXEC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CrossTradeExecutionCode";
				definition = "Type of cross being submitted to a market.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CrossTradeExecutionCode.Executed, com.tools20022.repository.codeset.CrossTradeExecutionCode.PartialCancel,
						com.tools20022.repository.codeset.CrossTradeExecutionCode.PartialActive, com.tools20022.repository.codeset.CrossTradeExecutionCode.ExecutedWithExisting);
			}
		});
		return mmObject_lazy.get();
	}
}