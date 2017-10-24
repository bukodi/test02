package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the origin of cash.
 */
public class SourceOfCashCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Income from a retirement policy.
	 */
	public static final MMCode RetirementPolicy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetirementPolicy";
			definition = "Income from a retirement policy.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "REPY";
		}
	};
	/**
	 * Income from self-employment.
	 */
	public static final MMCode SelfEmploymentIncome = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfEmploymentIncome";
			definition = "Income from self-employment.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "SELF";
		}
	};
	/**
	 * Employee income.
	 */
	public static final MMCode EmployeeIncome = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeIncome";
			definition = "Employee income.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "EMIN";
		}
	};
	/**
	 * Income from a savings plan.
	 */
	public static final MMCode Savings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Savings";
			definition = "Income from a savings plan.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "SVGS";
		}
	};
	/**
	 * Income was a cash gift.
	 */
	public static final MMCode Gift = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gift";
			definition = "Income was a cash gift.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "GIFT";
		}
	};
	/**
	 * Cash from an inheritance.
	 */
	public static final MMCode Inheritance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inheritance";
			definition = "Cash from an inheritance.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "INHE";
		}
	};
	/**
	 * Redemption of an investment fund.
	 */
	public static final MMCode Redemption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			definition = "Redemption of an investment fund.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Income from a cash win.
	 */
	public static final MMCode Winnings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Winnings";
			definition = "Income from a cash win.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "WINS";
		}
	};
	/**
	 * Income from the liquidation of an insurance premium.
	 */
	public static final MMCode InsurancePremiumLiquidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsurancePremiumLiquidation";
			definition = "Income from the liquidation of an insurance premium.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "INLQ";
		}
	};
	/**
	 * Sale of goods.
	 */
	public static final MMCode SaleOfGoods = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfGoods";
			definition = "Sale of goods.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "SALE";
		}
	};
	/**
	 * Income from the sale of real estate.
	 */
	public static final MMCode RealEstateSale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateSale";
			definition = "Income from the sale of real estate.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "REST";
		}
	};
	/**
	 * Sale and acquisition of a corporation.
	 */
	public static final MMCode SaleAquisitionCorporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleAquisitionCorporation";
			definition = "Sale and acquisition of a corporation.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "SEAQ";
		}
	};
	/**
	 * Income is cash proceeds from customers.
	 */
	public static final MMCode CashProceeds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashProceeds";
			definition = "Income is cash proceeds from customers.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Income as a result of alimony.
	 */
	public static final MMCode Alimony = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Alimony";
			definition = "Income as a result of alimony.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "ALMY";
		}
	};
	/**
	 * Income is from compensation received.
	 */
	public static final MMCode Compensation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compensation";
			definition = "Income is from compensation received.";
			owner_lazy = () -> SourceOfCashCode.mmObject();
			codeName = "COMP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SourceOfCashCode";
				definition = "Specifies the origin of cash.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SourceOfCashCode.RetirementPolicy, com.tools20022.repository.codeset.SourceOfCashCode.SelfEmploymentIncome,
						com.tools20022.repository.codeset.SourceOfCashCode.EmployeeIncome, com.tools20022.repository.codeset.SourceOfCashCode.Savings, com.tools20022.repository.codeset.SourceOfCashCode.Gift,
						com.tools20022.repository.codeset.SourceOfCashCode.Inheritance, com.tools20022.repository.codeset.SourceOfCashCode.Redemption, com.tools20022.repository.codeset.SourceOfCashCode.Winnings,
						com.tools20022.repository.codeset.SourceOfCashCode.InsurancePremiumLiquidation, com.tools20022.repository.codeset.SourceOfCashCode.SaleOfGoods, com.tools20022.repository.codeset.SourceOfCashCode.RealEstateSale,
						com.tools20022.repository.codeset.SourceOfCashCode.SaleAquisitionCorporation, com.tools20022.repository.codeset.SourceOfCashCode.CashProceeds, com.tools20022.repository.codeset.SourceOfCashCode.Alimony,
						com.tools20022.repository.codeset.SourceOfCashCode.Compensation);
			}
		});
		return mmObject_lazy.get();
	}
}