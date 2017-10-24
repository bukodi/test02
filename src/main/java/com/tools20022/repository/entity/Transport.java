package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FreightChargesCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Moving of goods or people from one place to another by vehicle.
 */
public class Transport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the applicable Incoterm and associated location.
	 */
	public static final MMBusinessAssociationEnd Incoterms = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Incoterms.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Incoterms.mmObject();
		}
	};
	/**
	 * Unique identification of the means of transport, such as the
	 * International Maritime Organization number of a vessel.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identification of the means of transport, such as the International Maritime Organization number of a vessel.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Physical packaging of goods for transport.
	 */
	public static final MMBusinessAssociationEnd Packaging = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of goods for transport.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	/**
	 * Date and time when the goods reach their destination..
	 */
	public static final MMBusinessAttribute ArrivalDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ArrivalDateTime";
			definition = "Date and time when the goods reach their destination..";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether or not partial shipments are allowed.
	 */
	public static final MMBusinessAttribute PartialShipment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialShipment";
			definition = "Indicates whether or not partial shipments are allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether or not transshipment of goods is allowed.
	 */
	public static final MMBusinessAttribute TransShipment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransShipment";
			definition = "Indicates whether or not transshipment of goods is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the delivery parameters of a trade.
	 */
	public static final MMBusinessAssociationEnd ProductDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Specifies the delivery parameters of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.Routing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};
	/**
	 * Place from where the goods must leave.
	 */
	public static final MMBusinessAssociationEnd PlaceOfDeparture = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDeparture";
			definition = "Place from where the goods must leave.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.DepartureTransportParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}
	};
	/**
	 * Place where the goods must arrive.
	 */
	public static final MMBusinessAssociationEnd PlaceOfDestination = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDestination";
			definition = "Place where the goods must arrive.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.DestinationTransportParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}
	};
	/**
	 * Charges related to the conveyance of goods.
	 */
	public static final MMBusinessAssociationEnd TransportCharges = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportCharges";
			definition = "Charges related to the conveyance of goods.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Charges.mmObject();
		}
	};
	/**
	 * Identifies whether the freight charges associated with the items are
	 * "prepaid" or "collect".
	 */
	public static final MMBusinessAttribute FreightChargesPrepaidOrCollect = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FreightChargesPrepaidOrCollect";
			definition = "Identifies whether the freight charges associated with the items are \"prepaid\" or \"collect\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FreightChargesCode.mmObject();
		}
	};
	/**
	 * Specifies the shipment date, the earliest shipment date and the latest
	 * shipment date.
	 */
	public static final MMBusinessAssociationEnd ShipmentDates = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShipmentDates";
			definition = "Specifies the shipment date, the earliest shipment date and the latest shipment date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.RelatedTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ShipmentDateRange.mmObject();
		}
	};
	/**
	 * Goods that are transported.
	 */
	public static final MMBusinessAssociationEnd TransportedGoods = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportedGoods";
			definition = "Goods that are transported.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Goods.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Goods.mmObject();
		}
	};
	/**
	 * Specifies each role linked to the transport of goods.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the transport of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransportPartyRole.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TransportPartyRole.mmObject();
		}
	};
	/**
	 * Place through which the goods are transiting.
	 */
	public static final MMBusinessAssociationEnd TransitLocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransitLocation";
			definition = "Place through which the goods are transiting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.RelatedTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}
	};
	/**
	 * Documents which may be required in relation with the transportation of
	 * goods.
	 */
	public static final MMBusinessAssociationEnd TransportDocuments = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Transport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportDocuments";
			definition = "Documents which may be required in relation with the transportation of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Transport";
				definition = "Moving of goods or people from one place to another by vehicle.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.DepartureTransportParameters, com.tools20022.repository.entity.Location.DestinationTransportParameters,
						com.tools20022.repository.entity.Location.RelatedTransport, com.tools20022.repository.entity.Document.Transport, com.tools20022.repository.entity.Charges.Transport,
						com.tools20022.repository.entity.Incoterms.Transport, com.tools20022.repository.entity.Goods.Transport, com.tools20022.repository.entity.ProductDelivery.Routing, com.tools20022.repository.entity.Packaging.Transport,
						com.tools20022.repository.entity.TransportPartyRole.Transport, com.tools20022.repository.entity.ShipmentDateRange.RelatedTransport);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.Incoterms, com.tools20022.repository.entity.Transport.Identification, com.tools20022.repository.entity.Transport.Packaging,
						com.tools20022.repository.entity.Transport.ArrivalDateTime, com.tools20022.repository.entity.Transport.PartialShipment, com.tools20022.repository.entity.Transport.TransShipment,
						com.tools20022.repository.entity.Transport.ProductDelivery, com.tools20022.repository.entity.Transport.PlaceOfDeparture, com.tools20022.repository.entity.Transport.PlaceOfDestination,
						com.tools20022.repository.entity.Transport.TransportCharges, com.tools20022.repository.entity.Transport.FreightChargesPrepaidOrCollect, com.tools20022.repository.entity.Transport.ShipmentDates,
						com.tools20022.repository.entity.Transport.TransportedGoods, com.tools20022.repository.entity.Transport.PartyRole, com.tools20022.repository.entity.Transport.TransitLocation,
						com.tools20022.repository.entity.Transport.TransportDocuments);
			}
		});
		return mmObject_lazy.get();
	}
}