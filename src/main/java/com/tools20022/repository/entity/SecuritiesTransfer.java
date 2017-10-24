package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PartialSettlementCode;
import com.tools20022.repository.codeset.TransferReasonCode;
import com.tools20022.repository.codeset.TransferTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ObligationFulfilment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 */
public class SecuritiesTransfer extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of a transfer, as assigned by the
	 * instructing party.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a transfer, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Total quantity of securities settled.
	 */
	public static final MMBusinessAssociationEnd TransferredQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredQuantity";
			definition = "Total quantity of securities settled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Specifies the account from/to which the securities are transferred.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Specifies the account from/to which the securities are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Specifies whether the financial instrument is transferred as an asset or
	 * as cash.
	 */
	public static final MMBusinessAttribute TransferType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferType";
			definition = "Specifies whether the financial instrument is transferred as an asset or as cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferTypeCode.mmObject();
		}
	};
	/**
	 * Settlement process which is the source of the transfer operation.
	 */
	public static final MMBusinessAssociationEnd RelatedSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSettlement";
			definition = "Settlement process which is the source of the transfer operation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.TransferOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}
	};
	/**
	 * Indicates whether the transfer results in a change of beneficial owner.
	 */
	public static final MMBusinessAttribute OwnAccountTransferIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information related to physical delivery of the securities.
	 */
	public static final MMBusinessAssociationEnd PhysicalDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDelivery";
			definition = "Information related to physical delivery of the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.RelatedTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
		}
	};
	/**
	 * Date and time after the settlement date specified in the trade, used for
	 * pool trades resulting from the original To Be Assigned (TBA) securities.
	 */
	public static final MMBusinessAttribute LateDeliveryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LateDeliveryDate";
			definition = "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Tax related to the transfer of a financial instrument.
	 */
	public static final MMBusinessAssociationEnd TransferTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferTax";
			definition = "Tax related to the transfer of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}
	};
	/**
	 * Identifies the transfer reason.
	 */
	public static final MMBusinessAttribute TransferReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferReason";
			definition = "Identifies the transfer reason.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferReasonCode.mmObject();
		}
	};
	/**
	 * Information about partial settlement.
	 */
	public static final MMBusinessAttribute PartialSettlementType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementType";
			definition = "Information about partial settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartialSettlementCode.mmObject();
		}
	};
	/**
	 * Obligation for one party to deliver securities to another party.
	 */
	public static final MMBusinessAssociationEnd SecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Obligation for one party to deliver securities to another party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}
	};
	/**
	 * Record in a securities account resulting from the transfer of a security.
	 */
	public static final MMBusinessAssociationEnd BookEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Record in a securities account resulting from the transfer of a security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.TriggeringSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesEntry.mmObject();
		}
	};
	/**
	 * Unambiguous identification of a securities transfer.
	 */
	public static final MMBusinessAttribute TransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Security which is transferred.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Status of a securities transfer.
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.RelatedSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTradeStatus.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransfer";
				definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesAccount.RelatedTransfer,
						com.tools20022.repository.entity.Tax.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesSettlement.TransferOperation,
						com.tools20022.repository.entity.SecuritiesEntry.TriggeringSecuritiesTransfer, com.tools20022.repository.entity.PhysicalDelivery.RelatedTransfer,
						com.tools20022.repository.entity.SecuritiesTradeStatus.RelatedSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTransfer);
				subType_lazy = () -> Arrays.asList(IntraPositionTransfer.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTransfer.Identification, com.tools20022.repository.entity.SecuritiesTransfer.TransferredQuantity,
						com.tools20022.repository.entity.SecuritiesTransfer.Account, com.tools20022.repository.entity.SecuritiesTransfer.TransferType, com.tools20022.repository.entity.SecuritiesTransfer.RelatedSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.OwnAccountTransferIndicator, com.tools20022.repository.entity.SecuritiesTransfer.PhysicalDelivery,
						com.tools20022.repository.entity.SecuritiesTransfer.LateDeliveryDate, com.tools20022.repository.entity.SecuritiesTransfer.TransferTax, com.tools20022.repository.entity.SecuritiesTransfer.TransferReason,
						com.tools20022.repository.entity.SecuritiesTransfer.PartialSettlementType, com.tools20022.repository.entity.SecuritiesTransfer.SecuritiesDeliveryObligation,
						com.tools20022.repository.entity.SecuritiesTransfer.BookEntry, com.tools20022.repository.entity.SecuritiesTransfer.TransactionIdentification, com.tools20022.repository.entity.SecuritiesTransfer.Security,
						com.tools20022.repository.entity.SecuritiesTransfer.Status);
			}
		});
		return mmObject_lazy.get();
	}
}