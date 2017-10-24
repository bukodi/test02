package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BatchTransactionTypeCode;
import com.tools20022.repository.codeset.ExchangePolicyCode;
import com.tools20022.repository.codeset.FinancialCaptureCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Acceptor parameters to be downloaded from the terminal management system.
 */
public class AcceptorConfiguration {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of the payment application.
	 */
	public static final MMBusinessAttribute ApplicationIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Mode for the financial capture of the transaction by the acquirer.
	 */
	public static final MMBusinessAttribute FinancialCapture = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialCapture";
			definition = "Mode for the financial capture of the transaction by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCaptureCode.mmObject();
		}
	};
	/**
	 * Types of transaction to include in the batch.
	 */
	public static final MMBusinessAttribute BatchTransferContent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BatchTransactionTypeCode.mmObject();
		}
	};
	/**
	 * Exchange policy between parties.
	 */
	public static final MMBusinessAttribute ExchangePolicy = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangePolicy";
			definition = "Exchange policy between parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangePolicyCode.mmObject();
		}
	};
	/**
	 * Maximum number of transactions without exchange.
	 */
	public static final MMBusinessAttribute MaximumNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of transactions without exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Maximum cumulative amount of the transactions without exchange.
	 */
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum cumulative amount of the transactions without exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates the reconciliation period is assigned by the acquirer instead
	 * of the acceptor.
	 */
	public static final MMBusinessAttribute ReconciliationByAcquirer = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates the reconciliation total amounts are computed per currency.
	 */
	public static final MMBusinessAttribute TotalsPerCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicator to require protection of sensitive card data in messages.
	 */
	public static final MMBusinessAttribute ProtectCardData = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Acceptor parameters dedicated to the retailer.
	 */
	public static final MMBusinessAttribute RetailerParameters = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RetailerParameters";
			definition = "Acceptor parameters dedicated to the retailer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	/**
	 * Configuration parameters attached to the payment application.
	 */
	public static final MMBusinessAttribute ApplicationParameters = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Configuration parameters attached to the payment application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	/**
	 * Terminal management system for which an acceptor configuration is
	 * provided.
	 */
	public static final MMBusinessAssociationEnd TerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system for which an acceptor configuration is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.AcceptorConfiguration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
		}
	};
	/**
	 * Version of the application.
	 */
	public static final MMBusinessAttribute ApplicationVersion = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationVersion";
			definition = "Version of the application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfiguration";
				definition = "Acceptor parameters to be downloaded from the terminal management system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.AcceptorConfiguration);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AcceptorConfiguration.ApplicationIdentification, com.tools20022.repository.entity.AcceptorConfiguration.FinancialCapture,
						com.tools20022.repository.entity.AcceptorConfiguration.BatchTransferContent, com.tools20022.repository.entity.AcceptorConfiguration.ExchangePolicy,
						com.tools20022.repository.entity.AcceptorConfiguration.MaximumNumber, com.tools20022.repository.entity.AcceptorConfiguration.MaximumAmount,
						com.tools20022.repository.entity.AcceptorConfiguration.ReconciliationByAcquirer, com.tools20022.repository.entity.AcceptorConfiguration.TotalsPerCurrency,
						com.tools20022.repository.entity.AcceptorConfiguration.ProtectCardData, com.tools20022.repository.entity.AcceptorConfiguration.RetailerParameters,
						com.tools20022.repository.entity.AcceptorConfiguration.ApplicationParameters, com.tools20022.repository.entity.AcceptorConfiguration.TerminalManagementSystem,
						com.tools20022.repository.entity.AcceptorConfiguration.ApplicationVersion);
			}
		});
		return mmObject_lazy.get();
	}
}