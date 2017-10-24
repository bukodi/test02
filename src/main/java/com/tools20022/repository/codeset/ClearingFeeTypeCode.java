package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the type of fee being assessed of the customer for trade executions
 * at an exchange. Applicable for futures markets only at this time.
 */
public class ClearingFeeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Member of the Chicago Board Of Exchange.
	 */
	public static final MMCode CBOEMember = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CBOEMember";
			definition = "Member of the Chicago Board Of Exchange.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "CBOE";
		}
	};
	/**
	 * Non-member and customer.
	 */
	public static final MMCode NonMemberAndCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonMemberAndCustomer";
			definition = "Non-member and customer.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "NONM";
		}
	};
	/**
	 * Equity member and clearing member.
	 */
	public static final MMCode EquityClearingMember = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityClearingMember";
			definition = "Equity member and clearing member.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "EQCL";
		}
	};
	/**
	 * Full and associate member trading for own account and as floor brokers.
	 */
	public static final MMCode FullAssociateMember = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullAssociateMember";
			definition = "Full and associate member trading for own account and as floor brokers.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "FUAS";
		}
	};
	/**
	 * 106.J and 106.H Firms.
	 */
	public static final MMCode J106AndHFirms = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "J106AndHFirms";
			definition = "106.J and 106.H Firms.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "JANF";
		}
	};
	/**
	 * GIM, IDEM and COM Membership Interest Holders.
	 */
	public static final MMCode GICInterestHolders = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GICInterestHolders";
			definition = "GIM, IDEM and COM Membership Interest Holders.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "GICI";
		}
	};
	/**
	 * Lessee and 106.F Employees.
	 */
	public static final MMCode LesseeAnd106FFirms = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LesseeAnd106FFirms";
			definition = "Lessee and 106.F Employees.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "LESF";
		}
	};
	/**
	 * Miscellaneous type of clearing membership.
	 */
	public static final MMCode OtherOwnershipTypes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherOwnershipTypes";
			definition = "Miscellaneous type of clearing membership.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * First year delegate trading for his own account.
	 */
	public static final MMCode FirstYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstYearOwnAccount";
			definition = "First year delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "YTR1";
		}
	};
	/**
	 * Second year delegate trading for his own account.
	 */
	public static final MMCode SecondYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondYearOwnAccount";
			definition = "Second year delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "YTR2";
		}
	};
	/**
	 * Third year delegate trading for his own account.
	 */
	public static final MMCode ThirdYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdYearOwnAccount";
			definition = "Third year delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "YTR3";
		}
	};
	/**
	 * Fourth year delegate trading for his own account.
	 */
	public static final MMCode FourthYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourthYearOwnAccount";
			definition = "Fourth year delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "YTR4";
		}
	};
	/**
	 * Fifth year delegate trading for his own account.
	 */
	public static final MMCode FifthYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FifthYearOwnAccount";
			definition = "Fifth year delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "YTR5";
		}
	};
	/**
	 * Sixth year and beyond delegate trading for his own account.
	 */
	public static final MMCode MoreThanFiveYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoreThanFiveYearOwnAccount";
			definition = "Sixth year and beyond delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "NYTR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CBOE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingFeeTypeCode";
				definition = "Indicates the type of fee being assessed of the customer for trade executions at an exchange. Applicable for futures markets only at this time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingFeeTypeCode.CBOEMember, com.tools20022.repository.codeset.ClearingFeeTypeCode.NonMemberAndCustomer,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.EquityClearingMember, com.tools20022.repository.codeset.ClearingFeeTypeCode.FullAssociateMember,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.J106AndHFirms, com.tools20022.repository.codeset.ClearingFeeTypeCode.GICInterestHolders,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.LesseeAnd106FFirms, com.tools20022.repository.codeset.ClearingFeeTypeCode.OtherOwnershipTypes,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.FirstYearOwnAccount, com.tools20022.repository.codeset.ClearingFeeTypeCode.SecondYearOwnAccount,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.ThirdYearOwnAccount, com.tools20022.repository.codeset.ClearingFeeTypeCode.FourthYearOwnAccount,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.FifthYearOwnAccount, com.tools20022.repository.codeset.ClearingFeeTypeCode.MoreThanFiveYearOwnAccount);
			}
		});
		return mmObject_lazy.get();
	}
}