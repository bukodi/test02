package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Code containing the operator used to indicate the relationship between a
 * variable and a fixed value.
 */
public class OperatorCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Smaller than.
	 */
	public static final MMCode SmallerThan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallerThan";
			definition = "Smaller than.";
			owner_lazy = () -> OperatorCode.mmObject();
			codeName = "SMAL";
		}
	};
	/**
	 * Smaller or equal to.
	 */
	public static final MMCode SmallerOrEqualTo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallerOrEqualTo";
			definition = "Smaller or equal to.";
			owner_lazy = () -> OperatorCode.mmObject();
			codeName = "SMEQ";
		}
	};
	/**
	 * Greater than.
	 */
	public static final MMCode GreaterThan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GreaterThan";
			definition = "Greater than.";
			owner_lazy = () -> OperatorCode.mmObject();
			codeName = "GREA";
		}
	};
	/**
	 * Greater or equal to.
	 */
	public static final MMCode GreaterOrEqualTo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GreaterOrEqualTo";
			definition = "Greater or equal to.";
			owner_lazy = () -> OperatorCode.mmObject();
			codeName = "GREQ";
		}
	};
	/**
	 * Equal to.
	 */
	public static final MMCode EqualTo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualTo";
			definition = "Equal to.";
			owner_lazy = () -> OperatorCode.mmObject();
			codeName = "EQAL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SMAL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OperatorCode";
				definition = "Code containing the operator used to indicate the relationship between a variable and a fixed value.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OperatorCode.SmallerThan, com.tools20022.repository.codeset.OperatorCode.SmallerOrEqualTo, com.tools20022.repository.codeset.OperatorCode.GreaterThan,
						com.tools20022.repository.codeset.OperatorCode.GreaterOrEqualTo, com.tools20022.repository.codeset.OperatorCode.EqualTo);
			}
		});
		return mmObject_lazy.get();
	}
}