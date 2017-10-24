package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ChoiceCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Security which forms a component of another security, for example,
 * underlying.
 */
public class ComponentSecurity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Period during which the related security can (optional) or must
	 * (mandatory) be separated.
	 */
	public static final MMBusinessAssociationEnd SeparationPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeparationPeriod";
			definition = "Period during which the related security can (optional) or must (mandatory) be separated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ComponentSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Security for which a component security is specified.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a component security is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.ComponentSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Defines if the separation of the security is optional or mandatory.
	 */
	public static final MMBusinessAttribute SeparationChoice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeparationChoice";
			definition = " Defines if the separation of the security is optional or mandatory.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChoiceCode.mmObject();
		}
	};
	/**
	 * Number of related securities for the exercise.
	 */
	public static final MMBusinessAttribute QuantityNumerator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityNumerator";
			definition = "Number of related securities for the exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Number of held securities for the exercise.
	 */
	public static final MMBusinessAttribute QuantityDenominator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityDenominator";
			definition = "Number of held securities for the exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Date/time at which the related security can (optional) or must
	 * (mandatory) be separated.
	 */
	public static final MMBusinessAttribute SeparationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeparationDate";
			definition = "Date/time at which the related security can (optional) or must (mandatory) be separated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ComponentSecurity";
				definition = "Security which forms a component of another security, for example, underlying.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.ComponentSecurity, com.tools20022.repository.entity.DateTimePeriod.ComponentSecurity);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ComponentSecurity.SeparationPeriod, com.tools20022.repository.entity.ComponentSecurity.Security,
						com.tools20022.repository.entity.ComponentSecurity.SeparationChoice, com.tools20022.repository.entity.ComponentSecurity.QuantityNumerator, com.tools20022.repository.entity.ComponentSecurity.QuantityDenominator,
						com.tools20022.repository.entity.ComponentSecurity.SeparationDate);
			}
		});
		return mmObject_lazy.get();
	}
}