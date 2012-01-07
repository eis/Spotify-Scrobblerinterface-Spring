package fi.eis.applications.scrobbler.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fi.eis.applications.scrobbler.domain.ScrobblingEntry;

@Transactional()
public interface ScrobblingEntryRepository extends CrudRepository<ScrobblingEntry,Long>{

}
