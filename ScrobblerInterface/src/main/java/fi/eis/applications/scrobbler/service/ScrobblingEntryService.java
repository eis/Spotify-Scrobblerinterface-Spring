package fi.eis.applications.scrobbler.service;

import org.springframework.beans.factory.annotation.Autowired;

import fi.eis.applications.scrobbler.repository.ScrobblingEntryRepository;

public class ScrobblingEntryService {
	@Autowired
	ScrobblingEntryRepository scrobblingEntryRepository;
}
