package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.ServiceLevel8Choice;
import com.tools20022.repository.codeset.ServiceLevelCode;
import com.tools20022.repository.codeset.SWIFTServiceLevelCode;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement under which or rules under which the transaction should be
 * processed.
 */
public class ServiceLevel {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment process for which a service level is specified.
	 */
	public static final MMBusinessAssociationEnd PaymentProcessing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ServiceLevel.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentProcessing";
			definition = "Payment process for which a service level is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.ServiceLevel;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
		}
	};
	/**
	 * Identification of a pre-agreed level of service between the parties in a
	 * coded form.
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ServiceLevel8Choice.Code);
			isDerived = false;
			elementContext_lazy = () -> ServiceLevel.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Identification of a pre-agreed level of service between the parties in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServiceLevelCode.mmObject();
		}
	};
	/**
	 * SWIFT defined service level applies to the payment instruction.
	 */
	public static final MMBusinessAttribute Other = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ServiceLevel.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "SWIFT defined service level applies to the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SWIFTServiceLevelCode.mmObject();
		}
	};
	/**
	 * Unambiguous identification of a pre-agreed level of service between the
	 * parties.
	 */
	public static final MMBusinessAttribute Bilateral = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ServiceLevel.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bilateral";
			definition = "Unambiguous identification of a pre-agreed level of service between the parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ServiceLevel";
				definition = "Agreement under which or rules under which the transaction should be processed.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentProcessing.ServiceLevel);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ServiceLevel8Choice.Proprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ServiceLevel.PaymentProcessing, com.tools20022.repository.entity.ServiceLevel.Code, com.tools20022.repository.entity.ServiceLevel.Other,
						com.tools20022.repository.entity.ServiceLevel.Bilateral);
				derivationComponent_lazy = () -> Arrays.asList(ServiceLevel8Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}