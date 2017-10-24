package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An event determined by a corporation's board of directors, that changes the
 * existing corporate capital structure or financial condition.
 */
public class CorporateActionEvent {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of corporate action event.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventTypeV3Code.mmObject();
		}
	};
	/**
	 * Specifies whether the event is mandatory, mandatory with options or
	 * voluntary.
	 */
	public static final MMBusinessAttribute MandatoryVoluntaryEventType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatoryVoluntaryEventType";
			definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
		}
	};
	/**
	 * Security to which this instruction or event applies.
	 */
	public static final MMBusinessAssociationEnd UnderlyingSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Security to which this instruction or event applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.CorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};
	/**
	 * Specifies prices related to a corporate action.
	 */
	public static final MMBusinessAssociationEnd CorporateActionPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPrice";
			definition = "Specifies prices related to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	/**
	 * Rate, specified by the issuer, when the paid amount is not in the same
	 * currency as the specified amount.
	 */
	public static final MMBusinessAssociationEnd ExchangeRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Rate, specified by the issuer, when the paid amount is not in the same currency as the specified amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}
	};
	/**
	 * Provides information required for the registration.
	 */
	public static final MMBusinessAttribute RegistrationDetails = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Provides additional information on the basket or index underlying a
	 * security, for example a warrant.
	 */
	public static final MMBusinessAttribute BasketOrIndexInformation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the different deadlines related to a corporate event.
	 */
	public static final MMBusinessAssociationEnd Deadline = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines related to a corporate event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Deadline.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
		}
	};
	/**
	 * Specifies the type of the additional business process linked to a
	 * corporate action event such as a claim compensation or tax refund.
	 */
	public static final MMBusinessAttribute AdditionalBusinessProcess = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalBusinessProcess";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdditionalBusinessProcessCode.mmObject();
		}
	};
	/**
	 * Date/time at which the deal (rights) was agreed.
	 */
	public static final MMBusinessAttribute TradingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingDate";
			definition = "Date/time at which the deal (rights) was agreed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the charges relative to a corporate action event.
	 */
	public static final MMBusinessAssociationEnd CorporateActionCharge = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCharge";
			definition = "Specifies the charges relative to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.CorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
		}
	};
	/**
	 * Date on which security will assimilate, become fungible, or have the same
	 * rights to dividends as the parent issue.
	 */
	public static final MMBusinessAttribute PariPassuDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PariPassuDate";
			definition = "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Provides conditional information related to the event, eg, an offer is
	 * subject to 50% acceptance, the offeror allows the securities holder to
	 * set some conditions.
	 */
	public static final MMBusinessAttribute InformationConditions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, eg, an offer is subject to 50% acceptance, the offeror allows the securities holder to set some conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Fractional quantity resulting from an event which will be paid with cash
	 * in lieu.
	 */
	public static final MMBusinessAssociationEnd FractionalQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FractionalQuantity";
			definition = "Fractional quantity resulting from an event which will be paid with cash in lieu. ";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedEventForFractionalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Type of processing involved by a Corporate Action.
	 */
	public static final MMBusinessAttribute EventProcessingType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventProcessingType";
			definition = "Type of processing involved by a Corporate Action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingTypeCode.mmObject();
		}
	};
	/**
	 * Status of the corporate action process.
	 */
	public static final MMBusinessAssociationEnd CorporateActionStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Status of the corporate action process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
		}
	};
	/**
	 * Date/time at which the issuer announced that a corporate action event
	 * will occur such as the issue of securities or an official meeting.
	 */
	public static final MMBusinessAttribute AnnouncementDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur such as the issue of securities or an official meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which an event is officially effective from the issuer's
	 * perspective.
	 */
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which an event is officially effective from the issuer's perspective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which additional information on the event will be announced,
	 * for instance exchange ratio announcement date.
	 */
	public static final MMBusinessAttribute FurtherDetailsAnnouncementDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FurtherDetailsAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, for instance exchange ratio announcement date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which the margin rate will be determined .
	 */
	public static final MMBusinessAttribute MarginFixingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which results are published, eg, results of an offer, of a
	 * meeting.
	 */
	public static final MMBusinessAttribute ResultPublicationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultPublicationDate";
			definition = "Date on which results are published, eg, results of an offer, of a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date upon which the terms of the take-over become unconditional as to
	 * acceptances.
	 */
	public static final MMBusinessAttribute UnconditionalDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnconditionalDate";
			definition = "Date upon which the terms of the take-over become unconditional as to acceptances.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which all conditions, including regulatory, legal etc. pertaining
	 * to the take-over, have been met.
	 */
	public static final MMBusinessAttribute WhollyUnconditionalDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which an event/offer is terminated or lapsed.
	 */
	public static final MMBusinessAttribute LapsedDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period defining the last date on which shareholder registration will be
	 * accepted by the issuer and the date on which shareholder registration
	 * will resume.
	 */
	public static final MMBusinessAssociationEnd BookClosurePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookClosurePeriod";
			definition = "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BookClosureCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Provides information about securities quantity linked to a corporate
	 * action.
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Indicates whether there are legal or other restrictions associated with a
	 * rights offer or other corporate event, for example, domicile,
	 * citizenship, residency, type of investor.<br>
	 * Yes = There are restrictions.<br>
	 * No = There are no restrictions.
	 */
	public static final MMBusinessAttribute RestrictionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there are legal or other restrictions associated with a rights offer or other corporate event, for example, domicile, citizenship, residency, type of investor.\r\nYes = There are restrictions.\r\nNo = There are no restrictions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Stage in the corporate action event life cycle.
	 */
	public static final MMBusinessAttribute EventStage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStageCode.mmObject();
		}
	};
	/**
	 * Information on where additional information published for the event, can
	 * be received. for instance the address for the Universal Resource Locator
	 * (URL), eg, used over the www (HTTP) service.
	 */
	public static final MMBusinessAssociationEnd DocumentationLocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DocumentationLocation";
			definition = "Information on where additional information published for the event, can be received. for instance the address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Quantity of securities the offeror/issuer will purchase or redeem under
	 * the terms of the event. This can be a number or the term "any and all".
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantitySought = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantitySought";
			definition = "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Specifies if the issuer will allow the agent to accept partial elections.
	 * It is to allow split voting over options. It allows the client to elect
	 * more than one option to be selected per designated holding.
	 */
	public static final MMBusinessAttribute PartialElectionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialElectionIndicator";
			definition = "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the role played by a party in the context of a corporate
	 * action.
	 */
	public static final MMBusinessAssociationEnd CorporateActionPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPartyRole";
			definition = "Specifies the role played by a party in the context of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.mmObject();
		}
	};
	/**
	 * Market claim information.
	 */
	public static final MMBusinessAssociationEnd MarketClaim = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClaim";
			definition = "Market claim information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarketClaim.RelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmObject();
		}
	};
	/**
	 * Specifies the conditions under which securities can be acquired as part
	 * of a corporate action.
	 */
	public static final MMBusinessAssociationEnd BiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.Event;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	/**
	 * Specifies the underlying class action related to the event.
	 */
	public static final MMBusinessAssociationEnd RelatedClassAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedClassAction";
			definition = "Specifies the underlying class action related to the event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClassAction.CorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ClassAction.mmObject();
		}
	};
	/**
	 * Official registration of the event.
	 */
	public static final MMBusinessAssociationEnd CorporateActionEventRegistration = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventRegistration";
			definition = "Official registration of the event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
		}
	};
	/**
	 * Period defining the last date for which an action will be accepted and
	 * the date on which the suspension will be released and normal processing
	 * will resume.
	 */
	public static final MMBusinessAssociationEnd SuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspensionPeriod";
			definition = "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Organisation of draws for cash prizes on bonds (instead of coupon
	 * payments). Every issued bond (similar to a lottery ticket) has an equal
	 * opportunity at winning payments in the draws.
	 */
	public static final MMBusinessAssociationEnd Lottery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Organisation of draws for cash prizes on bonds (instead of coupon payments). Every issued bond (similar to a lottery ticket) has an equal opportunity at winning payments in the draws.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Lottery.RelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
		}
	};
	/**
	 * Specifies the margin type for a remarketing procedure.
	 */
	public static final MMBusinessAttribute MarginType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginType";
			definition = "Specifies the margin type for a remarketing procedure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RemarketingMarginTypeCode.mmObject();
		}
	};
	/**
	 * Provides information on the meeting related to the corporate event.
	 */
	public static final MMBusinessAssociationEnd RelatedMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Provides information on the meeting  related to the corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.CorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Meeting.mmObject();
		}
	};
	/**
	 * Specifies the different services linked to a corporate action event.
	 */
	public static final MMBusinessAssociationEnd Services = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Specifies the different services linked to a corporate action event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.Event;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionServicing.mmObject();
		}
	};
	/**
	 * Information specified when the corporate event relates to the issuance of
	 * securities.
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Information specified when the corporate event relates to the issuance of securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.EventInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	/**
	 * Modification of the reference data of a security or of the organisation
	 * that issued it.
	 */
	public static final MMBusinessAssociationEnd SecuritiesModification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Modification of the reference data of a security or of the organisation that issued it.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.RelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
		}
	};
	/**
	 * Period during which a financial instrument is available for trading.
	 */
	public static final MMBusinessAssociationEnd TradingPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which a financial instrument is available for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Tax rate of financial transactions related to an event.
	 */
	public static final MMBusinessAssociationEnd TransactionTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax rate of financial transactions related to an event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}
	};
	/**
	 * Corporate actions may be approved by shareholders without a meeting or a
	 * vote by means of execution of a consent by a majority of shareholders
	 * entitled to vote.
	 */
	public static final MMBusinessAttribute ConsentType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentType";
			definition = "Corporate actions may be approved by shareholders without a meeting or a vote by means of execution of a consent by a majority of shareholders entitled to vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsentTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the proceeds of a corporate action.
	 */
	public static final MMBusinessAssociationEnd ProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Specifies the proceeds of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.CorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEvent";
				definition = "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.CorporateEvent, com.tools20022.repository.entity.ContactPoint.RelatedCorporateActionEvent,
						com.tools20022.repository.entity.DateTimePeriod.BookClosureCorporateAction, com.tools20022.repository.entity.DateTimePeriod.RelatedCorporateAction, com.tools20022.repository.entity.Tax.CorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedEventForFractionalQuantity, com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionStatus.CorporateActionEvent,
						com.tools20022.repository.entity.CurrencyExchange.RelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionEventRegistration.CorporateActionEvent,
						com.tools20022.repository.entity.Issuance.EventInformation, com.tools20022.repository.entity.ProceedsDefinition.CorporateAction, com.tools20022.repository.entity.ClassAction.CorporateEvent,
						com.tools20022.repository.entity.SecuritiesModification.RelatedCorporateEvent, com.tools20022.repository.entity.BiddingConditions.Event, com.tools20022.repository.entity.CorporateActionPrice.CorporateActionEvent,
						com.tools20022.repository.entity.CorporateActionServicing.Event, com.tools20022.repository.entity.Deadline.RelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionFeesAndCharges.CorporateAction,
						com.tools20022.repository.entity.MarketClaim.RelatedCorporateEvent, com.tools20022.repository.entity.SuspensionPeriod.CorporateActionEvent, com.tools20022.repository.entity.Lottery.RelatedCorporateEvent,
						com.tools20022.repository.entity.Meeting.CorporateEvent, com.tools20022.repository.entity.CorporateActionPartyRole.CorporateActionEvent);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.Type, com.tools20022.repository.entity.CorporateActionEvent.MandatoryVoluntaryEventType,
						com.tools20022.repository.entity.CorporateActionEvent.UnderlyingSecurity, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPrice,
						com.tools20022.repository.entity.CorporateActionEvent.ExchangeRate, com.tools20022.repository.entity.CorporateActionEvent.RegistrationDetails,
						com.tools20022.repository.entity.CorporateActionEvent.BasketOrIndexInformation, com.tools20022.repository.entity.CorporateActionEvent.Deadline,
						com.tools20022.repository.entity.CorporateActionEvent.AdditionalBusinessProcess, com.tools20022.repository.entity.CorporateActionEvent.TradingDate,
						com.tools20022.repository.entity.CorporateActionEvent.CorporateActionCharge, com.tools20022.repository.entity.CorporateActionEvent.PariPassuDate,
						com.tools20022.repository.entity.CorporateActionEvent.InformationConditions, com.tools20022.repository.entity.CorporateActionEvent.FractionalQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.EventProcessingType, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionStatus,
						com.tools20022.repository.entity.CorporateActionEvent.AnnouncementDate, com.tools20022.repository.entity.CorporateActionEvent.EffectiveDate,
						com.tools20022.repository.entity.CorporateActionEvent.FurtherDetailsAnnouncementDate, com.tools20022.repository.entity.CorporateActionEvent.MarginFixingDate,
						com.tools20022.repository.entity.CorporateActionEvent.ResultPublicationDate, com.tools20022.repository.entity.CorporateActionEvent.UnconditionalDate,
						com.tools20022.repository.entity.CorporateActionEvent.WhollyUnconditionalDate, com.tools20022.repository.entity.CorporateActionEvent.LapsedDate,
						com.tools20022.repository.entity.CorporateActionEvent.BookClosurePeriod, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.RestrictionIndicator, com.tools20022.repository.entity.CorporateActionEvent.EventStage,
						com.tools20022.repository.entity.CorporateActionEvent.DocumentationLocation, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantitySought,
						com.tools20022.repository.entity.CorporateActionEvent.PartialElectionIndicator, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPartyRole,
						com.tools20022.repository.entity.CorporateActionEvent.MarketClaim, com.tools20022.repository.entity.CorporateActionEvent.BiddingConditions, com.tools20022.repository.entity.CorporateActionEvent.RelatedClassAction,
						com.tools20022.repository.entity.CorporateActionEvent.CorporateActionEventRegistration, com.tools20022.repository.entity.CorporateActionEvent.SuspensionPeriod,
						com.tools20022.repository.entity.CorporateActionEvent.Lottery, com.tools20022.repository.entity.CorporateActionEvent.MarginType, com.tools20022.repository.entity.CorporateActionEvent.RelatedMeeting,
						com.tools20022.repository.entity.CorporateActionEvent.Services, com.tools20022.repository.entity.CorporateActionEvent.Issuance, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesModification,
						com.tools20022.repository.entity.CorporateActionEvent.TradingPeriod, com.tools20022.repository.entity.CorporateActionEvent.TransactionTax, com.tools20022.repository.entity.CorporateActionEvent.ConsentType,
						com.tools20022.repository.entity.CorporateActionEvent.ProceedsDefinition);
			}
		});
		return mmObject_lazy.get();
	}
}