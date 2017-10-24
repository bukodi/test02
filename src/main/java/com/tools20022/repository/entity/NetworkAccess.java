package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters used to access a network.
 */
public class NetworkAccess {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * IP address of the host.
	 */
	public static final MMBusinessAttribute HostIPAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetworkAccess.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HostIPAddress";
			definition = "IP address of the host.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Port number of the host.
	 */
	public static final MMBusinessAttribute HostPortNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetworkAccess.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HostPortNumber";
			definition = "Port number of the host.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * User name identifying the party accessing the network.
	 */
	public static final MMBusinessAttribute UserName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetworkAccess.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UserName";
			definition = "User name identifying the party accessing the network.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Password authenticating the user
	 */
	public static final MMBusinessAttribute AccessCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetworkAccess.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccessCode";
			definition = "Password authenticating the user";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Client certificate chain.
	 */
	public static final MMBusinessAssociationEnd ClientCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetworkAccess.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientCertificate";
			definition = "Client certificate chain.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.NetworkAccess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecurityCertificate.mmObject();
		}
	};
	/**
	 * Terminal Management System which uses the network.
	 */
	public static final MMBusinessAssociationEnd TerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetworkAccess.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal Management System which uses the network.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.NetworkAccess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
		}
	};
	/**
	 * Address used to reach the network on which a message will be carried.
	 */
	public static final MMBusinessAttribute NetworkAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetworkAccess.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetworkAddress";
			definition = "Address used to reach the network on which a message will be carried.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NetworkAccess";
				definition = "Parameters used to access a network.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecurityCertificate.NetworkAccess, com.tools20022.repository.entity.TerminalManagementSystem.NetworkAccess);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetworkAccess.HostIPAddress, com.tools20022.repository.entity.NetworkAccess.HostPortNumber, com.tools20022.repository.entity.NetworkAccess.UserName,
						com.tools20022.repository.entity.NetworkAccess.AccessCode, com.tools20022.repository.entity.NetworkAccess.ClientCertificate, com.tools20022.repository.entity.NetworkAccess.TerminalManagementSystem,
						com.tools20022.repository.entity.NetworkAccess.NetworkAddress);
			}
		});
		return mmObject_lazy.get();
	}
}