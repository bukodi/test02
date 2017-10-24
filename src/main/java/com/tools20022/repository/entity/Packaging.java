package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max4Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Physical packaging of goods for transport.
 */
public class Packaging {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of packages for a supply chain trade delivery.
	 */
	public static final MMBusinessAssociationEnd Quantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Packaging.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Number of packages for a  supply chain trade delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.RelatedPackaging;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Number of units per package for a supply chain trade delivery.
	 */
	public static final MMBusinessAssociationEnd PerPackageUnitQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Packaging.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerPackageUnitQuantity";
			definition = "Number of units per package  for a supply chain trade delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.PackagingForUnitQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Transport process which uses a specific packaging.
	 */
	public static final MMBusinessAssociationEnd Transport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Packaging.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Transport process which uses a specific packaging.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.Packaging;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	/**
	 * Name given to the type of supply chain packaging. For instance
	 * Halogenated Resin (PVC).
	 */
	public static final MMBusinessAttribute PackagingName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Packaging.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingName";
			definition = "Name given to the type of supply chain packaging. For instance Halogenated Resin (PVC).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Total quantity of packaging units, eg number of boxes, containers,
	 * pallets, etc
	 */
	public static final MMBusinessAssociationEnd TotalConsignmentQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Packaging.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalConsignmentQuantity";
			definition = "Total quantity of packaging units, eg number of boxes, containers, pallets, etc";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.PackagingForConsignmentlQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Total volume of goods shipped, eg number of cubic meters.
	 */
	public static final MMBusinessAssociationEnd TotalVolume = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Packaging.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalVolume";
			definition = "Total volume of goods shipped, eg number of cubic meters.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.PackagingForVolume;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Total weight of goods shipped, eg number of kg, tons.
	 */
	public static final MMBusinessAssociationEnd TotalWeight = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Packaging.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalWeight";
			definition = "Total weight of goods shipped, eg number of kg, tons.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.PackagingForWeight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Line item information for the package goods.
	 */
	public static final MMBusinessAssociationEnd RelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Packaging.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLineItem";
			definition = "Line item information for the package goods.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.Packaging;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}
	};
	/**
	 * Code specifying the properties of packaging for the supply chain delivery
	 * of goods.
	 */
	public static final MMBusinessAttribute PackageType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Packaging.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackageType";
			definition = "Code specifying the properties of packaging for the supply chain delivery of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Packaging";
				definition = "Physical packaging of goods for transport.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductQuantity.RelatedPackaging, com.tools20022.repository.entity.ProductQuantity.PackagingForUnitQuantity,
						com.tools20022.repository.entity.ProductQuantity.PackagingForConsignmentlQuantity, com.tools20022.repository.entity.ProductQuantity.PackagingForVolume,
						com.tools20022.repository.entity.ProductQuantity.PackagingForWeight, com.tools20022.repository.entity.LineItem.Packaging, com.tools20022.repository.entity.Transport.Packaging);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Packaging.Quantity, com.tools20022.repository.entity.Packaging.PerPackageUnitQuantity, com.tools20022.repository.entity.Packaging.Transport,
						com.tools20022.repository.entity.Packaging.PackagingName, com.tools20022.repository.entity.Packaging.TotalConsignmentQuantity, com.tools20022.repository.entity.Packaging.TotalVolume,
						com.tools20022.repository.entity.Packaging.TotalWeight, com.tools20022.repository.entity.Packaging.RelatedLineItem, com.tools20022.repository.entity.Packaging.PackageType);
			}
		});
		return mmObject_lazy.get();
	}
}