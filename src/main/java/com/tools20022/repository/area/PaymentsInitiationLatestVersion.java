package com.tools20022.repository.area;

import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.repository.area.pain.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the initiation of a payment from the ordering customer
 * to a financial institution that services a cash account and reporting its
 * status
 */
public class PaymentsInitiationLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Payments Initiation - Latest version - master";
				definition = "Messages that support the initiation of a payment from the ordering customer to a financial institution that services a cash account and reporting its status";
				messageDefinition_lazy = () -> Arrays.asList(MandateAcceptanceReportV05.mmObject(), MandateAmendmentRequestV05.mmObject(), MandateInitiationRequestV05.mmObject(), CustomerCreditTransferInitiationV08.mmObject(),
						MandateCancellationRequestV05.mmObject(), CustomerDirectDebitInitiationV07.mmObject(), CreditorPaymentActivationRequestStatusReportV06.mmObject(), CustomerPaymentStatusReportV08.mmObject(),
						CreditorPaymentActivationRequestV06.mmObject(), CustomerPaymentReversalV07.mmObject(), MandateSuspensionRequestV01.mmObject(), MandateCopyRequestV01.mmObject());
				code = "pain";
			}
		});
		return mmObject_lazy.get();
	}
}