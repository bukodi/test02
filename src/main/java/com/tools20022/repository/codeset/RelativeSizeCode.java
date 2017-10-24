package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A type of quantity of financial instrument expressed in a relative size.
 */
public class RelativeSizeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the relative size is small.
	 */
	public static final MMCode Small = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Small";
			definition = "Indicates that the relative size is small.";
			owner_lazy = () -> RelativeSizeCode.mmObject();
			codeName = "SMAL";
		}
	};
	/**
	 * Indicates that the relative size is medium.
	 */
	public static final MMCode Medium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Medium";
			definition = "Indicates that the relative size is medium.";
			owner_lazy = () -> RelativeSizeCode.mmObject();
			codeName = "MEDI";
		}
	};
	/**
	 * Indicates that the relative size is large.
	 */
	public static final MMCode Large = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Large";
			definition = "Indicates that the relative size is large.";
			owner_lazy = () -> RelativeSizeCode.mmObject();
			codeName = "LARG";
		}
	};
	/**
	 * Indicates that the quantity is undisclosed.
	 */
	public static final MMCode Undisclosed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undisclosed";
			definition = "Indicates that the quantity is undisclosed.";
			owner_lazy = () -> RelativeSizeCode.mmObject();
			codeName = "UNDI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SMAL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RelativeSizeCode";
				definition = "A type of quantity of financial instrument expressed in a relative size.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RelativeSizeCode.Small, com.tools20022.repository.codeset.RelativeSizeCode.Medium, com.tools20022.repository.codeset.RelativeSizeCode.Large,
						com.tools20022.repository.codeset.RelativeSizeCode.Undisclosed);
			}
		});
		return mmObject_lazy.get();
	}
}