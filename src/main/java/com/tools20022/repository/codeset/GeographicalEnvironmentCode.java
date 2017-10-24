package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the geographic environment, or zone, in which a payment is
 * executed, from the perspective of the forwarding or first agent, eg,
 * international.
 */
public class GeographicalEnvironmentCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction has an origin and a destination in the same country and is
	 * made in the currency of that country.
	 */
	public static final MMCode Domestic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domestic";
			definition = "Transaction has an origin and a destination in the same country and is made in the currency of that country.";
			owner_lazy = () -> GeographicalEnvironmentCode.mmObject();
			codeName = "DMST";
		}
	};
	/**
	 * Transaction is a credit transfer in Euro with its country of origin and
	 * country of destination within the European Union. Origin and destination
	 * countries may be one and the same country.
	 */
	public static final MMCode EuroDomestic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EuroDomestic";
			definition = "Transaction is a credit transfer in Euro with its country of origin and country of destination within the European Union. Origin and destination countries may be one and the same country.";
			owner_lazy = () -> GeographicalEnvironmentCode.mmObject();
			codeName = "EUDM";
		}
	};
	/**
	 * Transaction is between a French Overseas Departments and Territories
	 * (Dom/Tom) and some country in the European Union (France included).
	 */
	public static final MMCode FrenchDomTom = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchDomTom";
			definition = "Transaction is between a French Overseas Departments and Territories (Dom/Tom) and some country in the European Union (France included).";
			owner_lazy = () -> GeographicalEnvironmentCode.mmObject();
			codeName = "FRDT";
		}
	};
	/**
	 * Transaction has an origin in one country and a destination in another and
	 * is made in the currency of either the origin or destination country.
	 */
	public static final MMCode International = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "International";
			definition = "Transaction has an origin in one country and a destination in another and is made in the currency of either the origin or destination country.";
			owner_lazy = () -> GeographicalEnvironmentCode.mmObject();
			codeName = "INTL";
		}
	};
	/**
	 * Transaction is a North American Free Trade Association (NAFTA)
	 * transaction, ie, the first and final agent are both located in the NAFTA
	 * area.
	 */
	public static final MMCode NAFTA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NAFTA";
			definition = "Transaction is a North American Free Trade Association (NAFTA) transaction, ie, the first and final agent are both located in the NAFTA area.";
			owner_lazy = () -> GeographicalEnvironmentCode.mmObject();
			codeName = "NFTA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GeographicalEnvironmentCode";
				definition = "Specifies the geographic environment, or zone, in which a payment is executed, from the perspective of the forwarding or first agent, eg, international.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GeographicalEnvironmentCode.Domestic, com.tools20022.repository.codeset.GeographicalEnvironmentCode.EuroDomestic,
						com.tools20022.repository.codeset.GeographicalEnvironmentCode.FrenchDomTom, com.tools20022.repository.codeset.GeographicalEnvironmentCode.International,
						com.tools20022.repository.codeset.GeographicalEnvironmentCode.NAFTA);
			}
		});
		return mmObject_lazy.get();
	}
}