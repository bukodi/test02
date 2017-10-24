package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of activities performed to handle an exception to a normal transaction
 * flow..
 */
public class InvestigationCase {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Uniquely identifies the case assignment.
	 */
	public static final MMBusinessAttribute AssignmentIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssignmentIdentification";
			definition = "Uniquely identifies the case assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Creation date and time of the case.
	 */
	public static final MMBusinessAttribute CreationDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreationDateTime";
			definition = "Creation date and time of the case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Uniquely identifies the case.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the status of the case together with the reason and the date
	 * and time.
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the case together with the reason and the date and time.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCaseStatus.InvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestigationCaseStatus.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of an investigation process.
	 */
	public static final MMBusinessAssociationEnd InvestigationPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationPartyRole";
			definition = "Role played by a party in the context of an investigation process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.InvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.mmObject();
		}
	};
	/**
	 * Solution which consists in closing the case as it is a duplicate of an
	 * original one.
	 */
	public static final MMBusinessAssociationEnd DuplicateCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DuplicateCaseResolution";
			definition = "Solution which consists in closing the case as it is a duplicate of an original one.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DuplicateCase.DuplicatedCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DuplicateCase.mmObject();
		}
	};
	/**
	 * Specifies the actions taken as a result of an investigation.
	 */
	public static final MMBusinessAssociationEnd InvestigationResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationResolution";
			definition = "Specifies the actions taken as a result of an investigation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationResolution.InvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationResolution.mmObject();
		}
	};
	/**
	 * Original case to which another one is linked.
	 */
	public static final MMBusinessAssociationEnd OriginalInvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalInvestigationCase";
			definition = "Original case to which another one is linked.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.LinkedCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestigationCase.mmObject();
		}
	};
	/**
	 * Step in the resolution process of an investigation case. The assigned
	 * case is linked to the investigation case in the previous step.
	 */
	public static final MMBusinessAssociationEnd LinkedCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LinkedCase";
			definition = "Step in the resolution process of an investigation case. The assigned case is linked to the investigation case in the previous step.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.OriginalInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestigationCase.mmObject();
		}
	};
	/**
	 * Action which is taken to forward the case to another party.
	 */
	public static final MMBusinessAssociationEnd Reassignment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reassignment";
			definition = "Action which is taken to forward the case to another party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reassignment.ReassignedCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reassignment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestigationCase";
				definition = "Set of activities performed to handle an exception to a normal transaction flow..";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationPartyRole.InvestigationCase, com.tools20022.repository.entity.InvestigationCase.OriginalInvestigationCase,
						com.tools20022.repository.entity.InvestigationCase.LinkedCase, com.tools20022.repository.entity.InvestigationResolution.InvestigationCase, com.tools20022.repository.entity.Reassignment.ReassignedCase,
						com.tools20022.repository.entity.InvestigationCaseStatus.InvestigationCase, com.tools20022.repository.entity.DuplicateCase.DuplicatedCase);
				subType_lazy = () -> Arrays.asList(PaymentInvestigationCase.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCase.AssignmentIdentification, com.tools20022.repository.entity.InvestigationCase.CreationDateTime,
						com.tools20022.repository.entity.InvestigationCase.Identification, com.tools20022.repository.entity.InvestigationCase.Status, com.tools20022.repository.entity.InvestigationCase.InvestigationPartyRole,
						com.tools20022.repository.entity.InvestigationCase.DuplicateCaseResolution, com.tools20022.repository.entity.InvestigationCase.InvestigationResolution,
						com.tools20022.repository.entity.InvestigationCase.OriginalInvestigationCase, com.tools20022.repository.entity.InvestigationCase.LinkedCase, com.tools20022.repository.entity.InvestigationCase.Reassignment);
			}
		});
		return mmObject_lazy.get();
	}
}