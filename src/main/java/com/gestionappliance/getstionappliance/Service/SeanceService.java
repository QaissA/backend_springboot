package com.gestionappliance.getstionappliance.Service;

import com.gestionappliance.getstionappliance.Dto.SeanceDTO;

import java.util.List;

public interface SeanceService {
    SeanceDTO save(SeanceDTO seanceDTO);

    void delete(Long idSeance);

    List<SeanceDTO> findAllSeance();

    SeanceDTO updateSeance(long id, SeanceDTO seanceDTO);
}
