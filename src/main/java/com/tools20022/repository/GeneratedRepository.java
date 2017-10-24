package com.tools20022.repository;

import com.tools20022.core.repo.ReflectionBasedRepository;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repository.area.PaymentsInitiationLatestVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class GeneratedRepository extends ReflectionBasedRepository {

	final static private AtomicReference<MMRepository> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of BusinessProcessCatalogue.
	 */
	public static final MMBusinessProcessCatalogue catalogue = new MMBusinessProcessCatalogue() {
		{
			repository_lazy = () -> GeneratedRepository.mmObject();
			topLevelCatalogueEntry_lazy = () -> Arrays.asList(PaymentsInitiationLatestVersion.mmObject());
		}
	};
	/**
	 * An instance of DataDictionary.
	 */
	public static final MMDataDictionary dataDict = new MMDataDictionary() {
		{
			repository_lazy = () -> GeneratedRepository.mmObject();
			topLevelDictionaryEntry_lazy = () -> ListBuilderForGeneratedRepository_00.addElems(new ArrayList<>());
		}
	};

	private GeneratedRepository() {
		super(StandardMetamodel2013.metamodel());
	}

	final static public MMRepository mmObject() {
		mmObject_lazy.compareAndSet(null, new MMRepository() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
			}
		});
		return mmObject_lazy.get();
	}
}