package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.TaxRecordPeriodCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the period related to the tax payment.
 */
public class TaxRecordPeriod1Code extends TaxRecordPeriodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode FirstMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode SecondMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode ThirdMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode FourthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourthMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode FifthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FifthMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode SixthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SixthMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode SeventhMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeventhMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode EighthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EighthMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode NinthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NinthMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode TenthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenthMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode EleventhMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EleventhMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode TwelfthMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwelfthMonth";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode FirstQuarter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstQuarter";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode SecondQuarter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondQuarter";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode ThirdQuarter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdQuarter";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode FourthQuarter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourthQuarter";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode FirstHalf = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstHalf";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode SecondHalf = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondHalf";
			owner_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MM01");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxRecordPeriod1Code";
				definition = "Specifies the period related to the tax payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxRecordPeriod1Code.FirstMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.SecondMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.ThirdMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.FourthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.FifthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.SixthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.SeventhMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.EighthMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.NinthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.TenthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.EleventhMonth,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.TwelfthMonth, com.tools20022.repository.codeset.TaxRecordPeriod1Code.FirstQuarter, com.tools20022.repository.codeset.TaxRecordPeriod1Code.SecondQuarter,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.ThirdQuarter, com.tools20022.repository.codeset.TaxRecordPeriod1Code.FourthQuarter, com.tools20022.repository.codeset.TaxRecordPeriod1Code.FirstHalf,
						com.tools20022.repository.codeset.TaxRecordPeriod1Code.SecondHalf);
				trace_lazy = () -> TaxRecordPeriodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}