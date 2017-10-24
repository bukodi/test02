package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Categorization of financial asset type.
 */
public class FinancialAssetTypeCategoryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance attributed to equities.
	 */
	public static final MMCode Equities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equities";
			definition = "Balance attributed to equities.";
			owner_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
			codeName = "EQTY";
		}
	};
	/**
	 * Balance attributed to debt instruments.
	 */
	public static final MMCode DebtInstruments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtInstruments";
			definition = "Balance attributed to debt instruments.";
			owner_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
			codeName = "DEBT";
		}
	};
	/**
	 * Balance attributed to entitlements.
	 */
	public static final MMCode Entitlements = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entitlements";
			definition = "Balance attributed to entitlements.";
			owner_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
			codeName = "ENTL";
		}
	};
	/**
	 * Balance attributed to derivatives.
	 */
	public static final MMCode Derivatives = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Derivatives";
			definition = "Balance attributed to derivatives.";
			owner_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
			codeName = "DERV";
		}
	};
	/**
	 * Balance attributed to money market instruments.
	 */
	public static final MMCode MoneyMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			definition = "Balance attributed to money market instruments.";
			owner_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
			codeName = "MMKT";
		}
	};
	/**
	 * Other financial asset type balance according to a different
	 * classification, which is not explictly defined.
	 */
	public static final MMCode Others = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Others";
			definition = "Other financial asset type balance according to a different classification, which is not explictly defined.";
			owner_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EQTY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialAssetTypeCategoryCode";
				definition = "Categorization of financial asset type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.Equities, com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.DebtInstruments,
						com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.Entitlements, com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.Derivatives,
						com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.MoneyMarket, com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.Others);
			}
		});
		return mmObject_lazy.get();
	}
}