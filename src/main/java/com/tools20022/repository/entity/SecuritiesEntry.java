package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Entry;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Posting to a securities account as a result of a securities creation,
 * deletion or transfer in the context of a securities transaction.
 */
public class SecuritiesEntry extends Entry {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date upon which the investor purchased the financial instrument.
	 */
	public static final MMBusinessAttribute AcquisitionDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcquisitionDate";
			definition = "Date upon which the investor purchased the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Quantity of financial instrument.
	 */
	public static final MMBusinessAssociationEnd FinancialInstrumentQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentQuantity";
			definition = "Quantity of financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Entry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Securities account on which the quantity of the entry is debited or
	 * credited. It is derived from the association between Entry and Account.
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Securities account on which the quantity of the entry is debited or credited. It is derived from the association between Entry and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.SecuritiesEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Amount that is the result of the sum of the entries from or to an
	 * account. It is derived from the association between Entry and Balance.
	 */
	public static final MMBusinessAssociationEnd SecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Amount that is the result of the sum of the entries from or to an account. It is derived from the association between Entry and Balance.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SecuritiesEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	/**
	 * Transfer which is at the origin of the entry in the securities account.
	 */
	public static final MMBusinessAssociationEnd TriggeringSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TriggeringSecuritiesTransfer";
			definition = "Transfer which is at the origin of the entry in the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.BookEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTransfer.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesEntry";
				definition = "Posting to a securities account as a result of a securities creation, deletion or transfer in the context of a securities transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.SecuritiesEntry, com.tools20022.repository.entity.SecuritiesQuantity.Entry,
						com.tools20022.repository.entity.SecuritiesTransfer.BookEntry, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesEntry);
				superType_lazy = () -> Entry.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesEntry.AcquisitionDate, com.tools20022.repository.entity.SecuritiesEntry.FinancialInstrumentQuantity,
						com.tools20022.repository.entity.SecuritiesEntry.SecuritiesAccount, com.tools20022.repository.entity.SecuritiesEntry.SecuritiesBalance, com.tools20022.repository.entity.SecuritiesEntry.TriggeringSecuritiesTransfer);
			}
		});
		return mmObject_lazy.get();
	}
}