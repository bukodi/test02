package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExternalUnderlyingTradeTransactionTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reference information on a commercial obligation between the beneficiary and
 * applicant for which an undertaking is issued.
 */
public class UnderlyingTransaction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking issued to support a contract.
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UnderlyingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking issued to support a contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.UnderlyingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	/**
	 * Type of commercial obligation such as a tender, order, contract, etc.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UnderlyingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of commercial obligation such as a tender, order, contract, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUnderlyingTradeTransactionTypeCode.mmObject();
		}
	};
	/**
	 * Identification of the commercial obligation.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UnderlyingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the commercial obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date the commercial obligation was issued or awarded.
	 */
	public static final MMBusinessAttribute IssueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UnderlyingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date the commercial obligation was issued or awarded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date the tender closes.
	 */
	public static final MMBusinessAttribute TenderClosingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UnderlyingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TenderClosingDate";
			definition = "Date the tender closes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Amount of the commercial obligation.
	 */
	public static final MMBusinessAttribute TotalAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UnderlyingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Amount of the commercial obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Percentage of the underlying contract covered by the undertaking.
	 */
	public static final MMBusinessAttribute ContractAmountPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UnderlyingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractAmountPercentage";
			definition = "Percentage of the underlying contract covered by the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Commercial trade for which an undertaking is issued.
	 */
	public static final MMBusinessAssociationEnd CommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UnderlyingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialTrade";
			definition = "Commercial trade for which an undertaking is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.RelatedUndertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction";
				definition = "Reference information on a commercial obligation between the beneficiary and applicant for which an undertaking is issued.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.UnderlyingTransaction, com.tools20022.repository.entity.CommercialTrade.RelatedUndertaking);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UnderlyingTransaction.Undertaking, com.tools20022.repository.entity.UnderlyingTransaction.Type,
						com.tools20022.repository.entity.UnderlyingTransaction.Identification, com.tools20022.repository.entity.UnderlyingTransaction.IssueDate, com.tools20022.repository.entity.UnderlyingTransaction.TenderClosingDate,
						com.tools20022.repository.entity.UnderlyingTransaction.TotalAmount, com.tools20022.repository.entity.UnderlyingTransaction.ContractAmountPercentage,
						com.tools20022.repository.entity.UnderlyingTransaction.CommercialTrade);
			}
		});
		return mmObject_lazy.get();
	}
}