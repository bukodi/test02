package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CorporateActionChangeTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Modification of the reference data of a security or of the organisation that
 * issued it.
 */
public class SecuritiesModification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of changes affecting the security form.
	 */
	public static final MMBusinessAttribute ChangeType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChangeType";
			definition = "Type of changes affecting the security form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionChangeTypeCode.mmObject();
		}
	};
	/**
	 * New name of a company following a name change.
	 */
	public static final MMBusinessAssociationEnd NewOrganisationInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewOrganisationInformation";
			definition = "New name of a company following a name change.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.SecuritiesModification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Organisation.mmObject();
		}
	};
	/**
	 * Specifies the parameters of the event related to the modification of the
	 * securities.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Specifies the parameters of the event related to the modification of the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.SecuritiesModification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Specifies the updated information of the new security.
	 */
	public static final MMBusinessAssociationEnd NewSecurityReferenceData = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewSecurityReferenceData";
			definition = "Specifies the updated information of the new security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Modification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};
	/**
	 * The number of shares the issuer is creating as part of the event
	 */
	public static final MMBusinessAttribute NumberOfSharesIssued = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfSharesIssued";
			definition = "The number of shares the issuer is creating as part of the event";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Date/time at which the securities to be reorganised will cease to be
	 * tradeable.
	 */
	public static final MMBusinessAttribute LastTradingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LastTradingDate";
			definition = "Date/time at which the securities to be reorganised will cease to be tradeable.";
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
				name = "SecuritiesModification";
				definition = "Modification of the reference data of a security or of the organisation that issued it.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Modification, com.tools20022.repository.entity.Organisation.SecuritiesModification,
						com.tools20022.repository.entity.CorporateActionEvent.SecuritiesModification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesModification.ChangeType, com.tools20022.repository.entity.SecuritiesModification.NewOrganisationInformation,
						com.tools20022.repository.entity.SecuritiesModification.RelatedCorporateEvent, com.tools20022.repository.entity.SecuritiesModification.NewSecurityReferenceData,
						com.tools20022.repository.entity.SecuritiesModification.NumberOfSharesIssued, com.tools20022.repository.entity.SecuritiesModification.LastTradingDate);
			}
		});
		return mmObject_lazy.get();
	}
}