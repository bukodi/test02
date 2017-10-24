package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PaymentMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the instrument to be used for the credit of a payment.
 */
public class CreditInstrument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment which uses the credit instrument.
	 */
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CreditInstrument.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment which uses the credit instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.CreditMethod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}
	};
	/**
	 * Transfer method to be used for the transfer.
	 */
	public static final MMBusinessAttribute Method = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction21.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction23.PaymentMethod,
					com.tools20022.repository.msg.PaymentInstruction22.PaymentMethod, com.tools20022.repository.msg.OriginalTransactionReference24.PaymentMethod);
			isDerived = false;
			elementContext_lazy = () -> CreditInstrument.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Transfer method to be used for the transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentMethodCode.mmObject();
		}
	};
	/**
	 * Identifies the credit instrument.
	 */
	public static final MMBusinessAttribute CreditInstrumentIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.ChequeNumber);
			isDerived = false;
			elementContext_lazy = () -> CreditInstrument.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditInstrumentIdentification";
			definition = "Identifies the credit instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Amount less fees and charges, that will be exchanged on settlement date
	 * of the trade.
	 */
	public static final MMBusinessAttribute NetAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CreditInstrument.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Amount less fees and charges, that will be exchanged on settlement date of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Time by which the amount must be paid in.
	 */
	public static final MMBusinessAttribute Deadline = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CreditInstrument.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Time by which the amount must be paid in.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CreditInstrument";
				definition = "Specifies the instrument to be used for the credit of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.CreditMethod);
				subType_lazy = () -> Arrays.asList(ChequeIssue.mmObject(), BookEntry.mmObject(), CashDelivery.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CreditInstrument.RelatedPayment, com.tools20022.repository.entity.CreditInstrument.Method,
						com.tools20022.repository.entity.CreditInstrument.CreditInstrumentIdentification, com.tools20022.repository.entity.CreditInstrument.NetAmount, com.tools20022.repository.entity.CreditInstrument.Deadline);
			}
		});
		return mmObject_lazy.get();
	}
}