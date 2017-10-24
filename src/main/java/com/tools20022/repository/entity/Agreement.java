package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contractual details related to an agreement between parties.
 */
public class Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which the agreement was signed by all parties.
	 */
	public static final MMBusinessAttribute DateSigned = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.DateOfSignature);
			isDerived = false;
			elementContext_lazy = () -> Agreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateSigned";
			definition = "Date on which the agreement was signed by all parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Full name of an agreement, annexes and amendments in place between the
	 * principals.
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.Reason, com.tools20022.repository.msg.Mandate9.Reason, com.tools20022.repository.msg.MandateRelatedInformation11.Reason,
					com.tools20022.repository.msg.Mandate11.Reason, com.tools20022.repository.msg.Mandate8.Reason, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalReason);
			isDerived = false;
			elementContext_lazy = () -> Agreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Full name of an agreement, annexes and amendments in place between the principals.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Version number of a contract or of a legal agreement.
	 */
	public static final MMBusinessAttribute Version = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Agreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Version";
			definition = "Version number of a contract or of a  legal agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Period during which the agreement is valid
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateOccurrences4.Duration);
			isDerived = false;
			elementContext_lazy = () -> Agreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period during which the agreement is valid";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Document which materialises the agreement.
	 */
	public static final MMBusinessAssociationEnd Document = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.ReferredDocument, com.tools20022.repository.msg.Mandate9.ReferredDocument, com.tools20022.repository.msg.Mandate11.ReferredDocument,
					com.tools20022.repository.msg.Mandate8.ReferredDocument);
			isDerived = false;
			elementContext_lazy = () -> Agreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document which materialises the agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.Agreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	/**
	 * Specifies the type of trade that is the subject of an agreement. The
	 * agreement contains the clauses that will govern each trade between the
	 * signing parties.
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Agreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Specifies the type of trade that is the subject of an agreement. The agreement contains the clauses that will govern each trade between the signing parties.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.Agreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CommercialTrade.mmObject();
		}
	};
	/**
	 * Jurisdiction where an agreement applies.
	 */
	public static final MMBusinessAssociationEnd Jurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Agreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction where an agreement applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.RelatedAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Agreement";
				definition = "Contractual details related to an agreement between parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedAgreement, com.tools20022.repository.entity.Document.Agreement,
						com.tools20022.repository.entity.Jurisdiction.RelatedAgreement, com.tools20022.repository.entity.CommercialTrade.Agreement);
				subType_lazy = () -> Arrays.asList(Contract.mmObject(), SecuritiesFinancingAgreement.mmObject(), CollateralAgreement.mmObject(), MasterAgreement.mmObject(), InvoiceFinancingAgreement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Agreement.DateSigned, com.tools20022.repository.entity.Agreement.Description, com.tools20022.repository.entity.Agreement.Version,
						com.tools20022.repository.entity.Agreement.ValidityPeriod, com.tools20022.repository.entity.Agreement.Document, com.tools20022.repository.entity.Agreement.Trade,
						com.tools20022.repository.entity.Agreement.Jurisdiction);
			}
		});
		return mmObject_lazy.get();
	}
}