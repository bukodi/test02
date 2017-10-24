package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ContactPoint;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Address which is accessed by electronic means.
 */
public class ElectronicAddress extends ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Address for electronic mail (e-mail).
	 */
	public static final MMBusinessAttribute EmailAddress = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails2.EmailAddress);
			isDerived = false;
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Address for the Universal Resource Locator (URL), eg, used over the www
	 * (HTTP) service.
	 */
	public static final MMBusinessAttribute URLAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "URLAddress";
			definition = "Address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Address for a telex machine.
	 */
	public static final MMBusinessAttribute TelexAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TelexAddress";
			definition = "Address for a telex machine.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Presentation process for which an electronic presentation address is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPresentation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPresentation";
			definition = "Presentation process for which an electronic presentation address is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Presentation.ElectronicPresentationAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Presentation.mmObject();
		}
	};
	/**
	 * Address for a teletext.
	 */
	public static final MMBusinessAttribute TeletextAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TeletextAddress";
			definition = "Address for a teletext.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Address for an Integrated Services Digital Network.
	 */
	public static final MMBusinessAttribute ISDNAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ElectronicAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ISDNAddress";
			definition = "Address for an Integrated Services Digital Network.";
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
				name = "ElectronicAddress";
				definition = "Address which is accessed by electronic means.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Presentation.ElectronicPresentationAddress);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceLocationDetails1.ElectronicAddress);
				superType_lazy = () -> ContactPoint.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicAddress.EmailAddress, com.tools20022.repository.entity.ElectronicAddress.URLAddress,
						com.tools20022.repository.entity.ElectronicAddress.TelexAddress, com.tools20022.repository.entity.ElectronicAddress.RelatedPresentation, com.tools20022.repository.entity.ElectronicAddress.TeletextAddress,
						com.tools20022.repository.entity.ElectronicAddress.ISDNAddress);
			}
		});
		return mmObject_lazy.get();
	}
}