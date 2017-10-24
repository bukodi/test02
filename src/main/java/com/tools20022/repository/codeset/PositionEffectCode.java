package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether the resulting position after a trade should be an opening
 * position or closing position.
 */
public class PositionEffectCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Position after the trade should be open.
	 */
	public static final MMCode Open = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Open";
			definition = "Position after the trade should be open.";
			owner_lazy = () -> PositionEffectCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Position after the trade should be closed.
	 */
	public static final MMCode Close = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Close";
			definition = "Position after the trade should be closed.";
			owner_lazy = () -> PositionEffectCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Results in a position obtained in a security previously held, sold and
	 * repurchased.
	 */
	public static final MMCode Rolled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rolled";
			definition = "Results in a position obtained in a security previously held, sold and repurchased.";
			owner_lazy = () -> PositionEffectCode.mmObject();
			codeName = "ROLL";
		}
	};
	/**
	 * First in, first out. Results in a position obtained after having sold in
	 * priority the securities bought chronologically.
	 */
	public static final MMCode Fifo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fifo";
			definition = "First in, first out. Results in a position obtained after having sold in priority the securities bought chronologically.";
			owner_lazy = () -> PositionEffectCode.mmObject();
			codeName = "FIFO";
		}
	};
	/**
	 * Last in, last out. Results in a position obtained after having sold in
	 * priority the securities bought chronologically.
	 */
	public static final MMCode Lifo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lifo";
			definition = "Last in, last out. Results in a position obtained after having sold in priority the securities bought chronologically.";
			owner_lazy = () -> PositionEffectCode.mmObject();
			codeName = "LIFO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PositionEffectCode";
				definition = "Indicates whether the resulting position after a  trade should be an opening position or closing position.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PositionEffectCode.Open, com.tools20022.repository.codeset.PositionEffectCode.Close, com.tools20022.repository.codeset.PositionEffectCode.Rolled,
						com.tools20022.repository.codeset.PositionEffectCode.Fifo, com.tools20022.repository.codeset.PositionEffectCode.Lifo);
			}
		});
		return mmObject_lazy.get();
	}
}