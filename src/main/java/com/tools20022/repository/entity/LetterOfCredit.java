package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.Asset;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instrument issued by a bank substituting its name and credit standing for
 * that of its customer. A letter of credit is a written undertaking of the
 * bank, issued for the account of a customer (the applicant), to honour a
 * demand for payment, upon the beneficiary's compliance with the terms and
 * conditions set forth in the undertaking.
 */
public class LetterOfCredit extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of the letter/documentary credit.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LetterOfCredit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the letter/documentary credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Document which materialises the letter of credit.
	 */
	public static final MMBusinessAssociationEnd Document = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LetterOfCredit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document which materialises the letter of credit.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.LetterOfCredit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	/**
	 * Settlement process related to a letter of credit.
	 */
	public static final MMBusinessAssociationEnd CommercialTradeSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LetterOfCredit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialTradeSettlement";
			definition = "Settlement process related to a letter of credit.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.LetterOfCredit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LetterOfCredit";
				definition = "Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Document.LetterOfCredit, com.tools20022.repository.entity.CommercialTradeSettlement.LetterOfCredit);
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LetterOfCredit.Amount, com.tools20022.repository.entity.LetterOfCredit.Document, com.tools20022.repository.entity.LetterOfCredit.CommercialTradeSettlement);
			}
		});
		return mmObject_lazy.get();
	}
}