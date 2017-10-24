package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Offset of the time before or after 00:00 hour UTC.
 */
public class UTCOffset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the offset is before or after 00:00 hour UTC.
	 */
	public static final MMBusinessAttribute Sign = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UTCOffset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sign";
			definition = "Indicates whether the offset is before or after 00:00 hour UTC.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	/**
	 * Offset of the reporting time, in hours, before or after 00:00 hour UTC.
	 */
	public static final MMBusinessAttribute NumberOfHours = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UTCOffset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfHours";
			definition = "Offset of the reporting time, in hours,  before or after 00:00 hour UTC.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	/**
	 * Location to which the time zone applies.
	 */
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UTCOffset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location to which the time zone applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.TimeZone;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UTCOffset";
				definition = "Offset of the time before or after 00:00 hour UTC.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.TimeZone);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UTCOffset.Sign, com.tools20022.repository.entity.UTCOffset.NumberOfHours, com.tools20022.repository.entity.UTCOffset.Location);
			}
		});
		return mmObject_lazy.get();
	}
}