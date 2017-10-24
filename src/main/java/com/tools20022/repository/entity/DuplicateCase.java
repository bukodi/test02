package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.InvestigationResolution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Outcome that results in closing a case as duplicate because the same issue
 * has been reported by another party.
 */
public class DuplicateCase extends InvestigationResolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the original case.
	 */
	public static final MMBusinessAssociationEnd DuplicatedCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DuplicateCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DuplicatedCase";
			definition = "Identifies the original case.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.DuplicateCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
		}
	};
	/**
	 * Investigation case information which is duplicate.
	 */
	public static final MMBusinessAssociationEnd RelatedCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DuplicateCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCaseResolution";
			definition = "Investigation case information which is duplicate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.DuplicateCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DuplicateCase";
				definition = "Outcome that results in closing a case as duplicate because the same issue has been reported by another party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCase.DuplicateCaseResolution, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.DuplicateCase);
				superType_lazy = () -> InvestigationResolution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DuplicateCase.DuplicatedCase, com.tools20022.repository.entity.DuplicateCase.RelatedCaseResolution);
			}
		});
		return mmObject_lazy.get();
	}
}