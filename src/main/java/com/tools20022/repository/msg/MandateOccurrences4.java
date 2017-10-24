package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.Frequency36Choice;
import com.tools20022.repository.codeset.SequenceType2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.DirectDebitMandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details related to the duration of the mandate and the
 * occurrence of the underlying transactions.
 */
public class MandateOccurrences4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the underlying transaction sequence as either recurring or
	 * one-off.
	 */
	public static final MMMessageAttribute SequenceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.SequenceType;
			componentContext_lazy = () -> MandateOccurrences4.mmObject();
			isDerived = false;
			xmlTag = "SeqTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceType";
			definition = "Identifies the underlying transaction sequence as either recurring or one-off.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SequenceType2Code.mmObject();
		}
	};
	/**
	 * Regularity with which instructions are to be created and processed.
	 */
	public static final MMMessageAttribute Frequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.Frequency;
			componentContext_lazy = () -> MandateOccurrences4.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Regularity with which instructions are to be created and processed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency36Choice.mmObject();
		}
	};
	/**
	 * Length of time for which the mandate remains valid.
	 */
	public static final MMMessageAttribute Duration = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.ValidityPeriod;
			componentContext_lazy = () -> MandateOccurrences4.mmObject();
			isDerived = false;
			xmlTag = "Drtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Duration";
			definition = "Length of time for which the mandate remains valid.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DatePeriodDetails1.mmObject();
		}
	};
	/**
	 * Date of the first collection of a direct debit as per the mandate.
	 */
	public static final MMMessageAttribute FirstCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.FirstCollectionDate;
			componentContext_lazy = () -> MandateOccurrences4.mmObject();
			isDerived = false;
			xmlTag = "FrstColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date of the final collection of a direct debit as per the mandate.
	 */
	public static final MMMessageAttribute FinalCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.FinalCollectionDate;
			componentContext_lazy = () -> MandateOccurrences4.mmObject();
			isDerived = false;
			xmlTag = "FnlColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateOccurrences4.SequenceType, com.tools20022.repository.msg.MandateOccurrences4.Frequency,
						com.tools20022.repository.msg.MandateOccurrences4.Duration, com.tools20022.repository.msg.MandateOccurrences4.FirstCollectionDate, com.tools20022.repository.msg.MandateOccurrences4.FinalCollectionDate);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateOccurrences4";
				definition = "Provides further details related to the duration of the mandate and the occurrence of the underlying transactions.";
			}
		});
		return mmObject_lazy.get();
	}
}