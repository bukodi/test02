package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DeliveryTypeCode;
import com.tools20022.repository.codeset.TerminationTypeCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Agreement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contractual details related to the agreement between parties.
 */
public class SecuritiesFinancingAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies a trade using the related financing agreement.
	 */
	public static final MMBusinessAssociationEnd SecuritiesFinancingTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingTrade";
			definition = "Specifies a trade using the related financing agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.FinancingAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesFinancing.mmObject();
		}
	};
	/**
	 * Contractual currency forming the basis of a financing agreement and
	 * associated transactions. Usually, but not always, the same as the trade
	 * currency.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Contractual currency forming the basis of a financing agreement and associated transactions. Usually, but not always, the same as the trade currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Type of financing termination.
	 */
	public static final MMBusinessAttribute TerminationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationType";
			definition = "Type of financing termination.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminationTypeCode.mmObject();
		}
	};
	/**
	 * Identifies type of settlement.
	 */
	public static final MMBusinessAttribute DeliveryType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryType";
			definition = "Identifies type of settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryTypeCode.mmObject();
		}
	};
	/**
	 * Fraction of the cash consideration that must be collateralized, expressed
	 * as a percent. A margin ratio of 02% indicates that the value of the
	 * collateral (after deducting for "haircut") must exceed the cash
	 * consideration by 2%.
	 */
	public static final MMBusinessAttribute MarginRatio = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginRatio";
			definition = "Fraction of the cash consideration that must be collateralized, expressed as a percent. A margin ratio of 02% indicates that the value of the collateral (after deducting for \"haircut\") must exceed the cash consideration by 2%.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingAgreement";
				definition = "Contractual details related to the agreement between parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesFinancing.FinancingAgreement);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesFinancingAgreement.SecuritiesFinancingTrade, com.tools20022.repository.entity.SecuritiesFinancingAgreement.Currency,
						com.tools20022.repository.entity.SecuritiesFinancingAgreement.TerminationType, com.tools20022.repository.entity.SecuritiesFinancingAgreement.DeliveryType,
						com.tools20022.repository.entity.SecuritiesFinancingAgreement.MarginRatio);
			}
		});
		return mmObject_lazy.get();
	}
}