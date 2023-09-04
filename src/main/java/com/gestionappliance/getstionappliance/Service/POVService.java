package com.gestionappliance.getstionappliance.Service;

import com.gestionappliance.getstionappliance.Dto.POVDTO;

import java.util.List;

public interface POVService {
    POVDTO save(POVDTO povdto);

    void delete(Long IdPOV);
    List<POVDTO> findAllPOV();

    POVDTO updatePOV(long id, POVDTO povdto);
}
