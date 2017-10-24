package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of business process model used to carry out the transaction.
 */
public class BusinessProcessTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the processing of a transaction in a central matching utility
	 * model.
	 */
	public static final MMCode TripartiteCentralMatching = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartiteCentralMatching";
			definition = "Specifies the processing of a transaction in a  central matching utility model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "ISUP";
		}
	};
	/**
	 * Specifies the processing of a transaction in a local matching model.
	 */
	public static final MMCode NotCoveredByInvestmentInstructions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCoveredByInvestmentInstructions";
			definition = "Specifies the processing of a transaction in a local matching model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "NISP";
		}
	};
	/**
	 * Transaction notice results from an agreement made out of a trading
	 * platform between two members (broker and intermediary) of an authorised
	 * entity.
	 */
	public static final MMCode PreAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAccepted";
			definition = "Transaction notice results from an agreement made out of a trading platform between two members (broker and intermediary) of an authorised entity.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "PRAC";
		}
	};
	/**
	 * Transaction notice reverses a previously sent and agreed transaction
	 * notice. If the reversal transaction notice is stated to serve as invoice:<br>
	 * o Fees and taxes contained in the transaction notice are considered as
	 * being in debit of the broker’s account and in credit of the
	 * intermediary’s account: it is a ‘credit invoice’;<br>
	 * o The broker will have to specify the original transaction notice
	 * reference;<br>
	 * o The reversal transaction notice will have the same direction (buy,
	 * sell) as the original transaction notice.
	 */
	public static final MMCode Reversal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			definition = "Transaction notice reverses a previously sent and agreed transaction notice. If the reversal transaction notice is stated to serve as invoice:\r\no Fees and taxes contained in the transaction notice are considered as being in debit of the broker’s account and in credit of the intermediary’s account: it is a ‘credit invoice’;\r\no The broker will have to specify the original transaction notice reference;\r\no The reversal transaction notice will have the same direction (buy, sell) as the original transaction notice.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "RSAL";
		}
	};
	/**
	 * Specifies the processing of a transaction in a own account trade type
	 * model.
	 */
	public static final MMCode OwnAccountTradeType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnAccountTradeType";
			definition = "Specifies the processing of a transaction in a own account trade type model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Specifies the processing of a transaction in a through type model.
	 */
	public static final MMCode ThroughType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThroughType";
			definition = "Specifies the processing of a transaction in a through type model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "THRU";
		}
	};
	/**
	 * Specifies the processing of a transaction in a billateral central
	 * matching model.
	 */
	public static final MMCode BillateralCentralMatching = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillateralCentralMatching";
			definition = "Specifies the processing of a transaction in a billateral central matching model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "IDEL";
		}
	};
	/**
	 * Specifies the processing of a transaction in a duplex type model.
	 */
	public static final MMCode DuplexType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplexType";
			definition = "Specifies the processing of a transaction in a duplex type model.";
			owner_lazy = () -> BusinessProcessTypeCode.mmObject();
			codeName = "DPLX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ISUP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BusinessProcessTypeCode";
				definition = "Type of business process model used to carry out the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BusinessProcessTypeCode.TripartiteCentralMatching, com.tools20022.repository.codeset.BusinessProcessTypeCode.NotCoveredByInvestmentInstructions,
						com.tools20022.repository.codeset.BusinessProcessTypeCode.PreAccepted, com.tools20022.repository.codeset.BusinessProcessTypeCode.Reversal,
						com.tools20022.repository.codeset.BusinessProcessTypeCode.OwnAccountTradeType, com.tools20022.repository.codeset.BusinessProcessTypeCode.ThroughType,
						com.tools20022.repository.codeset.BusinessProcessTypeCode.BillateralCentralMatching, com.tools20022.repository.codeset.BusinessProcessTypeCode.DuplexType);
			}
		});
		return mmObject_lazy.get();
	}
}