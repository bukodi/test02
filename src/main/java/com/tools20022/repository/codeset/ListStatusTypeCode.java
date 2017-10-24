package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the type of status.
 */
public class ListStatusTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status is an acknowledgement of the ListOrder.
	 */
	public static final MMCode Acknowledgement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acknowledgement";
			definition = "Status is an acknowledgement of the ListOrder.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "ACKN";
		}
	};
	/**
	 * Status is a response to a previously sent StatusRequest.
	 */
	public static final MMCode Response = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Status is a response to a previously sent StatusRequest.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "RESP";
		}
	};
	/**
	 * Status indicates that the ListOrder has been executed.
	 */
	public static final MMCode AllDone = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllDone";
			definition = "Status indicates that the ListOrder has been executed.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "ADON";
		}
	};
	/**
	 * Status indicates that any of the individual orders of the ListOrder have
	 * a status that requires something to be done.
	 */
	public static final MMCode Alert = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Alert";
			definition = "Status indicates that any of the individual orders of the ListOrder have a status that requires something to be done.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "ALER";
		}
	};
	/**
	 * Status indicates that the Execution has started.
	 */
	public static final MMCode ExecutionStarted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionStarted";
			definition = "Status indicates that the Execution has started.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "EXST";
		}
	};
	/**
	 * Status indicated that time limit for the order has expired.
	 */
	public static final MMCode Timed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Timed";
			definition = "Status indicated that time limit for the order has expired.";
			owner_lazy = () -> ListStatusTypeCode.mmObject();
			codeName = "TIME";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACKN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ListStatusTypeCode";
				definition = "Identifies the type of status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ListStatusTypeCode.Acknowledgement, com.tools20022.repository.codeset.ListStatusTypeCode.Response,
						com.tools20022.repository.codeset.ListStatusTypeCode.AllDone, com.tools20022.repository.codeset.ListStatusTypeCode.Alert, com.tools20022.repository.codeset.ListStatusTypeCode.ExecutionStarted,
						com.tools20022.repository.codeset.ListStatusTypeCode.Timed);
			}
		});
		return mmObject_lazy.get();
	}
}