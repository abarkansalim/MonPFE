package cigma.pfe.repositories;

import cigma.pfe.models.Facture;

public interface IFactureDao {
    Facture save(Facture c);
    Facture update(Facture c);
    void deleteById(long idFacture);
    Facture findById(long idFacture);
}
