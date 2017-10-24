package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specification of a pre-agreed offering between clearing agents or the channel
 * through which the payment instruction is to be processed.
 */
public class CashClearingSystemCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Scheme code for EBA Euro1/Step1.
	 */
	public static final MMCode EBAEuro1Step1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EBAEuro1Step1";
			definition = "Scheme code for EBA Euro1/Step1.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "ABE";
		}
	};
	/**
	 * Scheme code for AT (Austria) - Austrian RTGS (ARTIS).
	 */
	public static final MMCode Austrian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Austrian";
			definition = "Scheme code for AT (Austria) - Austrian RTGS (ARTIS).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "ART";
		}
	};
	/**
	 * Scheme code for NZ (New Zealand) - New Zealand Assured Value Payments.
	 */
	public static final MMCode NewZealand = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewZealand";
			definition = "Scheme code for NZ (New Zealand) - New Zealand Assured Value Payments.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "AVP";
		}
	};
	/**
	 * Scheme code for AZ (Azerbaijan) - Azerbaijan Interbank Payment System
	 * (AZIPS).
	 */
	public static final MMCode Azerbaijan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Azerbaijan";
			definition = "Scheme code for AZ (Azerbaijan) - Azerbaijan Interbank Payment System (AZIPS).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "AZM";
		}
	};
	/**
	 * Scheme code for BA (Bosnia and Herzegovina).
	 */
	public static final MMCode BosniaHerzegovina = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BosniaHerzegovina";
			definition = "Scheme code for BA (Bosnia and Herzegovina).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "BAP";
		}
	};
	/**
	 * Scheme code for BE (Belgium) - Belgium RTGS (ELLIPS).
	 */
	public static final MMCode Belgium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Belgium";
			definition = "Scheme code for BE (Belgium) - Belgium RTGS (ELLIPS).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "BEL";
		}
	};
	/**
	 * Scheme code for FI (Finland) - RTGS (BOF).
	 */
	public static final MMCode Finland = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Finland";
			definition = "Scheme code for FI (Finland) - RTGS (BOF).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "BOF";
		}
	};
	/**
	 * Scheme code for IT (Italy) - Italy RTGS (BIREL).
	 */
	public static final MMCode Italy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Italy";
			definition = "Scheme code for IT (Italy) - Italy RTGS (BIREL).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "BRL";
		}
	};
	/**
	 * Scheme code for CA (Canada) - Canadian Large Value Transfer System (LVTS)
	 */
	public static final MMCode Canada = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Canada";
			definition = "Scheme code for CA (Canada) - Canadian Large Value Transfer System (LVTS)";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "CAD";
		}
	};
	/**
	 * Scheme code for ES (Spain).
	 */
	public static final MMCode SpainCAM = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpainCAM";
			definition = "Scheme code for ES (Spain).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "CAM";
		}
	};
	/**
	 * Scheme code for IE (Ireland) - Irish RTGS (IRIS).
	 */
	public static final MMCode Ireland = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Ireland";
			definition = "Scheme code for IE (Ireland) - Irish RTGS (IRIS).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "CBJ";
		}
	};
	/**
	 * Scheme code for GB (UK) - British Euro RTGS (CHAPS).
	 */
	public static final MMCode UnitedKingdom = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitedKingdom";
			definition = "Scheme code for GB (UK) - British Euro RTGS (CHAPS).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "CHP";
		}
	};
	/**
	 * Scheme code for DK (Denmark) - Danish Euro RTGS (KRONOS)
	 */
	public static final MMCode Denmark = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Denmark";
			definition = "Scheme code for DK (Denmark) - Danish Euro RTGS (KRONOS)";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "DKC";
		}
	};
	/**
	 * Scheme code for DE (Germany).
	 */
	public static final MMCode GermanyRTGSPlus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GermanyRTGSPlus";
			definition = "Scheme code for DE (Germany).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "RTP";
		}
	};
	/**
	 * Scheme code for EBA Euro1.
	 */
	public static final MMCode EBAEuro1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EBAEuro1";
			definition = "Scheme code for EBA Euro1.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "EBA";
		}
	};
	/**
	 * Scheme code for DE (Germany).
	 */
	public static final MMCode GermanyELS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GermanyELS";
			definition = "Scheme code for DE (Germany).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "ELS";
		}
	};
	/**
	 * Scheme code for EBA step 1 (members).
	 */
	public static final MMCode EBAStep1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EBAStep1";
			definition = "Scheme code for EBA step 1 (members).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "ERP";
		}
	};
	/**
	 * Scheme code for EBA step 2.
	 */
	public static final MMCode EBAStep2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EBAStep2";
			definition = "Scheme code for EBA step 2.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "XCT";
		}
	};
	/**
	 * Scheme code for HR (Croatia) - HSVP.
	 */
	public static final MMCode Croatia = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Croatia";
			definition = "Scheme code for HR (Croatia) - HSVP.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "HRK";
		}
	};
	/**
	 * Scheme code for GR (Greece) - Greek RTGS (HERMES).
	 */
	public static final MMCode Greece = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Greece";
			definition = "Scheme code for GR (Greece) - Greek RTGS (HERMES).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "HRM";
		}
	};
	/**
	 * Scheme code for HU (Hungary) - VIBER.
	 */
	public static final MMCode Hungary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Hungary";
			definition = "Scheme code for HU (Hungary) - VIBER.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "HUF";
		}
	};
	/**
	 * Scheme code for LU (Luxemburg) - Luxembourg RTGS (LIPS).
	 */
	public static final MMCode Luxemburg = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Luxemburg";
			definition = "Scheme code for LU (Luxemburg) - Luxembourg RTGS (LIPS).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "LGS";
		}
	};
	/**
	 * Scheme code for LV (Latvia).
	 */
	public static final MMCode Latvia = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Latvia";
			definition = "Scheme code for LV (Latvia).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "LVL";
		}
	};
	/**
	 * Scheme code for ZA (South Africa) - South-African Multiple Option
	 * Settlement.
	 */
	public static final MMCode SouthAfrica = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SouthAfrica";
			definition = "Scheme code for ZA (South Africa) - South-African Multiple Option Settlement.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "MOS";
		}
	};
	/**
	 * Scheme code for MU (Mauritius).
	 */
	public static final MMCode Mauritius = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mauritius";
			definition = "Scheme code for MU (Mauritius).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "MUP";
		}
	};
	/**
	 * Scheme code for NO (Norway).
	 */
	public static final MMCode Norway = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Norway";
			definition = "Scheme code for NO (Norway).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "NOC";
		}
	};
	/**
	 * Scheme code for CH (Switzerland).
	 */
	public static final MMCode Switzerland = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Switzerland";
			definition = "Scheme code for CH (Switzerland).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "PCH";
		}
	};
	/**
	 * Scheme code for AU (Australia).
	 */
	public static final MMCode Australia = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Australia";
			definition = "Scheme code for AU (Australia).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "PDS";
		}
	};
	/**
	 * Scheme code for EG (Egypt).
	 */
	public static final MMCode Egypt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Egypt";
			definition = "Scheme code for EG (Egypt).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "PEG";
		}
	};
	/**
	 * Scheme code for FR (France).
	 */
	public static final MMCode FrancePNS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrancePNS";
			definition = "Scheme code for FR (France).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "PNS";
		}
	};
	/**
	 * Scheme code for Ve (Venezuela).
	 */
	public static final MMCode Venezuela = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Venezuela";
			definition = "Scheme code for Ve (Venezuela).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "PVE";
		}
	};
	/**
	 * Scheme code for SE (Sweden) - Swedish Euro RTGS (SEC).
	 */
	public static final MMCode SwedenSEC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwedenSEC";
			definition = "Scheme code for SE (Sweden) - Swedish Euro RTGS (SEC).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "SEC";
		}
	};
	/**
	 * Scheme code for SI (Slovenia).
	 */
	public static final MMCode Slovania = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Slovania";
			definition = "Scheme code for SI (Slovenia).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "SIT";
		}
	};
	/**
	 * Scheme code for ES (Spain) - Spanish RTGS (SLBE).
	 */
	public static final MMCode SpainES = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpainES";
			definition = "Scheme code for ES (Spain) - Spanish RTGS (SLBE).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "SLB";
		}
	};
	/**
	 * Scheme code for PT (Portugal) - Portuguese RTGS (SPGT).
	 */
	public static final MMCode Portugal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portugal";
			definition = "Scheme code for PT (Portugal) - Portuguese RTGS (SPGT).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "SPG";
		}
	};
	/**
	 * Scheme code for SE (Sweden) - SEK RTGS (RIX).
	 */
	public static final MMCode SwedenSSK = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwedenSSK";
			definition = "Scheme code for SE (Sweden) - SEK RTGS (RIX).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "SSK";
		}
	};
	/**
	 * Scheme code for FR (France) - French RTGS (TBF).
	 */
	public static final MMCode FranceFR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FranceFR";
			definition = "Scheme code for FR (France) - French RTGS (TBF).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "TBF";
		}
	};
	/**
	 * Scheme code for Target.
	 */
	public static final MMCode Target = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Target";
			definition = "Scheme code for Target.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "TGT";
		}
	};
	/**
	 * Scheme code for NL (Netherlands) - Dutch RTGS (TOP)
	 */
	public static final MMCode Netherlands = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netherlands";
			definition = "Scheme code for NL (Netherlands) - Dutch RTGS (TOP)";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "TOP";
		}
	};
	/**
	 * Scheme code for the US national real time gross settlement system.
	 */
	public static final MMCode Fedwire = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fedwire";
			definition = "Scheme code for the US national real time gross settlement system.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "FDW";
		}
	};
	/**
	 * Scheme code for the Bank of Japan clearing system.
	 */
	public static final MMCode BankOfJapanNet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankOfJapanNet";
			definition = "Scheme code for the Bank of Japan clearing system.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "BOJ";
		}
	};
	/**
	 * Scheme code for the Foreign Exchange Yen Clearing system (FEYCS). It is
	 * the Japanese electronic interbank system for sending guaranteed and
	 * unconditional yen payments of FX deals for same day settlement from one
	 * settlement bank, on behalf of itself or its customers, to another
	 * settlement bank.
	 */
	public static final MMCode ForeignExchangeYenClearing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeYenClearing";
			definition = "Scheme code for the Foreign Exchange Yen Clearing system (FEYCS). It is the Japanese electronic interbank system for sending guaranteed and unconditional yen payments of FX deals for same day settlement from one settlement bank, on behalf of itself or its customers, to another settlement bank.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "FEY";
		}
	};
	/**
	 * Scheme code for the Zengin system. The electronic payment system for
	 * domestic third party transfers managed by the Tokyo Bankers Association.
	 */
	public static final MMCode Zengin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Zengin";
			definition = "Scheme code for the Zengin system. The electronic payment system for domestic third party transfers managed by the Tokyo Bankers Association.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "ZEN";
		}
	};
	/**
	 * Real Time Gross Settlement System. Payment system that simultaneously
	 * clears individual transfers and settles them in central bank money.
	 */
	public static final MMCode RTGS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RTGS";
			definition = "Real Time Gross Settlement System. Payment system that simultaneously clears individual transfers and settles them in central bank money.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "RTG";
		}
	};
	/**
	 * Automated Clearing House. Payment system that clears cash transfers and
	 * settles the proceeds in a lump sum, usually on a multilateral netting
	 * basis.
	 */
	public static final MMCode ACH = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ACH";
			definition = "Automated Clearing House. Payment system that clears cash transfers and settles the proceeds in a lump sum, usually on a multilateral netting basis.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "ACH";
		}
	};
	/**
	 * CHIPS is the Clearing House Interbank Payment System in the US.
	 */
	public static final MMCode USChips = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USChips";
			definition = "CHIPS is the Clearing House Interbank Payment System in the US.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "CHI";
		}
	};
	/**
	 * FedNet is a link to a Federal Bank account via the internet. FedNet
	 * enables checking of account balance, transactions, take print outs of
	 * account statement, transfer funds to third party accounts, E-shopping,
	 * BSNL Payments, Deposit opening, Deposit Renewal, Request for Demand
	 * Draft, Cheque Book etc.
	 */
	public static final MMCode FedNet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FedNet";
			definition = "FedNet is a link to a Federal Bank account via the internet.  FedNet enables checking of account balance, transactions, take print outs of account statement, transfer funds to third party accounts, E-shopping, BSNL Payments, Deposit opening, Deposit Renewal, Request for Demand Draft, Cheque Book etc.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "FDN";
		}
	};
	/**
	 * Scheme code for DK (Denmark) - Danish Krone RTGS (KRONOS)
	 */
	public static final MMCode DenmarkDDK = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DenmarkDDK";
			definition = "Scheme code for DK (Denmark) - Danish Krone RTGS (KRONOS)";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "DDK";
		}
	};
	/**
	 * Scheme code for AL (Albania) - Albania Interbank Payment System.
	 */
	public static final MMCode Albania = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Albania";
			definition = "Scheme code for AL (Albania) -  Albania Interbank Payment System.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "AIP";
		}
	};
	/**
	 * Scheme code for SE (Sweden) - Sweden BGC Clearing CUG.
	 */
	public static final MMCode SwedenBGC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwedenBGC";
			definition = "Scheme code for SE (Sweden) - Sweden BGC Clearing CUG.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "BCC";
		}
	};
	/**
	 * Scheme code for BB (Barbados) - Barbados RTGS (CBRTGS).
	 */
	public static final MMCode Barbados = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Barbados";
			definition = "Scheme code for BB (Barbados) - Barbados RTGS (CBRTGS).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "BDS";
		}
	};
	/**
	 * Scheme code for BG (Bulgaria) - Bulgaria RTGS.
	 */
	public static final MMCode Bulgaria = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bulgaria";
			definition = "Scheme code for BG (Bulgaria) - Bulgaria RTGS.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "BGN";
		}
	};
	/**
	 * Scheme code for BS (Bahamas) - Bahamas RTGS.
	 */
	public static final MMCode Bahamas = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bahamas";
			definition = "Scheme code for BS (Bahamas) - Bahamas RTGS.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "BHS";
		}
	};
	/**
	 * Scheme code for BW (Botswana) - Botswana Interbank Settlement System.
	 */
	public static final MMCode Botswana = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Botswana";
			definition = "Scheme code for BW (Botswana) - Botswana Interbank Settlement System.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "BIS";
		}
	};
	/**
	 * Scheme code for PH (Philippines) - Philippines Payment System.
	 */
	public static final MMCode Philippines = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Philippines";
			definition = "Scheme code for PH (Philippines) - Philippines Payment System.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "BSP";
		}
	};
	/**
	 * Scheme code for ECB (European Central Bank) - ECB Payment Mechanism.
	 */
	public static final MMCode ECB = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ECB";
			definition = "Scheme code for ECB (European Central Bank) - ECB Payment Mechanism.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "EPM";
		}
	};
	/**
	 * Scheme code for the US CHIPS-ACH.
	 */
	public static final MMCode USChipsACH = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USChipsACH";
			definition = "Scheme code for the US CHIPS-ACH.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "EPN";
		}
	};
	/**
	 * Scheme code for the US FED-ACH.
	 */
	public static final MMCode USFedACH = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USFedACH";
			definition = "Scheme code for the US FED-ACH.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "FDA";
		}
	};
	/**
	 * Scheme code for GH (Ghana) - Ghana Interbank Settlement System (GISS).
	 */
	public static final MMCode Ghana = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Ghana";
			definition = "Scheme code for GH (Ghana) - Ghana Interbank Settlement System (GISS).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "GIS";
		}
	};
	/**
	 * Scheme code for NL (Netherlands) - Netherlands Interpay CUG.
	 */
	public static final MMCode NetherlandsIP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetherlandsIP";
			definition = "Scheme code for NL (Netherlands) - Netherlands Interpay CUG.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "INC";
		}
	};
	/**
	 * Scheme code for JO (Jordan) - Jordan RTGS.
	 */
	public static final MMCode Jordan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Jordan";
			definition = "Scheme code for JO (Jordan) - Jordan RTGS.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "JOD";
		}
	};
	/**
	 * Scheme code for KE (Kenya) - Kenyan Electronic Payment Settlement System.
	 */
	public static final MMCode Kenya = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Kenya";
			definition = "Scheme code for KE (Kenya) - Kenyan Electronic Payment Settlement System.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "KPS";
		}
	};
	/**
	 * Scheme code for LK (Sri Lanka) - Sri Lanka (Lankasettle).
	 */
	public static final MMCode SriLanka = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SriLanka";
			definition = "Scheme code for LK (Sri Lanka) - Sri Lanka (Lankasettle).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "LKB";
		}
	};
	/**
	 * Scheme code for SG (Singapore) - Singapore RTGS (MEPS+).
	 */
	public static final MMCode Singapore = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Singapore";
			definition = "Scheme code for SG (Singapore) - Singapore RTGS (MEPS+).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "MEP";
		}
	};
	/**
	 * Scheme code for MT (Malta) - Malta Realtime Interbank Settlement System.
	 */
	public static final MMCode Malta = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Malta";
			definition = "Scheme code for MT (Malta) - Malta Realtime Interbank Settlement System.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "MRS";
		}
	};
	/**
	 * Scheme code for NA (Namibian) - Namibian Interbank Settlement System.
	 */
	public static final MMCode Namibia = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Namibia";
			definition = "Scheme code for NA (Namibian) - Namibian Interbank Settlement System.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "NAM";
		}
	};
	/**
	 * Scheme code for AO (Angola) - Angola RTGS.
	 */
	public static final MMCode Angola = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Angola";
			definition = "Scheme code for AO (Angola) - Angola RTGS.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "PTR";
		}
	};
	/**
	 * Scheme code for RO (Romania) - Romanian Electronic Payment Operations RT.
	 */
	public static final MMCode RomaniaEPO = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RomaniaEPO";
			definition = "Scheme code for RO (Romania) - Romanian Electronic Payment Operations RT.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "ROL";
		}
	};
	/**
	 * Scheme code for RO (Romania) - Romanian GSRS.
	 */
	public static final MMCode RomaniaGSRS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RomaniaGSRS";
			definition = "Scheme code for RO (Romania) - Romanian GSRS.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "ROS";
		}
	};
	/**
	 * Scheme code for CL (Chile) - Chilean Interbank Payment System.
	 */
	public static final MMCode Chili = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Chili";
			definition = "Scheme code for CL (Chile) - Chilean Interbank Payment System.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "SCP";
		}
	};
	/**
	 * Scheme code for UK (United Kingdom) - CHAPS Sterling RTGS.
	 */
	public static final MMCode UnitedKingdomGBP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitedKingdomGBP";
			definition = "Scheme code for UK (United Kingdom) - CHAPS Sterling RTGS.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "STG";
		}
	};
	/**
	 * Scheme code for TH (Thailand) - Thailand Payment System (Bahtnet/2).
	 */
	public static final MMCode Thailand = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Thailand";
			definition = "Scheme code for TH (Thailand) - Thailand Payment System (Bahtnet/2).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "THB";
		}
	};
	/**
	 * Scheme code for TZ (Tanzania) - Tanzania Interbank Settlement System
	 * (TISS).
	 */
	public static final MMCode Tanzania = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tanzania";
			definition = "Scheme code for TZ (Tanzania) - Tanzania Interbank Settlement System (TISS).";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "TIS";
		}
	};
	/**
	 * Scheme code for TT (Trinidad and Tobago ) - Trinidad and Tobago SAFE-TT.
	 */
	public static final MMCode TrinidadAndTobago = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TrinidadAndTobago";
			definition = "Scheme code for TT (Trinidad and Tobago ) - Trinidad and Tobago SAFE-TT.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "TTD";
		}
	};
	/**
	 * Scheme code for UG (Uganda) - Uganda National Interbank Settlement
	 * System.
	 */
	public static final MMCode Uganda = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Uganda";
			definition = "Scheme code for UG (Uganda) - Uganda National Interbank Settlement System.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "UIS";
		}
	};
	/**
	 * Scheme code for ZW (Zimbabwe) - Zimbabwe Electronic Transfer &amp;
	 * Settlement System.
	 */
	public static final MMCode Zimbabwe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Zimbabwe";
			definition = "Scheme code for ZW (Zimbabwe) - Zimbabwe Electronic Transfer & Settlement System.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "ZET";
		}
	};
	/**
	 * Scheme code for ZM (Zambia) - Zambian Interbank Payment &amp;Settlement
	 * System.
	 */
	public static final MMCode Zambia = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Zambia";
			definition = "Scheme code for ZM (Zambia) - Zambian Interbank Payment &Settlement System.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "ZIS";
		}
	};
	/**
	 * Scheme code for Columbia (CO) - Colombian ACH CENIT Central Bank Payment
	 * System.
	 */
	public static final MMCode Columbia = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Columbia";
			definition = "Scheme code for Columbia (CO) - Colombian ACH CENIT Central Bank Payment System.";
			owner_lazy = () -> CashClearingSystemCode.mmObject();
			codeName = "COP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ABE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashClearingSystemCode";
				definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is to be processed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashClearingSystemCode.EBAEuro1Step1, com.tools20022.repository.codeset.CashClearingSystemCode.Austrian,
						com.tools20022.repository.codeset.CashClearingSystemCode.NewZealand, com.tools20022.repository.codeset.CashClearingSystemCode.Azerbaijan, com.tools20022.repository.codeset.CashClearingSystemCode.BosniaHerzegovina,
						com.tools20022.repository.codeset.CashClearingSystemCode.Belgium, com.tools20022.repository.codeset.CashClearingSystemCode.Finland, com.tools20022.repository.codeset.CashClearingSystemCode.Italy,
						com.tools20022.repository.codeset.CashClearingSystemCode.Canada, com.tools20022.repository.codeset.CashClearingSystemCode.SpainCAM, com.tools20022.repository.codeset.CashClearingSystemCode.Ireland,
						com.tools20022.repository.codeset.CashClearingSystemCode.UnitedKingdom, com.tools20022.repository.codeset.CashClearingSystemCode.Denmark, com.tools20022.repository.codeset.CashClearingSystemCode.GermanyRTGSPlus,
						com.tools20022.repository.codeset.CashClearingSystemCode.EBAEuro1, com.tools20022.repository.codeset.CashClearingSystemCode.GermanyELS, com.tools20022.repository.codeset.CashClearingSystemCode.EBAStep1,
						com.tools20022.repository.codeset.CashClearingSystemCode.EBAStep2, com.tools20022.repository.codeset.CashClearingSystemCode.Croatia, com.tools20022.repository.codeset.CashClearingSystemCode.Greece,
						com.tools20022.repository.codeset.CashClearingSystemCode.Hungary, com.tools20022.repository.codeset.CashClearingSystemCode.Luxemburg, com.tools20022.repository.codeset.CashClearingSystemCode.Latvia,
						com.tools20022.repository.codeset.CashClearingSystemCode.SouthAfrica, com.tools20022.repository.codeset.CashClearingSystemCode.Mauritius, com.tools20022.repository.codeset.CashClearingSystemCode.Norway,
						com.tools20022.repository.codeset.CashClearingSystemCode.Switzerland, com.tools20022.repository.codeset.CashClearingSystemCode.Australia, com.tools20022.repository.codeset.CashClearingSystemCode.Egypt,
						com.tools20022.repository.codeset.CashClearingSystemCode.FrancePNS, com.tools20022.repository.codeset.CashClearingSystemCode.Venezuela, com.tools20022.repository.codeset.CashClearingSystemCode.SwedenSEC,
						com.tools20022.repository.codeset.CashClearingSystemCode.Slovania, com.tools20022.repository.codeset.CashClearingSystemCode.SpainES, com.tools20022.repository.codeset.CashClearingSystemCode.Portugal,
						com.tools20022.repository.codeset.CashClearingSystemCode.SwedenSSK, com.tools20022.repository.codeset.CashClearingSystemCode.FranceFR, com.tools20022.repository.codeset.CashClearingSystemCode.Target,
						com.tools20022.repository.codeset.CashClearingSystemCode.Netherlands, com.tools20022.repository.codeset.CashClearingSystemCode.Fedwire, com.tools20022.repository.codeset.CashClearingSystemCode.BankOfJapanNet,
						com.tools20022.repository.codeset.CashClearingSystemCode.ForeignExchangeYenClearing, com.tools20022.repository.codeset.CashClearingSystemCode.Zengin, com.tools20022.repository.codeset.CashClearingSystemCode.RTGS,
						com.tools20022.repository.codeset.CashClearingSystemCode.ACH, com.tools20022.repository.codeset.CashClearingSystemCode.USChips, com.tools20022.repository.codeset.CashClearingSystemCode.FedNet,
						com.tools20022.repository.codeset.CashClearingSystemCode.DenmarkDDK, com.tools20022.repository.codeset.CashClearingSystemCode.Albania, com.tools20022.repository.codeset.CashClearingSystemCode.SwedenBGC,
						com.tools20022.repository.codeset.CashClearingSystemCode.Barbados, com.tools20022.repository.codeset.CashClearingSystemCode.Bulgaria, com.tools20022.repository.codeset.CashClearingSystemCode.Bahamas,
						com.tools20022.repository.codeset.CashClearingSystemCode.Botswana, com.tools20022.repository.codeset.CashClearingSystemCode.Philippines, com.tools20022.repository.codeset.CashClearingSystemCode.ECB,
						com.tools20022.repository.codeset.CashClearingSystemCode.USChipsACH, com.tools20022.repository.codeset.CashClearingSystemCode.USFedACH, com.tools20022.repository.codeset.CashClearingSystemCode.Ghana,
						com.tools20022.repository.codeset.CashClearingSystemCode.NetherlandsIP, com.tools20022.repository.codeset.CashClearingSystemCode.Jordan, com.tools20022.repository.codeset.CashClearingSystemCode.Kenya,
						com.tools20022.repository.codeset.CashClearingSystemCode.SriLanka, com.tools20022.repository.codeset.CashClearingSystemCode.Singapore, com.tools20022.repository.codeset.CashClearingSystemCode.Malta,
						com.tools20022.repository.codeset.CashClearingSystemCode.Namibia, com.tools20022.repository.codeset.CashClearingSystemCode.Angola, com.tools20022.repository.codeset.CashClearingSystemCode.RomaniaEPO,
						com.tools20022.repository.codeset.CashClearingSystemCode.RomaniaGSRS, com.tools20022.repository.codeset.CashClearingSystemCode.Chili, com.tools20022.repository.codeset.CashClearingSystemCode.UnitedKingdomGBP,
						com.tools20022.repository.codeset.CashClearingSystemCode.Thailand, com.tools20022.repository.codeset.CashClearingSystemCode.Tanzania, com.tools20022.repository.codeset.CashClearingSystemCode.TrinidadAndTobago,
						com.tools20022.repository.codeset.CashClearingSystemCode.Uganda, com.tools20022.repository.codeset.CashClearingSystemCode.Zimbabwe, com.tools20022.repository.codeset.CashClearingSystemCode.Zambia,
						com.tools20022.repository.codeset.CashClearingSystemCode.Columbia);
			}
		});
		return mmObject_lazy.get();
	}
}