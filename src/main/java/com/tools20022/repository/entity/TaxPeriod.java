package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.TaxRecordPeriodCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.msg.TaxPeriod1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Period of time details related to the tax payment.
 */
public class TaxPeriod {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax record for which a period is specified.
	 */
	public static final MMBusinessAssociationEnd TaxRecord = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRecord";
			definition = "Tax record for which a period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxRecord.Period;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
		}
	};
	/**
	 * Year related to the tax payment.
	 */
	public static final MMBusinessAttribute Year = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxPeriod1.Year);
			isDerived = false;
			elementContext_lazy = () -> TaxPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Year";
			definition = "Year related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Identification of the period related to the tax payment.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxPeriod1.Type);
			isDerived = false;
			elementContext_lazy = () -> TaxPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Identification of the period related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxRecordPeriodCode.mmObject();
		}
	};
	/**
	 * Range of time between a start date and an end date for which the tax
	 * report is provided.
	 */
	public static final MMBusinessAssociationEnd FromToDate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxPeriod1.FromToDate);
			isDerived = false;
			elementContext_lazy = () -> TaxPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for which the tax report is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.TaxPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Date on which the fiscal year is closed.
	 */
	public static final MMBusinessAttribute EndOfFiscalYear = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndOfFiscalYear";
			definition = "Date on which the fiscal year is closed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxPeriod";
				definition = "Period of time details related to the tax payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.TaxPeriod, com.tools20022.repository.entity.TaxRecord.Period);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxPeriod.TaxRecord, com.tools20022.repository.entity.TaxPeriod.Year, com.tools20022.repository.entity.TaxPeriod.Type,
						com.tools20022.repository.entity.TaxPeriod.FromToDate, com.tools20022.repository.entity.TaxPeriod.EndOfFiscalYear);
				derivationComponent_lazy = () -> Arrays.asList(TaxPeriod1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}