package raf.si.bolnica.management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import raf.si.bolnica.management.entities.IstorijaBolesti;
import raf.si.bolnica.management.entities.ZdravstveniKarton;
import raf.si.bolnica.management.repositories.IstorijaBolestiRepository;

@Service
@Transactional(value = "transactionManager", readOnly = true)
public class IstorijaBolestiServiceImpl implements IstorijaBolestiService {

    @Autowired
    IstorijaBolestiRepository istorijaBolestiRepository;

    @Override
    @Transactional()
    public IstorijaBolesti saveIstorijaBolesti(IstorijaBolesti istorijaBolesti) {
        return istorijaBolestiRepository.save(istorijaBolesti);
    }

    @Override
    public IstorijaBolesti fetchByZdravstveniKartonPodaciValidni(ZdravstveniKarton zk, boolean podaci) {
        return istorijaBolestiRepository.getIstorijaBolestiByZdravstveniKartonAndPodaciValidni(zk, podaci);
    }
}
