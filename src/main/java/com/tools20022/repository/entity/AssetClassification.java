package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.ProductTypeCode;
import com.tools20022.repository.datatype.CFIOct2015Identifier;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Other classification type of the security, ie, other than ISO 10962.
 */
public class AssetClassification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Classification type of the financial instrument, as per the ISO
	 * Classification of Financial Instrument (CFI) codification, for example,
	 * common share with voting rights, fully paid, or registered.
	 */
	public static final MMBusinessAttribute ClassificationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetClassification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CFIOct2015Identifier.mmObject();
		}
	};
	/**
	 * Asset for which classification information is provided.
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetClassification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Asset for which classification information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.AssetClassification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	/**
	 * Language in which the asset classification is expressed.
	 */
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetClassification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which the asset classification is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	/**
	 * Information regarding the entity that assigns the asset classification.
	 */
	public static final MMBusinessAssociationEnd AssetClassScheme = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetClassification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetClassScheme";
			definition = "Information regarding the entity that assigns the asset classification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.AssetClassification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Scheme.mmObject();
		}
	};
	/**
	 * Identifies the product type.
	 */
	public static final MMBusinessAttribute ProductType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetClassification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductType";
			definition = "Identifies the product type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProductTypeCode.mmObject();
		}
	};
	/**
	 * Strategy related to a class of assets.
	 */
	public static final MMBusinessAssociationEnd Strategy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetClassification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to a class of assets.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassStrategy.AssetClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AssetClassStrategy.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetClassification";
				definition = "Other classification type of the security, ie, other than ISO 10962.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.AssetClassification, com.tools20022.repository.entity.Scheme.AssetClassification,
						com.tools20022.repository.entity.AssetClassStrategy.AssetClass);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetClassification.ClassificationType, com.tools20022.repository.entity.AssetClassification.Asset,
						com.tools20022.repository.entity.AssetClassification.Language, com.tools20022.repository.entity.AssetClassification.AssetClassScheme, com.tools20022.repository.entity.AssetClassification.ProductType,
						com.tools20022.repository.entity.AssetClassification.Strategy);
			}
		});
		return mmObject_lazy.get();
	}
}