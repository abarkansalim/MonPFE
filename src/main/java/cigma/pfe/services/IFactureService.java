package cigma.pfe.services;

import cigma.pfe.models.Facture;

public interface IFactureService {
    Facture save(Facture f);
    Facture modify(Facture f);
    void removeById(long id);
    Facture getById(long id);
}
