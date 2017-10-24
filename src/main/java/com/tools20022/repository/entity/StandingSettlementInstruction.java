package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Settlement instruction database information.
 */
public class StandingSettlementInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement process to which the settlement instruction database applies.
	 */
	public static final MMBusinessAssociationEnd Settlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Settlement process to which the settlement instruction database applies.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Settlement.StandingSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
		}
	};
	/**
	 * Specifies whether the forex standing instruction in place should apply.
	 */
	public static final MMBusinessAttribute FXStandingInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FXStandingInstruction";
			definition = "Specifies whether the forex standing instruction in place should apply.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies what settlement standing instruction database is to be used to
	 * derive the settlement parties involved in the transaction.
	 */
	public static final MMBusinessAttribute SettlementStandingInstructionDatabase = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementStandingInstructionDatabase";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStandingInstructionDatabaseCode.mmObject();
		}
	};
	/**
	 * Identification of the standing instruction.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Collateral agreement for which standing settlement instructions are
	 * specified.
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralAgreement";
			definition = "Collateral agreement for which standing settlement instructions are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.StandingSettlementInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralAgreement.mmObject();
		}
	};
	/**
	 * Specifies the settlement standing instruction database to be used to
	 * derive the settlement parties involved in a transaction.
	 */
	public static final MMBusinessAttribute SSIDatabaseName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SSIDatabaseName";
			definition = "Specifies the settlement standing instruction database to be used to derive the settlement parties involved in a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Party which provides information on the parties and accounts to be used
	 * to settle a transaction.
	 */
	public static final MMBusinessAssociationEnd SSIDatabaseProvider = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SSIDatabaseProvider";
			definition = "Party which provides information on the parties and accounts to be used to settle a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SSIDatabaseProvider.StandingSettlementDatabase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SSIDatabaseProvider.mmObject();
		}
	};
	/**
	 * Period during which the SSI is valid.
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period during which the SSI is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedStandingSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Currency of the payment to which the SSI applies.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the payment to which the SSI applies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Inidicates the asset for the standing settlement instruction.
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Inidicates the asset for the standing settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.StandingSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StandingSettlementInstruction";
				definition = "Settlement instruction database information.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.StandingSettlementInstruction, com.tools20022.repository.entity.DateTimePeriod.RelatedStandingSettlementInstruction,
						com.tools20022.repository.entity.Settlement.StandingSettlementInstruction, com.tools20022.repository.entity.CollateralAgreement.StandingSettlementInstructions,
						com.tools20022.repository.entity.SSIDatabaseProvider.StandingSettlementDatabase);
				subType_lazy = () -> Arrays.asList(AgentCorporateActionStandingInstruction.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StandingSettlementInstruction.Settlement, com.tools20022.repository.entity.StandingSettlementInstruction.FXStandingInstruction,
						com.tools20022.repository.entity.StandingSettlementInstruction.SettlementStandingInstructionDatabase, com.tools20022.repository.entity.StandingSettlementInstruction.Identification,
						com.tools20022.repository.entity.StandingSettlementInstruction.RelatedCollateralAgreement, com.tools20022.repository.entity.StandingSettlementInstruction.SSIDatabaseName,
						com.tools20022.repository.entity.StandingSettlementInstruction.SSIDatabaseProvider, com.tools20022.repository.entity.StandingSettlementInstruction.ValidityPeriod,
						com.tools20022.repository.entity.StandingSettlementInstruction.Currency, com.tools20022.repository.entity.StandingSettlementInstruction.Asset);
			}
		});
		return mmObject_lazy.get();
	}
}