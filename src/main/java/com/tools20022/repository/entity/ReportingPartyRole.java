package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party responsible for providing regulatory reports.
 */
public class ReportingPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Report provided by the reporting party.
	 */
	public static final MMBusinessAssociationEnd RegulatoryReport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReportingPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegulatoryReport";
			definition = "Report provided by the reporting party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.ReportingPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReportingPartyRole";
				definition = "Party responsible for providing regulatory reports.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryReport.ReportingPartyRole);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingPartyRole.RegulatoryReport);
			}
		});
		return mmObject_lazy.get();
	}
}