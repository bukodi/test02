package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Description of the parameters under which an order must be handled on the
 * floor.
 */
public class TradingFloorOrderHandlingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the order should be executed automatically, private
	 * initiative, no broker intervention. Its sales trading desk will not be
	 * informed of the order and trade.
	 */
	public static final MMCode AutomatedPrivate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomatedPrivate";
			definition = "Indicates that the order should be executed automatically, private initiative, no broker intervention. Its sales trading desk will not be informed of the order and trade.";
			owner_lazy = () -> TradingFloorOrderHandlingCode.mmObject();
			codeName = "ATPR";
		}
	};
	/**
	 * Indicates that the order should be executed automatically, public
	 * initiative, broker intervention allowed.
	 */
	public static final MMCode AutomatedPublic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomatedPublic";
			definition = "Indicates that the order should be executed automatically, public initiative, broker intervention allowed.";
			owner_lazy = () -> TradingFloorOrderHandlingCode.mmObject();
			codeName = "ATPU";
		}
	};
	/**
	 * Manual order, best execution.
	 */
	public static final MMCode Manual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manual";
			definition = "Manual order, best execution.";
			owner_lazy = () -> TradingFloorOrderHandlingCode.mmObject();
			codeName = "MANU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ATPR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingFloorOrderHandlingCode";
				definition = "Description of the parameters under which an order must be handled on the floor.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingFloorOrderHandlingCode.AutomatedPrivate, com.tools20022.repository.codeset.TradingFloorOrderHandlingCode.AutomatedPublic,
						com.tools20022.repository.codeset.TradingFloorOrderHandlingCode.Manual);
			}
		});
		return mmObject_lazy.get();
	}
}