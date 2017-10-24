package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Exchange policy between parties.
 */
public class ExchangePolicyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Exchange is performed if requested by the acquirer in a previous
	 * exchange, or at any time by the acceptor.
	 */
	public static final MMCode OnDemand = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnDemand";
			definition = "Exchange is performed if requested by the acquirer in a previous exchange, or at any time by the acceptor.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "ONDM";
		}
	};
	/**
	 * Exchange is performed just after the transaction completion.
	 */
	public static final MMCode Immediately = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Immediately";
			definition = "Exchange is performed just after the transaction completion.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "IMMD";
		}
	};
	/**
	 * As soon as the acquirer is contacted, for example with the next on-line
	 * transaction.
	 */
	public static final MMCode AsSoonAsPossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AsSoonAsPossible";
			definition = "As soon as the acquirer is contacted, for example with the next on-line transaction.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "ASAP";
		}
	};
	/**
	 * Exchanges are performed after reaching a maximum number of transaction or
	 * time period.
	 */
	public static final MMCode AsGroup = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AsGroup";
			definition = "Exchanges are performed after reaching a maximum number of transaction or time period.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "AGRP";
		}
	};
	/**
	 * Exchange is performed after reaching a number of transactions without
	 * exchanges with the acquirer.
	 */
	public static final MMCode NumberLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberLimit";
			definition = "Exchange is performed after reaching a number of transactions without exchanges with the acquirer.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "NBLT";
		}
	};
	/**
	 * Exchange is performed after reaching a cumulative amount of transactions
	 * without exchanges with the acquirer.
	 */
	public static final MMCode TotalLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalLimit";
			definition = "Exchange is performed after reaching a cumulative amount of transactions without exchanges with the acquirer.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "TTLT";
		}
	};
	/**
	 * Cyclic exchanges based on the related time conditions.
	 */
	public static final MMCode Cyclic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cyclic";
			definition = "Cyclic exchanges based on the related time conditions.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "CYCL";
		}
	};
	/**
	 * No exchange.
	 */
	public static final MMCode None = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "None";
			definition = "No exchange.";
			owner_lazy = () -> ExchangePolicyCode.mmObject();
			codeName = "NONE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ONDM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExchangePolicyCode";
				definition = "Exchange policy between parties.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExchangePolicyCode.OnDemand, com.tools20022.repository.codeset.ExchangePolicyCode.Immediately,
						com.tools20022.repository.codeset.ExchangePolicyCode.AsSoonAsPossible, com.tools20022.repository.codeset.ExchangePolicyCode.AsGroup, com.tools20022.repository.codeset.ExchangePolicyCode.NumberLimit,
						com.tools20022.repository.codeset.ExchangePolicyCode.TotalLimit, com.tools20022.repository.codeset.ExchangePolicyCode.Cyclic, com.tools20022.repository.codeset.ExchangePolicyCode.None);
			}
		});
		return mmObject_lazy.get();
	}
}