package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Side taken by a party on an order.
 */
public class SideCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order is buy driven.
	 */
	public static final MMCode Buy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Buy";
			definition = "Order is buy driven.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "BUYI";
		}
	};
	/**
	 * Order is sell driven.
	 */
	public static final MMCode Sell = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sell";
			definition = "Order is sell driven.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * Identifies an order for which a broker wishes to take the other side and
	 * cross with the client.
	 */
	public static final MMCode Cross = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cross";
			definition = "Identifies an order for which a broker wishes to take the other side and cross with the client.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "CROS";
		}
	};
	/**
	 * Identifies a type of order for which a broker wants to cross with the
	 * client in the case a client wants to establish a short position, and
	 * sends a Sell Short order to the broker. Many exchanges have tick rules
	 * needing to be enforced, and the order getting converted from Sell Short
	 * to Cross (instead of Cross Short) could result in an illegal short sell.
	 */
	public static final MMCode CrossShort = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossShort";
			definition = "Identifies a type of order for which a broker wants to cross with the client in the case a client wants to establish a short position, and sends a Sell Short order to the broker. Many exchanges have tick rules needing to be enforced, and the order getting converted from Sell Short to Cross (instead of Cross Short) could result in an illegal short sell.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "CRSH";
		}
	};
	/**
	 * Identifies a type of order for which a broker wants to cross with the
	 * client in the case a client wants to establish a short position and is
	 * exempt from the uptick restriction. Used as audit trail on exchanges.
	 */
	public static final MMCode CrossShortExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossShortExempt";
			definition = "Identifies a type of order for which a broker wants to cross with the client in the case a client wants to establish a short position and is exempt from the uptick restriction. Used as audit trail on exchanges.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "CSHE";
		}
	};
	/**
	 * Indicates, in the case of a multileg instrument,that the sides of the
	 * legs are the same as defined at the creation of the multileg instrument.
	 */
	public static final MMCode AsDefined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AsDefined";
			definition = "Indicates, in the case of a multileg instrument,that the sides of the legs are the same as defined at the creation of the multileg instrument.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "DEFI";
		}
	};
	/**
	 * Indicates, in the case of a multileg instrument,that the sides of the
	 * legs are the opposite of their definition at the creation of the multileg
	 * instrument.
	 */
	public static final MMCode Opposite = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Opposite";
			definition = "Indicates, in the case of a multileg instrument,that the sides of the legs are the opposite of their definition at the creation of the multileg instrument.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "OPPO";
		}
	};
	/**
	 * The side of the indication of interest is not disclosed.
	 */
	public static final MMCode Undisclosed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undisclosed";
			definition = "The side of the indication of interest is not disclosed.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "UNDI";
		}
	};
	/**
	 * Indicates that the side refers to both buys and sells.
	 */
	public static final MMCode TwoSided = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TwoSided";
			definition = "Indicates that the side refers to both buys and sells.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "TWOS";
		}
	};
	/**
	 * A round-lot market order to buy minus is an order to buy a stated amount
	 * of a stock provided that its price is: - not higher than the last sale if
	 * the last sale was a minus or zero minus tick and - not higher than the
	 * last sale minus the minimum fractional change in the stock if the last
	 * sale was a plus or zero plus tick. A limit price order to buy minus also
	 * states the highest price at which it can be executed.
	 */
	public static final MMCode BuyMinus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyMinus";
			definition = "A round-lot market order to buy minus is an order to buy a stated amount of a stock provided that its price is:\n- not higher than the last sale if the last sale was a minus or zero minus tick and\n- not higher than the last sale minus the minimum fractional change in the stock if the last sale was a plus or zero plus tick.\nA limit price order to buy minus also states the highest price at which it can be executed.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "BUMI";
		}
	};
	/**
	 * A round-lot market order to sell plus is an order to sell a stated amount
	 * of a stock provided that its price is: - not lower than the last sale if
	 * the last sale was a plus or zero plus tick and - not lower than the last
	 * sale minus the minimum fractional change in the stock if the last sale
	 * was a minus or zero minus tick. A limit-price order to sell plus also
	 * states the lowest price at which it can be executed.
	 */
	public static final MMCode SellPlus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellPlus";
			definition = "A round-lot market order to sell plus is an order to sell a stated amount of a stock provided that its price is:\n- not lower than the last sale if the last sale was a plus or zero plus tick and\n- not lower than the last sale minus the minimum fractional change in the stock if the last sale was a minus or zero minus tick.\nA limit-price order to sell plus also states the lowest price at which it can be executed.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "SEPL";
		}
	};
	/**
	 * An order to sell a security that the seller does not own; a sale effected
	 * by delivering a security borrowed by, or for the account of, the seller.
	 * Can only be executed on a plus or zero plus tick.
	 */
	public static final MMCode SellShort = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShort";
			definition = "An order to sell a security that the seller does not own; a sale effected by delivering a security borrowed by, or for the account of, the seller. Can only be executed on a plus or zero plus tick.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "SESH";
		}
	};
	/**
	 * Short sale exempt from short-sale rules.
	 */
	public static final MMCode SellShortExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShortExempt";
			definition = "Short sale exempt from short-sale rules.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "SSEX";
		}
	};
	/**
	 * Order is to lend securities.
	 */
	public static final MMCode Lend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lend";
			definition = "Order is to lend securities.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "LEND";
		}
	};
	/**
	 * Order is to borrow securities.
	 */
	public static final MMCode Borrow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrow";
			definition = "Order is to borrow securities.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "BORW";
		}
	};
	/**
	 * Exercise of an option contract.
	 */
	public static final MMCode OptionExercise = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionExercise";
			definition = "Exercise of an option contract.";
			owner_lazy = () -> SideCode.mmObject();
			codeName = "OPEX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BUYI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SideCode";
				definition = "Side taken by a party on an order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SideCode.Buy, com.tools20022.repository.codeset.SideCode.Sell, com.tools20022.repository.codeset.SideCode.Cross,
						com.tools20022.repository.codeset.SideCode.CrossShort, com.tools20022.repository.codeset.SideCode.CrossShortExempt, com.tools20022.repository.codeset.SideCode.AsDefined,
						com.tools20022.repository.codeset.SideCode.Opposite, com.tools20022.repository.codeset.SideCode.Undisclosed, com.tools20022.repository.codeset.SideCode.TwoSided, com.tools20022.repository.codeset.SideCode.BuyMinus,
						com.tools20022.repository.codeset.SideCode.SellPlus, com.tools20022.repository.codeset.SideCode.SellShort, com.tools20022.repository.codeset.SideCode.SellShortExempt, com.tools20022.repository.codeset.SideCode.Lend,
						com.tools20022.repository.codeset.SideCode.Borrow, com.tools20022.repository.codeset.SideCode.OptionExercise);
			}
		});
		return mmObject_lazy.get();
	}
}