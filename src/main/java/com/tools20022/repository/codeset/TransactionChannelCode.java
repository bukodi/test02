package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of communication channel.
 */
public class TransactionChannelCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Mail order.
	 */
	public static final MMCode MailOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailOrder";
			definition = "Mail order.";
			owner_lazy = () -> TransactionChannelCode.mmObject();
			codeName = "MAIL";
		}
	};
	/**
	 * Telephone order.
	 */
	public static final MMCode TelephoneOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TelephoneOrder";
			definition = "Telephone order.";
			owner_lazy = () -> TransactionChannelCode.mmObject();
			codeName = "TLPH";
		}
	};
	/**
	 * Electronic commerce.
	 */
	public static final MMCode ElectronicCommerce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicCommerce";
			definition = "Electronic commerce.";
			owner_lazy = () -> TransactionChannelCode.mmObject();
			codeName = "ECOM";
		}
	};
	/**
	 * Payment on television.
	 */
	public static final MMCode TelevisionPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TelevisionPayment";
			definition = "Payment on television.";
			owner_lazy = () -> TransactionChannelCode.mmObject();
			codeName = "TVPY";
		}
	};
	/**
	 * Office or branch.
	 */
	public static final MMCode OfficeOrBranch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficeOrBranch";
			definition = "Office or branch.";
			owner_lazy = () -> TransactionChannelCode.mmObject();
			codeName = "BRAN";
		}
	};
	/**
	 * Home banking.
	 */
	public static final MMCode HomeBanking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeBanking";
			definition = "Home banking.";
			owner_lazy = () -> TransactionChannelCode.mmObject();
			codeName = "HOBA";
		}
	};
	/**
	 * Financial advisor.
	 */
	public static final MMCode FinancialAdvisor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvisor";
			definition = "Financial advisor.";
			owner_lazy = () -> TransactionChannelCode.mmObject();
			codeName = "FIAD";
		}
	};
	/**
	 * Payment performed through a cardholder mobile device.
	 */
	public static final MMCode MobilePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePayment";
			definition = "Payment performed through a cardholder mobile device.";
			owner_lazy = () -> TransactionChannelCode.mmObject();
			codeName = "MOBL";
		}
	};
	/**
	 * Electronic commerce with cardholder authentication.
	 */
	public static final MMCode SecuredElectronicCommerce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredElectronicCommerce";
			definition = "Electronic commerce with cardholder authentication.";
			owner_lazy = () -> TransactionChannelCode.mmObject();
			codeName = "SECM";
		}
	};
	/**
	 * Payment performed through a merchant mobile device.
	 */
	public static final MMCode MobilePOS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePOS";
			definition = "Payment performed through a merchant mobile device.";
			owner_lazy = () -> TransactionChannelCode.mmObject();
			codeName = "MPOS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MAIL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionChannelCode";
				definition = "Specifies the type of communication channel.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannelCode.MailOrder, com.tools20022.repository.codeset.TransactionChannelCode.TelephoneOrder,
						com.tools20022.repository.codeset.TransactionChannelCode.ElectronicCommerce, com.tools20022.repository.codeset.TransactionChannelCode.TelevisionPayment,
						com.tools20022.repository.codeset.TransactionChannelCode.OfficeOrBranch, com.tools20022.repository.codeset.TransactionChannelCode.HomeBanking,
						com.tools20022.repository.codeset.TransactionChannelCode.FinancialAdvisor, com.tools20022.repository.codeset.TransactionChannelCode.MobilePayment,
						com.tools20022.repository.codeset.TransactionChannelCode.SecuredElectronicCommerce, com.tools20022.repository.codeset.TransactionChannelCode.MobilePOS);
			}
		});
		return mmObject_lazy.get();
	}
}