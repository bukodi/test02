package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of dividend rate.
 */
public class DividendRateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rate relating to the underlying security for which capital is
	 * distributed.
	 */
	public static final MMCode CapitalPortion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalPortion";
			definition = "Rate relating to the underlying security for which capital is distributed.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "CAPO";
		}
	};
	/**
	 * Rate resulting from a fully franked dividend paid by a company; rate
	 * includes tax credit for companies that have made sufficient tax payments
	 * during fiscal period.
	 */
	public static final MMCode FullyFranked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullyFranked";
			definition = "Rate resulting from a fully franked dividend paid by a company; rate includes tax credit for companies that have made sufficient tax payments during fiscal period.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "FLFR";
		}
	};
	/**
	 * Rate relating to the underlying security for which income is distributed.
	 */
	public static final MMCode IncomePortion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomePortion";
			definition = "Rate relating to the underlying security for which income is distributed.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "INCO";
		}
	};
	/**
	 * Rate relating to the underlying security for which interest is paid.
	 */
	public static final MMCode Interest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Rate relating to the underlying security for which interest is paid.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Rate relating to the underlying security for which other income is paid.
	 */
	public static final MMCode SundryOrOtherIncome = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SundryOrOtherIncome";
			definition = "Rate relating to the underlying security for which other income is paid.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "SOIC";
		}
	};
	/**
	 * Rate relating to the underlying security for which tax is charged.
	 */
	public static final MMCode TaxablePortion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxablePortion";
			definition = "Rate relating to the underlying security for which tax is charged.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "TXBL";
		}
	};
	/**
	 * Rate relating to the underlying security for which tax is deferred.
	 */
	public static final MMCode TaxDeferred = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDeferred";
			definition = "Rate relating to the underlying security for which tax is deferred.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "TXDF";
		}
	};
	/**
	 * Rate relating to the underlying security which is not taxable
	 */
	public static final MMCode TaxFree = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxFree";
			definition = "Rate relating to the underlying security which is not taxable";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "TXFR";
		}
	};
	/**
	 * Rate resulting from an unfranked dividend paid by a company; the rate
	 * doesnt include tax credit and is subject to withholding tax.
	 */
	public static final MMCode Unfranked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unfranked";
			definition = "Rate resulting from an unfranked dividend paid by a company; the rate\ndoesnt include tax credit and is subject to withholding tax.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "UNFR";
		}
	};
	/**
	 * Long term capital gain.
	 */
	public static final MMCode LongTermCapitalGain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LongTermCapitalGain";
			definition = "Long term capital gain.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "LTCG";
		}
	};
	/**
	 * Short term capital gain.
	 */
	public static final MMCode ShortTermCapitalGain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortTermCapitalGain";
			definition = "Short term capital gain.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "STCG";
		}
	};
	/**
	 * Distribution rate relating to the full period units, for example Group I
	 * units in UK.
	 */
	public static final MMCode FullPeriodUnitsIncomePortion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPeriodUnitsIncomePortion";
			definition = "Distribution rate relating to the full period units, for example Group I units in UK. ";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "FUPU";
		}
	};
	/**
	 * Distribution rate relating to the part way period units, for example
	 * Group II units in UK.
	 */
	public static final MMCode PartWayPeriodUnitsIncomePortion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartWayPeriodUnitsIncomePortion";
			definition = "Distribution rate relating to the part way period units, for example Group II units in UK. ";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "PAPU";
		}
	};
	/**
	 * Rate of income distribution originated by real estate investment.
	 */
	public static final MMCode RealEstatePropertyIncomePortion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstatePropertyIncomePortion";
			definition = "Rate of income distribution originated by real estate investment.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "REES";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CAPO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DividendRateTypeCode";
				definition = "Specifies the type of dividend rate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DividendRateTypeCode.CapitalPortion, com.tools20022.repository.codeset.DividendRateTypeCode.FullyFranked,
						com.tools20022.repository.codeset.DividendRateTypeCode.IncomePortion, com.tools20022.repository.codeset.DividendRateTypeCode.Interest, com.tools20022.repository.codeset.DividendRateTypeCode.SundryOrOtherIncome,
						com.tools20022.repository.codeset.DividendRateTypeCode.TaxablePortion, com.tools20022.repository.codeset.DividendRateTypeCode.TaxDeferred, com.tools20022.repository.codeset.DividendRateTypeCode.TaxFree,
						com.tools20022.repository.codeset.DividendRateTypeCode.Unfranked, com.tools20022.repository.codeset.DividendRateTypeCode.LongTermCapitalGain,
						com.tools20022.repository.codeset.DividendRateTypeCode.ShortTermCapitalGain, com.tools20022.repository.codeset.DividendRateTypeCode.FullPeriodUnitsIncomePortion,
						com.tools20022.repository.codeset.DividendRateTypeCode.PartWayPeriodUnitsIncomePortion, com.tools20022.repository.codeset.DividendRateTypeCode.RealEstatePropertyIncomePortion);
			}
		});
		return mmObject_lazy.get();
	}
}