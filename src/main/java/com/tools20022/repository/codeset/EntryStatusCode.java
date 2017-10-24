package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of an entry.
 */
public class EntryStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Booked means that the transfer of money has been completed between
	 * account servicer and account owner
	 * 
	 * Usage : Status Booked does not necessarily imply finality of money as
	 * this depends on other factors such as the payment system used, the
	 * completion of the end-to-end transaction and the terms agreed between
	 * account servicer and owner. Status Booked is the only status that can be
	 * reversed.
	 */
	public static final MMCode Booked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Booked";
			definition = "Booked means that the transfer of money has been completed between account servicer and account owner\n\nUsage :   \nStatus Booked does not necessarily imply finality of money as this depends on other factors such as the payment system used, the completion of the end-to-end transaction and the terms agreed between account servicer and owner.\nStatus Booked is the only status that can be reversed.";
			owner_lazy = () -> EntryStatusCode.mmObject();
			codeName = "BOOK";
		}
	};
	/**
	 * Booking on the account owner's account in the account servicer's ledger
	 * has not been completed.
	 * 
	 * Usage : this can be used for expected items, or for items for which some
	 * conditions still need to be fulfilled before they can be booked. If
	 * booking takes place, the entry will be included with status Booked in
	 * subsequent account report or statement. Status Pending cannot be
	 * reversed.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Booking on the account owner's account in the account servicer's ledger has not been completed.\n\nUsage : this can be used for expected items, or for items for which some conditions still need to be fulfilled before they can be booked. If booking takes place, the entry will be included with status Booked in subsequent account report or statement. Status Pending cannot be reversed.";
			owner_lazy = () -> EntryStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Entry is only provided for information, and no booking on the account
	 * owner's account in the account servicer's ledger has been performed.
	 */
	public static final MMCode Information = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Information";
			definition = "Entry is only provided for information, and no booking on the account owner's account in the account servicer's ledger has been performed.";
			owner_lazy = () -> EntryStatusCode.mmObject();
			codeName = "INFO";
		}
	};
	/**
	 * Entry is on the books of the account servicer and value will be applied
	 * to the account owner at a future date and time.
	 */
	public static final MMCode Future = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Future";
			definition = "Entry is on the books of the account servicer and value will be applied to the account owner at a future date and time.";
			owner_lazy = () -> EntryStatusCode.mmObject();
			codeName = "FUTR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BOOK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EntryStatusCode";
				definition = "Specifies the status of an entry.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EntryStatusCode.Booked, com.tools20022.repository.codeset.EntryStatusCode.Pending, com.tools20022.repository.codeset.EntryStatusCode.Information,
						com.tools20022.repository.codeset.EntryStatusCode.Future);
			}
		});
		return mmObject_lazy.get();
	}
}