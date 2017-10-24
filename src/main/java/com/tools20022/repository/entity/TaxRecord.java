package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.TaxRecord1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Record of tax details.
 */
public class TaxRecord {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax for which tax record information is provided.
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxRecord1.TaxAmount);
			isDerived = false;
			elementContext_lazy = () -> TaxRecord.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax for which tax record information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Record;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	/**
	 * High level code to identify the type of tax details.
	 */
	public static final MMBusinessAttribute TaxRecordType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxRecord1.Type);
			isDerived = false;
			elementContext_lazy = () -> TaxRecord.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRecordType";
			definition = "High level code to identify the type of tax details.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Description of the tax that is being paid, including specific
	 * representation (code) required by the tax authority.
	 */
	public static final MMBusinessAttribute Category = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxRecord1.Category);
			isDerived = false;
			elementContext_lazy = () -> TaxRecord.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Category";
			definition = "Description of the tax that is being paid, including specific representation (code) required by the tax authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Code provided by local authority to identify the status of the party that
	 * has drawn up the settlement document.
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxRecord1.DebtorStatus);
			isDerived = false;
			elementContext_lazy = () -> TaxRecord.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Code provided by local authority to identify the status of the party that has drawn up the settlement document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Code to identify on which template the tax report is to be provided
	 */
	public static final MMBusinessAttribute FormsCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxRecord1.FormsCode);
			isDerived = false;
			elementContext_lazy = () -> TaxRecord.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FormsCode";
			definition = "Code to identify on which template the tax report is to be provided";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Period of time details related to the tax payment.
	 */
	public static final MMBusinessAssociationEnd Period = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxRecord1.Period);
			isDerived = false;
			elementContext_lazy = () -> TaxRecord.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Period";
			definition = "Period of time details related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxPeriod.TaxRecord;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TaxPeriod.mmObject();
		}
	};
	/**
	 * Amount of the tax record.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxRecord.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the tax record.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Description of the tax that is being paid, including specific
	 * representation required by taxing authority.
	 */
	public static final MMBusinessAttribute CategoryDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxRecord.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CategoryDescription";
			definition = "Description of the tax that is being paid, including specific representation required by taxing authority.";
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
				name = "TaxRecord";
				definition = "Record of tax details.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tax.Record, com.tools20022.repository.entity.TaxPeriod.TaxRecord);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxRecord.Tax, com.tools20022.repository.entity.TaxRecord.TaxRecordType, com.tools20022.repository.entity.TaxRecord.Category,
						com.tools20022.repository.entity.TaxRecord.Status, com.tools20022.repository.entity.TaxRecord.FormsCode, com.tools20022.repository.entity.TaxRecord.Period, com.tools20022.repository.entity.TaxRecord.Amount,
						com.tools20022.repository.entity.TaxRecord.CategoryDescription);
				derivationComponent_lazy = () -> Arrays.asList(TaxRecord1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}