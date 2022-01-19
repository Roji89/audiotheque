package com.ipiEcole.audiotheque.repository;

import com.ipiEcole.audiotheque.model.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    Artist findByName(String name);

    Page<Artist> findByNameIgnoreCase(String name, Pageable pageable);

}
