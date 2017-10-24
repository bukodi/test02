package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.AuthenticationEntityCode;
import com.tools20022.repository.codeset.AuthenticationMethodCode;
import com.tools20022.repository.codeset.AuthenticationResultCode;
import com.tools20022.repository.codeset.PINFormatCode;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.msg.MandateAuthentication1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Data related to the authentication of the cardholder.
 */
public class Authentication {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cardholder for which an authentication is provided.
	 */
	public static final MMBusinessAssociationEnd Cardholder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Authentication.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cardholder";
			definition = "Cardholder for which an authentication is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardholderRole.Authentication;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardholderRole.mmObject();
		}
	};
	/**
	 * Method used to authenticate a person.
	 */
	public static final MMBusinessAttribute AuthenticationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAuthentication1.Channel);
			isDerived = false;
			elementContext_lazy = () -> Authentication.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method used to authenticate a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethodCode.mmObject();
		}
	};
	/**
	 * Entity or object in charge of verifying the person authenticity.
	 */
	public static final MMBusinessAttribute AuthenticationEntity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAuthentication1.MessageAuthenticationCode);
			isDerived = false;
			elementContext_lazy = () -> Authentication.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthenticationEntity";
			definition = "Entity or object in charge of verifying the person authenticity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationEntityCode.mmObject();
		}
	};
	/**
	 * Value used to authenticate the owner of the payment card.
	 */
	public static final MMBusinessAttribute AuthenticationValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Authentication.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthenticationValue";
			definition = "Value used to authenticate the owner of the payment card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Encrypted personal identification number (PIN) format.
	 */
	public static final MMBusinessAttribute PINFormat = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Authentication.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PINFormat";
			definition = "Encrypted personal identification number (PIN) format.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PINFormatCode.mmObject();
		}
	};
	/**
	 * Personal Identification Number (PIN) for authentication.
	 */
	public static final MMBusinessAttribute PIN = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Authentication.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PIN";
			definition = "Personal Identification Number (PIN) for authentication.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	/**
	 * This indicator identifies whether person authentication is supported and
	 * data is available.
	 */
	public static final MMBusinessAttribute AuthenticationSupport = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Authentication.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthenticationSupport";
			definition = "This indicator identifies whether person authentication is supported and data is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies in electronic commerce transactions whether customer
	 * authentication is supported and data is available.
	 */
	public static final MMBusinessAttribute CollectionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Authentication.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionIndicator";
			definition = "Identifies in electronic commerce transactions whether customer authentication is supported and data is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the mandate related to the transport authentication
	 * detailsmandate.
	 */
	public static final MMBusinessAssociationEnd Mandate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Authentication.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mandate";
			definition = "Specifies the mandate related to the transport authentication detailsmandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.Authentication;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
		}
	};
	/**
	 * Specifies the result of the authentication.
	 */
	public static final MMBusinessAttribute AuthenticationResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Authentication.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthenticationResult";
			definition = "Specifies the result of the authentication.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationResultCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Authentication";
				definition = "Data related to the authentication of the cardholder.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardholderRole.Authentication, com.tools20022.repository.entity.Mandate.Authentication);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Authentication.Cardholder, com.tools20022.repository.entity.Authentication.AuthenticationMethod,
						com.tools20022.repository.entity.Authentication.AuthenticationEntity, com.tools20022.repository.entity.Authentication.AuthenticationValue, com.tools20022.repository.entity.Authentication.PINFormat,
						com.tools20022.repository.entity.Authentication.PIN, com.tools20022.repository.entity.Authentication.AuthenticationSupport, com.tools20022.repository.entity.Authentication.CollectionIndicator,
						com.tools20022.repository.entity.Authentication.Mandate, com.tools20022.repository.entity.Authentication.AuthenticationResult);
				derivationComponent_lazy = () -> Arrays.asList(MandateAuthentication1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}