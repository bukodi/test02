package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.RatingValueIdentifier;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Assessment of securities credit and investment risk.
 */
public class Rating {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security for which a rating is provided.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Rating.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a rating is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Rating;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Information regarding the entity that assigns the rating.
	 */
	public static final MMBusinessAssociationEnd RatingScheme = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Rating.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RatingScheme";
			definition = "Information regarding the entity that assigns the rating.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.Rating;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Scheme.mmObject();
		}
	};
	/**
	 * Date/time as from which the rating is valid.
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Rating.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time as from which the rating is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the rating, which has been assigned to a security by a rating
	 * agency.
	 */
	public static final MMBusinessAttribute Value = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Rating.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Specifies the rating, which has been assigned to a security by a rating agency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RatingValueIdentifier.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Rating";
				definition = "Assessment of securities credit and investment risk.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Rating, com.tools20022.repository.entity.Scheme.Rating);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Rating.Security, com.tools20022.repository.entity.Rating.RatingScheme, com.tools20022.repository.entity.Rating.ValueDate,
						com.tools20022.repository.entity.Rating.Value);
			}
		});
		return mmObject_lazy.get();
	}
}