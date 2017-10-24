package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FATCASourceStatusCode;
import com.tools20022.repository.codeset.FATCAStatusCode;
import com.tools20022.repository.datatype.ISODate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Foreign Account Tax Compliance Act (FATCA) status and the status source of
 * the investor.
 */
public class FATCAStatus {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Foreign Account Tax Compliance Act (FATCA) status of the investor.
	 */
	public static final MMBusinessAttribute FATCAStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FATCAStatusCode.mmObject();
		}
	};
	/**
	 * Source of the Foreign Account Tax Compliance Act (FATCA) status.
	 */
	public static final MMBusinessAttribute FATCASourceStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCASourceStatus";
			definition = "Source of the Foreign Account Tax Compliance Act (FATCA) status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FATCASourceStatusCode.mmObject();
		}
	};
	/**
	 * Foreign Account Tax Compliance Act (FATCA) status linked to an investment
	 * account and played by a party in that context.
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountParty";
			definition = "Foreign Account Tax Compliance Act (FATCA) status linked to an investment account and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.FATCAStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccountPartyRole.mmObject();
		}
	};
	/**
	 * Date provided by the account owner to inform the account servicer of the
	 * date on which the holdings must be reported before the account is
	 * subsequently closed.
	 */
	public static final MMBusinessAttribute FATCAReportingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCAReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FATCAStatus";
				definition = "Foreign Account Tax Compliance Act (FATCA) status and the status source of the investor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountPartyRole.FATCAStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FATCAStatus.FATCAStatus, com.tools20022.repository.entity.FATCAStatus.FATCASourceStatus,
						com.tools20022.repository.entity.FATCAStatus.InvestmentAccountParty, com.tools20022.repository.entity.FATCAStatus.FATCAReportingDate);
			}
		});
		return mmObject_lazy.get();
	}
}