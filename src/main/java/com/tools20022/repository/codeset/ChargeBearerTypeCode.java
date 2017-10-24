package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies which party(ies) will pay charges due for processing of the
 * instruction.
 */
public class ChargeBearerTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * All transaction charges are to be borne by the debtor.
	 */
	public static final MMCode BorneByDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByDebtor";
			definition = "All transaction charges are to be borne by the debtor.";
			owner_lazy = () -> ChargeBearerTypeCode.mmObject();
			codeName = "DEBT";
		}
	};
	/**
	 * All transaction charges are to be borne by the creditor.
	 */
	public static final MMCode BorneByCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByCreditor";
			definition = "All transaction charges are to be borne by the creditor.";
			owner_lazy = () -> ChargeBearerTypeCode.mmObject();
			codeName = "CRED";
		}
	};
	/**
	 * In a credit transfer context, means that transaction charges on the
	 * sender side are to be borne by the debtor, transaction charges on the
	 * receiver side are to be borne by the creditor. In a direct debit context,
	 * means that transaction charges on the sender side are to be borne by the
	 * creditor, transaction charges on the receiver side are to be borne by the
	 * debtor.
	 */
	public static final MMCode Shared = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Shared";
			definition = "In a credit transfer context, means that transaction charges on the sender side are to be borne by the debtor, transaction charges on the receiver side are to be borne by the creditor. In a direct debit context, means that transaction charges on the sender side are to be borne by the creditor, transaction charges on the receiver side are to be borne by the debtor.";
			owner_lazy = () -> ChargeBearerTypeCode.mmObject();
			codeName = "SHAR";
		}
	};
	/**
	 * Charges are to be applied following the rules agreed in the service level
	 * and/or scheme.
	 */
	public static final MMCode FollowingServiceLevel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FollowingServiceLevel";
			definition = "Charges are to be applied following the rules agreed in the service level and/or scheme.";
			owner_lazy = () -> ChargeBearerTypeCode.mmObject();
			codeName = "SLEV";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DEBT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChargeBearerTypeCode";
				definition = "Specifies which party(ies) will pay charges due for processing of the instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeBearerTypeCode.BorneByDebtor, com.tools20022.repository.codeset.ChargeBearerTypeCode.BorneByCreditor,
						com.tools20022.repository.codeset.ChargeBearerTypeCode.Shared, com.tools20022.repository.codeset.ChargeBearerTypeCode.FollowingServiceLevel);
				derivation_lazy = () -> Arrays.asList(ChargeBearerType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}