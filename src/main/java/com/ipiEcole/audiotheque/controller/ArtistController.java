package com.ipiEcole.audiotheque.controller;


import com.ipiEcole.audiotheque.model.Artist;
import com.ipiEcole.audiotheque.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@RestController
@RequestMapping(value = "/artists")
public class ArtistController {

    @Autowired
    private ArtistRepository artistRepository;

    //Recherche d'un artiste par son id
    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public Artist artist(
            @PathVariable(value = "id") Integer id
    ){
        Optional<Artist> artist = artistRepository.findById(id);

        if (artist.isEmpty()){
            throw new EntityNotFoundException("artist with this : " + id + " id not found.");
        }

        return artist.get();
    }

}
