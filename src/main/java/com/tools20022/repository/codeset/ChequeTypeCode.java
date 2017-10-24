package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of cheque.
 */
public class ChequeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cheque that must be paid into an account and not cashed over the counter.
	 * There are two parallel lines across the face of a crossed cheque.
	 */
	public static final MMCode CrossedCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossedCheque";
			definition = "Cheque that must be paid into an account and not cashed over the counter. There are two parallel lines across the face of a crossed cheque.";
			owner_lazy = () -> ChequeTypeCode.mmObject();
			codeName = "CRCQ";
		}
	};
	/**
	 * Cheque that may only be cashed at the bank of origin.
	 */
	public static final MMCode OpenCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpenCheque";
			definition = "Cheque that may only be cashed at the bank of origin.";
			owner_lazy = () -> ChequeTypeCode.mmObject();
			codeName = "OPCQ";
		}
	};
	/**
	 * Cheque made payable to a named recipient 'or order'. The payee can either
	 * deposit the cheque in an account or endorse it to a third party.
	 */
	public static final MMCode OrderCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderCheque";
			definition = "Cheque made payable to a named recipient 'or order'.  The payee can either deposit the cheque in an account or endorse it to a third party.";
			owner_lazy = () -> ChequeTypeCode.mmObject();
			codeName = "ORCQ";
		}
	};
	/**
	 * An instruction from a bank to its correspondent bank to pay the creditor
	 * a stated sum upon the presentation of a means of identification.
	 */
	public static final MMCode CircularCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CircularCheque";
			definition = "An instruction from a bank to its correspondent bank to pay the creditor a stated sum upon the presentation of a means of identification.";
			owner_lazy = () -> ChequeTypeCode.mmObject();
			codeName = "CLCQ";
		}
	};
	/**
	 * Cheque drawn by a bank on itself or its agent. A person who owes money to
	 * another buys the draft from a bank for cash and hands it to the creditor
	 * who need have no fear that it might be dishonoured. A bank draft is also
	 * called a banker's cheque, banker's draft, bank check, or treasurer's
	 * check.
	 */
	public static final MMCode BankDraft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankDraft";
			definition = "Cheque drawn by a bank on itself or its agent. A person who owes money to another buys the draft from a bank for cash and hands it to the creditor who need have no fear that it might be dishonoured. A bank draft is also called a banker's cheque, banker's draft, bank check, or treasurer's check.";
			owner_lazy = () -> ChequeTypeCode.mmObject();
			codeName = "BKDF";
		}
	};
	/**
	 * Cheque drawn on the account of the debtor, and debited on the debtor's
	 * account when the cheque is cashed. Synonym is 'corporate cheque'.
	 */
	public static final MMCode CustomerCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerCheque";
			definition = "Cheque drawn on the account of the debtor, and debited on the debtor's account when the cheque is cashed. Synonym is 'corporate cheque'.";
			owner_lazy = () -> ChequeTypeCode.mmObject();
			codeName = "CCHQ";
		}
	};
	/**
	 * Cheque drawn on the account of the debtor, and debited on the debtor's
	 * account when the cheque is cashed. The financial institution prints and
	 * certifies the cheque, guaranteeing the payment.
	 */
	public static final MMCode CertifiedCustomerCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertifiedCustomerCheque";
			definition = "Cheque drawn on the account of the debtor, and debited on the debtor's account when the cheque is cashed. The financial institution prints and certifies the cheque, guaranteeing the payment.";
			owner_lazy = () -> ChequeTypeCode.mmObject();
			codeName = "CCCH";
		}
	};
	/**
	 * Cheque drawn on the account of the debtor's financial institution, which
	 * is debited on the debtor's account when the cheque is issued.These
	 * cheques are printed by the debtor's financial institution and payment is
	 * guaranteed by the financial institution. Synonym is 'cashier's cheque'.
	 */
	public static final MMCode BankCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankCheque";
			definition = "Cheque drawn on the account of the debtor's financial institution, which is debited on the debtor's account when the cheque is issued.These cheques are printed by the debtor's financial institution and payment is guaranteed by the financial institution. Synonym is 'cashier's cheque'.";
			owner_lazy = () -> ChequeTypeCode.mmObject();
			codeName = "BCHQ";
		}
	};
	/**
	 * A guaranteed bank cheque with a future value date (do not pay before],
	 * which in commercial terms is a 'negotiatable instrument': the beneficiary
	 * can receive early payment from any bank under subtraction of a discount.
	 * The ordering customer's account is debited on value date.
	 */
	public static final MMCode Draft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Draft";
			definition = "A guaranteed bank cheque with a future value date (do not pay before], which in commercial terms is a 'negotiatable instrument': the beneficiary can receive early payment from any bank under subtraction of a discount. The ordering customer's account is debited on value date.";
			owner_lazy = () -> ChequeTypeCode.mmObject();
			codeName = "DRFT";
		}
	};
	/**
	 * An instrument with a future value date (do not pay before], which in
	 * commercial terms is a 'negotiatable instrument': the beneficiary can
	 * receive early payment from any bank under subtraction of a discount. The
	 * ordering customer's account is debited on value date.
	 */
	public static final MMCode ElectronicDraft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicDraft";
			definition = "An instrument with a future value date (do not pay before], which in commercial terms is a 'negotiatable instrument': the beneficiary can receive early payment from any bank under subtraction of a discount. The ordering customer's account is debited on value date.";
			owner_lazy = () -> ChequeTypeCode.mmObject();
			codeName = "ELDR";
		}
	};
	/**
	 * Cheque intiated or completed through an online service.
	 */
	public static final MMCode OnlineCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlineCheque";
			definition = "Cheque intiated or completed through an online service.";
			owner_lazy = () -> ChequeTypeCode.mmObject();
			codeName = "OCHQ";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CRCQ");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChequeTypeCode";
				definition = "Specifies the type of cheque.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChequeTypeCode.CrossedCheque, com.tools20022.repository.codeset.ChequeTypeCode.OpenCheque, com.tools20022.repository.codeset.ChequeTypeCode.OrderCheque,
						com.tools20022.repository.codeset.ChequeTypeCode.CircularCheque, com.tools20022.repository.codeset.ChequeTypeCode.BankDraft, com.tools20022.repository.codeset.ChequeTypeCode.CustomerCheque,
						com.tools20022.repository.codeset.ChequeTypeCode.CertifiedCustomerCheque, com.tools20022.repository.codeset.ChequeTypeCode.BankCheque, com.tools20022.repository.codeset.ChequeTypeCode.Draft,
						com.tools20022.repository.codeset.ChequeTypeCode.ElectronicDraft, com.tools20022.repository.codeset.ChequeTypeCode.OnlineCheque);
				derivation_lazy = () -> Arrays.asList(ChequeType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}