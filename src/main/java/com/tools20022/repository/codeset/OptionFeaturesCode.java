package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the features that may apply to a corporate action option.
 */
public class OptionFeaturesCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Feature whereby the holder must elect directly to the issuer's agent
	 * (issuer only supported option).
	 */
	public static final MMCode NoServiceOffered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoServiceOffered";
			definition = "Feature whereby the holder must elect directly to the issuer's agent (issuer only supported option).";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "NOSE";
		}
	};
	/**
	 * Option applicability is not subject to the account owner decision but
	 * depends on the terms defined by the issuer, for example in the case of
	 * equity linked notes or warrants.
	 */
	public static final MMCode OptionApplicability = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionApplicability";
			definition = "Option applicability is not subject to the account owner decision but depends on the terms defined by the issuer, for example in the case of equity linked notes or warrants.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "CAOS";
		}
	};
	/**
	 * Feature whereby the holder can elect to place a condition on the
	 * acceptance of the option.
	 */
	public static final MMCode Conditional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Conditional";
			definition = "Feature whereby the holder can elect to place a condition on the acceptance of the option.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "COND";
		}
	};
	/**
	 * Maximum cash option, may be subject to scaling, as such you may receive a
	 * combination of cash and securities outturn.
	 */
	public static final MMCode MaximumCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumCash";
			definition = "Maximum cash option, may be subject to scaling, as such you may receive a combination of cash and securities outturn.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "MAXC";
		}
	};
	/**
	 * Maximum stock option, may be subject to scaling, as such you may receive
	 * a combination of securities and cash outturn.
	 */
	public static final MMCode MaximumSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumSecurities";
			definition = "Maximum stock option, may be subject to scaling, as such you may receive a combination of securities and cash outturn.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "MAXS";
		}
	};
	/**
	 * Tender or exchange with the odd lot preference.
	 */
	public static final MMCode OddLotPreference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OddLotPreference";
			definition = "Tender or exchange with the odd lot preference.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "OPLF";
		}
	};
	/**
	 * Feature whereby the option can be subject to pro ration in case, for
	 * example, of over-subscription.
	 */
	public static final MMCode Proration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Proration";
			definition = "Feature whereby the option can be subject to pro ration in case, for example, of over-subscription.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "PROR";
		}
	};
	/**
	 * Feature whereby the holder can elect a quantity to receive over and above
	 * normal ensured entitlement.
	 */
	public static final MMCode OverAndAbove = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAndAbove";
			definition = "Feature whereby the holder can elect a quantity to receive over and above normal ensured entitlement.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "QOVE";
		}
	};
	/**
	 * Feature whereby the holder can elect a quantity to receive.
	 */
	public static final MMCode QuantityToReceive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityToReceive";
			definition = "Feature whereby the holder can elect a quantity to receive.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "QREC";
		}
	};
	/**
	 * Reduced withholding tax rate applies to the option.
	 */
	public static final MMCode ReducedWithholdingTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReducedWithholdingTax";
			definition = "Reduced withholding tax rate applies to the option.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "VVPR";
		}
	};
	/**
	 * Indicates the previously sent instructions becomes invalid. This is only
	 * applicable after a market deadline extension.
	 */
	public static final MMCode PreviousInstructionInvalidity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousInstructionInvalidity";
			definition = "Indicates the previously sent instructions becomes invalid. This is only applicable after a market deadline extension.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "PINS";
		}
	};
	/**
	 * Option is offered by the account servicer only.
	 */
	public static final MMCode AccountServicerOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerOption";
			definition = "Option is offered by the account servicer only.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "ASVO";
		}
	};
	/**
	 * Indicates that the holder needs to instruct at beneficiary owner level
	 * only.
	 */
	public static final MMCode BeneficiaryOwnerInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryOwnerInstruction";
			definition = "Indicates that the holder needs to instruct at beneficiary owner level only.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "BOIS";
		}
	};
	/**
	 * Feature whereby the holder should only instruct a cash amount.
	 */
	public static final MMCode InstructCashAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructCashAmount";
			definition = "Feature whereby the holder should only instruct a cash amount.";
			owner_lazy = () -> OptionFeaturesCode.mmObject();
			codeName = "QCAS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NOSE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OptionFeaturesCode";
				definition = "Specifies the features that may apply to a corporate action option.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionFeaturesCode.NoServiceOffered, com.tools20022.repository.codeset.OptionFeaturesCode.OptionApplicability,
						com.tools20022.repository.codeset.OptionFeaturesCode.Conditional, com.tools20022.repository.codeset.OptionFeaturesCode.MaximumCash, com.tools20022.repository.codeset.OptionFeaturesCode.MaximumSecurities,
						com.tools20022.repository.codeset.OptionFeaturesCode.OddLotPreference, com.tools20022.repository.codeset.OptionFeaturesCode.Proration, com.tools20022.repository.codeset.OptionFeaturesCode.OverAndAbove,
						com.tools20022.repository.codeset.OptionFeaturesCode.QuantityToReceive, com.tools20022.repository.codeset.OptionFeaturesCode.ReducedWithholdingTax,
						com.tools20022.repository.codeset.OptionFeaturesCode.PreviousInstructionInvalidity, com.tools20022.repository.codeset.OptionFeaturesCode.AccountServicerOption,
						com.tools20022.repository.codeset.OptionFeaturesCode.BeneficiaryOwnerInstruction, com.tools20022.repository.codeset.OptionFeaturesCode.InstructCashAmount);
			}
		});
		return mmObject_lazy.get();
	}
}