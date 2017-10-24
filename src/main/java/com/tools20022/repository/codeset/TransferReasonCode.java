package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for the assets transfer.
 */
public class TransferReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transfer is ordinary.
	 */
	public static final MMCode OrdinaryTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrdinaryTransfer";
			definition = "Transfer is ordinary.";
			owner_lazy = () -> TransferReasonCode.mmObject();
			codeName = "TRAO";
		}
	};
	/**
	 * Transfer is between spouses.
	 */
	public static final MMCode TransferBetweenSpouses = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferBetweenSpouses";
			definition = "Transfer is between spouses.";
			owner_lazy = () -> TransferReasonCode.mmObject();
			codeName = "TRAC";
		}
	};
	/**
	 * Transfer is the result of a demrger or division.
	 */
	public static final MMCode Demerger = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Demerger";
			definition = "Transfer is the result of a demrger or division.";
			owner_lazy = () -> TransferReasonCode.mmObject();
			codeName = "TRAF";
		}
	};
	/**
	 * Transfer is a gift.
	 */
	public static final MMCode Gift = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gift";
			definition = "Transfer is a gift.";
			owner_lazy = () -> TransferReasonCode.mmObject();
			codeName = "TRAG";
		}
	};
	/**
	 * Transfer is a heritage.
	 */
	public static final MMCode Heritage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Heritage";
			definition = "Transfer is a heritage.";
			owner_lazy = () -> TransferReasonCode.mmObject();
			codeName = "TRAI";
		}
	};
	/**
	 * Transfer is between own accounts.
	 */
	public static final MMCode BetweenOwnAccounts = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BetweenOwnAccounts";
			definition = "Transfer is between own accounts.";
			owner_lazy = () -> TransferReasonCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Transfer is a trade.
	 */
	public static final MMCode Trade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Transfer is a trade.";
			owner_lazy = () -> TransferReasonCode.mmObject();
			codeName = "TRAT";
		}
	};
	/**
	 * Transfer is an undivided possession.
	 */
	public static final MMCode UndividedPossession = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndividedPossession";
			definition = "Transfer is an undivided possession.";
			owner_lazy = () -> TransferReasonCode.mmObject();
			codeName = "TRAU";
		}
	};
	/**
	 * Transfer to pledged account (in certain circumstances distributors have
	 * to freeze and transfer total or partial holding to separate omnibus
	 * account e.g. investigation required by fiscal authority or police).
	 */
	public static final MMCode PledgedAccountTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedAccountTransfer";
			definition = "Transfer to pledged account (in certain circumstances distributors have to freeze and transfer total or partial holding to separate omnibus account e.g. investigation required by fiscal authority or police).";
			owner_lazy = () -> TransferReasonCode.mmObject();
			codeName = "TPLD";
		}
	};
	/**
	 * Transfer between different beneficiaries with taxation to be applied
	 * (accounts with different owner).
	 */
	public static final MMCode TransferBetweenDifferentBeneficiaries = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferBetweenDifferentBeneficiaries";
			definition = "Transfer between different beneficiaries with taxation to be applied (accounts with different owner).";
			owner_lazy = () -> TransferReasonCode.mmObject();
			codeName = "TRPE";
		}
	};
	/**
	 * Transfer instruction executed within TDT framework (TDT framework is the
	 * operation model promoted by the Italian Banking Association for transfer
	 * and most of transfers, but not all, will be executed in accordance with
	 * that process).
	 */
	public static final MMCode TDTFrameworkTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TDTFrameworkTransfer";
			definition = "Transfer instruction executed within TDT framework (TDT framework is the operation model promoted by the Italian Banking Association for transfer and most of transfers, but not all, will be executed in accordance with that process).";
			owner_lazy = () -> TransferReasonCode.mmObject();
			codeName = "TTDT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("TRAO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransferReasonCode";
				definition = "Specifies the reason for the assets transfer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransferReasonCode.OrdinaryTransfer, com.tools20022.repository.codeset.TransferReasonCode.TransferBetweenSpouses,
						com.tools20022.repository.codeset.TransferReasonCode.Demerger, com.tools20022.repository.codeset.TransferReasonCode.Gift, com.tools20022.repository.codeset.TransferReasonCode.Heritage,
						com.tools20022.repository.codeset.TransferReasonCode.BetweenOwnAccounts, com.tools20022.repository.codeset.TransferReasonCode.Trade, com.tools20022.repository.codeset.TransferReasonCode.UndividedPossession,
						com.tools20022.repository.codeset.TransferReasonCode.PledgedAccountTransfer, com.tools20022.repository.codeset.TransferReasonCode.TransferBetweenDifferentBeneficiaries,
						com.tools20022.repository.codeset.TransferReasonCode.TDTFrameworkTransfer);
			}
		});
		return mmObject_lazy.get();
	}
}