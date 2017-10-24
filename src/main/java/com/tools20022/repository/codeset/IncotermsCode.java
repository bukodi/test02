package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A set of international standard trade terms (delivery terms) used to
 * designate a point at which the costs and risks of transport are divided
 * between the buyer and the seller.
 */
public class IncotermsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ex Works (any mode of transport, including multimodal)
	 */
	public static final MMCode ExWorks = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExWorks";
			definition = "Ex Works (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "EXW";
		}
	};
	/**
	 * Free Carrier (any mode of transport, including multimodal)
	 */
	public static final MMCode FreeCarrier = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FreeCarrier";
			definition = "Free Carrier (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "FCA";
		}
	};
	/**
	 * Free Alongside Ship (sea and inland waterway transport)
	 */
	public static final MMCode FreeAlongsideShip = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FreeAlongsideShip";
			definition = "Free Alongside Ship (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "FAS";
		}
	};
	/**
	 * Free On Board (sea and inland waterway transport)
	 */
	public static final MMCode FreeOnBoard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FreeOnBoard";
			definition = "Free On Board (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "FOB";
		}
	};
	/**
	 * Cost and Freight (sea and inland waterway transport)
	 */
	public static final MMCode CostAndFreight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CostAndFreight";
			definition = "Cost and Freight (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "CFR";
		}
	};
	/**
	 * Cost, Insurance and Freight (sea and inland waterway transport)
	 */
	public static final MMCode CostInsuranceAndFreight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CostInsuranceAndFreight";
			definition = "Cost, Insurance and Freight (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "CIF";
		}
	};
	/**
	 * Carriage Paid To (any mode of transport, including multimodal)
	 */
	public static final MMCode CarriagePaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CarriagePaid";
			definition = "Carriage Paid To (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "CPT";
		}
	};
	/**
	 * Carriage and Insurance Paid to (any mode of transport, including
	 * multimodal)
	 */
	public static final MMCode CarriageAndInsurancePaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CarriageAndInsurancePaid";
			definition = "Carriage and Insurance Paid to (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "CIP";
		}
	};
	/**
	 * Delivered At Frontier (any mode of transport, including multimodal)
	 */
	public static final MMCode DeliveredAtFrontier = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveredAtFrontier";
			definition = "Delivered At Frontier (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "DAF";
		}
	};
	/**
	 * Delivered Ex Ship (sea and inland waterway transport)
	 */
	public static final MMCode DeliveredExShip = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveredExShip";
			definition = "Delivered Ex Ship (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "DES";
		}
	};
	/**
	 * Delivered Ex Quay (sea and inland waterway transport)
	 */
	public static final MMCode DeliveredExQuay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveredExQuay";
			definition = "Delivered Ex Quay (sea and inland waterway transport)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "DEQ";
		}
	};
	/**
	 * Delivered Duty Unpaid (any mode of transport, including multimodal)
	 */
	public static final MMCode DeliveredDutyUnpaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveredDutyUnpaid";
			definition = "Delivered Duty Unpaid (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "DDU";
		}
	};
	/**
	 * Delivered Duty Paid (any mode of transport, including multimodal)
	 */
	public static final MMCode DeliveredDutyPaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveredDutyPaid";
			definition = "Delivered Duty Paid (any mode of transport, including multimodal)";
			owner_lazy = () -> IncotermsCode.mmObject();
			codeName = "DDP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EXW");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IncotermsCode";
				definition = "A set of international standard trade terms (delivery terms) used to designate a point at which the costs and risks of transport are divided between the buyer and the seller.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IncotermsCode.ExWorks, com.tools20022.repository.codeset.IncotermsCode.FreeCarrier, com.tools20022.repository.codeset.IncotermsCode.FreeAlongsideShip,
						com.tools20022.repository.codeset.IncotermsCode.FreeOnBoard, com.tools20022.repository.codeset.IncotermsCode.CostAndFreight, com.tools20022.repository.codeset.IncotermsCode.CostInsuranceAndFreight,
						com.tools20022.repository.codeset.IncotermsCode.CarriagePaid, com.tools20022.repository.codeset.IncotermsCode.CarriageAndInsurancePaid, com.tools20022.repository.codeset.IncotermsCode.DeliveredAtFrontier,
						com.tools20022.repository.codeset.IncotermsCode.DeliveredExShip, com.tools20022.repository.codeset.IncotermsCode.DeliveredExQuay, com.tools20022.repository.codeset.IncotermsCode.DeliveredDutyUnpaid,
						com.tools20022.repository.codeset.IncotermsCode.DeliveredDutyPaid);
			}
		});
		return mmObject_lazy.get();
	}
}