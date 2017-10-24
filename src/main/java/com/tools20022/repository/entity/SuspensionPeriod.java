package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Period defining the last date for which an action will be accepted and the
 * date on which the suspension will be released and normal processing will
 * resume.
 */
public class SuspensionPeriod {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Period during which the privilege is not available, eg, this can happen
	 * whenever a meeting takes place or whenever a coupon payment is due.
	 */
	public static final MMBusinessAssociationEnd PrivilegeSuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrivilegeSuspensionPeriod";
			definition = "Period during which the privilege is not available, eg, this can happen whenever a meeting takes place or whenever a coupon payment is due.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PrivilegeSuspensionCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period defining the last date on which withdrawal in street name requests
	 * on the outturn security will be accepted and the date on which the
	 * suspension will be released and withdrawal by transfer processing on the
	 * outturn security will resume.
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForWithdrawal = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawal";
			definition = "Period defining the last date on which withdrawal in street name requests on the outturn security will be accepted and the date on which the suspension will be released and withdrawal by transfer processing on the outturn security will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.WithdrawalSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period defining the last date for which book entry transfers will be
	 * accepted and the date on which the suspension will be released and book
	 * entry transfer processing will resume.
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForBookEntryTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForBookEntryTransfer";
			definition = "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BookEntryTransferSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period defining the last date for which deposits, into nominee name, at
	 * the agent will be accepted and the date on which the suspension will be
	 * released and deposits at agent will resume.
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForDepositAtAgent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForDepositAtAgent";
			definition = "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.DepositAtAgentSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period defining the last date for which deposits will be accepted and the
	 * date on which the suspension will be released and deposits will resume.
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForDeposit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForDeposit";
			definition = "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.DepositSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period defining the last date for which pledges will be accepted and the
	 * date on which the suspension will be released and pledge processing will
	 * resume.
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForPledge = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForPledge";
			definition = "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PledgeSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period defining the last date for which intra-position balances can be
	 * segregated and the date on which the suspension will be released and the
	 * ability to segregate intra-position balances will resume.
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForSegregation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForSegregation";
			definition = "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.SegregationPeriodRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period defining the last date for which withdrawals, from nominee name at
	 * the agent will be accepted and the date on which the suspension will be
	 * released and withdrawals at agent processing will resume.
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForWithdrawalAtAgent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalAtAgent";
			definition = "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.WithdrawalAtAgentSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period defining the last date for which physical withdrawals in the
	 * nominee's name will be accepted and the date on which the suspension will
	 * be released and physical withdrawals in the nominee's name will resume.
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForWithdrawalInNomineeName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInNomineeName";
			definition = "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.WithdrawalInNomineeNameSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period defining the last date on which withdrawal requests in street
	 * name's will be accepted on the event security and the date on which the
	 * suspension will be released and withdrawal in street name's processing on
	 * the event security will resume.
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForWithdrawalInStreetName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInStreetName";
			definition = "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.WithdrawalInStreetNameSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period during which the settlement activities at the co-depositories are
	 * suspended in order to stabilise the holdings at the CSD.
	 */
	public static final MMBusinessAssociationEnd CoDepositoriesSuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoDepositoriesSuspensionPeriod";
			definition = "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.CoDepositoriesSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Corporate action event for which a depository suspension period is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate action event for which a depository suspension period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.SuspensionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SuspensionPeriod";
				definition = "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.PrivilegeSuspensionCorporateAction, com.tools20022.repository.entity.DateTimePeriod.WithdrawalSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.BookEntryTransferSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.DepositAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.DepositSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.PledgeSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.SegregationPeriodRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.WithdrawalAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.WithdrawalInNomineeNameSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.WithdrawalInStreetNameSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.CoDepositoriesSuspensionRelatedEvent, com.tools20022.repository.entity.CorporateActionEvent.SuspensionPeriod);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SuspensionPeriod.PrivilegeSuspensionPeriod, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawal,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForBookEntryTransfer, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDepositAtAgent,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDeposit, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForPledge,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForSegregation, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalAtAgent,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInNomineeName, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInStreetName,
						com.tools20022.repository.entity.SuspensionPeriod.CoDepositoriesSuspensionPeriod, com.tools20022.repository.entity.SuspensionPeriod.CorporateActionEvent);
			}
		});
		return mmObject_lazy.get();
	}
}