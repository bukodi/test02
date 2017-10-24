package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.CRSSourceStatusCode;
import com.tools20022.repository.codeset.CRSStatusCode;
import com.tools20022.repository.datatype.ISODate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Common Reporting Standard (CRS) status and the status source of the investor.
 */
public class CRSStatus {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Common Reporting Standard (CRS) status of the investor.
	 */
	public static final MMBusinessAttribute CRSStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CRSStatus";
			definition = "Common Reporting Standard (CRS) status of the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CRSStatusCode.mmObject();
		}
	};
	/**
	 * Reporting country for the CRS status when there is an exception at the
	 * country level.
	 */
	public static final MMBusinessAttribute ExceptionalReportingCountry = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalReportingCountry";
			definition = "Reporting country for the CRS status when there is an exception at the country level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Source of the Common Reporting Standard (CRS) status expressed as a code.
	 */
	public static final MMBusinessAttribute CRSSourceStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRSSourceStatus";
			definition = "Source of the Common Reporting Standard (CRS) status expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CRSSourceStatusCode.mmObject();
		}
	};
	/**
	 * Date provided by the account owner to inform the account servicer of the
	 * date on which the holdings must be reported before the account is
	 * subsequently closed.
	 */
	public static final MMBusinessAttribute CRSReportingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CRSReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Common Reporting Standard (CRS) status linked to an investment account
	 * and played by a party in that context.
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountParty";
			definition = "Common Reporting Standard (CRS) status linked to an investment account and played by a party in that context.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.CRSStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccountPartyRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CRSStatus";
				definition = "Common Reporting Standard (CRS) status and the status source of the investor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountPartyRole.CRSStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CRSStatus.CRSStatus, com.tools20022.repository.entity.CRSStatus.ExceptionalReportingCountry, com.tools20022.repository.entity.CRSStatus.CRSSourceStatus,
						com.tools20022.repository.entity.CRSStatus.CRSReportingDate, com.tools20022.repository.entity.CRSStatus.InvestmentAccountParty);
			}
		});
		return mmObject_lazy.get();
	}
}