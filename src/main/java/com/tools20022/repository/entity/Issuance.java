package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.GlobalNoteCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Preparation/bringing to market of a security (also known as primary market or
 * Initial Public Offering (IPO) issuance).
 */
public class Issuance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date/time at which the security was made available.
	 */
	public static final MMBusinessAttribute IssueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Discount on a new issue or tranche of an existing issue.
	 */
	public static final MMBusinessAttribute IssueDiscountAllowance = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDiscountAllowance";
			definition = "Discount on a new issue or tranche of an existing issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * For structured security issues where there is a set schedule of principal
	 * and interest payments for the life of the issue, this is the difference
	 * between the actual rate of the interest payment and the expected or
	 * scheduled rate of the interest payment .
	 */
	public static final MMBusinessAssociationEnd InterestShortfall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestShortfall";
			definition = "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the interest payment and the expected or scheduled rate of the interest payment .";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.InterestRelatedIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * For structured security issues where there is a set schedule of principal
	 * and interest payments for the life of the issue, this is the difference
	 * between the actual rate of the capital or principal repayment and the
	 * scheduled capital repayment.
	 */
	public static final MMBusinessAssociationEnd RealisedLoss = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RealisedLoss";
			definition = "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the capital or principal repayment and the scheduled capital repayment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.LossRelatedIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * Reason for which money is raised through the issuance of a security.
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Identifies the issue size range.
	 */
	public static final MMBusinessAttribute IssueSize = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueSize";
			definition = "Identifies the issue size range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Total original amount or quantity published.
	 */
	public static final MMBusinessAssociationEnd IssueNominalAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueNominalAmount";
			definition = "Total original amount or quantity published.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Parameters of the event.
	 */
	public static final MMBusinessAssociationEnd EventInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventInformation";
			definition = "Parameters of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Asset which is issued.
	 */
	public static final MMBusinessAssociationEnd IssuedAsset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuedAsset";
			definition = "Asset which is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Asset.mmObject();
		}
	};
	/**
	 * Discount from par value at the time the security is issued.
	 */
	public static final MMBusinessAssociationEnd OriginalIssueDiscount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalIssueDiscount";
			definition = "Discount from par value at the time the security is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Primary market or country where an asset is issued by the issuer or its
	 * agent.
	 */
	public static final MMBusinessAssociationEnd IssuePlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuePlace";
			definition = "Primary market or country where an asset is issued by the issuer or its agent.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}
	};
	/**
	 * Identifies if the security will be issued in New Global Note (NGN) or
	 * Classical Global Note (CGN).<br>
	 * New Global Note (NGN): Form of global certificate which refers to the
	 * books and records of the ICSDs to determine the issue outstanding amount
	 * (IOA). <br>
	 * Classical Global Note (CGN): Form of global certificate which requires
	 * physical annotation on the attached schedule to reflect changes in the
	 * issue outstanding amount (IOA).
	 */
	public static final MMBusinessAttribute GlobalNoteType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalNoteType";
			definition = "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).\r\nNew Global Note (NGN): Form of global certificate which refers to the books and records of the ICSDs to determine the issue outstanding amount (IOA). \r\nClassical Global Note (CGN): Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the issue outstanding amount (IOA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GlobalNoteCode.mmObject();
		}
	};
	/**
	 * Capital raised through the issuance of an asset.
	 */
	public static final MMBusinessAssociationEnd CapitalRaised = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalRaised";
			definition = "Capital raised through the issuance of an asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Capital.AssetIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Capital.mmObject();
		}
	};
	/**
	 * Period during which the security can be subscribed to.
	 */
	public static final MMBusinessAssociationEnd SubscriptionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionPeriod";
			definition = "Period during which the security can be subscribed to.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Minimum or incremental denomination required for the transfer or change
	 * of ownership of a security.
	 */
	public static final MMBusinessAssociationEnd Minimum = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Minimum";
			definition = "Minimum or incremental denomination required for the transfer or change of ownership of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Initial issue price of a financial instrument.
	 */
	public static final MMBusinessAttribute IssuePrice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Issuance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Issuance";
				definition = "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.Issuance, com.tools20022.repository.entity.SecuritiesPricing.Issuance, com.tools20022.repository.entity.TradingMarket.Issuance,
						com.tools20022.repository.entity.DateTimePeriod.Issuance, com.tools20022.repository.entity.SecuritiesQuantity.RelatedIssuance, com.tools20022.repository.entity.SecuritiesQuantity.Issuance,
						com.tools20022.repository.entity.CorporateActionEvent.Issuance, com.tools20022.repository.entity.RateAndAmount.InterestRelatedIssuance, com.tools20022.repository.entity.RateAndAmount.LossRelatedIssuance,
						com.tools20022.repository.entity.Capital.AssetIssuance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Issuance.IssueDate, com.tools20022.repository.entity.Issuance.IssueDiscountAllowance, com.tools20022.repository.entity.Issuance.InterestShortfall,
						com.tools20022.repository.entity.Issuance.RealisedLoss, com.tools20022.repository.entity.Issuance.Purpose, com.tools20022.repository.entity.Issuance.IssueSize,
						com.tools20022.repository.entity.Issuance.IssueNominalAmount, com.tools20022.repository.entity.Issuance.EventInformation, com.tools20022.repository.entity.Issuance.IssuedAsset,
						com.tools20022.repository.entity.Issuance.OriginalIssueDiscount, com.tools20022.repository.entity.Issuance.IssuePlace, com.tools20022.repository.entity.Issuance.GlobalNoteType,
						com.tools20022.repository.entity.Issuance.CapitalRaised, com.tools20022.repository.entity.Issuance.SubscriptionPeriod, com.tools20022.repository.entity.Issuance.Minimum,
						com.tools20022.repository.entity.Issuance.IssuePrice);
			}
		});
		return mmObject_lazy.get();
	}
}