package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.AccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reporting parameters that are included in the account contract
 * which specifies the services linked to the account..
 */
public class ReportingService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the frequency at which a statement must be created by the
	 * account servicer.
	 */
	public static final MMBusinessAttribute StatementFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReportingService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatementFrequency";
			definition = "Specifies the frequency at which a statement must be created by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Specifies the balance amount of an account under which a notification
	 * should be sent from the account servicer to the account owner.
	 */
	public static final MMBusinessAttribute FloorNotificationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReportingService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FloorNotificationAmount";
			definition = "Specifies the balance amount of an account under which a notification should be sent from the account servicer to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the balance amount of an account above which a notification
	 * should be sent from the account servicer to the account owner.
	 */
	public static final MMBusinessAttribute CeilingNotificationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReportingService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CeilingNotificationAmount";
			definition = "Specifies the balance amount of an account above which a notification should be sent from the account servicer to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the channel through which the statement must be made available
	 * to the account owner or to the information recipient.
	 */
	public static final MMBusinessAssociationEnd ReportingChannel = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReportingService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingChannel";
			definition = "Specifies the channel through which the statement must be made available to the account owner or to the information recipient.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedReportingService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Investment account services which include reporting services.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReportingService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccountService";
			definition = "Investment account services which include reporting services.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.ReportingService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccountService.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReportingService";
				definition = "Specifies the reporting parameters that are included in the account contract which specifies the services linked to the account..";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.RelatedReportingService, com.tools20022.repository.entity.InvestmentAccountService.ReportingService);
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingService.StatementFrequency, com.tools20022.repository.entity.ReportingService.FloorNotificationAmount,
						com.tools20022.repository.entity.ReportingService.CeilingNotificationAmount, com.tools20022.repository.entity.ReportingService.ReportingChannel,
						com.tools20022.repository.entity.ReportingService.RelatedInvestmentAccountService);
			}
		});
		return mmObject_lazy.get();
	}
}