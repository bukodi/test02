package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies a benchmark curve name.
 */
public class BenchmarkCurveNameCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Benchmark curve used for municipals based on the best credit rating for
	 * municipal market debt.
	 */
	public static final MMCode MuniAAA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MuniAAA";
			definition = "Benchmark curve used for municipals based on the best credit rating for municipal market debt.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "MAAA";
		}
	};
	/**
	 * Portion of a synthetic curve that is composed of Eurodollar or Treasury
	 * or similar Futures and Swap rates. The term usually begins at 3 months to
	 * 2 years for the futures strip component with the Swaps filling in the
	 * points to 10 years and beyond.
	 */
	public static final MMCode FutureSWAP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FutureSWAP";
			definition = "Portion of a synthetic curve that is composed of Eurodollar or Treasury or similar Futures and Swap rates.  The term usually begins at 3 months to 2 years for the futures strip component with the Swaps filling in the points to 10 years and beyond.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "FUSW";
		}
	};
	/**
	 * Rate at which major international banks are willing to take deposits from
	 * one another, is normally 1/8 percent below LIBOR.<br>
	 * <br>
	 * London InterBank Bid Rate, the rate bid by banks on Eurocurrency
	 * deposits; the international rate that banks lend to other banks.
	 */
	public static final MMCode LIBID = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LIBID";
			definition = "Rate at which major international banks are willing to take deposits from one another, is normally 1/8 percent below LIBOR.\r\n\r\nLondon InterBank Bid Rate, the rate bid by banks on Eurocurrency deposits; the international rate that banks lend to other banks.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "LIBI";
		}
	};
	/**
	 * London Interbank Offered Rate, the interest rate that major international
	 * banks in London charge each other for borrowing.
	 */
	public static final MMCode LIBOR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LIBOR";
			definition = "London Interbank Offered Rate, the interest rate that major international banks in London charge each other for borrowing.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "LIBO";
		}
	};
	/**
	 * In curve construction, Swap is the long portion of the curve constituting
	 * about 3 years to 30 years term.
	 * 
	 * The exchange of one security, currency or interest rate for another to
	 * change the maturity (bonds), or quality of issues (stocks or bonds), or
	 * because investment objectives have changed.
	 */
	public static final MMCode SWAP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SWAP";
			definition = "In curve construction, Swap is the long portion of the curve constituting about 3 years to 30 years term.\n\nThe exchange of one security, currency or interest rate for another to change the maturity (bonds), or quality of issues (stocks or bonds), or because investment objectives have changed.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * Treasury benchmark that comes in three types: the yield curve, the par
	 * curve, and the spot curve. All curves also have a constituent time
	 * series.
	 */
	public static final MMCode Treasury = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Treasury";
			definition = "Treasury benchmark that comes in three types: the yield curve, the par curve, and the spot curve.  All curves also have a constituent time series.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "TREA";
		}
	};
	/**
	 * Euro Interbank Offer Rate is the rate at which Euro inter-bank term
	 * deposits within the Euro zone are offered by one prime bank to another
	 * prime bank.
	 */
	public static final MMCode Euribor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Euribor";
			definition = "Euro Interbank Offer Rate is the rate at which Euro inter-bank term deposits within the Euro zone are offered by one prime bank to another prime bank.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "EURI";
		}
	};
	/**
	 * Pfandbriefe security is a collateralised bullet bond backed by either
	 * mortgage loans or loans to the public sector. Pfandbriefe differ from
	 * traditional asset-backed securities in significant ways. The most
	 * important difference is that Pfandbriefe carry no pre-payment risk since
	 * they remain on the balance sheet of the issuing institution. Therefore,
	 * their spreads over sovereign bonds are attributable to liquidity and
	 * credit quality alone. New indices have been created and existing indices
	 * have been modified in response to the growing importance of the
	 * Pfandbriefe market. The Deutsche Borse has three synthetic indices called
	 * REX, JEX, and PEX. The Pfandbriefe curve is used as a reference for
	 * credit as well as mortgage market.
	 */
	public static final MMCode Pfandbriefe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pfandbriefe";
			definition = "Pfandbriefe security is a collateralised bullet bond backed by either mortgage loans or loans to the public sector.  Pfandbriefe differ from traditional asset-backed securities in significant ways.  The most important difference is that Pfandbriefe carry no pre-payment risk since they remain on the balance sheet of the issuing institution.  Therefore, their spreads over sovereign bonds are attributable to liquidity and credit quality alone.  New indices have been created and existing indices have been modified in response to the growing importance of the Pfandbriefe market.  The Deutsche Borse has three synthetic indices called REX, JEX, and PEX.  The Pfandbriefe curve is used as a reference for credit as well as mortgage market.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "PFAN";
		}
	};
	/**
	 * Euro OverNight Index Average rate.
	 */
	public static final MMCode EONIA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EONIA";
			definition = "Euro OverNight Index Average rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "EONA";
		}
	};
	/**
	 * Euro OverNight Index Average swap rate.
	 */
	public static final MMCode EONIASwaps = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EONIASwaps";
			definition = "Euro OverNight Index Average swap rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "EONS";
		}
	};
	/**
	 * Rate for the eurodollars, time deposits denominated in U.S. dollars at
	 * banks outside the United States, and thus are not under the jurisdiction
	 * of the Federal Reserve.
	 */
	public static final MMCode EURODOLLAR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EURODOLLAR";
			definition = "Rate for the eurodollars, time deposits denominated in U.S. dollars at banks outside the United States, and thus are not under the jurisdiction of the Federal Reserve.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "EUUS";
		}
	};
	/**
	 * Swiss Franc LIBOR rate.
	 */
	public static final MMCode EuroSwiss = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EuroSwiss";
			definition = "Swiss Franc LIBOR rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "EUCH";
		}
	};
	/**
	 * Tokyo Interbank Offered Rate.
	 */
	public static final MMCode TIBOR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TIBOR";
			definition = "Tokyo Interbank Offered Rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "TIBO";
		}
	};
	/**
	 * Worldwide common reference rate value for fixed interest rate swap rates,
	 * as defined by the International Swaps and Derivatives Association (ISDA).
	 */
	public static final MMCode ISDAFIX = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISDAFIX";
			definition = "Worldwide common reference rate value for fixed interest rate swap rates, as defined by the International Swaps and Derivatives Association (ISDA).";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "ISDA";
		}
	};
	/**
	 * GCF Repo Index, the Depository Trust &amp; Clearing Corporation (DTCC)
	 * general collateral finance repurchase agreements index.
	 */
	public static final MMCode GCFRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GCFRepo";
			definition = "GCF Repo Index, the Depository Trust & Clearing Corporation (DTCC) general collateral finance repurchase agreements index.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "GCFR";
		}
	};
	/**
	 * Stockholm Interbank Offered Rate.
	 */
	public static final MMCode STIBOR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "STIBOR";
			definition = "Stockholm Interbank Offered Rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "STBO";
		}
	};
	/**
	 * Australian Financial Markets Association (AFMA) Bank-Bill Reference Rate
	 * (BBSW).
	 */
	public static final MMCode BBSW = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BBSW";
			definition = "Australian Financial Markets Association (AFMA) Bank-Bill Reference Rate (BBSW).";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "BBSW";
		}
	};
	/**
	 * Johannesburg Interbank Agreed Rate.
	 */
	public static final MMCode JIBAR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JIBAR";
			definition = "Johannesburg Interbank Agreed Rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "JIBA";
		}
	};
	/**
	 * Budapest Interbank Offered Rate.
	 */
	public static final MMCode BUBOR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BUBOR";
			definition = "Budapest Interbank Offered Rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "BUBO";
		}
	};
	/**
	 * Canadian Dollar Offered Rate.
	 */
	public static final MMCode CDOR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDOR";
			definition = "Canadian Dollar Offered Rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "CDOR";
		}
	};
	/**
	 * Copenhagen Interbank Offered Rate.
	 */
	public static final MMCode CIBOR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CIBOR";
			definition = "Copenhagen Interbank Offered Rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "CIBO";
		}
	};
	/**
	 * Moscow Prime Offered Rate.
	 */
	public static final MMCode MOSPRIM = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MOSPRIM";
			definition = "Moscow Prime Offered Rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "MOSP";
		}
	};
	/**
	 * Norwegian Interbank Offered Rate.
	 */
	public static final MMCode NIBOR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NIBOR";
			definition = "Norwegian Interbank Offered Rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "NIBO";
		}
	};
	/**
	 * Czech Fixing of Interest Rates on Interbank Deposits.
	 */
	public static final MMCode PRIBOR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PRIBOR";
			definition = "Czech Fixing of Interest Rates on Interbank Deposits.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "PRBO";
		}
	};
	/**
	 * Tel Aviv Interbank Offered Rate.
	 */
	public static final MMCode TELBOR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TELBOR";
			definition = "Tel Aviv Interbank Offered Rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "TLBO";
		}
	};
	/**
	 * Warsaw Interbank Offered Rate.
	 */
	public static final MMCode WIBOR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WIBOR";
			definition = "Warsaw Interbank Offered Rate.";
			owner_lazy = () -> BenchmarkCurveNameCode.mmObject();
			codeName = "WIBO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MAAA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BenchmarkCurveNameCode";
				definition = "Identifies a benchmark curve name.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BenchmarkCurveNameCode.MuniAAA, com.tools20022.repository.codeset.BenchmarkCurveNameCode.FutureSWAP,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.LIBID, com.tools20022.repository.codeset.BenchmarkCurveNameCode.LIBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.SWAP,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.Treasury, com.tools20022.repository.codeset.BenchmarkCurveNameCode.Euribor, com.tools20022.repository.codeset.BenchmarkCurveNameCode.Pfandbriefe,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.EONIA, com.tools20022.repository.codeset.BenchmarkCurveNameCode.EONIASwaps, com.tools20022.repository.codeset.BenchmarkCurveNameCode.EURODOLLAR,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.EuroSwiss, com.tools20022.repository.codeset.BenchmarkCurveNameCode.TIBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.ISDAFIX,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.GCFRepo, com.tools20022.repository.codeset.BenchmarkCurveNameCode.STIBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.BBSW,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.JIBAR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.BUBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.CDOR,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.CIBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.MOSPRIM, com.tools20022.repository.codeset.BenchmarkCurveNameCode.NIBOR,
						com.tools20022.repository.codeset.BenchmarkCurveNameCode.PRIBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.TELBOR, com.tools20022.repository.codeset.BenchmarkCurveNameCode.WIBOR);
			}
		});
		return mmObject_lazy.get();
	}
}