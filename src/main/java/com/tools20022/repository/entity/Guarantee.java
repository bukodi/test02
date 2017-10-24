package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.GuarantyTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Asset;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Partial or full coverage of amounts by a party other than the debtor.
 */
public class Guarantee extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount covered by the guarantee.
	 */
	public static final MMBusinessAttribute CoveredAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Guarantee.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoveredAmount";
			definition = "Amount covered by the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Period during which the guarantee is valid.
	 */
	public static final MMBusinessAssociationEnd EffectivePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Guarantee.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the guarantee is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.Guarantee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Specifies the type of security granted by an organisation with the role
	 * as 'guarantor', for example, suretyship.
	 */
	public static final MMBusinessAttribute GuaranteeType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Guarantee.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GuaranteeType";
			definition = "Specifies the type of security granted by an organisation with the role as 'guarantor', for example, suretyship.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GuarantyTypeCode.mmObject();
		}
	};
	/**
	 * Amount covered by the guarantee, expressed as a percentage.
	 */
	public static final MMBusinessAttribute CoveredPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Guarantee.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoveredPercentage";
			definition = "Amount covered by the guarantee, expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Document which contains the description of the guarantee.
	 */
	public static final MMBusinessAssociationEnd Document = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Guarantee.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document which contains the description of the guarantee.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.Guarantee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	/**
	 * Trade which is partially or fully covered by a guarantee.
	 */
	public static final MMBusinessAssociationEnd GuaranteedTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Guarantee.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedTrade";
			definition = "Trade which is partially or fully covered by a guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Guarantee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	/**
	 * Amount not covered by the guarantee.
	 */
	public static final MMBusinessAttribute ExcessAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Guarantee.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExcessAmount";
			definition = "Amount not covered by the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the roles played by a party in the context of guarantees.
	 */
	public static final MMBusinessAssociationEnd GuaranteePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Guarantee.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteePartyRole";
			definition = "Specifies the roles played by a party in the context of guarantees.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GuaranteePartyRole.Guarantee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GuaranteePartyRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Guarantee";
				definition = "Partial or full coverage of amounts by a party other than the debtor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.Guarantee, com.tools20022.repository.entity.DateTimePeriod.Guarantee, com.tools20022.repository.entity.Document.Guarantee,
						com.tools20022.repository.entity.GuaranteePartyRole.Guarantee);
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Guarantee.CoveredAmount, com.tools20022.repository.entity.Guarantee.EffectivePeriod, com.tools20022.repository.entity.Guarantee.GuaranteeType,
						com.tools20022.repository.entity.Guarantee.CoveredPercentage, com.tools20022.repository.entity.Guarantee.Document, com.tools20022.repository.entity.Guarantee.GuaranteedTrade,
						com.tools20022.repository.entity.Guarantee.ExcessAmount, com.tools20022.repository.entity.Guarantee.GuaranteePartyRole);
			}
		});
		return mmObject_lazy.get();
	}
}