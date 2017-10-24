package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.AgreementFrameworkCode;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.Agreement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement which defines the framework of a contract between two trading
 * parties in different domains such as collateral, derivatives, trade..
 */
public class MasterAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Collateral agreement which is governed by the related master agreement.
	 */
	public static final MMBusinessAssociationEnd CollateralAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MasterAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAgreement";
			definition = "Collateral agreement which is governed by the related master agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.AssociatedMasterAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
		}
	};
	/**
	 * Nature of the agreement, eg, ISDA Master Agreement or bilateral
	 * agreement.
	 */
	public static final MMBusinessAttribute MasterAgreementType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MasterAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MasterAgreementType";
			definition = "Nature of the agreement, eg, ISDA Master Agreement or bilateral agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AgreementFrameworkCode.mmObject();
		}
	};
	/**
	 * Trades to which the master agreement applies.
	 */
	public static final MMBusinessAssociationEnd GovernedTrades = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MasterAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernedTrades";
			definition = "Trades to which the master agreement applies.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.GoverningDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	/**
	 * Contract which is governed by the master agreement.
	 */
	public static final MMBusinessAssociationEnd GovernedContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MasterAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernedContract";
			definition = "Contract which is governed by the master agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Contract.MasterAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Contract.mmObject();
		}
	};
	/**
	 * National law under which a non-deliverable contract has been agreed.
	 */
	public static final MMBusinessAttribute GoverningLaw = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MasterAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoverningLaw";
			definition = "National law under which a non-deliverable contract has been agreed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MasterAgreement";
				definition = "Agreement which defines the framework of a contract between two trading parties in different domains such as collateral, derivatives, trade..";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.GoverningDocument, com.tools20022.repository.entity.Contract.MasterAgreement,
						com.tools20022.repository.entity.CollateralAgreement.AssociatedMasterAgreement);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MasterAgreement.CollateralAgreement, com.tools20022.repository.entity.MasterAgreement.MasterAgreementType,
						com.tools20022.repository.entity.MasterAgreement.GovernedTrades, com.tools20022.repository.entity.MasterAgreement.GovernedContract, com.tools20022.repository.entity.MasterAgreement.GoverningLaw);
			}
		});
		return mmObject_lazy.get();
	}
}