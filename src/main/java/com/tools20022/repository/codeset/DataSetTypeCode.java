package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of data set that is matched.
 */
public class DataSetTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Data set is a baseline.
	 */
	public static final MMCode Baseline = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Baseline";
			definition = "Data set is a baseline.";
			owner_lazy = () -> DataSetTypeCode.mmObject();
			codeName = "BASE";
		}
	};
	/**
	 * Data set is a transport data set.
	 */
	public static final MMCode TransportDataSet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDataSet";
			definition = "Data set is a transport data set.";
			owner_lazy = () -> DataSetTypeCode.mmObject();
			codeName = "TRDS";
		}
	};
	/**
	 * Data set is a commercial data set.
	 */
	public static final MMCode CommercialDataSet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDataSet";
			definition = "Data set is a commercial data set.";
			owner_lazy = () -> DataSetTypeCode.mmObject();
			codeName = "CODS";
		}
	};
	/**
	 * Data set is an insurance data set.
	 */
	public static final MMCode InsuranceDataSet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceDataSet";
			definition = "Data set is an insurance data set.";
			owner_lazy = () -> DataSetTypeCode.mmObject();
			codeName = "INDS";
		}
	};
	/**
	 * Data set is a certificate data set.
	 */
	public static final MMCode CertificateDataSet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDataSet";
			definition = "Data set is a certificate data set.";
			owner_lazy = () -> DataSetTypeCode.mmObject();
			codeName = "CEDS";
		}
	};
	/**
	 * Data set is an other special certificate data set.
	 */
	public static final MMCode OtherCertificateDataSet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCertificateDataSet";
			definition = "Data set is an other special certificate data set.";
			owner_lazy = () -> DataSetTypeCode.mmObject();
			codeName = "OCDS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BASE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DataSetTypeCode";
				definition = "Specifies the type of data set that is matched.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetTypeCode.Baseline, com.tools20022.repository.codeset.DataSetTypeCode.TransportDataSet,
						com.tools20022.repository.codeset.DataSetTypeCode.CommercialDataSet, com.tools20022.repository.codeset.DataSetTypeCode.InsuranceDataSet, com.tools20022.repository.codeset.DataSetTypeCode.CertificateDataSet,
						com.tools20022.repository.codeset.DataSetTypeCode.OtherCertificateDataSet);
			}
		});
		return mmObject_lazy.get();
	}
}