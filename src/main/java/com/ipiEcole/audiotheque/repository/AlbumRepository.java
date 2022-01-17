package com.ipiEcole.audiotheque.repository;

import com.ipiEcole.audiotheque.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

    Album findByTitle(String title);

}
