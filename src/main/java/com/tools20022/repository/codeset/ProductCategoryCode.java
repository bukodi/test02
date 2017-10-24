package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the category of a product.
 */
public class ProductCategoryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Classification of goods as developed by the Customs Cooperation council.
	 */
	public static final MMCode HarmonizedTariffCodeName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HarmonizedTariffCodeName";
			definition = "Classification of goods as developed by the Customs Cooperation council.";
			owner_lazy = () -> ProductCategoryCode.mmObject();
			codeName = "HRTR";
		}
	};
	/**
	 * Product identifier used by the retail industry.
	 */
	public static final MMCode QuotaCategory = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotaCategory";
			definition = "Product identifier used by the retail industry.";
			owner_lazy = () -> ProductCategoryCode.mmObject();
			codeName = "QOTA";
		}
	};
	/**
	 * Product Group Code.
	 */
	public static final MMCode ProductGroup = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductGroup";
			definition = "Product Group Code.";
			owner_lazy = () -> ProductCategoryCode.mmObject();
			codeName = "PRGP";
		}
	};
	/**
	 * Line of business code.
	 */
	public static final MMCode LineOfBusiness = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineOfBusiness";
			definition = "Line of business code.";
			owner_lazy = () -> ProductCategoryCode.mmObject();
			codeName = "LOBU";
		}
	};
	/**
	 * Code for gender.
	 */
	public static final MMCode Gender = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gender";
			definition = "Code for gender.";
			owner_lazy = () -> ProductCategoryCode.mmObject();
			codeName = "GNDR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("HRTR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductCategoryCode";
				definition = "Specifies the category of a product.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductCategoryCode.HarmonizedTariffCodeName, com.tools20022.repository.codeset.ProductCategoryCode.QuotaCategory,
						com.tools20022.repository.codeset.ProductCategoryCode.ProductGroup, com.tools20022.repository.codeset.ProductCategoryCode.LineOfBusiness, com.tools20022.repository.codeset.ProductCategoryCode.Gender);
			}
		});
		return mmObject_lazy.get();
	}
}