package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The legal form of a Fund.
 */
public class FundLegalFormCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The fund is constituted under the law of contract. Contractual fund issue
	 * units and investors are called unitholders. The fund is run by a
	 * management company which may or may not delegate to third agents certain
	 * investment and/or administration tasks.
	 */
	public static final MMCode Contractual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Contractual";
			definition = "The fund is constituted under the law of contract. Contractual fund issue units and investors are called unitholders. The fund is run by a management company which may or may not delegate to third agents certain investment and/or administration tasks.";
			owner_lazy = () -> FundLegalFormCode.mmObject();
			codeName = "CONT";
		}
	};
	/**
	 * The fund is constituted under the trust law. Whereby an independant
	 * person (a trustee) holds the assets of the investment fund for the
	 * benefit of the underlying investors. The trustee is placed under the
	 * fiduciary responsibility to ensure that the fund is managed in accordance
	 * with its investment policy and objectives.
	 */
	public static final MMCode Trust = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trust";
			definition = "The fund is constituted under the trust law. Whereby an independant person (a trustee) holds the assets of the investment fund for the benefit of the underlying investors. The trustee is placed under the fiduciary responsibility to ensure that the fund is managed in accordance with its investment policy and objectives.";
			owner_lazy = () -> FundLegalFormCode.mmObject();
			codeName = "TRUS";
		}
	};
	/**
	 * The fund is constituted as a company . It issues shares and the investors
	 * are the shareholders. The fund is run by a management company which may
	 * or may not delegate to third agens certain investment and/or
	 * administration tasks.
	 */
	public static final MMCode Corporate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Corporate";
			definition = "The fund is constituted as a company . It issues shares and the investors are the shareholders. The fund is run by a management company which may or may not delegate to third agens certain investment and/or administration tasks.";
			owner_lazy = () -> FundLegalFormCode.mmObject();
			codeName = "CORP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CONT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FundLegalFormCode";
				definition = "The legal form of a Fund.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundLegalFormCode.Contractual, com.tools20022.repository.codeset.FundLegalFormCode.Trust, com.tools20022.repository.codeset.FundLegalFormCode.Corporate);
			}
		});
		return mmObject_lazy.get();
	}
}