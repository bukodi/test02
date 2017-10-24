package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExternalTypeOfPartyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies information related to the extension of an undertaking.
 */
public class UndertakingExtension {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking for which extension parameters are provided.
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingExtension.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which extension parameters are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.UndertakingExtension;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	/**
	 * Requirement for a clause covering an automatic extension of the validity
	 * expiry date.
	 */
	public static final MMBusinessAttribute AutoExtensionPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingExtension.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutoExtensionPeriod";
			definition = "Requirement for a clause covering an automatic extension of the validity expiry date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date after which the undertaking will no longer be subject to automatic
	 * extension.
	 */
	public static final MMBusinessAttribute AutoExtensionFinalExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingExtension.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutoExtensionFinalExpiryDate";
			definition = "Date after which the undertaking will no longer be subject to automatic extension.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Minimum number of days of advance notification that must be given to
	 * indicate the undertaking will no longer be extended.
	 */
	public static final MMBusinessAttribute NonExtensionNoticePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingExtension.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonExtensionNoticePeriod";
			definition = "Minimum number of days of advance notification that must be given to indicate the undertaking  will no longer be extended. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates whether the undertaking can be extended.
	 */
	public static final MMBusinessAttribute NonExtensionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingExtension.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonExtensionIndicator";
			definition = "Indicates whether the undertaking can be extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Minimum number of days of advance notification given to indicate the
	 * undertaking will no longer be automatically extended.
	 */
	public static final MMBusinessAttribute AutoExtensionNotificationPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingExtension.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoExtensionNotificationPeriod";
			definition = "Minimum number of days of advance notification given to indicate the undertaking will no longer be automatically extended. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Type of party to whom the notice of non-extension is intended to be
	 * delivered, such as the applicant or beneficiary.
	 */
	public static final MMBusinessAttribute NotificationRecipientType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingExtension.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationRecipientType";
			definition = "Type of party to whom the notice of non-extension is intended to be delivered, such as the applicant or beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalTypeOfPartyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingExtension";
				definition = "Specifies information related to the extension of an undertaking.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.UndertakingExtension);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingExtension.Undertaking, com.tools20022.repository.entity.UndertakingExtension.AutoExtensionPeriod,
						com.tools20022.repository.entity.UndertakingExtension.AutoExtensionFinalExpiryDate, com.tools20022.repository.entity.UndertakingExtension.NonExtensionNoticePeriod,
						com.tools20022.repository.entity.UndertakingExtension.NonExtensionIndicator, com.tools20022.repository.entity.UndertakingExtension.AutoExtensionNotificationPeriod,
						com.tools20022.repository.entity.UndertakingExtension.NotificationRecipientType);
			}
		});
		return mmObject_lazy.get();
	}
}