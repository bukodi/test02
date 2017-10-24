package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BalanceTypeCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ProcessingTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Numerical representation of the net increases and decreases in an account at
 * a specific point in time.
 */
public class Balance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the nature of a balance.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Balance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the nature of a balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceTypeCode.mmObject();
		}
	};
	/**
	 * Date and time at which the balance is or will be available.
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Balance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date and time at which the balance is or will be available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether the balance is a credit or a debit balance. A zero
	 * balance is considered to be a credit balance
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Balance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the balance is a credit or a debit balance. A zero balance is considered to be a credit balance";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Specifies in terms of value and quantity the assets held in a balance.
	 */
	public static final MMBusinessAssociationEnd AssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Balance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetHolding";
			definition = "Specifies in terms of value and quantity the assets held in a balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	/**
	 * Specifies the date and time at which the balance is calculated.
	 */
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Balance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Specifies the date and time at which the balance is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the balance adjustments.
	 */
	public static final MMBusinessAssociationEnd Adjustment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Balance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the balance adjustments.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.AdjustedBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	/**
	 * Account or sub-account for which a balance is calculated.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Balance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account or sub-account for which a balance is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	/**
	 * Set of elements used to provide interest information that applies to the
	 * balance.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Balance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Set of elements used to provide interest information that applies to the balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.AccountBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	/**
	 * Credit or debit postings used to calculate a balance.
	 */
	public static final MMBusinessAssociationEnd BalanceEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Balance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceEntry";
			definition = "Credit or debit postings used to calculate a balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Entry.mmObject();
		}
	};
	/**
	 * Specifies the type of balance processing restrictions that must be
	 * applied.
	 */
	public static final MMBusinessAttribute ProcessingRestriction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Balance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingRestriction";
			definition = "Specifies the type of balance processing restrictions that must be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProcessingTypeCode.mmObject();
		}
	};
	/**
	 * Specifies whether the balance is an opening or a closing one.
	 */
	public static final MMBusinessAttribute OpeningClosingCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Balance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningClosingCode";
			definition = "Specifies whether the balance is an opening or a closing one.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.codeset.OpeningClosingCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Balance";
				definition = "Numerical representation of the net increases and decreases in an account at a specific point in time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.Balance, com.tools20022.repository.entity.Adjustment.AdjustedBalance, com.tools20022.repository.entity.Entry.Balance,
						com.tools20022.repository.entity.AssetHolding.Balance, com.tools20022.repository.entity.Interest.AccountBalance);
				subType_lazy = () -> Arrays.asList(CashBalance.mmObject(), SecuritiesBalance.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Balance.Type, com.tools20022.repository.entity.Balance.ValueDate, com.tools20022.repository.entity.Balance.CreditDebitIndicator,
						com.tools20022.repository.entity.Balance.AssetHolding, com.tools20022.repository.entity.Balance.CalculationDate, com.tools20022.repository.entity.Balance.Adjustment, com.tools20022.repository.entity.Balance.Account,
						com.tools20022.repository.entity.Balance.Interest, com.tools20022.repository.entity.Balance.BalanceEntry, com.tools20022.repository.entity.Balance.ProcessingRestriction,
						com.tools20022.repository.entity.Balance.OpeningClosingCode);
			}
		});
		return mmObject_lazy.get();
	}
}