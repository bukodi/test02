package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DepositTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An arrangement in which a lender gives money or property to a borrower, and
 * the borrower agrees to return the property or repay the money, usually along
 * with interest, at some future point(s) in time.
 */
public class Deposit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether the deposit is fixed term or call/notice.
	 */
	public static final MMBusinessAttribute DepositType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Deposit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositType";
			definition = "Specifies whether the deposit is fixed term or call/notice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DepositTypeCode.mmObject();
		}
	};
	/**
	 * Interest amount linked to a deposit. It is derived from the relationship
	 * between AssetHolding and Interest.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Deposit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest amount linked to a deposit. It is derived from the relationship between AssetHolding and Interest.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.Deposit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Deposit";
				definition = "An arrangement in which a lender gives money or property to a borrower, and the borrower agrees to return the property or repay the money, usually along with interest, at some future point(s) in time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Interest.Deposit);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Deposit.DepositType, com.tools20022.repository.entity.Deposit.Interest);
			}
		});
		return mmObject_lazy.get();
	}
}