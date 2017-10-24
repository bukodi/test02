package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.ClearingSystemMemberIdentification2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous identifier for a clearing system member, as assigned
 * by the clearing system. In some clearing systems, the accounts of the
 * clearing system members are also assigned an identifier. The identifier can
 * be used when transmitting, reconciling and confirming payment orders or
 * security transfer instructions prior to settlement, and may include the
 * netting of instructions and the establishment of final positions for
 * settlement.
 */
public class CashClearingSystemMember {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification parameters which include clearing system member
	 * identification.
	 */
	public static final MMBusinessAssociationEnd OrganisationIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationIdentification";
			definition = "Identification parameters which include clearing system member identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.ClearingSystemMemberIdentificationType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
		}
	};
	/**
	 * (United States) Clearing House Interbank Payments System (CHIPS)
	 * Universal Identification (UID) - identifies entities that own accounts at
	 * CHIPS participating financial institutions, through which CHIPS payments
	 * are effected. The CHIPS UID is assigned by the New York Clearing House.
	 */
	public static final MMBusinessAttribute CHIPSUniversalIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CHIPSUniversalIdentification";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CHIPSUniversalIdentifier.mmObject();
		}
	};
	/**
	 * New Zealand Bank/Branch Code - identifies New Zealand institutions on the
	 * New Zealand national clearing system. The code is assigned by the New
	 * Zealand Bankers' Association (NZBA).
	 */
	public static final MMBusinessAttribute NewZealandNCC = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewZealandNCC";
			definition = "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NewZealandNCCIdentifier.mmObject();
		}
	};
	/**
	 * Irish National Sorting Code - identifies Irish financial institutions on
	 * the Irish national clearing system. The code is assigned by the Irish
	 * Payments Services Organisation (IPSO).
	 */
	public static final MMBusinessAttribute IrishNSC = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IrishNSC";
			definition = "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IrishNSCIdentifier.mmObject();
		}
	};
	/**
	 * United Kingdom (UK) Sort Code - identifies British financial institutions
	 * on the British national clearing systems. The sort code is assigned by
	 * the Association for Payments and Clearing Services (APACS).
	 */
	public static final MMBusinessAttribute UKSortCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UKSortCode";
			definition = "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UKDomesticSortCodeIdentifier.mmObject();
		}
	};
	/**
	 * (United States) Clearing House Interbank Payment System (CHIPS)
	 * Participant Identifier (ID) - identifies financial institutions
	 * participating on CHIPS. The CHIPS Participant ID is assigned by the New
	 * York Clearing House.
	 */
	public static final MMBusinessAttribute CHIPSParticipantIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CHIPSParticipantIdentification";
			definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CHIPSParticipantIdentifier.mmObject();
		}
	};
	/**
	 * Swiss Bank Code - identifies Swiss institutions on the Swiss national
	 * clearing system.
	 */
	public static final MMBusinessAttribute SwissBC = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwissBC";
			definition = "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwissBCIdentifier.mmObject();
		}
	};
	/**
	 * Fed wire Routing Number - identifies financial institutions, in the US,
	 * on the Fed wire system. The routing number is assigned by the American
	 * Bankers Association (ABA).
	 */
	public static final MMBusinessAttribute FedwireRoutingNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FedwireRoutingNumber";
			definition = "Fed wire Routing Number - identifies financial institutions, in the US, on the Fed wire system. The routing number is assigned by the American Bankers Association (ABA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FedwireRoutingNumberIdentifier.mmObject();
		}
	};
	/**
	 * Portuguese National Clearing Code - identifies Portuguese financial
	 * institutions on the Portuguese national clearing system.
	 */
	public static final MMBusinessAttribute PortugueseNCC = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PortugueseNCC";
			definition = "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PortugueseNCCIdentifier.mmObject();
		}
	};
	/**
	 * Russian Central Bank Identification Code - identifies Russian financial
	 * institutions on the Russian national clearing system.
	 */
	public static final MMBusinessAttribute RussianCentralBankIdentificationCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RussianCentralBankIdentificationCode";
			definition = "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RussianCentralBankIdentificationCodeIdentifier.mmObject();
		}
	};
	/**
	 * Italian Domestic Identification Code - identifies Italian financial
	 * institutions on the Italian national clearing system. The code is
	 * assigned by the Associazione Bancaria Italiana (ABI).
	 */
	public static final MMBusinessAttribute ItalianDomesticIdentificationCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ItalianDomesticIdentificationCode";
			definition = "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ItalianDomesticIdentifier.mmObject();
		}
	};
	/**
	 * Austrian Bankleitzahl - identifies Austrian financial institutions on the
	 * Austrian national clearing system.
	 */
	public static final MMBusinessAttribute AustrianBankleitzahl = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AustrianBankleitzahl";
			definition = "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AustrianBankleitzahlIdentifier.mmObject();
		}
	};
	/**
	 * Canadian Payments Association Routing Number - identifies Canadian
	 * financial institutions on the Canadian national clearing system.
	 */
	public static final MMBusinessAttribute CanadianPaymentsAssociationRoutingNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CanadianPaymentsAssociationRoutingNumber";
			definition = "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CanadianPaymentsARNIdentifier.mmObject();
		}
	};
	/**
	 * Swiss Interbank Clearing (SIC) Code - identifies Swiss financial
	 * institutions domestically, on the Swiss national clearing system.
	 */
	public static final MMBusinessAttribute SwissSIC = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwissSIC";
			definition = "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwissSICIdentifier.mmObject();
		}
	};
	/**
	 * German Bankleitzahl - identifies German financial institutions on the
	 * German national clearing systems.
	 */
	public static final MMBusinessAttribute GermanBankleitzahl = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GermanBankleitzahl";
			definition = "German Bankleitzahl - identifies German financial institutions on the German national clearing systems.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GermanBankleitzahlIdentifier.mmObject();
		}
	};
	/**
	 * Spanish Domestic Interbanking Code - identifies Spanish financial
	 * institutions on the Spanish national clearing system. The code is
	 * assigned by the Centro de Cooperacion Interbancaria (CCI).
	 */
	public static final MMBusinessAttribute SpanishDomesticInterbankingCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpanishDomesticInterbankingCode";
			definition = "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SpanishDomesticInterbankingIdentifier.mmObject();
		}
	};
	/**
	 * South African National Clearing Code (NCC) - identifies South African
	 * financial institutions on the South African national clearing system. The
	 * code is assigned by the South African Bankers Services Company Ltd.
	 * (BankServ).
	 */
	public static final MMBusinessAttribute SouthAfricanNCC = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SouthAfricanNCC";
			definition = "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SouthAfricanNCCIdentifier.mmObject();
		}
	};
	/**
	 * Hong Kong Bank Code - identifies Hong Kong financial institutions on the
	 * Hong Kong local clearing system.
	 */
	public static final MMBusinessAttribute HongKongBankCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HongKongBankCode";
			definition = "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HongKongBankIdentifier.mmObject();
		}
	};
	/**
	 * Clearing system member for which a clearing system member identification
	 * is specified.
	 */
	public static final MMBusinessAssociationEnd ClearingMember = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingMember";
			definition = "Clearing system member for which a clearing system member identification is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.ClearingSystemMemberIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}
	};
	/**
	 * Indian Financial System Code - identifies Indian financial institutions
	 * on the Indian local clearing system.
	 */
	public static final MMBusinessAttribute IndianFinancialSystemCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndianFinancialSystemCode";
			definition = "Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IndianFinancialSystemCodeIdentifier.mmObject();
		}
	};
	/**
	 * Hellenic Bank Identification Code - identifies Hellenic financial
	 * institutions on the Hellenic national clearing system.
	 */
	public static final MMBusinessAttribute HellenicBankIdentificationCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HellenicBankIdentificationCode";
			definition = "Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HellenicBankIdentificationCodeIdentifier.mmObject();
		}
	};
	/**
	 * Polish National Clearing Code - identifies Polish financial institutions
	 * on the Polish national clearing system.
	 */
	public static final MMBusinessAttribute PolishNationalClearingCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PolishNationalClearingCode";
			definition = "Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PolishNationalClearingCodeIdentifier.mmObject();
		}
	};
	/**
	 * Australian Bank State Branch (BSB) Code - identifies Australian financial
	 * institutions on the Australian national clearing system. The code is
	 * assigned by the Australian Payments Clearing Association (APCA).
	 */
	public static final MMBusinessAssociationEnd AustralianBSBCode = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AustralianBSBCode";
			definition = "Australian Bank State Branch (BSB) Code - identifies Australian financial institutions on the Australian national clearing system. The code is assigned by the Australian Payments Clearing Association (APCA).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.ClearingSystemMemberIdentificationType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AustralianBSBIdentification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashClearingSystemMember";
				definition = "Unique and unambiguous identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier. The identifier can be used when transmitting, reconciling and confirming payment orders or security transfer instructions prior to settlement, and may include the netting of instructions and the establishment of final positions for settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.ClearingSystemMemberIdentificationType,
						com.tools20022.repository.entity.AustralianBSBIdentification.ClearingSystemMemberIdentificationType, com.tools20022.repository.entity.ClearingMemberRole.ClearingSystemMemberIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystemMember.OrganisationIdentification, com.tools20022.repository.entity.CashClearingSystemMember.CHIPSUniversalIdentification,
						com.tools20022.repository.entity.CashClearingSystemMember.NewZealandNCC, com.tools20022.repository.entity.CashClearingSystemMember.IrishNSC, com.tools20022.repository.entity.CashClearingSystemMember.UKSortCode,
						com.tools20022.repository.entity.CashClearingSystemMember.CHIPSParticipantIdentification, com.tools20022.repository.entity.CashClearingSystemMember.SwissBC,
						com.tools20022.repository.entity.CashClearingSystemMember.FedwireRoutingNumber, com.tools20022.repository.entity.CashClearingSystemMember.PortugueseNCC,
						com.tools20022.repository.entity.CashClearingSystemMember.RussianCentralBankIdentificationCode, com.tools20022.repository.entity.CashClearingSystemMember.ItalianDomesticIdentificationCode,
						com.tools20022.repository.entity.CashClearingSystemMember.AustrianBankleitzahl, com.tools20022.repository.entity.CashClearingSystemMember.CanadianPaymentsAssociationRoutingNumber,
						com.tools20022.repository.entity.CashClearingSystemMember.SwissSIC, com.tools20022.repository.entity.CashClearingSystemMember.GermanBankleitzahl,
						com.tools20022.repository.entity.CashClearingSystemMember.SpanishDomesticInterbankingCode, com.tools20022.repository.entity.CashClearingSystemMember.SouthAfricanNCC,
						com.tools20022.repository.entity.CashClearingSystemMember.HongKongBankCode, com.tools20022.repository.entity.CashClearingSystemMember.ClearingMember,
						com.tools20022.repository.entity.CashClearingSystemMember.IndianFinancialSystemCode, com.tools20022.repository.entity.CashClearingSystemMember.HellenicBankIdentificationCode,
						com.tools20022.repository.entity.CashClearingSystemMember.PolishNationalClearingCode, com.tools20022.repository.entity.CashClearingSystemMember.AustralianBSBCode);
				derivationComponent_lazy = () -> Arrays.asList(ClearingSystemMemberIdentification2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}