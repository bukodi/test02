package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.ExternalGarnishmentType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of garnishment.
 */
public class GarnishmentType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Garnishment type in a coded form.<br>
	 * Would suggest this to be an External Code List to contain:<br>
	 * GNCS    Garnishment from a third party payer for Child Support<br>
	 * GNDP    Garnishment from a Direct Payer for Child Support<br>
	 * GTPP     Garnishment from a third party payer to taxing agency
	 */
	public static final MMMessageAttribute Code = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Type;
			componentContext_lazy = () -> GarnishmentType1Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Garnishment type in a coded form.\r\nWould suggest this to be an External Code List to contain:\r\nGNCS    Garnishment from a third party payer for Child Support\r\nGNDP    Garnishment from a Direct Payer for Child Support\r\nGTPP     Garnishment from a third party payer to taxing agency";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalGarnishmentType1Code.mmObject();
		}
	};
	/**
	 * Proprietary identification of the type of garnishment.
	 */
	public static final MMMessageAttribute Proprietary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Type;
			componentContext_lazy = () -> GarnishmentType1Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary identification of the type of garnishment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.GarnishmentType1Choice.Code, com.tools20022.repository.choice.GarnishmentType1Choice.Proprietary);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GarnishmentType1Choice";
				definition = "Specifies the type of garnishment.";
			}
		});
		return mmObject_lazy.get();
	}
}