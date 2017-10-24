package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies whether an order is a non-margin, an opening margin or a closing
 * margin order.
 */
public class CashMarginOrderCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The principal owns the cash in case of a purchase, or the securities in
	 * case of a sale so the execution, if it occurs, will not generate any
	 * margin account opening or margin call.
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "The principal owns the cash in case of a purchase, or the securities in case of a sale so the execution, if it occurs, will not generate any margin account opening or margin call.";
			owner_lazy = () -> CashMarginOrderCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * The principal order, if executed, will generate a margin account opening
	 * or margin call because the principal does not have the cash in case of a
	 * purchase or the securities in case of a sale.
	 */
	public static final MMCode MarginOpen = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginOpen";
			definition = "The principal order, if  executed, will generate a margin account opening or margin call because the principal does not have the cash in case of a purchase or the securities in case of a sale.";
			owner_lazy = () -> CashMarginOrderCode.mmObject();
			codeName = "MRGO";
		}
	};
	/**
	 * The principal order, if executed, will enable the margin position to be
	 * closed and the positions to be covered (for example: purchase of
	 * securities that have previously been short-sold, or sale of securities
	 * that have been bought on margin).
	 */
	public static final MMCode MarginClose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginClose";
			definition = "The principal order, if executed, will enable the margin position to be closed and the positions to be covered (for example: purchase of securities that have previously been short-sold, or sale of securities that have been bought on margin).";
			owner_lazy = () -> CashMarginOrderCode.mmObject();
			codeName = "MRGC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashMarginOrderCode";
				definition = "Identifies whether an order is a non-margin, an opening margin or a closing margin order.";
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.CashMarginOrderCode.Cash, com.tools20022.repository.codeset.CashMarginOrderCode.MarginOpen, com.tools20022.repository.codeset.CashMarginOrderCode.MarginClose);
			}
		});
		return mmObject_lazy.get();
	}
}