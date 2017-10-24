package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicate whether or not the fund is subject to reporting under the EU Savings
 * Directive. Enter "Variable" if the status of the fund is likely to change
 * from time to time.
 */
public class EUSavingsDirectiveCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment Fund is in the scope of the directive.
	 */
	public static final MMCode EUSavingsInScope = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EUSavingsInScope";
			definition = "Investment Fund is in the scope of the directive.";
			owner_lazy = () -> EUSavingsDirectiveCode.mmObject();
			codeName = "EUSI";
		}
	};
	/**
	 * Investment Fund is out of the scope of the directive.
	 */
	public static final MMCode EUSavingsOutScope = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EUSavingsOutScope";
			definition = "Investment Fund is out of the scope of the directive.";
			owner_lazy = () -> EUSavingsDirectiveCode.mmObject();
			codeName = "EUSO";
		}
	};
	/**
	 * Unknown whether capital gain is in or out of the scope fo the directive.
	 */
	public static final MMCode EUSavingsUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EUSavingsUnknown";
			definition = "Unknown whether capital gain is in or out of the scope fo the directive.";
			owner_lazy = () -> EUSavingsDirectiveCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Investment Fund may vary for inclusion in the scope of the directive.
	 */
	public static final MMCode EUSavingsVariable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EUSavingsVariable";
			definition = "Investment Fund may vary for inclusion in the scope of the directive.";
			owner_lazy = () -> EUSavingsDirectiveCode.mmObject();
			codeName = "VARI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EUSI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EUSavingsDirectiveCode";
				definition = "Indicate whether or not the fund is subject to reporting  under the EU Savings Directive.  Enter \"Variable\" if the status of the fund is likely to change from time to time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EUSavingsDirectiveCode.EUSavingsInScope, com.tools20022.repository.codeset.EUSavingsDirectiveCode.EUSavingsOutScope,
						com.tools20022.repository.codeset.EUSavingsDirectiveCode.EUSavingsUnknown, com.tools20022.repository.codeset.EUSavingsDirectiveCode.EUSavingsVariable);
			}
		});
		return mmObject_lazy.get();
	}
}