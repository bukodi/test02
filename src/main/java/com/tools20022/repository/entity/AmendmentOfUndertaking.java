package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Modification of an undertaking such as an guarantee or standby letter of
 * credit.
 */
public class AmendmentOfUndertaking {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date the amendment is issued.
	 */
	public static final MMBusinessAttribute DateOfIssuance = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmendmentOfUndertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateOfIssuance";
			definition = "Date the amendment is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Decrease (negative) or increase (positive) of the undertaking as a result
	 * of the amendment.
	 */
	public static final MMBusinessAttribute ChangeOfAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmendmentOfUndertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChangeOfAmount";
			definition = "Decrease (negative) or increase (positive) of the undertaking as a result of the amendment. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Contents of an UndertakingAmendmentResponse message.
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmendmentOfUndertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Contents of an UndertakingAmendmentResponse message.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.UndertakingAmendment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	/**
	 * Indicates whether or not a request for consent is required from the
	 * beneficiary.
	 */
	public static final MMBusinessAttribute BeneficiaryConsentRequestIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmendmentOfUndertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryConsentRequestIndicator";
			definition = "Indicates whether or not a request for consent is required from the beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identification of the amendment.
	 */
	public static final MMBusinessAttribute AmendmentIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmendmentOfUndertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmendmentIdentification";
			definition = "Identification of the amendment.";
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
				name = "AmendmentOfUndertaking";
				definition = "Modification of an undertaking such as an guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.UndertakingAmendment);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmendmentOfUndertaking.DateOfIssuance, com.tools20022.repository.entity.AmendmentOfUndertaking.ChangeOfAmount,
						com.tools20022.repository.entity.AmendmentOfUndertaking.Undertaking, com.tools20022.repository.entity.AmendmentOfUndertaking.BeneficiaryConsentRequestIndicator,
						com.tools20022.repository.entity.AmendmentOfUndertaking.AmendmentIdentification);
			}
		});
		return mmObject_lazy.get();
	}
}