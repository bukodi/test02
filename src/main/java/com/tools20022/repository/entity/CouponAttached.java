package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3NumericText;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Physical certificates representing rights attached to the physical
 * certificates representing a security.
 */
public class CouponAttached {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date of the coupon attached to the physical security.
	 */
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CouponAttached.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Number of the coupon attached to the physical security.
	 */
	public static final MMBusinessAttribute Number = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CouponAttached.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Number of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Instrument to which a coupon is specified.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CouponAttached.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Instrument to which a coupon is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.CouponAttached;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Date on which the coupons are to be/were submitted for payment of
	 * interest.
	 */
	public static final MMBusinessAttribute CouponClippingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CouponAttached.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CouponClippingDate";
			definition = "Date on which the coupons are to be/were submitted for payment of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Identification of the coupon.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CouponAttached.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the coupon.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CouponAttached";
				definition = "Physical certificates representing rights attached to the physical certificates representing a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.CouponAttached);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CouponAttached.Date, com.tools20022.repository.entity.CouponAttached.Number, com.tools20022.repository.entity.CouponAttached.Security,
						com.tools20022.repository.entity.CouponAttached.CouponClippingDate, com.tools20022.repository.entity.CouponAttached.Identification);
			}
		});
		return mmObject_lazy.get();
	}
}