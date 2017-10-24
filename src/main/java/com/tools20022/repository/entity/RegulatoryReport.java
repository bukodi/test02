package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.RegulatoryReportingTypeCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.RegulatoryReporting3;
import com.tools20022.repository.msg.StructuredRegulatoryReporting3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information needed due to regulatory and statutory requirements.
 */
public class RegulatoryReport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies whether the regulatory reporting information applies to the
	 * debit side, to the credit side or to both debit and credit sides of the
	 * transaction.
	 */
	public static final MMBusinessAttribute DebitCreditReportingIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting3.DebitCreditReportingIndicator);
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitCreditReportingIndicator";
			definition = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RegulatoryReportingTypeCode.mmObject();
		}
	};
	/**
	 * Entity requiring the regulatory reporting information.
	 */
	public static final MMBusinessAssociationEnd Authority = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting3.Authority);
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Authority";
			definition = "Entity requiring the regulatory reporting information.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.RegulatoryReport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegulatoryAuthorityRole.mmObject();
		}
	};
	/**
	 * Specifies the nature, purpose, and reason for the transaction to be
	 * reported for regulatory and statutory requirements in a coded form.
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRegulatoryReporting3.Code);
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Specifies the nature, purpose, and reason for the transaction to be reported for regulatory and statutory requirements in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	/**
	 * Amount of money to be reported for regulatory and statutory requirements.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRegulatoryReporting3.Amount);
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money to be reported for regulatory and statutory requirements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Additional details that may be necessary to cater for specific domestic
	 * regulatory requirements.
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRegulatoryReporting3.Information);
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Additional details that may be necessary to cater for specific domestic regulatory requirements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of the information supplied in the regulatory
	 * reporting details.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRegulatoryReporting3.Type);
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the information supplied in the regulatory reporting details.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date related to the specified type of regulatory reporting details.
	 */
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRegulatoryReporting3.Date);
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date related to the specified type of regulatory reporting details.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Trade for which a regulatory report is provided.
	 */
	public static final MMBusinessAssociationEnd ReportedTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedTransaction";
			definition = "Trade for which a regulatory report is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.RegulatoryReport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FinancialTransaction.mmObject();
		}
	};
	/**
	 * Specifies the underlying product type.
	 */
	public static final MMBusinessAttribute UnderlyingProduct = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingProduct";
			definition = "Specifies the underlying product type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies whether the reportable transaction has one or more additional
	 * terms or provisions, other than those listed in the required real-time
	 * data fields, that materially affects the price of the reportable
	 * transaction.
	 */
	public static final MMBusinessAttribute NonStandardFlag = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonStandardFlag";
			definition = "Specifies whether the reportable transaction has one or more additional terms or provisions, other than those listed in the required real-time data fields, that materially affects the price of the reportable transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Party responsible for providing regulatory reports.
	 */
	public static final MMBusinessAssociationEnd ReportingPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingPartyRole";
			definition = "Party responsible for providing regulatory reports.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ReportingPartyRole.RegulatoryReport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReportingPartyRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReport";
				definition = "Information needed due to regulatory and statutory requirements.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryAuthorityRole.RegulatoryReport, com.tools20022.repository.entity.ReportingPartyRole.RegulatoryReport,
						com.tools20022.repository.entity.FinancialTransaction.RegulatoryReport);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting3.Details);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryReport.DebitCreditReportingIndicator, com.tools20022.repository.entity.RegulatoryReport.Authority,
						com.tools20022.repository.entity.RegulatoryReport.Code, com.tools20022.repository.entity.RegulatoryReport.Amount, com.tools20022.repository.entity.RegulatoryReport.Description,
						com.tools20022.repository.entity.RegulatoryReport.Type, com.tools20022.repository.entity.RegulatoryReport.Date, com.tools20022.repository.entity.RegulatoryReport.ReportedTransaction,
						com.tools20022.repository.entity.RegulatoryReport.UnderlyingProduct, com.tools20022.repository.entity.RegulatoryReport.NonStandardFlag, com.tools20022.repository.entity.RegulatoryReport.ReportingPartyRole);
				derivationComponent_lazy = () -> Arrays.asList(StructuredRegulatoryReporting3.mmObject(), RegulatoryReporting3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}