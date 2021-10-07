package com.redlightbar.service.impl;

import com.redlightbar.model.Entry;
import com.redlightbar.repository.EntryRepository;
import com.redlightbar.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DefaultEntryService implements EntryService {

	private EntryRepository entryRepository;

	@Autowired
	public DefaultEntryService(EntryRepository entryRepository) {
		this.entryRepository = entryRepository;
	}

	@Override
	public Entry saveEntry(Entry entry) {
		return entryRepository.save(entry);
	}
}
