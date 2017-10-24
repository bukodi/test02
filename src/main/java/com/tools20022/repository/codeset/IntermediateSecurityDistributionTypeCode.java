package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Exchange of holdings for other securities and/or cash. The exchange can be
 * either mandatory or voluntary involving the exchange of outstanding
 * securities for different securities and/or cash. For example
 * "exchange offer", "capital reorganisation" or "funds separation".
 */
public class IntermediateSecurityDistributionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Distribution of reverser rights.
	 */
	public static final MMCode ReverseRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReverseRights";
			definition = "Distribution of reverser rights.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "BIDS";
		}
	};
	/**
	 * Distribution of bonus rights.
	 */
	public static final MMCode BonusRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BonusRights";
			definition = "Distribution of bonus rights.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "BONU";
		}
	};
	/**
	 * Distribution of dividend reinvestment securities.
	 */
	public static final MMCode DividendReinvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendReinvestment";
			definition = "Distribution of dividend reinvestment securities.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "DRIP";
		}
	};
	/**
	 * Distribution of cash to shareholders, in proportion to their equity
	 * holding. Ordinary dividends are recurring and regular. Shareholder must
	 * take cash and may be offered a choice of currency.
	 */
	public static final MMCode CashDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDividend";
			definition = "Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "DVCA";
		}
	};
	/**
	 * Distribution of dividend option.
	 */
	public static final MMCode DividendOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendOption";
			definition = "Distribution of dividend option.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "DVOP";
		}
	};
	/**
	 * Distribution of subscription rights.
	 */
	public static final MMCode SubscriptionRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionRights";
			definition = "Distribution of subscription rights.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "EXRI";
		}
	};
	/**
	 * Distribution of open offer rights.
	 */
	public static final MMCode OpenOfferRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpenOfferRights";
			definition = "Distribution of open offer rights.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "PRIO";
		}
	};
	/**
	 * Dividend or interest paid in the form of scrip.
	 */
	public static final MMCode ScripDividendOrPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ScripDividendOrPayment";
			definition = "Dividend or interest paid in the form of scrip.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "DVSC";
		}
	};
	/**
	 * Dividend paid to shareholders in the form of shares of stock.
	 */
	public static final MMCode StockDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockDividend";
			definition = "Dividend paid to shareholders in the form of shares of stock.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "DVSE";
		}
	};
	/**
	 * Interest payment distributed to holders of an interest bearing asset.
	 */
	public static final MMCode InterestPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestPayment";
			definition = "Interest payment distributed to holders of an interest bearing asset.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * A distribution of cash, assets or both.
	 */
	public static final MMCode LiquidationDividendOrPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiquidationDividendOrPayment";
			definition = "A distribution of cash, assets or both.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * A distribution of subsidiary stock to the shareholders
	 */
	public static final MMCode SpinOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpinOff";
			definition = "A distribution of subsidiary stock to the shareholders";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "SOFF";
		}
	};
	/**
	 * Also known as change in nominal value or subdivision. Increase in a
	 * corporation's number of outstanding equities without any change in the
	 * shareholder's equity or the aggregate market value at the time of the
	 * split. Equity price and nominal value are reduced accordingly.
	 */
	public static final MMCode StockSplit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockSplit";
			definition = "Also known as change in nominal value or subdivision.\nIncrease in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "SPLF";
		}
	};
	/**
	 * Exchange of holdings for other securities and/or cash. The exchange can
	 * be either mandatory or voluntary involving the exchange of outstanding
	 * securities for different securities and/or cash. For example
	 * "exchange offer", "capital reorganisation" or "funds separation".
	 */
	public static final MMCode Exchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Exchange";
			definition = "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\".";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "EXOF";
		}
	};
	/**
	 * Exchange of outstanding securities, initiated by the issuer which may
	 * include options, as the result of two or more companies combining assets,
	 * that is, an external, third party company. Cash payments may accompany
	 * share exchange.
	 */
	public static final MMCode Merger = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			definition = "Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange.";
			owner_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
			codeName = "MRGR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BIDS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IntermediateSecurityDistributionTypeCode";
				definition = "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\".";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.ReverseRights, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.BonusRights,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.DividendReinvestment, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.CashDividend,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.DividendOption, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.SubscriptionRights,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.OpenOfferRights, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.ScripDividendOrPayment,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.StockDividend, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.InterestPayment,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.LiquidationDividendOrPayment, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.SpinOff,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.StockSplit, com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.Exchange,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode.Merger);
			}
		});
		return mmObject_lazy.get();
	}
}