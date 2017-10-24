package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if the investor has the right to cancel an instruction or, if not,
 * the reason the investor cannot cancel.
 */
public class CancellationRightCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investor is entitled to a "cooling off" period with cancellation rights
	 * under compliance rules.
	 */
	public static final MMCode Entitled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entitled";
			definition = "Investor is entitled to a \"cooling off\" period with cancellation rights under compliance rules.";
			owner_lazy = () -> CancellationRightCode.mmObject();
			codeName = "VALI";
		}
	};
	/**
	 * Investor is not entitled to cancellation rights under compliance rules,
	 * as the investor is an execution's only client.
	 */
	public static final MMCode ExecutionOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionOnly";
			definition = "Investor is not entitled to cancellation rights under compliance rules, as the investor is an execution's only client.";
			owner_lazy = () -> CancellationRightCode.mmObject();
			codeName = "NOXO";
		}
	};
	/**
	 * Investor is not entitled to cancellation rights under compliance rules as
	 * the investor has agreed to waive those rights.
	 */
	public static final MMCode WaiverAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WaiverAgreement";
			definition = "Investor is not entitled to cancellation rights under compliance rules as the investor has agreed to waive those rights.";
			owner_lazy = () -> CancellationRightCode.mmObject();
			codeName = "NOWA";
		}
	};
	/**
	 * Investor is not entitled to cancellation rights under compliance rules as
	 * the investor is a financial institution.
	 */
	public static final MMCode Institutional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Institutional";
			definition = "Investor is not entitled to cancellation rights under compliance rules as the investor is a financial institution.";
			owner_lazy = () -> CancellationRightCode.mmObject();
			codeName = "NOIN";
		}
	};
	/**
	 * Another type of cancellation right.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of cancellation right.";
			owner_lazy = () -> CancellationRightCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("VALI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CancellationRightCode";
				definition = "Specifies if the investor has the right to cancel an instruction or, if not, the reason the investor cannot cancel.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationRightCode.Entitled, com.tools20022.repository.codeset.CancellationRightCode.ExecutionOnly,
						com.tools20022.repository.codeset.CancellationRightCode.WaiverAgreement, com.tools20022.repository.codeset.CancellationRightCode.Institutional, com.tools20022.repository.codeset.CancellationRightCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}