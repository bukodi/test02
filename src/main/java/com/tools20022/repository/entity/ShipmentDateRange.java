package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a shipment period or a shipment date.
 */
public class ShipmentDateRange {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Latest date whereby the goods must be shipped.
	 */
	public static final MMBusinessAttribute LatestShipmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ShipmentDateRange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LatestShipmentDate";
			definition = "Latest date whereby the goods must be shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the transport process to which the dates apply.
	 */
	public static final MMBusinessAssociationEnd RelatedTransport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ShipmentDateRange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransport";
			definition = "Specifies the transport process to which the dates apply.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.ShipmentDates;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Transport.mmObject();
		}
	};
	/**
	 * Earliest date whereby the items must be shipped.
	 */
	public static final MMBusinessAttribute EarliestShipmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ShipmentDateRange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestShipmentDate";
			definition = "Earliest date whereby the items must be shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date at which the goods are shipped.
	 */
	public static final MMBusinessAttribute ShipmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ShipmentDateRange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShipmentDate";
			definition = "Date at which the goods are shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ShipmentDateRange";
				definition = "Specifies a shipment period or a shipment date.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.ShipmentDates);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ShipmentDateRange.LatestShipmentDate, com.tools20022.repository.entity.ShipmentDateRange.RelatedTransport,
						com.tools20022.repository.entity.ShipmentDateRange.EarliestShipmentDate, com.tools20022.repository.entity.ShipmentDateRange.ShipmentDate);
			}
		});
		return mmObject_lazy.get();
	}
}