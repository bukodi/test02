package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BorrowingReasonCode;
import com.tools20022.repository.codeset.LendingTransactionMethodCode;
import com.tools20022.repository.codeset.ReversibleCode;
import com.tools20022.repository.codeset.SecuritiesLendingTypeCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesFinancing;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Lending of securities by one party to another. The terms of the loan are
 * governed by an agreement that requires the borrower to provide the lender
 * with collateral of value equal to or greater than the loaned securities. As
 * payment for the loan, the parties negotiate a fee, quoted as an annualised
 * percentage of the value of the loaned securities.
 */
public class SecuritiesLending extends SecuritiesFinancing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount to be paid by the borrower to the lender for the securities
	 * borrowed calculated based on the bond loan rate.
	 */
	public static final MMBusinessAttribute BorrowingFee = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BorrowingFee";
			definition = "Amount to be paid by the borrower to the lender for the securities borrowed calculated based on the bond loan rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether the trade is callable or not.
	 */
	public static final MMBusinessAttribute CallableTradeIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallableTradeIndicator";
			definition = "Indicates whether the trade is callable or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Method applied to a lending transaction.
	 */
	public static final MMBusinessAttribute LendingTransactionMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LendingTransactionMethod";
			definition = "Method applied to a lending transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LendingTransactionMethodCode.mmObject();
		}
	};
	/**
	 * Underlying reason for the borrowing, for instance, sale on my behalf or
	 * on behalf of a third party.
	 */
	public static final MMBusinessAttribute BorrowingReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BorrowingReason";
			definition = "Underlying reason for the borrowing, for instance, sale on my behalf or on behalf of a third party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BorrowingReasonCode.mmObject();
		}
	};
	/**
	 * Indicates the possibility to terminate the securitiesc lending contract
	 * either by the borrower or lender before the expiration date.
	 */
	public static final MMBusinessAttribute Reversible = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reversible";
			definition = "Indicates the possibility to terminate the securitiesc lending contract either by the borrower or lender before the expiration date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReversibleCode.mmObject();
		}
	};
	/**
	 * Type of securities lending.
	 */
	public static final MMBusinessAttribute SecuritiesLendingType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLendingType";
			definition = "Type of securities lending.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesLendingTypeCode.mmObject();
		}
	};
	/**
	 * Indicates if the contract is with or without an exchange of collateral.
	 */
	public static final MMBusinessAttribute LendingWithCollateral = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LendingWithCollateral";
			definition = "Indicates if the contract is with or without an exchange of collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Minimum date at which the borrower is allowed to give back the
	 * securities.
	 */
	public static final MMBusinessAttribute MinimumDateForCallBack = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumDateForCallBack";
			definition = "Minimum date at which the borrower is allowed to give back the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Number of days the securities are lent or borrowed for a contract which
	 * has an agreed closing date.
	 */
	public static final MMBusinessAttribute NumberOfDaysLendingBorrowing = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfDaysLendingBorrowing";
			definition = "Number of days the securities are lent or borrowed for a contract which has an agreed closing date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4NumericText.mmObject();
		}
	};
	/**
	 * Indicates whether the securities lending fees can be paid periodically or
	 * at the end of the contract.
	 */
	public static final MMBusinessAttribute PeriodicPayment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PeriodicPayment";
			definition = "Indicates whether the securities lending fees can be paid periodically or at the end of the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the contract can be rolled over.
	 */
	public static final MMBusinessAttribute Rollover = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rollover";
			definition = "Indicates that the contract can be rolled over.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Rate paid by the borrower to the lender for the securities borrowed.
	 */
	public static final MMBusinessAttribute BorrowingRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BorrowingRate";
			definition = "Rate paid by the borrower to the lender for the securities borrowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Obligation covered by the lending of securities.
	 */
	public static final MMBusinessAssociationEnd SecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Obligation covered by the lending of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesLending;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesLending";
				definition = "Lending of securities by one party to another. The terms of the loan are governed by an agreement that requires the borrower to provide the lender with collateral of value equal to or greater than the loaned securities. As payment for the loan, the parties negotiate a fee, quoted as an annualised percentage of the value of the loaned securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesLending);
				superType_lazy = () -> SecuritiesFinancing.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesLending.BorrowingFee, com.tools20022.repository.entity.SecuritiesLending.CallableTradeIndicator,
						com.tools20022.repository.entity.SecuritiesLending.LendingTransactionMethod, com.tools20022.repository.entity.SecuritiesLending.BorrowingReason, com.tools20022.repository.entity.SecuritiesLending.Reversible,
						com.tools20022.repository.entity.SecuritiesLending.SecuritiesLendingType, com.tools20022.repository.entity.SecuritiesLending.LendingWithCollateral,
						com.tools20022.repository.entity.SecuritiesLending.MinimumDateForCallBack, com.tools20022.repository.entity.SecuritiesLending.NumberOfDaysLendingBorrowing,
						com.tools20022.repository.entity.SecuritiesLending.PeriodicPayment, com.tools20022.repository.entity.SecuritiesLending.Rollover, com.tools20022.repository.entity.SecuritiesLending.BorrowingRate,
						com.tools20022.repository.entity.SecuritiesLending.SecuritiesDeliveryObligation);
			}
		});
		return mmObject_lazy.get();
	}
}