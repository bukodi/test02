package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the Common Reporting Status (CRS) status.
 */
public class CRSStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account holder type is a passive non-financial entity with one or more
	 * controlling persons that are foreign persons.
	 */
	public static final MMCode CRS101 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS101";
			definition = "Account holder type is a passive non-financial entity with one or more controlling persons that are foreign persons.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C101";
		}
	};
	/**
	 * Account holder type is a foreign person.
	 */
	public static final MMCode CRS102 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS102";
			definition = "Account holder type is a foreign person.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C102";
		}
	};
	/**
	 * Account holder type is a passive foreign non-financial entity without
	 * controlling persons that are foreign persons.
	 */
	public static final MMCode CRS103 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS103";
			definition = "Account holder type is a passive foreign non-financial entity without controlling persons that are foreign persons.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C103";
		}
	};
	/**
	 * Account holder type is a financial institution such as a depositary , a
	 * custodial institution or a specified insurance company.
	 */
	public static final MMCode CRS104 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS104";
			definition = "Account holder type is a financial institution such as a depositary , a custodial institution or a specified insurance company.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C104";
		}
	};
	/**
	 * Account holder type is a financial institution such as an investment
	 * entity of a non-participating jurisdiction and managed by another
	 * financial institution without one or more controlling persons that are
	 * foreign persons.
	 */
	public static final MMCode CRS105 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS105";
			definition = "Account holder type is a financial institution such as an investment entity of a non-participating jurisdiction and managed by another financial institution without one or more controlling persons that are foreign persons.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C105";
		}
	};
	/**
	 * Account holder type is a financial institution such as an investment
	 * entity of a non-participating jurisdiction and managed by another
	 * financial institution with one or more controlling persons that are
	 * foreign persons.
	 */
	public static final MMCode CRS106 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS106";
			definition = "Account holder type is a financial institution such as an investment entity of a non-participating jurisdiction and managed by another financial institution with one or more controlling persons that are foreign persons.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C106";
		}
	};
	/**
	 * Account holder type is a financial institution such as another investment
	 * entity.
	 */
	public static final MMCode CRS107 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS107";
			definition = "Account holder type is a financial institution such as another investment entity.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C107";
		}
	};
	/**
	 * Account holder type is an active non-financial entity such as a
	 * corporation for which the stock is regularly traded on an established
	 * securities market.
	 */
	public static final MMCode CRS108 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS108";
			definition = "Account holder type is an active non-financial entity such as a corporation for which the stock is regularly traded on an established securities market.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C108";
		}
	};
	/**
	 * Account holder type is an active non-financial entity such as a
	 * corporation which is a related entity of a corporation for which the
	 * stock is regularly traded on an established securities market.
	 */
	public static final MMCode CRS109 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS109";
			definition = "Account holder type is an active non-financial entity such as a corporation which is a related entity of a corporation for which the stock is regularly traded on an established securities market.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C109";
		}
	};
	/**
	 * Account holder type is an active non-financial entity such as a
	 * government entity.
	 */
	public static final MMCode CRS110 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS110";
			definition = "Account holder type is an active non-financial entity such as a government entity.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C110";
		}
	};
	/**
	 * Account holder type is an active non-financial entity such as a central
	 * bank.
	 */
	public static final MMCode CRS111 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS111";
			definition = "Account holder type is an active non-financial entity such as a central bank.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C111";
		}
	};
	/**
	 * Account holder type is an active non-financial entity such as an
	 * international organisation.
	 */
	public static final MMCode CRS112 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS112";
			definition = "Account holder type is an active non-financial entity such as an international organisation.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C112";
		}
	};
	/**
	 * Account holder type is not a foreign person.
	 */
	public static final MMCode CRS113 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS113";
			definition = "Account holder type is not a foreign person.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C113";
		}
	};
	/**
	 * Account holder type is a financial institution such as an investment
	 * entity of a participating jurisdiction and managed by another financial
	 * institution.
	 */
	public static final MMCode CRS114 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS114";
			definition = "Account holder type is a financial institution such as an investment entity of a participating jurisdiction and managed by another financial institution.";
			owner_lazy = () -> CRSStatusCode.mmObject();
			codeName = "C114";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CRSStatusCode";
				definition = "Specifies the Common Reporting Status (CRS) status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CRSStatusCode.CRS101, com.tools20022.repository.codeset.CRSStatusCode.CRS102, com.tools20022.repository.codeset.CRSStatusCode.CRS103,
						com.tools20022.repository.codeset.CRSStatusCode.CRS104, com.tools20022.repository.codeset.CRSStatusCode.CRS105, com.tools20022.repository.codeset.CRSStatusCode.CRS106,
						com.tools20022.repository.codeset.CRSStatusCode.CRS107, com.tools20022.repository.codeset.CRSStatusCode.CRS108, com.tools20022.repository.codeset.CRSStatusCode.CRS109,
						com.tools20022.repository.codeset.CRSStatusCode.CRS110, com.tools20022.repository.codeset.CRSStatusCode.CRS111, com.tools20022.repository.codeset.CRSStatusCode.CRS112,
						com.tools20022.repository.codeset.CRSStatusCode.CRS113, com.tools20022.repository.codeset.CRSStatusCode.CRS114);
			}
		});
		return mmObject_lazy.get();
	}
}