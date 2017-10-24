package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.MoveTypeCode;
import com.tools20022.repository.codeset.OffsetTypeCode;
import com.tools20022.repository.codeset.PriceProtectionScopeCode;
import com.tools20022.repository.codeset.TypeOfDiscretionPriceCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates on an order that the trader wishes to display one price in the
 * market but will accept trades at another price.
 */
public class Discretion {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order instruction for which a discretion is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedOrderExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discretion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderExecution";
			definition = "Order instruction for which a discretion is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.OrderPriceStrategy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
		}
	};
	/**
	 * Amount added to the 'related to' price.
	 */
	public static final MMBusinessAttribute Offset = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discretion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Amount added to the 'related to' price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether the offset should be added or subtracted from the
	 * related price.
	 */
	public static final MMBusinessAttribute OffsetSign = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discretion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffsetSign";
			definition = "Indicates whether the offset should be added or subtracted from the related price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	/**
	 * Identify the type of price an offset is related to. The offset can either
	 * be added or subtracted.
	 */
	public static final MMBusinessAttribute RelatedPriceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discretion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPriceType";
			definition = "Identify the type of price an offset is related to. The offset can either be added or subtracted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
		}
	};
	/**
	 * Describes whether discretion price is static/fixed or floats.
	 */
	public static final MMBusinessAttribute MoveType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discretion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MoveType";
			definition = "Describes whether discretion price is static/fixed or floats.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoveTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the nature of the resulting discretion price (e.g. or better
	 * limit, strict limit etc).
	 */
	public static final MMBusinessAttribute LimitType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discretion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitType";
			definition = "Specifies the nature of the resulting discretion price (e.g. or better limit, strict limit etc).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * If the calculated discretion price is not a valid tick price, specifies
	 * how to round the price (e.g. to be more or less aggressive)
	 */
	public static final MMBusinessAttribute RoundDirection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discretion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundDirection";
			definition = "If the calculated discretion price is not a valid tick price, specifies how to round the price (e.g. to be more or less aggressive)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * The scope of "related to" price of the discretion (e.g. local, global
	 * etc)
	 */
	public static final MMBusinessAttribute Scope = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discretion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scope";
			definition = "The scope of \"related to\" price of the discretion (e.g. local, global etc)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceProtectionScopeCode.mmObject();
		}
	};
	/**
	 * Describes the type of Discretion Offset .
	 */
	public static final MMBusinessAttribute OffsetType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discretion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffsetType";
			definition = "Describes the type of Discretion Offset .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OffsetTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Discretion";
				definition = "Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.OrderPriceStrategy);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Discretion.RelatedOrderExecution, com.tools20022.repository.entity.Discretion.Offset, com.tools20022.repository.entity.Discretion.OffsetSign,
						com.tools20022.repository.entity.Discretion.RelatedPriceType, com.tools20022.repository.entity.Discretion.MoveType, com.tools20022.repository.entity.Discretion.LimitType,
						com.tools20022.repository.entity.Discretion.RoundDirection, com.tools20022.repository.entity.Discretion.Scope, com.tools20022.repository.entity.Discretion.OffsetType);
			}
		});
		return mmObject_lazy.get();
	}
}