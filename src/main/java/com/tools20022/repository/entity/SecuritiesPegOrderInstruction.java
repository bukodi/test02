package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.MoveTypeCode;
import com.tools20022.repository.codeset.OffsetTypeCode;
import com.tools20022.repository.codeset.PegTypeCode;
import com.tools20022.repository.codeset.PriceProtectionScopeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instructions specific to pegged orders, which consist in an investor buying
 * large amounts of the underlying asset of a derivative it holds.<br>
 */
public class SecuritiesPegOrderInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount (signed) added to the peg for a pegged order.
	 */
	public static final MMBusinessAttribute Offset = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Amount (signed) added to the peg for a pegged order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Defines the type of peg.
	 */
	public static final MMBusinessAttribute PriceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Defines the type of peg.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PegTypeCode.mmObject();
		}
	};
	/**
	 * Describes whether peg is static/fixed or floats.
	 */
	public static final MMBusinessAttribute MoveType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MoveType";
			definition = "Describes whether peg is static/fixed or floats.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoveTypeCode.mmObject();
		}
	};
	/**
	 * Type of peg offset.
	 */
	public static final MMBusinessAttribute OffsetType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffsetType";
			definition = "Type of peg offset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OffsetTypeCode.mmObject();
		}
	};
	/**
	 * Specifies nature of resulting pegged price.
	 */
	public static final MMBusinessAttribute LimitType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitType";
			definition = "Specifies nature of resulting pegged price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * The scope of "related to" price of the peg (for example, local, global
	 * etc).
	 */
	public static final MMBusinessAttribute Scope = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scope";
			definition = "The scope of \"related to\" price of the peg (for example, local, global etc).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceProtectionScopeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the offset should be added to or subtracted from the
	 * peg for a pegged order.
	 */
	public static final MMBusinessAttribute OffsetSign = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffsetSign";
			definition = "Indicates whether the offset should be added to or subtracted from the peg for a pegged order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	/**
	 * Order which is pegged.
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order which is pegged.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.PegInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
		}
	};
	/**
	 * If the calculated peg price is not a valid tick price, specifies how to
	 * round the price.
	 */
	public static final MMBusinessAssociationEnd RoundDirection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDirection";
			definition = "If the calculated peg price is not a valid tick price, specifies how to round the price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RoundingParameters.RelatedPegOrderInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RoundingParameters.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPegOrderInstruction";
				definition = "Instructions specific to pegged orders, which consist in an investor buying large amounts of  the underlying asset of a derivative it holds.\r\n";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RoundingParameters.RelatedPegOrderInstruction, com.tools20022.repository.entity.SecuritiesOrderParameters.PegInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPegOrderInstruction.Offset, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.PriceType,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.MoveType, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.OffsetType,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.LimitType, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.Scope,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.OffsetSign, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.Order,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.RoundDirection);
			}
		});
		return mmObject_lazy.get();
	}
}