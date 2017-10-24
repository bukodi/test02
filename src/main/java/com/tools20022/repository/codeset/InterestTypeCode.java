package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates if the deal price is excluding or including the accrued interest.
 */
public class InterestTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates deal price including accrued interest.
	 */
	public static final MMCode CumInterest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumInterest";
			definition = "Indicates deal price including accrued interest.";
			owner_lazy = () -> InterestTypeCode.mmObject();
			codeName = "CINT";
		}
	};
	/**
	 * Indicates deal price excluding accrued interest.
	 */
	public static final MMCode ExInterest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExInterest";
			definition = "Indicates deal price excluding accrued interest.";
			owner_lazy = () -> InterestTypeCode.mmObject();
			codeName = "XINT";
		}
	};
	/**
	 * Indicates that the type of interest is a zero coupon.
	 */
	public static final MMCode ZeroCoupon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroCoupon";
			definition = "Indicates that the type of interest is a zero coupon.";
			owner_lazy = () -> InterestTypeCode.mmObject();
			codeName = "ZCPN";
		}
	};
	/**
	 * Indicates that the type of interest is discounted.
	 */
	public static final MMCode Discounted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discounted";
			definition = "Indicates that the type of interest is discounted.";
			owner_lazy = () -> InterestTypeCode.mmObject();
			codeName = "DSCO";
		}
	};
	/**
	 * Indicates that the type of interest is index.
	 */
	public static final MMCode Index = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Indicates that the type of interest is index.";
			owner_lazy = () -> InterestTypeCode.mmObject();
			codeName = "INDE";
		}
	};
	/**
	 * Indicates that the type of interest is a dual basis.
	 */
	public static final MMCode DualBasis = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DualBasis";
			definition = "Indicates that the type of interest is a dual basis.";
			owner_lazy = () -> InterestTypeCode.mmObject();
			codeName = "DUAL";
		}
	};
	/**
	 * Indicates that the type of interest is a floating rate note.
	 */
	public static final MMCode FloatingRateNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			definition = "Indicates that the type of interest is a floating rate note.";
			owner_lazy = () -> InterestTypeCode.mmObject();
			codeName = "FLRN";
		}
	};
	/**
	 * Indicates that the type of interest is fixed.
	 */
	public static final MMCode Fixed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			definition = "Indicates that the type of interest is fixed.";
			owner_lazy = () -> InterestTypeCode.mmObject();
			codeName = "FIXD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CINT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InterestTypeCode";
				definition = "Indicates if the deal price is excluding or including the accrued interest.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestTypeCode.CumInterest, com.tools20022.repository.codeset.InterestTypeCode.ExInterest, com.tools20022.repository.codeset.InterestTypeCode.ZeroCoupon,
						com.tools20022.repository.codeset.InterestTypeCode.Discounted, com.tools20022.repository.codeset.InterestTypeCode.Index, com.tools20022.repository.codeset.InterestTypeCode.DualBasis,
						com.tools20022.repository.codeset.InterestTypeCode.FloatingRateNote, com.tools20022.repository.codeset.InterestTypeCode.Fixed);
			}
		});
		return mmObject_lazy.get();
	}
}