package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ExtensiveBranchNetworkIdentifier;
import com.tools20022.repository.datatype.SmallNetworkIdentifier;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Australian Bank State Branch (BSB) Code - identifies Australian financial
 * institutions on the Australian national clearing system. The code is assigned
 * by the Australian Payments Clearing Association (APCA).
 */
public class AustralianBSBIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Extensive branch network list of the Australian Bank State Branch (BSB)
	 * Code. The codes are used for identifying Australian financial
	 * institutions, as assigned by the Australian Payments Clearing Association
	 * (APCA).
	 */
	public static final MMBusinessAttribute ExtensiveBranchNetworkIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AustralianBSBIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtensiveBranchNetworkIdentification";
			definition = "Extensive branch network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExtensiveBranchNetworkIdentifier.mmObject();
		}
	};
	/**
	 * Small network list of the Australian Bank State Branch (BSB) Code. The
	 * codes are used for identifying Australian financial institutions , as
	 * assigned by the Australian Payments Clearing Association (APCA).
	 */
	public static final MMBusinessAttribute SmallNetworkIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AustralianBSBIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SmallNetworkIdentification";
			definition = "Small network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions , as assigned by the Australian Payments Clearing Association (APCA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SmallNetworkIdentifier.mmObject();
		}
	};
	/**
	 * Clearing system member identification for which an Australian BSB
	 * identification is provided.
	 */
	public static final MMBusinessAssociationEnd ClearingSystemMemberIdentificationType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AustralianBSBIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentificationType";
			definition = "Clearing system member identification for which an Australian BSB identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.AustralianBSBCode;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashClearingSystemMember.mmObject();
		}
	};
	/**
	 * Clearing system for which an Australian code is provided.
	 */
	public static final MMBusinessAttribute ClearingSystemMember = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AustralianBSBIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMember";
			definition = "Clearing system for which an Australian code is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashClearingSystemMember.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AustralianBSBIdentification";
				definition = "Australian Bank State Branch (BSB) Code - identifies Australian financial institutions on the Australian national clearing system. The code is assigned by the Australian Payments Clearing Association (APCA).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystemMember.AustralianBSBCode);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AustralianBSBIdentification.ExtensiveBranchNetworkIdentification, com.tools20022.repository.entity.AustralianBSBIdentification.SmallNetworkIdentification,
						com.tools20022.repository.entity.AustralianBSBIdentification.ClearingSystemMemberIdentificationType, com.tools20022.repository.entity.AustralianBSBIdentification.ClearingSystemMember);
			}
		});
		return mmObject_lazy.get();
	}
}