package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the fund calculates a taxable interest per share (TIS).
 */
public class TaxableIncomePerShareCalculatedCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fund is calculating the taxable interest per share with the NAV.
	 */
	public static final MMCode FundCalculates = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundCalculates";
			definition = "Fund is calculating the taxable interest per share with the NAV.";
			owner_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "TSIY";
		}
	};
	/**
	 * Fund is not calculating the taxable interest per share with the NAV.
	 */
	public static final MMCode FundDoesNotCalculate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundDoesNotCalculate";
			definition = "Fund is not calculating the taxable interest per share with the NAV.";
			owner_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "TSIN";
		}
	};
	/**
	 * Unknown whether the fund is calculating the taxable interest per share
	 * with the NAV.
	 */
	public static final MMCode FundCalculatesUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundCalculatesUnknown";
			definition = "Unknown whether the fund is calculating the taxable interest per share with the NAV.";
			owner_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Another type of taxable income per share.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of taxable income per share.";
			owner_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("TSIY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxableIncomePerShareCalculatedCode";
				definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.FundCalculates, com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.FundDoesNotCalculate,
						com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.FundCalculatesUnknown, com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}