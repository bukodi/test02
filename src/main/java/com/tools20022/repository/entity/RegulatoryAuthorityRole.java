package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.msg.RegulatoryAuthority2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity requiring the regulatory reporting information.
 */
public class RegulatoryAuthorityRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Report which was requested by the regulatory authority.
	 */
	public static final MMBusinessAssociationEnd RegulatoryReport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegulatoryAuthorityRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegulatoryReport";
			definition = "Report which was requested by the regulatory authority.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.Authority;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
		}
	};
	/**
	 * Country for which the regulatory authority operates.
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegulatoryAuthorityRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country for which the regulatory authority operates.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.NationalRegulatoryAuthority;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegulatoryAuthorityRole";
				definition = "Entity requiring the regulatory reporting information.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.NationalRegulatoryAuthority, com.tools20022.repository.entity.RegulatoryReport.Authority);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryAuthorityRole.RegulatoryReport, com.tools20022.repository.entity.RegulatoryAuthorityRole.Country);
				derivationComponent_lazy = () -> Arrays.asList(RegulatoryAuthority2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}