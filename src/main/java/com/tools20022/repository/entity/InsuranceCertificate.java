package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.InsuranceClausesCode;
import com.tools20022.repository.codeset.InsuranceCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Formal document used to record a fact and used as proof of the fact that
 * goods have been insured under an insurance policy.
 */
public class InsuranceCertificate extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date upon which cover under an insurance policy becomes effective.
	 */
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date upon which cover under an insurance policy becomes effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Value of the goods as insured under the insurance policy.
	 */
	public static final MMBusinessAttribute InsuredAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuredAmount";
			definition = "Value of the goods as insured under the insurance policy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Description of the conditions and exclusion clauses under which insurance
	 * is granted.
	 */
	public static final MMBusinessAttribute InsuranceConditions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuranceConditions";
			definition = "Description of the conditions and exclusion clauses under which insurance is granted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Standard insurance clauses defined by the Institute of London
	 * Underwriters (or the American Institute of marine Underwriters).
	 */
	public static final MMBusinessAttribute InsuranceClauses = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuranceClauses";
			definition = "Standard insurance clauses defined by the Institute of London Underwriters (or the American Institute of marine Underwriters).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InsuranceClausesCode.mmObject();
		}
	};
	/**
	 * Place where claims under the insurance policy will be paid.
	 */
	public static final MMBusinessAssociationEnd ClaimsPayableAt = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClaimsPayableAt";
			definition = "Place where claims under the insurance policy will be paid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.InsuranceCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}
	};
	/**
	 * Currency in which claims, if valid, will be paid.
	 */
	public static final MMBusinessAttribute ClaimsPayableIn = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClaimsPayableIn";
			definition = "Currency in which claims, if valid, will be paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of insurance.
	 */
	public static final MMBusinessAssociationEnd InsurancePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsurancePartyRole";
			definition = "Role played by a party in the context of insurance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InsurancePartyRole.InsuranceCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InsurancePartyRole.mmObject();
		}
	};
	/**
	 * Delivery parameters of a trade.
	 */
	public static final MMBusinessAssociationEnd ProductDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Delivery parameters of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.InsuranceCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};
	/**
	 * Specifies the type of insurance.
	 */
	public static final MMBusinessAttribute InsuranceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuranceType";
			definition = "Specifies the type of insurance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InsuranceCode.mmObject();
		}
	};
	/**
	 * Investment plan covered by an insurance contract.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentPlan";
			definition = "Investment plan covered by an insurance contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.Insurance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentPlan.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InsuranceCertificate";
				definition = "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.InsuranceCertificate, com.tools20022.repository.entity.InvestmentPlan.Insurance,
						com.tools20022.repository.entity.ProductDelivery.InsuranceCertificate, com.tools20022.repository.entity.InsurancePartyRole.InsuranceCertificate);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.InsuranceCertificate.EffectiveDate, com.tools20022.repository.entity.InsuranceCertificate.InsuredAmount,
								com.tools20022.repository.entity.InsuranceCertificate.InsuranceConditions, com.tools20022.repository.entity.InsuranceCertificate.InsuranceClauses,
								com.tools20022.repository.entity.InsuranceCertificate.ClaimsPayableAt, com.tools20022.repository.entity.InsuranceCertificate.ClaimsPayableIn,
								com.tools20022.repository.entity.InsuranceCertificate.InsurancePartyRole, com.tools20022.repository.entity.InsuranceCertificate.ProductDelivery,
								com.tools20022.repository.entity.InsuranceCertificate.InsuranceType, com.tools20022.repository.entity.InsuranceCertificate.RelatedInvestmentPlan);
			}
		});
		return mmObject_lazy.get();
	}
}