package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Location category code of the place where the merchant actually performed the
 * transaction.
 */
public class LocationCategoryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fixed location, for example in a shop.
	 */
	public static final MMCode Fixed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fixed";
			definition = "Fixed location, for example in a shop.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "FIXD";
		}
	};
	/**
	 * Aboard a bus, train, ship, airplane, taxi, etc.
	 */
	public static final MMCode Aboard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Aboard";
			definition = "Aboard a bus, train, ship, airplane, taxi, etc.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "ABRD";
		}
	};
	/**
	 * Nomadic location.
	 */
	public static final MMCode Nomadic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Nomadic";
			definition = "Nomadic location.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "NMDC";
		}
	};
	/**
	 * Mail order or telephone order.
	 */
	public static final MMCode MailOrderTelephoneOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailOrderTelephoneOrder";
			definition = "Mail order or telephone order.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "MOTO";
		}
	};
	/**
	 * Customer home.
	 */
	public static final MMCode Home = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Home";
			definition = "Customer home.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "HOME";
		}
	};
	/**
	 * Indoor terminal.
	 */
	public static final MMCode Indoor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indoor";
			definition = "Indoor terminal.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "INDR";
		}
	};
	/**
	 * Terminal incorporated in the pump dispensing petrol.
	 */
	public static final MMCode InsidePump = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsidePump";
			definition = "Terminal incorporated in the pump dispensing petrol.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "IPMP";
		}
	};
	/**
	 * Outdoor terminal serving several petrol pumps.
	 */
	public static final MMCode MultiplePump = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiplePump";
			definition = "Outdoor terminal serving several petrol pumps.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "MPMP";
		}
	};
	/**
	 * Multiple terminals linked to a unique sale terminal.
	 */
	public static final MMCode MultiplePOITerminal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiplePOITerminal";
			definition = "Multiple terminals linked to a unique sale terminal.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "MPOI";
		}
	};
	/**
	 * Terminal serving multiple sale terminals.
	 */
	public static final MMCode MultipleSaleTerminal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSaleTerminal";
			definition = "Terminal serving multiple sale terminals.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "MSLE";
		}
	};
	/**
	 * Terminal linked to a unique sale terminal.
	 */
	public static final MMCode SingleSaleTerminal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleSaleTerminal";
			definition = "Terminal linked to a unique sale terminal.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "SSLE";
		}
	};
	/**
	 * Terminal integrated in a vending machine.
	 */
	public static final MMCode VendingMachine = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendingMachine";
			definition = "Terminal integrated in a vending machine.";
			owner_lazy = () -> LocationCategoryCode.mmObject();
			codeName = "VNDG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FIXD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LocationCategoryCode";
				definition = "Location category code of the place where the merchant actually performed the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LocationCategoryCode.Fixed, com.tools20022.repository.codeset.LocationCategoryCode.Aboard, com.tools20022.repository.codeset.LocationCategoryCode.Nomadic,
						com.tools20022.repository.codeset.LocationCategoryCode.MailOrderTelephoneOrder, com.tools20022.repository.codeset.LocationCategoryCode.Home, com.tools20022.repository.codeset.LocationCategoryCode.Indoor,
						com.tools20022.repository.codeset.LocationCategoryCode.InsidePump, com.tools20022.repository.codeset.LocationCategoryCode.MultiplePump, com.tools20022.repository.codeset.LocationCategoryCode.MultiplePOITerminal,
						com.tools20022.repository.codeset.LocationCategoryCode.MultipleSaleTerminal, com.tools20022.repository.codeset.LocationCategoryCode.SingleSaleTerminal,
						com.tools20022.repository.codeset.LocationCategoryCode.VendingMachine);
			}
		});
		return mmObject_lazy.get();
	}
}