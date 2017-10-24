package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the unit of measure by means of a code.
 */
public class UnitOfMeasureCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Basic unit of mass in the SI system, 1000 grams.
	 */
	public static final MMCode Kilogram = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Kilogram";
			definition = "Basic unit of mass in the SI system, 1000 grams.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KILO";
		}
	};
	/**
	 * Standard length of cloth, wallpaper, as an item for sale or amount of a
	 * substance.
	 */
	public static final MMCode Piece = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Piece";
			definition = "Standard length of cloth, wallpaper, as an item for sale or amount of a substance.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "PIEC";
		}
	};
	/**
	 * Measure of weight, in Britain 2240lb (long ton)and in the US 2000lb
	 * (short ton).
	 */
	public static final MMCode Ton = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Ton";
			definition = "Measure of weight, in Britain 2240lb (long ton)and in the US 2000lb (short ton).";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "TONS";
		}
	};
	/**
	 * Unit of length in the metric system, equal to 39.37 inches.
	 */
	public static final MMCode Metre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Metre";
			definition = "Unit of length in the metric system, equal to 39.37 inches.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "METR";
		}
	};
	/**
	 * Measure of length equal to 2.54 cm.
	 */
	public static final MMCode Inch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Inch";
			definition = "Measure of length equal to 2.54 cm.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "INCH";
		}
	};
	/**
	 * Unit of length equal to 3 feet or 0.9144 metre.
	 */
	public static final MMCode Yard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Yard";
			definition = "Unit of length equal to 3 feet or 0.9144 metre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "YARD";
		}
	};
	/**
	 * Unit of volume that is equal to 8 pints.
	 */
	public static final MMCode GBGallon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GBGallon";
			definition = "Unit of volume that is equal to 8 pints.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "GBGA";
		}
	};
	/**
	 * Unit of measure that is equal to a 1,000th of a kilo.
	 */
	public static final MMCode Gram = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gram";
			definition = "Unit of measure that is equal to a 1,000th of a kilo.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "GRAM";
		}
	};
	/**
	 * One 100th part of a metre.
	 */
	public static final MMCode Centimetre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Centimetre";
			definition = "One 100th part of a metre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "CMET";
		}
	};
	/**
	 * Measure of a surface, one metre by one metre.
	 */
	public static final MMCode SquareMetre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareMetre";
			definition = "Measure of a surface, one metre by one metre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "SMET";
		}
	};
	/**
	 * Unit of length equal to 1/3 yard.
	 */
	public static final MMCode Foot = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Foot";
			definition = "Unit of length equal to 1/3 yard.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "FOOT";
		}
	};
	/**
	 * Unit of length equal to 1,760 yards
	 */
	public static final MMCode Mile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mile";
			definition = "Unit of length equal to 1,760 yards";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MILE";
		}
	};
	/**
	 * Measure of a surface, one inch by one inch.
	 */
	public static final MMCode SquareInch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareInch";
			definition = "Measure of a surface, one inch by one inch.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "SQIN";
		}
	};
	/**
	 * Measure of a surface, one foot by one foot.
	 */
	public static final MMCode SquareFoot = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareFoot";
			definition = "Measure of a surface, one foot by one foot.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "SQFO";
		}
	};
	/**
	 * Measure of a surface, one mile by one mile.
	 */
	public static final MMCode SquareMile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareMile";
			definition = "Measure of a surface, one mile by one mile.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "SQMI";
		}
	};
	/**
	 * Unit of weight equal to a sixteenth of a pound.
	 */
	public static final MMCode GBOunce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GBOunce";
			definition = "Unit of weight equal to a sixteenth of a pound.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "GBOU";
		}
	};
	/**
	 * Unit of weight equal to a sixteenth of a pound.
	 */
	public static final MMCode USOunce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USOunce";
			definition = "Unit of weight equal to a sixteenth of a pound.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "USOU";
		}
	};
	/**
	 * Unit of volume that is equal to 568 cubic centimetres.
	 */
	public static final MMCode GBPint = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GBPint";
			definition = "Unit of volume that is equal to 568 cubic centimetres.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "GBPI";
		}
	};
	/**
	 * Unit of volume that is equal to 473 cubic centimetres.
	 */
	public static final MMCode USPint = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USPint";
			definition = "Unit of volume that is equal to 473 cubic centimetres.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "USPI";
		}
	};
	/**
	 * Unit of volume that is equal to 2 pints.
	 */
	public static final MMCode GBQuart = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GBQuart";
			definition = "Unit of volume that is equal to 2 pints.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "GBQA";
		}
	};
	/**
	 * Unit of volume that is equal to 2 pints.
	 */
	public static final MMCode USQuart = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USQuart";
			definition = "Unit of volume that is equal to 2 pints.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "USQA";
		}
	};
	/**
	 * Unit of volume that is equal to 8 pints.
	 */
	public static final MMCode USGallon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USGallon";
			definition = "Unit of volume that is equal to 8 pints.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "USGA";
		}
	};
	/**
	 * Unit of measure that is a thousandth of one metre.
	 */
	public static final MMCode Millimetre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Millimetre";
			definition = "Unit of measure that is a thousandth of one metre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MMET";
		}
	};
	/**
	 * Unit of measure that is equal to 1,000 meters.
	 */
	public static final MMCode Kilometre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Kilometre";
			definition = "Unit of measure that is equal to 1,000 meters.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KMET";
		}
	};
	/**
	 * Measure of a surface, one yard by one yard.
	 */
	public static final MMCode SquareYard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareYard";
			definition = "Measure of a surface, one yard by one yard.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "SQYA";
		}
	};
	/**
	 * Unit of measure equal to 4,840 square yards.
	 */
	public static final MMCode Acre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Acre";
			definition = "Unit of measure equal to 4,840 square yards.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "ACRE";
		}
	};
	/**
	 * Unit of measure equal to a 100 square meters.
	 */
	public static final MMCode Are = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Are";
			definition = "Unit of measure equal to a 100 square meters.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "ARES";
		}
	};
	/**
	 * Measure of a surface, one millimetre by one millimetre.
	 */
	public static final MMCode SquareMillimetre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareMillimetre";
			definition = "Measure of a surface, one millimetre by one millimetre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "SMIL";
		}
	};
	/**
	 * Measure of a surface, one centimetre by one centimetre.
	 */
	public static final MMCode SquareCentimetre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareCentimetre";
			definition = "Measure of a surface, one centimetre by one centimetre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "SCMT";
		}
	};
	/**
	 * Unit of measure that is equal to 10,000 square meters.
	 */
	public static final MMCode Hectare = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Hectare";
			definition = "Unit of measure that is equal to 10,000 square meters.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "HECT";
		}
	};
	/**
	 * Measure of a surface, one kilometre by one kilometre.
	 */
	public static final MMCode SquareKilometre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareKilometre";
			definition = "Measure of a surface, one kilometre by one kilometre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "SQKI";
		}
	};
	/**
	 * Unit of volume that is equal to one thousandth of a litre.
	 */
	public static final MMCode MilliLitre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MilliLitre";
			definition = "Unit of volume that is equal to one thousandth of a litre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MILI";
		}
	};
	/**
	 * Unit of volume that is equal to one hundredth of a litre.
	 */
	public static final MMCode Centilitre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Centilitre";
			definition = "Unit of volume that is equal to one hundredth of a litre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "CELI";
		}
	};
	/**
	 * Unit of volume that is equal to a thousand cubic centimetres.
	 */
	public static final MMCode Litre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Litre";
			definition = "Unit of volume that is equal to a thousand cubic centimetres.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "LITR";
		}
	};
	/**
	 * Unit of weight equal to 0.454 kilograms.
	 */
	public static final MMCode Pound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pound";
			definition = "Unit of weight equal to 0.454 kilograms.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "PUND";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode Allowances = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Allowances";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "ALOW";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode AmountOfCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountOfCurrency";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "ACCY";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode Barrels = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Barrels";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "BARL";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode BillionCubicFeet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillionCubicFeet";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "BCUF";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode BoardFeet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardFeet";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "BDFT";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode Bushels = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bushels";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "BUSL";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode CertifiedEmissionsReduction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertifiedEmissionsReduction";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "CEER";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode ClimateReserveTonnes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClimateReserveTonnes";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "CLRT";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode CubicMeters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicMeters";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "CBME";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode Days = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Days";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "DAYS";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode DryMetricTons = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DryMetricTons";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "DMET";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode EnvironmentalCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvironmentalCredit";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "ENVC";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode EnvironmentalOffset = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvironmentalOffset";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "ENVO";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode Hundredweight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hundredweight";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "HUWG";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode KilowattDayCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattDayCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KWDC";
		}
	};
	/**
	 * Unit of measure that is equal to the power consumption of one kilowatt
	 * during one hour.
	 */
	public static final MMCode KilowattHours = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattHours";
			definition = "Unit of measure that is equal to the power consumption of one kilowatt during one hour.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KWHO";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode KilowattHoursCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattHoursCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KWHC";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode KilowattMinuteCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattMinuteCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KMOC";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode KilowattMonthCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattMonthCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KWMC";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode KilowattYearCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattYearCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KWYC";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode MegawattDayCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattDayCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MWDC";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode MegawattHours = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattHours";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MWHO";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode MegawattHoursCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattHoursCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MWHC";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode MegawattMinuteCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattMinuteCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MWMC";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode MegawattMonthCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattMonthCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MMOC";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode MegawattYearCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattYearCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MWYC";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode MetricTons = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MetricTons";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "TONE";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode MillionBarrels = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MillionBarrels";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MIBA";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode OneMillionBTU = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneMillionBTU";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MBTU";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode TroyOunces = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TroyOunces";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "OZTR";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode USHundredweight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USHundredweight";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "UCWT";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode IndexPoint = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexPoint";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "IPNT";
		}
	};
	/**
	 * TO BE REVIEWED
	 */
	public static final MMCode PrincipalWithRelationToDebtInstrument = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalWithRelationToDebtInstrument";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "PWRD";
		}
	};
	/**
	 * Amount of fuel alternative equal to one gallon of diesel.
	 */
	public static final MMCode DieselGallonEquivalent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DieselGallonEquivalent";
			definition = "Amount of fuel alternative equal to one gallon of diesel.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "DGEU";
		}
	};
	/**
	 * Amount of fuel alternative equal to one gallon of gasoline.
	 */
	public static final MMCode GasolineGallonEquivalent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GasolineGallonEquivalent";
			definition = "Amount of fuel alternative equal to one gallon of gasoline.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "GGEU";
		}
	};
	/**
	 * Tons of carbon dioxide.
	 */
	public static final MMCode TonsOfCarbonDioxide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TonsOfCarbonDioxide";
			definition = "Tons of carbon dioxide.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "TOCD";
		}
	};
	/**
	 * Indication of the unit of measurement
	 */
	public static final MMCode Lot = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lot";
			definition = "Indication of the unit of measurement";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "LOTS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("KILO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnitOfMeasureCode";
				definition = "Identifies the unit of measure by means of a code.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnitOfMeasureCode.Kilogram, com.tools20022.repository.codeset.UnitOfMeasureCode.Piece, com.tools20022.repository.codeset.UnitOfMeasureCode.Ton,
						com.tools20022.repository.codeset.UnitOfMeasureCode.Metre, com.tools20022.repository.codeset.UnitOfMeasureCode.Inch, com.tools20022.repository.codeset.UnitOfMeasureCode.Yard,
						com.tools20022.repository.codeset.UnitOfMeasureCode.GBGallon, com.tools20022.repository.codeset.UnitOfMeasureCode.Gram, com.tools20022.repository.codeset.UnitOfMeasureCode.Centimetre,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SquareMetre, com.tools20022.repository.codeset.UnitOfMeasureCode.Foot, com.tools20022.repository.codeset.UnitOfMeasureCode.Mile,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SquareInch, com.tools20022.repository.codeset.UnitOfMeasureCode.SquareFoot, com.tools20022.repository.codeset.UnitOfMeasureCode.SquareMile,
						com.tools20022.repository.codeset.UnitOfMeasureCode.GBOunce, com.tools20022.repository.codeset.UnitOfMeasureCode.USOunce, com.tools20022.repository.codeset.UnitOfMeasureCode.GBPint,
						com.tools20022.repository.codeset.UnitOfMeasureCode.USPint, com.tools20022.repository.codeset.UnitOfMeasureCode.GBQuart, com.tools20022.repository.codeset.UnitOfMeasureCode.USQuart,
						com.tools20022.repository.codeset.UnitOfMeasureCode.USGallon, com.tools20022.repository.codeset.UnitOfMeasureCode.Millimetre, com.tools20022.repository.codeset.UnitOfMeasureCode.Kilometre,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SquareYard, com.tools20022.repository.codeset.UnitOfMeasureCode.Acre, com.tools20022.repository.codeset.UnitOfMeasureCode.Are,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SquareMillimetre, com.tools20022.repository.codeset.UnitOfMeasureCode.SquareCentimetre, com.tools20022.repository.codeset.UnitOfMeasureCode.Hectare,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SquareKilometre, com.tools20022.repository.codeset.UnitOfMeasureCode.MilliLitre, com.tools20022.repository.codeset.UnitOfMeasureCode.Centilitre,
						com.tools20022.repository.codeset.UnitOfMeasureCode.Litre, com.tools20022.repository.codeset.UnitOfMeasureCode.Pound, com.tools20022.repository.codeset.UnitOfMeasureCode.Allowances,
						com.tools20022.repository.codeset.UnitOfMeasureCode.AmountOfCurrency, com.tools20022.repository.codeset.UnitOfMeasureCode.Barrels, com.tools20022.repository.codeset.UnitOfMeasureCode.BillionCubicFeet,
						com.tools20022.repository.codeset.UnitOfMeasureCode.BoardFeet, com.tools20022.repository.codeset.UnitOfMeasureCode.Bushels, com.tools20022.repository.codeset.UnitOfMeasureCode.CertifiedEmissionsReduction,
						com.tools20022.repository.codeset.UnitOfMeasureCode.ClimateReserveTonnes, com.tools20022.repository.codeset.UnitOfMeasureCode.CubicMeters, com.tools20022.repository.codeset.UnitOfMeasureCode.Days,
						com.tools20022.repository.codeset.UnitOfMeasureCode.DryMetricTons, com.tools20022.repository.codeset.UnitOfMeasureCode.EnvironmentalCredit, com.tools20022.repository.codeset.UnitOfMeasureCode.EnvironmentalOffset,
						com.tools20022.repository.codeset.UnitOfMeasureCode.Hundredweight, com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattDayCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattHours,
						com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattHoursCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattMinuteCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattMonthCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattYearCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattDayCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattHours, com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattHoursCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattMinuteCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattMonthCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattYearCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.MetricTons, com.tools20022.repository.codeset.UnitOfMeasureCode.MillionBarrels,
						com.tools20022.repository.codeset.UnitOfMeasureCode.OneMillionBTU, com.tools20022.repository.codeset.UnitOfMeasureCode.TroyOunces, com.tools20022.repository.codeset.UnitOfMeasureCode.USHundredweight,
						com.tools20022.repository.codeset.UnitOfMeasureCode.IndexPoint, com.tools20022.repository.codeset.UnitOfMeasureCode.PrincipalWithRelationToDebtInstrument,
						com.tools20022.repository.codeset.UnitOfMeasureCode.DieselGallonEquivalent, com.tools20022.repository.codeset.UnitOfMeasureCode.GasolineGallonEquivalent,
						com.tools20022.repository.codeset.UnitOfMeasureCode.TonsOfCarbonDioxide, com.tools20022.repository.codeset.UnitOfMeasureCode.Lot);
			}
		});
		return mmObject_lazy.get();
	}
}