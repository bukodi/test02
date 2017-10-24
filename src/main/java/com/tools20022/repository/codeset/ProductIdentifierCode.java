package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of identifier of a product.
 */
public class ProductIdentifierCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Product identifier assigned by the buyer.
	 */
	public static final MMCode BuyersItemNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyersItemNumber";
			definition = "Product identifier assigned by the buyer.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "BINR";
		}
	};
	/**
	 * A code to identify a product based on applicable commercial conditions.
	 */
	public static final MMCode CommercialDescriptionCodeName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialDescriptionCodeName";
			definition = "A code to identify a product based on applicable commercial conditions.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "COMD";
		}
	};
	/**
	 * The unique EAN (European Article Number) code.
	 */
	public static final MMCode EAN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EAN";
			definition = "The unique EAN (European Article Number) code.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "EANC";
		}
	};
	/**
	 * Classification of goods as developed by the Customs Cooperation council.
	 */
	public static final MMCode HarmonizedTariffCodeName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HarmonizedTariffCodeName";
			definition = "Classification of goods as developed by the Customs Cooperation council.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "HRTR";
		}
	};
	/**
	 * Product identifier as assigned by the manufacturer.
	 */
	public static final MMCode ManufacturersItemNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManufacturersItemNumber";
			definition = "Product identifier as assigned by the manufacturer.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "MANI";
		}
	};
	/**
	 * Reference number assigned by the manufacturer to differentiate variations
	 * in similar products in a class or group.
	 */
	public static final MMCode ModelNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ModelNumber";
			definition = "Reference number assigned by the manufacturer to differentiate variations in similar products in a class or group.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "MODL";
		}
	};
	/**
	 * Reference assigned by the manufacturer to a product part.
	 */
	public static final MMCode PartNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartNumber";
			definition = "Reference assigned by the manufacturer to a product part.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "PART";
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
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "QOTA";
		}
	};
	/**
	 * Identification of the style of a product.
	 */
	public static final MMCode StyleNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StyleNumber";
			definition = "Identification of the style of a product.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "STYL";
		}
	};
	/**
	 * Number assigned to an article by the supplier of that article.
	 */
	public static final MMCode SuppliersItemNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuppliersItemNumber";
			definition = "Number assigned to an article by the supplier of that article.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "SUPI";
		}
	};
	/**
	 * Number assigned to a manufacturer's product by the Product Code Council.
	 */
	public static final MMCode UniversalProductCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UniversalProductCode";
			definition = "Number assigned to a manufacturer's product by the Product Code Council.";
			owner_lazy = () -> ProductIdentifierCode.mmObject();
			codeName = "UPCC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BINR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductIdentifierCode";
				definition = "Specifies the type of identifier of a product.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductIdentifierCode.BuyersItemNumber, com.tools20022.repository.codeset.ProductIdentifierCode.CommercialDescriptionCodeName,
						com.tools20022.repository.codeset.ProductIdentifierCode.EAN, com.tools20022.repository.codeset.ProductIdentifierCode.HarmonizedTariffCodeName,
						com.tools20022.repository.codeset.ProductIdentifierCode.ManufacturersItemNumber, com.tools20022.repository.codeset.ProductIdentifierCode.ModelNumber,
						com.tools20022.repository.codeset.ProductIdentifierCode.PartNumber, com.tools20022.repository.codeset.ProductIdentifierCode.QuotaCategory, com.tools20022.repository.codeset.ProductIdentifierCode.StyleNumber,
						com.tools20022.repository.codeset.ProductIdentifierCode.SuppliersItemNumber, com.tools20022.repository.codeset.ProductIdentifierCode.UniversalProductCode);
			}
		});
		return mmObject_lazy.get();
	}
}