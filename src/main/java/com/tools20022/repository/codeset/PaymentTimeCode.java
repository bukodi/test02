package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the payment conditions.
 */
public class PaymentTimeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code for payment on delivery.
	 */
	public static final MMCode PaymentOnDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnDelivery";
			definition = "Code for payment on delivery.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Code for payment at end of month of delivery.
	 */
	public static final MMCode EndOfMonthOfDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfDelivery";
			definition = "Code for payment at end of month of delivery.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EMTD";
		}
	};
	/**
	 * Code for payment at end of period after delivery.
	 */
	public static final MMCode EndOfPeriodAfterDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterDelivery";
			definition = "Code for payment at end of period after delivery.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPRD";
		}
	};
	/**
	 * Code for payment at end of period after end of month of delivery
	 */
	public static final MMCode EndOfPeriodAfterEndOfDeliveryMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfDeliveryMonth";
			definition = "Code for payment at end of period after end of month of delivery";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "PRMD";
		}
	};
	/**
	 * Code for payment on receipt of invoice.
	 */
	public static final MMCode PaymentOnReceiptOfInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnReceiptOfInvoice";
			definition = "Code for payment on receipt of invoice.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "IREC";
		}
	};
	/**
	 * Code for payment at end of period after end of month of receipt of
	 * invoice.
	 */
	public static final MMCode EndOfPeriodAfterEndOfReceiptMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfReceiptMonth";
			definition = "Code for payment at end of period after end of month of receipt of invoice.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "PRMR";
		}
	};
	/**
	 * Code for payment at end of period after receipt of invoice.
	 */
	public static final MMCode EndOfPeriodAfterReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterReceipt";
			definition = "Code for payment at end of period after receipt of invoice.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPRR";
		}
	};
	/**
	 * Code for payment at end of month of receipt of invoice.
	 */
	public static final MMCode EndOfMonthOfReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfReceipt";
			definition = "Code for payment at end of month of receipt of invoice.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EMTR";
		}
	};
	/**
	 * Code for payment at end of period after match or mismatch acceptance.
	 */
	public static final MMCode EndOfPeriodAfterMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterMatch";
			definition = "Code for payment at end of period after match or mismatch acceptance.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPAM";
		}
	};
	/**
	 * Payment at end of period after shipment date.
	 */
	public static final MMCode EndOfPeriodAfterShipmentDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterShipmentDate";
			definition = "Payment at end of period after shipment date.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPSD";
		}
	};
	/**
	 * Payment at end of period after purchase order date.
	 */
	public static final MMCode EndOfPeriodAfterPurchaseOrderDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterPurchaseOrderDate";
			definition = "Payment at end of period after purchase order date.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPPO";
		}
	};
	/**
	 * Payment at end of period after baseline establishment date.
	 */
	public static final MMCode EndOfPeriodAfterBaselineEstablishment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterBaselineEstablishment";
			definition = "Payment at end of period after baseline establishment date.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPBE";
		}
	};
	/**
	 * Payment at end of period after invoice date.
	 */
	public static final MMCode EndOfPeriodAfterInvoiceDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterInvoiceDate";
			definition = "Payment at end of period after invoice date.";
			owner_lazy = () -> PaymentTimeCode.mmObject();
			codeName = "EPIN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTimeCode";
				definition = "Specifies the payment conditions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentTimeCode.PaymentOnDelivery, com.tools20022.repository.codeset.PaymentTimeCode.EndOfMonthOfDelivery,
						com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterDelivery, com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterEndOfDeliveryMonth,
						com.tools20022.repository.codeset.PaymentTimeCode.PaymentOnReceiptOfInvoice, com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterEndOfReceiptMonth,
						com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterReceipt, com.tools20022.repository.codeset.PaymentTimeCode.EndOfMonthOfReceipt,
						com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterMatch, com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterShipmentDate,
						com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterPurchaseOrderDate, com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterBaselineEstablishment,
						com.tools20022.repository.codeset.PaymentTimeCode.EndOfPeriodAfterInvoiceDate);
			}
		});
		return mmObject_lazy.get();
	}
}