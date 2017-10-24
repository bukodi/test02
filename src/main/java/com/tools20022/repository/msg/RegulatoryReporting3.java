package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.RegulatoryReportingType1Code;
import com.tools20022.repository.entity.RegulatoryReport;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information needed due to regulatory and/or statutory requirements.
 */
public class RegulatoryReporting3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies whether the regulatory reporting information applies to the
	 * debit side, to the credit side or to both debit and credit sides of the
	 * transaction.
	 */
	public static final MMMessageAttribute DebitCreditReportingIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.DebitCreditReportingIndicator;
			componentContext_lazy = () -> RegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "DbtCdtRptgInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCreditReportingIndicator";
			definition = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RegulatoryReportingType1Code.mmObject();
		}
	};
	/**
	 * Entity requiring the regulatory reporting information.
	 */
	public static final MMMessageAssociationEnd Authority = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.Authority;
			componentContext_lazy = () -> RegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "Authrty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authority";
			definition = "Entity requiring the regulatory reporting information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RegulatoryAuthority2.mmObject();
		}
	};
	/**
	 * Set of elements used to provide details on the regulatory reporting
	 * information.
	 */
	public static final MMMessageAssociationEnd Details = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RegulatoryReport.mmObject();
			componentContext_lazy = () -> RegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "Dtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Details";
			definition = "Set of elements used to provide details on the regulatory reporting information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StructuredRegulatoryReporting3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting3.DebitCreditReportingIndicator, com.tools20022.repository.msg.RegulatoryReporting3.Authority,
						com.tools20022.repository.msg.RegulatoryReporting3.Details);
				trace_lazy = () -> RegulatoryReport.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReporting3";
				definition = "Information needed due to regulatory and/or statutory requirements.";
			}
		});
		return mmObject_lazy.get();
	}
}