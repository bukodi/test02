package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.RemittanceLocation4;
import com.tools20022.repository.msg.RemittanceLocationDetails1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number, physical or virtual address, used for communication.
 */
public class ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of a contact point.
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of a contact point.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForContactPoint;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Investment fund class for which an order desk is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedInvestmentFund";
			definition = "Investment fund class for which an order desk is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.OrderDesk;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFund.mmObject();
		}
	};
	/**
	 * BIC address which identifies the contact point.
	 */
	public static final MMBusinessAttribute BICAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BICAddress";
			definition = "BIC address which identifies the contact point.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	/**
	 * Party for which a contact point is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedParty";
			definition = "Party for which a contact point is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.ContactPoint;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Party.mmObject();
		}
	};
	/**
	 * Corporate action event for which the documentation location is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action event for which the documentation location is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.DocumentationLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Reporting service for which a contact point is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedReportingService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedReportingService";
			definition = "Reporting service for which a contact point is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ReportingService.ReportingChannel;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ReportingService.mmObject();
		}
	};
	/**
	 * Document which is stored at a specific place.
	 */
	public static final MMBusinessAssociationEnd StoredDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StoredDocument";
			definition = "Document which is stored at a specific place.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.PlaceOfStorage;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}
	};
	/**
	 * Payment for which a remittance location is specified.
	 */
	public static final MMBusinessAssociationEnd RemittanceRelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittanceRelatedPayment";
			definition = "Payment for which a remittance location is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RemittanceLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}
	};
	/**
	 * Proxy appointment process for which a notification address is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedProxyAppointment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedProxyAppointment";
			definition = "Proxy appointment process for which a notification address is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.NotificationAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProxyAppointmentCondition.mmObject();
		}
	};
	/**
	 * Meeting which takes place at a specific place.
	 */
	public static final MMBusinessAssociationEnd ContactPointForMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPointForMeeting";
			definition = "Meeting which takes place at a specific place.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.MeetingLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Meeting.mmObject();
		}
	};
	/**
	 * Vote parameters which apply to a vote location.
	 */
	public static final MMBusinessAssociationEnd ContactPointForVote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPointForVote";
			definition = "Vote parameters which apply to a vote location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VotingCondition.VoteLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> VotingCondition.mmObject();
		}
	};
	/**
	 * Contact address used for normal operations.
	 */
	public static final MMBusinessAssociationEnd MainContact = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MainContact";
			definition = "Contact address used for normal operations.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.ReturnAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Physical/logical address, segregated from the main address that is used
	 * for normal operations. The return address is used to route messages that
	 * require specific attention/exception handling, eg, returns or rejects.
	 */
	public static final MMBusinessAssociationEnd ReturnAddress = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReturnAddress";
			definition = "Physical/logical address, segregated from the main address that is used for normal operations. The return address is used to route messages that require specific attention/exception handling, eg, returns or rejects.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.MainContact;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Payment for which a notification method is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which a notification method is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.ContactPoint;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentProcessing.mmObject();
		}
	};
	/**
	 * Indicates whether the address is a temporary address.
	 */
	public static final MMBusinessAttribute TemporaryIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TemporaryIndicator";
			definition = "Indicates whether the address is a temporary address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Attendance card which is delivered at a specific location.
	 */
	public static final MMBusinessAssociationEnd DeliveredAttendanceCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveredAttendanceCard";
			definition = "Attendance card which is delivered at a specific location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AttendanceCard.DeliveryPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AttendanceCard.mmObject();
		}
	};
	/**
	 * Processing characteristics of an investment fund class for which a local
	 * market annex is specified.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundClassProcessing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ContactPoint.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClassProcessing";
			definition = "Processing characteristics of an investment fund class for which a local market annex is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LocalMarketAnnex;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ContactPoint";
				definition = "Number, physical or virtual address, used for communication.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForContactPoint, com.tools20022.repository.entity.InvestmentFund.OrderDesk,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LocalMarketAnnex, com.tools20022.repository.entity.Party.ContactPoint, com.tools20022.repository.entity.ContactPoint.MainContact,
						com.tools20022.repository.entity.ContactPoint.ReturnAddress, com.tools20022.repository.entity.ReportingService.ReportingChannel, com.tools20022.repository.entity.Document.PlaceOfStorage,
						com.tools20022.repository.entity.PaymentObligation.RemittanceLocation, com.tools20022.repository.entity.PaymentProcessing.ContactPoint, com.tools20022.repository.entity.CorporateActionEvent.DocumentationLocation,
						com.tools20022.repository.entity.Meeting.MeetingLocation, com.tools20022.repository.entity.ProxyAppointmentCondition.NotificationAddress, com.tools20022.repository.entity.VotingCondition.VoteLocation,
						com.tools20022.repository.entity.AttendanceCard.DeliveryPlace);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceLocation4.RemittanceLocationDetails);
				subType_lazy = () -> Arrays.asList(PostalAddress.mmObject(), PhoneAddress.mmObject(), ElectronicAddress.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.Identification, com.tools20022.repository.entity.ContactPoint.RelatedInvestmentFund, com.tools20022.repository.entity.ContactPoint.BICAddress,
						com.tools20022.repository.entity.ContactPoint.RelatedParty, com.tools20022.repository.entity.ContactPoint.RelatedCorporateActionEvent, com.tools20022.repository.entity.ContactPoint.RelatedReportingService,
						com.tools20022.repository.entity.ContactPoint.StoredDocument, com.tools20022.repository.entity.ContactPoint.RemittanceRelatedPayment, com.tools20022.repository.entity.ContactPoint.RelatedProxyAppointment,
						com.tools20022.repository.entity.ContactPoint.ContactPointForMeeting, com.tools20022.repository.entity.ContactPoint.ContactPointForVote, com.tools20022.repository.entity.ContactPoint.MainContact,
						com.tools20022.repository.entity.ContactPoint.ReturnAddress, com.tools20022.repository.entity.ContactPoint.RelatedPayment, com.tools20022.repository.entity.ContactPoint.TemporaryIndicator,
						com.tools20022.repository.entity.ContactPoint.DeliveredAttendanceCard, com.tools20022.repository.entity.ContactPoint.InvestmentFundClassProcessing);
				derivationComponent_lazy = () -> Arrays.asList(RemittanceLocationDetails1.mmObject(), RemittanceLocation4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}