package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of capital.
 */
public class CapitalTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Approved capital.
	 */
	public static final MMCode Approved = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Approved";
			definition = "Approved capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "APPD";
		}
	};
	/**
	 * Issued voting rights.
	 */
	public static final MMCode IssuedVotingRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuedVotingRights";
			definition = "Issued voting rights.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "ISVR";
		}
	};
	/**
	 * Maximum amount of increase.
	 */
	public static final MMCode MaximumIncrease = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumIncrease";
			definition = "Maximum amount of increase.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "MXIN";
		}
	};
	/**
	 * Outstanding capital.
	 */
	public static final MMCode Outstanding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Outstanding";
			definition = "Outstanding capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "OUTS";
		}
	};
	/**
	 * Redeemed capital.
	 */
	public static final MMCode Redeemed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Redeemed";
			definition = "Redeemed capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "REDE";
		}
	};
	/**
	 * Stated capital.
	 */
	public static final MMCode StatedCapital = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatedCapital";
			definition = "Stated capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "STCA";
		}
	};
	/**
	 * Issued reserve capital.
	 */
	public static final MMCode TreasuryStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryStock";
			definition = "Issued reserve capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "TRSO";
		}
	};
	/**
	 * Contingent capital.
	 */
	public static final MMCode Unissued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unissued";
			definition = "Contingent capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "UISS";
		}
	};
	/**
	 * Withdrawn capital.
	 */
	public static final MMCode Withdrawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withdrawn";
			definition = "Withdrawn capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "WTHD";
		}
	};
	/**
	 * Authorised capital.
	 */
	public static final MMCode Authorised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Authorised";
			definition = "Authorised capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "AUTD";
		}
	};
	/**
	 * In circulation.
	 */
	public static final MMCode InCirculation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InCirculation";
			definition = "In circulation.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "ICIR";
		}
	};
	/**
	 * Issued capital.
	 */
	public static final MMCode Issued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issued";
			definition = "Issued capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "ISUD";
		}
	};
	/**
	 * Issued reserve capital.
	 */
	public static final MMCode IssuedReserveCapital = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuedReserveCapital";
			definition = "Issued reserve capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "IRCA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("APPD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CapitalTypeCode";
				definition = "Specifies the type of capital.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CapitalTypeCode.Approved, com.tools20022.repository.codeset.CapitalTypeCode.IssuedVotingRights,
						com.tools20022.repository.codeset.CapitalTypeCode.MaximumIncrease, com.tools20022.repository.codeset.CapitalTypeCode.Outstanding, com.tools20022.repository.codeset.CapitalTypeCode.Redeemed,
						com.tools20022.repository.codeset.CapitalTypeCode.StatedCapital, com.tools20022.repository.codeset.CapitalTypeCode.TreasuryStock, com.tools20022.repository.codeset.CapitalTypeCode.Unissued,
						com.tools20022.repository.codeset.CapitalTypeCode.Withdrawn, com.tools20022.repository.codeset.CapitalTypeCode.Authorised, com.tools20022.repository.codeset.CapitalTypeCode.InCirculation,
						com.tools20022.repository.codeset.CapitalTypeCode.Issued, com.tools20022.repository.codeset.CapitalTypeCode.IssuedReserveCapital);
			}
		});
		return mmObject_lazy.get();
	}
}