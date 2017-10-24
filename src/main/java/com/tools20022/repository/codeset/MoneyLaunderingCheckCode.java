package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of money laundering identification procedures.
 */
public class MoneyLaunderingCheckCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Money laundering identification procedures have been carried out by the
	 * intermediary.
	 */
	public static final MMCode Passed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Passed";
			definition = "Money laundering identification procedures have been carried out by the intermediary.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out.
	 */
	public static final MMCode NotChecked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotChecked";
			definition = "Money laundering identification procedures have not been carried out.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "NOTC";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out
	 * because the transaction is below the prescribed limit.
	 */
	public static final MMCode ExemptBelowLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExemptBelowLimit";
			definition = "Money laundering identification procedures have not been carried out because the transaction is below the prescribed limit.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "EXEM";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out
	 * because of the transaction type, eg, switch, or because the transaction
	 * is being funded from an existing investor account held by the
	 * intermediary.
	 */
	public static final MMCode ClientMoneyTypeExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientMoneyTypeExempt";
			definition = "Money laundering identification procedures have not been carried out because of the transaction type, eg, switch, or because the transaction is being funded from an existing investor account held by the intermediary.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "CLMO";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out
	 * because the investor is an authorised credit or financial institution.
	 */
	public static final MMCode AuthorisedCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisedCredit";
			definition = "Money laundering identification procedures have not been carried out because the investor is an authorised credit or financial institution.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "AUTH";
		}
	};
	/**
	 * Limited money laundering identification procedures have been carried out
	 * because it is a one time only transaction and the payment is being made
	 * by postal, telephone or electronic transfers from an existing account
	 * with an authorised credit or financial institution.
	 */
	public static final MMCode PostalOrElectronicPaymentExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalOrElectronicPaymentExempt";
			definition = "Limited money laundering identification procedures have been carried out because it is a one time only transaction and the payment is being made by postal, telephone or electronic transfers from an existing account with an authorised credit or financial institution.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "POEP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PASS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MoneyLaunderingCheckCode";
				definition = "Specifies the status of money laundering identification procedures.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MoneyLaunderingCheckCode.Passed, com.tools20022.repository.codeset.MoneyLaunderingCheckCode.NotChecked,
						com.tools20022.repository.codeset.MoneyLaunderingCheckCode.ExemptBelowLimit, com.tools20022.repository.codeset.MoneyLaunderingCheckCode.ClientMoneyTypeExempt,
						com.tools20022.repository.codeset.MoneyLaunderingCheckCode.AuthorisedCredit, com.tools20022.repository.codeset.MoneyLaunderingCheckCode.PostalOrElectronicPaymentExempt);
			}
		});
		return mmObject_lazy.get();
	}
}