package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of service for which a charge is asked or paid.
 */
public class ChargeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fee paid to a broker for services provided.
	 */
	public static final MMCode BrokerageFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BrokerageFee";
			definition = "Fee paid to a broker for services provided.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "BRKF";
		}
	};
	/**
	 * Fee paid for services provided.
	 */
	public static final MMCode Commission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Fee paid for services provided.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Sales charge paid by the investor when redeeming an investment such as an
	 * investment fund.
	 */
	public static final MMCode BackEndLoad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackEndLoad";
			definition = "Sales charge paid by the investor when redeeming an investment such as an investment fund.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "BEND";
		}
	};
	/**
	 * Sales charge paid immediately by the investor when subscribing to an
	 * investment such as an investment fund.
	 */
	public static final MMCode FrontEndLoad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrontEndLoad";
			definition = "Sales charge paid immediately by the investor when subscribing to an investment such as an investment fund.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "FEND";
		}
	};
	/**
	 * In investment funds, charge related to a switch transaction.
	 */
	public static final MMCode Switch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Switch";
			definition = "In investment funds, charge related to a switch transaction.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SWIT";
		}
	};
	/**
	 * In investment funds, a charge payable by the investor covering bid-offer
	 * spreads and dealing charges for the underlying investments. The dilution
	 * levy is paid to the fund for the benefit of other unit holders.
	 */
	public static final MMCode DilutionLevy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DilutionLevy";
			definition = "In investment funds, a charge payable by the investor covering bid-offer spreads and dealing charges for the underlying investments. The dilution levy is paid to the fund for the benefit of other unit holders.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "DLEV";
		}
	};
	/**
	 * Charge that has been reduced from the standard initial charge levied by a
	 * fund, eg, during a launch period or as negotiated by a funds supermarket
	 * / discount broker.
	 */
	public static final MMCode Discount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discount";
			definition = "Charge that has been reduced from the standard initial charge levied by a fund, eg, during a launch period or as negotiated by a funds supermarket / discount broker.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Fee paid to an investment manager for services. The fee usually includes
	 * fund administration costs and investor relationship management.
	 * Typically, the amount paid is a percentage of the assets under
	 * management.
	 */
	public static final MMCode ManagementFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManagementFee";
			definition = "Fee paid to an investment manager for services. The fee usually includes fund administration costs and investor relationship management. Typically, the amount paid is a percentage of the assets under management.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "MANF";
		}
	};
	/**
	 * In investment funds, a fee charged for the transfer of ownership of an
	 * investment fund.
	 */
	public static final MMCode TransferFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferFee";
			definition = "In investment funds, a fee charged for the transfer of ownership of an investment fund.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Fee charged for matching and/or confirmation.
	 */
	public static final MMCode MatchingFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchingFees";
			definition = "Fee charged for matching and/or confirmation.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "MACO";
		}
	};
	/**
	 * Charge paid for the postage.
	 */
	public static final MMCode PostageCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostageCharge";
			definition = "Charge paid for the postage.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "POST";
		}
	};
	/**
	 * Fee charged by a regulatory authority, eg, Securities and Exchange fees.
	 */
	public static final MMCode RegulatoryFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegulatoryFee";
			definition = "Fee charged by a regulatory authority, eg, Securities and Exchange fees.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "REGF";
		}
	};
	/**
	 * Charge for shipping, including the insurance of securities.
	 */
	public static final MMCode ShippingCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShippingCharge";
			definition = "Charge for shipping, including the insurance of securities.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SHIP";
		}
	};
	/**
	 * Fee paid for the provision of financial services.
	 */
	public static final MMCode ServiceProvisionFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ServiceProvisionFee";
			definition = "Fee paid for the provision of financial services.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Charges, drawdown, or other reduction from or in addition to the deal
	 * price.
	 */
	public static final MMCode SpecialConcessions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialConcessions";
			definition = "Charges, drawdown, or other reduction from or in addition to the deal price.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SPCN";
		}
	};
	/**
	 * Portion of charge that the fund is entitled to receive, that cannot be
	 * reduced by an intermediary.
	 */
	public static final MMCode PartAcquis = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartAcquis";
			definition = "Portion of charge that the fund is entitled to receive, that cannot be reduced by an intermediary.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PACQ";
		}
	};
	/**
	 * Fee charged to the investor for early redemption of the fund.
	 */
	public static final MMCode Penalty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Penalty";
			definition = "Fee charged to the investor for early redemption of the fund.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PENA";
		}
	};
	/**
	 * Deferred sales charge.
	 */
	public static final MMCode ContingencyDeferredSalesCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContingencyDeferredSalesCharge";
			definition = "Deferred sales charge.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CDSC";
		}
	};
	/**
	 * Another type of charge.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of charge.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * The part of an investor's subscription amount that is held by the fund in
	 * order to pay incentive or performance fees at the end of the fiscal year.
	 */
	public static final MMCode Equalisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Equalisation";
			definition = "The part of an investor's subscription amount that is held by the fund in order to pay incentive or performance fees at the end of the fiscal year.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "EQUL";
		}
	};
	/**
	 * In investment funds, the charge of the correspondent bank for
	 * transferring money.
	 */
	public static final MMCode CorrespondentBankCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorrespondentBankCharge";
			definition = "In investment funds, the charge of the correspondent bank for transferring money.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CBCH";
		}
	};
	/**
	 * In investment funds, pre-arranged addition to the trade amount based on
	 * the published net asset value.
	 */
	public static final MMCode Premium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Premium";
			definition = "In investment funds, pre-arranged addition to the trade amount based on the published net asset value.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PREM";
		}
	};
	/**
	 * Charge paid at the time of the first subscription.
	 */
	public static final MMCode Initial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Initial";
			definition = "Charge paid at the time of the first subscription.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "INIT";
		}
	};
	/**
	 * Fee paid for advisory services rendered.
	 */
	public static final MMCode AdvisoryFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdvisoryFee";
			definition = "Fee paid for advisory services rendered.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "ADVI";
		}
	};
	/**
	 * Fee paid to a custodian in respect of custodial services.
	 */
	public static final MMCode CustodyFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustodyFee";
			definition = "Fee paid to a custodian in respect of custodial services.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Fee paid in respect of publications made.
	 */
	public static final MMCode PublicationFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PublicationFee";
			definition = "Fee paid in respect of publications made.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PUBL";
		}
	};
	/**
	 * Fee paid for accounting services rendered.
	 */
	public static final MMCode AccountingFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountingFee";
			definition = "Fee paid for accounting services rendered.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "ACCT";
		}
	};
	/**
	 * Charge is for signature services.
	 */
	public static final MMCode SignatureService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureService";
			definition = "Charge is for signature services.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SIGN";
		}
	};
	/**
	 * Charge is for storage of goods at destination.
	 */
	public static final MMCode StorageAtDestination = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StorageAtDestination";
			definition = "Charge is for storage of goods at destination.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "STDE";
		}
	};
	/**
	 * Charge is for storage of goods at origin.
	 */
	public static final MMCode StorageAtOrigin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StorageAtOrigin";
			definition = "Charge is for storage of goods at origin.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "STOR";
		}
	};
	/**
	 * Charge is for packaging of goods.
	 */
	public static final MMCode Packaging = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Charge is for packaging of goods.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Charge is for pick-up of goods.
	 */
	public static final MMCode PickUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PickUp";
			definition = "Charge is for pick-up of goods.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PICK";
		}
	};
	/**
	 * Charge is for dangerous goods.
	 */
	public static final MMCode DangerousGoodsFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DangerousGoodsFee";
			definition = "Charge is for dangerous goods.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "DNGR";
		}
	};
	/**
	 * Charge is for security.
	 */
	public static final MMCode SecurityCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityCharge";
			definition = "Charge is for security.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Charge is a premium for insurance.
	 */
	public static final MMCode InsurancePremium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsurancePremium";
			definition = "Charge is a premium for insurance.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "INSU";
		}
	};
	/**
	 * Charge is for the collection of the freight.
	 */
	public static final MMCode CollectFreight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectFreight";
			definition = "Charge is for the collection of the freight.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "COLF";
		}
	};
	/**
	 * Charge is for clearance and handling of goods at origin.
	 */
	public static final MMCode ClearanceAndHandlingAtOrigin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearanceAndHandlingAtOrigin";
			definition = "Charge is for clearance and handling of goods at origin.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CHOR";
		}
	};
	/**
	 * Charge is for clearance and handling of goods at destination.
	 */
	public static final MMCode ClearanceAndHandlingAtDestination = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearanceAndHandlingAtDestination";
			definition = "Charge is for clearance and handling of goods at destination.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CHDE";
		}
	};
	/**
	 * Charge is an airway bill fee.
	 */
	public static final MMCode AirWayBillFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AirWayBillFee";
			definition = "Charge is an airway bill fee.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "AIRF";
		}
	};
	/**
	 * Charge is for transport.
	 */
	public static final MMCode TransportCharges = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportCharges";
			definition = "Charge is for transport.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "TRPT";
		}
	};
	/**
	 * Charges paid by the investor to the Fund Company for subscription and
	 * redemption orders.
	 */
	public static final MMCode UCITSCommission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UCITSCommission";
			definition = "Charges paid by the investor to the Fund Company for subscription and redemption orders.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "UCIC";
		}
	};
	/**
	 * Specially agreed front-end load.
	 */
	public static final MMCode SpeciallyAgreedFrontEndLoad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpeciallyAgreedFrontEndLoad";
			definition = "Specially agreed front-end load.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SFEN";
		}
	};
	/**
	 * Charge linked to an ADR (American Depositary Receipt).
	 */
	public static final MMCode ADRFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ADRFee";
			definition = "Charge linked to an ADR (American Depositary Receipt).";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "ADRF";
		}
	};
	/**
	 * Fee linked to the cancellation of an issuance.
	 */
	public static final MMCode IssuanceCancellationFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuanceCancellationFee";
			definition = "Fee linked to the cancellation of an issuance.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "ISSC";
		}
	};
	/**
	 * Miscellaneous fee.
	 */
	public static final MMCode MiscellaneousFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MiscellaneousFee";
			definition = "Miscellaneous fee.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "MISC";
		}
	};
	/**
	 * Charge linked to the issuance of security.
	 */
	public static final MMCode IssuanceFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuanceFee";
			definition = "Charge linked to the issuance of security.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "ISSU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BRKF");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChargeTypeCode";
				definition = "Type of service for which a charge is asked or paid.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeTypeCode.BrokerageFee, com.tools20022.repository.codeset.ChargeTypeCode.Commission, com.tools20022.repository.codeset.ChargeTypeCode.BackEndLoad,
						com.tools20022.repository.codeset.ChargeTypeCode.FrontEndLoad, com.tools20022.repository.codeset.ChargeTypeCode.Switch, com.tools20022.repository.codeset.ChargeTypeCode.DilutionLevy,
						com.tools20022.repository.codeset.ChargeTypeCode.Discount, com.tools20022.repository.codeset.ChargeTypeCode.ManagementFee, com.tools20022.repository.codeset.ChargeTypeCode.TransferFee,
						com.tools20022.repository.codeset.ChargeTypeCode.MatchingFees, com.tools20022.repository.codeset.ChargeTypeCode.PostageCharge, com.tools20022.repository.codeset.ChargeTypeCode.RegulatoryFee,
						com.tools20022.repository.codeset.ChargeTypeCode.ShippingCharge, com.tools20022.repository.codeset.ChargeTypeCode.ServiceProvisionFee, com.tools20022.repository.codeset.ChargeTypeCode.SpecialConcessions,
						com.tools20022.repository.codeset.ChargeTypeCode.PartAcquis, com.tools20022.repository.codeset.ChargeTypeCode.Penalty, com.tools20022.repository.codeset.ChargeTypeCode.ContingencyDeferredSalesCharge,
						com.tools20022.repository.codeset.ChargeTypeCode.Other, com.tools20022.repository.codeset.ChargeTypeCode.Equalisation, com.tools20022.repository.codeset.ChargeTypeCode.CorrespondentBankCharge,
						com.tools20022.repository.codeset.ChargeTypeCode.Premium, com.tools20022.repository.codeset.ChargeTypeCode.Initial, com.tools20022.repository.codeset.ChargeTypeCode.AdvisoryFee,
						com.tools20022.repository.codeset.ChargeTypeCode.CustodyFee, com.tools20022.repository.codeset.ChargeTypeCode.PublicationFee, com.tools20022.repository.codeset.ChargeTypeCode.AccountingFee,
						com.tools20022.repository.codeset.ChargeTypeCode.SignatureService, com.tools20022.repository.codeset.ChargeTypeCode.StorageAtDestination, com.tools20022.repository.codeset.ChargeTypeCode.StorageAtOrigin,
						com.tools20022.repository.codeset.ChargeTypeCode.Packaging, com.tools20022.repository.codeset.ChargeTypeCode.PickUp, com.tools20022.repository.codeset.ChargeTypeCode.DangerousGoodsFee,
						com.tools20022.repository.codeset.ChargeTypeCode.SecurityCharge, com.tools20022.repository.codeset.ChargeTypeCode.InsurancePremium, com.tools20022.repository.codeset.ChargeTypeCode.CollectFreight,
						com.tools20022.repository.codeset.ChargeTypeCode.ClearanceAndHandlingAtOrigin, com.tools20022.repository.codeset.ChargeTypeCode.ClearanceAndHandlingAtDestination,
						com.tools20022.repository.codeset.ChargeTypeCode.AirWayBillFee, com.tools20022.repository.codeset.ChargeTypeCode.TransportCharges, com.tools20022.repository.codeset.ChargeTypeCode.UCITSCommission,
						com.tools20022.repository.codeset.ChargeTypeCode.SpeciallyAgreedFrontEndLoad, com.tools20022.repository.codeset.ChargeTypeCode.ADRFee, com.tools20022.repository.codeset.ChargeTypeCode.IssuanceCancellationFee,
						com.tools20022.repository.codeset.ChargeTypeCode.MiscellaneousFee, com.tools20022.repository.codeset.ChargeTypeCode.IssuanceFee);
			}
		});
		return mmObject_lazy.get();
	}
}