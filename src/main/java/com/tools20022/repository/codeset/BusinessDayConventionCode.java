package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates how a date is adjusted when it falls on a non-business day.
 */
public class BusinessDayConventionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The date will be the first following day that is a business day.
	 */
	public static final MMCode Following = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Following";
			definition = "The date will be the first following day that is a business day.";
			owner_lazy = () -> BusinessDayConventionCode.mmObject();
			codeName = "FWNG";
		}
	};
	/**
	 * The date will be the first following day that is a business day unless
	 * that day falls in the next calendar month, in which case that date will
	 * be the first preceding day that is a business day.
	 */
	public static final MMCode ModifiedFollowing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ModifiedFollowing";
			definition = "The date will be the first following day that is a business day unless that day falls in the next calendar month, in which case that date will be the first preceding day that is a business day.";
			owner_lazy = () -> BusinessDayConventionCode.mmObject();
			codeName = "MODF";
		}
	};
	/**
	 * The date will be the first preceding day that is a business day.
	 */
	public static final MMCode Preceding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Preceding";
			definition = "The date will be the first preceding day that is a business day.";
			owner_lazy = () -> BusinessDayConventionCode.mmObject();
			codeName = "PREC";
		}
	};
	/**
	 * The date will be the first preceding day that is a business day unless
	 * that day falls on a day other than a sunday or a monday, and will be the
	 * first following day that is a business day, if the relevant date
	 * otherwise falls on a sunday or a monday.
	 */
	public static final MMCode Nearest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Nearest";
			definition = "The date will be the first preceding day that is a business day unless that day falls on a day other than a sunday or a monday, and will be the first following day that is a business day, if the relevant date otherwise falls on a sunday or a monday.";
			owner_lazy = () -> BusinessDayConventionCode.mmObject();
			codeName = "NEAR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FWNG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BusinessDayConventionCode";
				definition = "Indicates how a date is adjusted when it falls on a non-business day.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BusinessDayConventionCode.Following, com.tools20022.repository.codeset.BusinessDayConventionCode.ModifiedFollowing,
						com.tools20022.repository.codeset.BusinessDayConventionCode.Preceding, com.tools20022.repository.codeset.BusinessDayConventionCode.Nearest);
			}
		});
		return mmObject_lazy.get();
	}
}