package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CapitalTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money targeted to be raised through the issuance of a security.
 */
public class Capital {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Issued asset.
	 */
	public static final MMBusinessAssociationEnd AssetIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Capital.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetIssuance";
			definition = "Issued asset.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.CapitalRaised;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}
	};
	/**
	 * Date/time at which capital amount was recorded.
	 */
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Capital.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date/time at which capital amount was recorded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the type of capital.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Capital.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of capital.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CapitalTypeCode.mmObject();
		}
	};
	/**
	 * Capital expressed as a currency and amount.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Capital.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Capital expressed as a currency and amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Capital expressed as a number of units.
	 */
	public static final MMBusinessAttribute Unit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Capital.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unit";
			definition = "Capital expressed as a number of units.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Capital";
				definition = "Amount of money targeted to be raised through the issuance of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Issuance.CapitalRaised);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Capital.AssetIssuance, com.tools20022.repository.entity.Capital.Date, com.tools20022.repository.entity.Capital.Type,
						com.tools20022.repository.entity.Capital.Amount, com.tools20022.repository.entity.Capital.Unit);
			}
		});
		return mmObject_lazy.get();
	}
}