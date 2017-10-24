package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the rounding direction.
 */
public class RoundingDirectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pre-allocate shares only if fully dealt.
	 */
	public static final MMCode Full = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Full";
			definition = "Pre-allocate shares only if fully dealt.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
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
			owner_lazy = () -> RoundingDirectionCode.mmObject();
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
			owner_lazy = () -> RoundingDirectionCode.mmObject();
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
			owner_lazy = () -> RoundingDirectionCode.mmObject();
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
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "RDWN";
		}
	};
	/**
	 * Round up or down to the nearest whole number.
	 */
	public static final MMCode RoundToNearest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundToNearest";
			definition = "Round up or down to the nearest whole number.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * Do not round.
	 */
	public static final MMCode IssueFraction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueFraction";
			definition = "Do not round.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
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
			owner_lazy = () -> RoundingDirectionCode.mmObject();
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
			owner_lazy = () -> RoundingDirectionCode.mmObject();
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
			owner_lazy = () -> RoundingDirectionCode.mmObject();
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
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "RETA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FULL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RoundingDirectionCode";
				definition = "Specifies the rounding direction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RoundingDirectionCode.Full, com.tools20022.repository.codeset.RoundingDirectionCode.NoFraction,
						com.tools20022.repository.codeset.RoundingDirectionCode.ProRate, com.tools20022.repository.codeset.RoundingDirectionCode.RoundUp, com.tools20022.repository.codeset.RoundingDirectionCode.RoundDown,
						com.tools20022.repository.codeset.RoundingDirectionCode.RoundToNearest, com.tools20022.repository.codeset.RoundingDirectionCode.IssueFraction, com.tools20022.repository.codeset.RoundingDirectionCode.DiscussFirst,
						com.tools20022.repository.codeset.RoundingDirectionCode.Specific, com.tools20022.repository.codeset.RoundingDirectionCode.Standard, com.tools20022.repository.codeset.RoundingDirectionCode.Retain);
			}
		});
		return mmObject_lazy.get();
	}
}