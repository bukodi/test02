package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates that fractional value should be retained; no rounding.
 */
public class FractionDispositionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Buy securities up to next whole number.
	 */
	public static final MMCode BuyUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyUp";
			definition = "Buy securities up to next whole number.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "BUYU";
		}
	};
	/**
	 * Fractional part of cash. Take cash in lieu of fractions.
	 */
	public static final MMCode CashInLieuOfFraction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfFraction";
			definition = "Fractional part of cash. Take cash in lieu of fractions.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "CINL";
		}
	};
	/**
	 * Pre-allocate shares only if fully dealt.
	 */
	public static final MMCode Full = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Full";
			definition = "Pre-allocate shares only if fully dealt.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * No fractional shares are allowed.
	 */
	public static final MMCode NoFraction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoFraction";
			definition = "No fractional shares are allowed.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "NOFR";
		}
	};
	/**
	 * In case of a partial fill, pro-rate the allocations.
	 */
	public static final MMCode ProRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProRate";
			definition = "In case of a partial fill, pro-rate the allocations.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "PROR";
		}
	};
	/**
	 * Round up to the nearest whole number.
	 */
	public static final MMCode RoundUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundUp";
			definition = "Round up to the nearest whole number.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "RDUP";
		}
	};
	/**
	 * Round down to the nearest whole number.
	 */
	public static final MMCode RoundDown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundDown";
			definition = "Round down to the nearest whole number.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "RDDN";
		}
	};
	/**
	 * If the fraction is greater than or equal to 0.5 of the resulting security
	 * then round up, else round down.
	 */
	public static final MMCode RoundToNearest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundToNearest";
			definition = "If the fraction is greater than or equal to 0.5 of the resulting security then round up, else round down.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * Take distribution of fractions in the form of securities.
	 */
	public static final MMCode IssueFraction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueFraction";
			definition = "Take distribution of fractions in the form of securities.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "DIST";
		}
	};
	/**
	 * Do not pro-rate; discuss first.
	 */
	public static final MMCode DiscussFirst = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DiscussFirst";
			definition = "Do not pro-rate; discuss first.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "TALK";
		}
	};
	/**
	 * Pre-allocate according to the amounts shown in a linked allocation
	 * instruction.
	 */
	public static final MMCode Specific = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Specific";
			definition = "Pre-allocate according to the amounts shown in a linked allocation instruction.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "SPEC";
		}
	};
	/**
	 * Indicates that if the fraction is greater than or equal to 0.5 of the
	 * value should be rounded up; otherwise rounded down.
	 */
	public static final MMCode Standard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Standard";
			definition = "Indicates that if the fraction is greater than or equal to 0.5 of the value should be rounded up; otherwise rounded down.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "SSTD";
		}
	};
	/**
	 * Indicates that fractional value should be retained; no rounding.
	 */
	public static final MMCode Retain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Retain";
			definition = "Indicates that fractional value should be retained; no rounding.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "RETA";
		}
	};
	/**
	 * Let fractions expire worthless.
	 */
	public static final MMCode Expire = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Expire";
			definition = "Let fractions expire worthless.";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Characteristics of the disposition of fractions are unknown
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Characteristics of the disposition of fractions are unknown";
			owner_lazy = () -> FractionDispositionTypeCode.mmObject();
			codeName = "UKWN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BUYU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FractionDispositionTypeCode";
				definition = "Indicates that fractional value should be retained; no rounding.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FractionDispositionTypeCode.BuyUp, com.tools20022.repository.codeset.FractionDispositionTypeCode.CashInLieuOfFraction,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.Full, com.tools20022.repository.codeset.FractionDispositionTypeCode.NoFraction, com.tools20022.repository.codeset.FractionDispositionTypeCode.ProRate,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.RoundUp, com.tools20022.repository.codeset.FractionDispositionTypeCode.RoundDown,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.RoundToNearest, com.tools20022.repository.codeset.FractionDispositionTypeCode.IssueFraction,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.DiscussFirst, com.tools20022.repository.codeset.FractionDispositionTypeCode.Specific,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.Standard, com.tools20022.repository.codeset.FractionDispositionTypeCode.Retain, com.tools20022.repository.codeset.FractionDispositionTypeCode.Expire,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.Unknown);
			}
		});
		return mmObject_lazy.get();
	}
}