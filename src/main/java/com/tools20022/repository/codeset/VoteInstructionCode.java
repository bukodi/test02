package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the possible types of voting instructions.
 */
public class VoteInstructionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Vote in favour of a meeting resolution.
	 */
	public static final MMCode For = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "For";
			definition = "Vote in favour of a meeting resolution.";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "CFOR";
		}
	};
	/**
	 * Vote against a meeting resolution.
	 */
	public static final MMCode Against = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Against";
			definition = "Vote against a meeting resolution.";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "CAGS";
		}
	};
	/**
	 * Active vote expressed as abstain (no opinion).
	 */
	public static final MMCode Abstain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Abstain";
			definition = "Active vote expressed as abstain (no opinion).";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "ABST";
		}
	};
	/**
	 * Participant to a meeting withholds its vote for a meeting resolution .
	 * This action is usually taken in order to indicate a strong disagreement
	 * with a resolution (US market).
	 */
	public static final MMCode Withhold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withhold";
			definition = "Participant to a meeting withholds its vote for a meeting resolution . This action is usually taken in order to indicate a strong disagreement with a resolution (US market).";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "WTHH";
		}
	};
	/**
	 * Vote instruction is in line with the voting recommendations of the
	 * management.
	 */
	public static final MMCode WithManagement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithManagement";
			definition = "Vote instruction is in line with the voting recommendations of the management.";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "WMGT";
		}
	};
	/**
	 * Vote instruction is in against the voting recommendations of the
	 * management.
	 */
	public static final MMCode AgainstManagement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgainstManagement";
			definition = "Vote instruction is in against the voting recommendations of the management.";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "AMGT";
		}
	};
	/**
	 * Voting party is assigned discretionary right to vote for one resolution.
	 */
	public static final MMCode Discretionary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discretionary";
			definition = "Voting party is assigned discretionary right to vote for one resolution.";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Indicates a recommendation to take no action
	 */
	public static final MMCode NoAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoAction";
			definition = "Indicates a recommendation to take no action";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * Specifies that the rights holder gives authority to the chairman to vote
	 * on his behalf.
	 */
	public static final MMCode Chairman = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Chairman";
			definition = "Specifies that the rights holder gives authority to the chairman to vote on his behalf.";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "CHRM";
		}
	};
	/**
	 * Vote in favour for one year for "say on pay" type of resolution.
	 */
	public static final MMCode OneYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneYear";
			definition = "Vote in favour for one year for \"say on pay\" type of resolution.";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "ONEY";
		}
	};
	/**
	 * Vote in favour for two years for "say on pay" type of resolution.
	 */
	public static final MMCode TwoYears = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoYears";
			definition = "Vote in favour for two years for \"say on pay\" type of resolution.";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "TWOY";
		}
	};
	/**
	 * Vote in favour for three years for "say on pay" type of resolution.
	 */
	public static final MMCode ThreeYears = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThreeYears";
			definition = "Vote in favour for three years for \"say on pay\" type of resolution.";
			owner_lazy = () -> VoteInstructionCode.mmObject();
			codeName = "THRY";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CFOR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VoteInstructionCode";
				definition = "Specifies the possible types of voting instructions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.VoteInstructionCode.For, com.tools20022.repository.codeset.VoteInstructionCode.Against, com.tools20022.repository.codeset.VoteInstructionCode.Abstain,
						com.tools20022.repository.codeset.VoteInstructionCode.Withhold, com.tools20022.repository.codeset.VoteInstructionCode.WithManagement, com.tools20022.repository.codeset.VoteInstructionCode.AgainstManagement,
						com.tools20022.repository.codeset.VoteInstructionCode.Discretionary, com.tools20022.repository.codeset.VoteInstructionCode.NoAction, com.tools20022.repository.codeset.VoteInstructionCode.Chairman,
						com.tools20022.repository.codeset.VoteInstructionCode.OneYear, com.tools20022.repository.codeset.VoteInstructionCode.TwoYears, com.tools20022.repository.codeset.VoteInstructionCode.ThreeYears);
			}
		});
		return mmObject_lazy.get();
	}
}