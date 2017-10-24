package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the period related to the tax payment.
 */
public class TaxRecordPeriodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax is related to the second month of the period.
	 */
	public static final MMCode FirstMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstMonth";
			definition = "Tax is related to the second month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM01";
		}
	};
	/**
	 * Tax is related to the first month of the period.
	 */
	public static final MMCode SecondMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecondMonth";
			definition = "Tax is related to the first month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM02";
		}
	};
	/**
	 * Tax is related to the third month of the period.
	 */
	public static final MMCode ThirdMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ThirdMonth";
			definition = "Tax is related to the third month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM03";
		}
	};
	/**
	 * Tax is related to the fourth month of the period.
	 */
	public static final MMCode FourthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FourthMonth";
			definition = "Tax is related to the fourth month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM04";
		}
	};
	/**
	 * Tax is related to the fifth month of the period.
	 */
	public static final MMCode FifthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FifthMonth";
			definition = "Tax is related to the fifth month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM05";
		}
	};
	/**
	 * Tax is related to the sixth month of the period.
	 */
	public static final MMCode SixthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SixthMonth";
			definition = "Tax is related to the sixth month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM06";
		}
	};
	/**
	 * Tax is related to the seventh month of the period.
	 */
	public static final MMCode SeventhMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeventhMonth";
			definition = "Tax is related to the seventh month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM07";
		}
	};
	/**
	 * Tax is related to the eighth month of the period.
	 */
	public static final MMCode EighthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EighthMonth";
			definition = "Tax is related to the eighth month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM08";
		}
	};
	/**
	 * Tax is related to the ninth month of the period.
	 */
	public static final MMCode NinthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NinthMonth";
			definition = "Tax is related to the ninth month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM09";
		}
	};
	/**
	 * Tax is related to the tenth month of the period.
	 */
	public static final MMCode TenthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TenthMonth";
			definition = "Tax is related to the tenth month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM10";
		}
	};
	/**
	 * Tax is related to the eleventh month of the period.
	 */
	public static final MMCode EleventhMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EleventhMonth";
			definition = "Tax is related to the eleventh month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM11";
		}
	};
	/**
	 * Tax is related to the twelfth month of the period.
	 */
	public static final MMCode TwelfthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TwelfthMonth";
			definition = "Tax is related to the twelfth month of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "MM12";
		}
	};
	/**
	 * Tax is related to the first quarter of the period.
	 */
	public static final MMCode FirstQuarter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstQuarter";
			definition = "Tax is related to the first quarter of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "QTR1";
		}
	};
	/**
	 * Tax is related to the second quarter of the period.
	 */
	public static final MMCode SecondQuarter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecondQuarter";
			definition = "Tax is related to the second quarter of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "QTR2";
		}
	};
	/**
	 * Tax is related to the third quarter of the period.
	 */
	public static final MMCode ThirdQuarter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ThirdQuarter";
			definition = "Tax is related to the third quarter of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "QTR3";
		}
	};
	/**
	 * Tax is related to the forth quarter of the period.
	 */
	public static final MMCode FourthQuarter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FourthQuarter";
			definition = "Tax is related to the forth quarter of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "QTR4";
		}
	};
	/**
	 * Tax is related to the first half of the period.
	 */
	public static final MMCode FirstHalf = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstHalf";
			definition = "Tax is related to the first half of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "HLF1";
		}
	};
	/**
	 * Tax is related to the second half of the period.
	 */
	public static final MMCode SecondHalf = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecondHalf";
			definition = "Tax is related to the second half of the period.";
			owner_lazy = () -> TaxRecordPeriodCode.mmObject();
			codeName = "HLF2";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MM01");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxRecordPeriodCode";
				definition = "Specifies the period related to the tax payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxRecordPeriodCode.FirstMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.SecondMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.ThirdMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.FourthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.FifthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.SixthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.SeventhMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.EighthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.NinthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.TenthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.EleventhMonth,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.TwelfthMonth, com.tools20022.repository.codeset.TaxRecordPeriodCode.FirstQuarter, com.tools20022.repository.codeset.TaxRecordPeriodCode.SecondQuarter,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.ThirdQuarter, com.tools20022.repository.codeset.TaxRecordPeriodCode.FourthQuarter, com.tools20022.repository.codeset.TaxRecordPeriodCode.FirstHalf,
						com.tools20022.repository.codeset.TaxRecordPeriodCode.SecondHalf);
				derivation_lazy = () -> Arrays.asList(TaxRecordPeriod1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}