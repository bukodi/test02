package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DisputeResolutionTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the dispute details on the variation margin and/or the segregated
 * independent amount.
 */
public class DisputeManagement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Disputed amount.
	 */
	public static final MMBusinessAttribute DisputedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DisputeManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputedAmount";
			definition = "Disputed amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date of dispute.
	 */
	public static final MMBusinessAttribute DisputeDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DisputeManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeDate";
			definition = "Date of dispute.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the type of dispute that is to be resolved regarding the
	 * disputed collateral amount.
	 */
	public static final MMBusinessAttribute DisputeResolutionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DisputeManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeResolutionType";
			definition = "Specifies the type of dispute that is to be resolved regarding the disputed collateral amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DisputeResolutionTypeCode.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 */
	public static final MMBusinessAssociationEnd RelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DisputeManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.DisputeManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DisputeManagement";
				definition = "Provides the dispute details on the variation margin and/or the segregated independent amount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.DisputeManagement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DisputeManagement.DisputedAmount, com.tools20022.repository.entity.DisputeManagement.DisputeDate,
						com.tools20022.repository.entity.DisputeManagement.DisputeResolutionType, com.tools20022.repository.entity.DisputeManagement.RelatedManagementProcess);
			}
		});
		return mmObject_lazy.get();
	}
}