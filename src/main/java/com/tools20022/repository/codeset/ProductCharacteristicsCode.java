package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the charateristics of a product.
 */
public class ProductCharacteristicsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Detailed product information as assigned by the buyer.
	 */
	public static final MMCode BuyersItemSpecification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyersItemSpecification";
			definition = "Detailed product information as assigned by the buyer.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "BISP";
		}
	};
	/**
	 * Unique identifier affixed by manufacturer to a chassis for identification
	 * purposes.
	 */
	public static final MMCode ChassisNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChassisNumber";
			definition = "Unique identifier affixed by manufacturer to a chassis for identification purposes.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "CHNR";
		}
	};
	/**
	 * Indication of the product colour.
	 */
	public static final MMCode Colour = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Colour";
			definition = "Indication of the product colour.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "CLOR";
		}
	};
	/**
	 * The total of the volume used for combustion inside the cylinders of an
	 * engine. This is expressed in cubic centimetres.
	 */
	public static final MMCode EngineDisplacement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EngineDisplacement";
			definition = "The total of the volume used for combustion inside the cylinders of an engine. This is expressed in cubic centimetres.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "EDSP";
		}
	};
	/**
	 * Unique identifier affixed by manufacturer to an engine for identification
	 * purposes.
	 */
	public static final MMCode EngineNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EngineNumber";
			definition = "Unique identifier affixed by manufacturer to an engine for identification purposes.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "ENNR";
		}
	};
	/**
	 * Identifier of a sub-category of a product such as size, colour, etc.
	 */
	public static final MMCode Option = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Identifier of a sub-category of a product such as size, colour, etc.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * Code assigned to the product describing how it will be stored.
	 */
	public static final MMCode OriginCriterion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginCriterion";
			definition = "Code assigned to the product describing how it will be stored.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "ORCR";
		}
	};
	/**
	 * Percentage by volume.
	 */
	public static final MMCode PercentageByVolume = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageByVolume";
			definition = "Percentage by volume.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "PCTV";
		}
	};
	/**
	 * Detailed product information as assigned by the seller.
	 */
	public static final MMCode SellersItemSpecification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellersItemSpecification";
			definition = "Detailed product information as assigned by the seller.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "SISP";
		}
	};
	/**
	 * Indication of the product size.
	 */
	public static final MMCode Size = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Size";
			definition = "Indication of the product size.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "SIZE";
		}
	};
	/**
	 * Range of product sizes.
	 */
	public static final MMCode SizeRange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SizeRange";
			definition = "Range of product sizes.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "SZRG";
		}
	};
	/**
	 * Special remarks about a product.
	 */
	public static final MMCode SpecialRemarks = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialRemarks";
			definition = "Special remarks about a product.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "SPRM";
		}
	};
	/**
	 * Code assigned to the product describing how it will be stored.
	 */
	public static final MMCode StorageCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StorageCode";
			definition = "Code assigned to the product describing how it will be stored.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "STOR";
		}
	};
	/**
	 * The identification number which uniquely distinguishes one vehicle from
	 * another through the lifespan of the vehicle.
	 */
	public static final MMCode VehicleIdentificationNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VehicleIdentificationNumber";
			definition = "The identification number which uniquely distinguishes one vehicle from another through the lifespan of the vehicle.";
			owner_lazy = () -> ProductCharacteristicsCode.mmObject();
			codeName = "VINR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BISP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductCharacteristicsCode";
				definition = "Specifies the charateristics of a product.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductCharacteristicsCode.BuyersItemSpecification, com.tools20022.repository.codeset.ProductCharacteristicsCode.ChassisNumber,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.Colour, com.tools20022.repository.codeset.ProductCharacteristicsCode.EngineDisplacement,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.EngineNumber, com.tools20022.repository.codeset.ProductCharacteristicsCode.Option,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.OriginCriterion, com.tools20022.repository.codeset.ProductCharacteristicsCode.PercentageByVolume,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.SellersItemSpecification, com.tools20022.repository.codeset.ProductCharacteristicsCode.Size,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.SizeRange, com.tools20022.repository.codeset.ProductCharacteristicsCode.SpecialRemarks,
						com.tools20022.repository.codeset.ProductCharacteristicsCode.StorageCode, com.tools20022.repository.codeset.ProductCharacteristicsCode.VehicleIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}
}