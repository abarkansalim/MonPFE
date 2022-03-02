package cigma.pfe.services;

import cigma.pfe.models.Facture;
import cigma.pfe.repositories.IFactureDao;

public class FactureServiceImpl implements IFactureService{
    private IFactureDao dao;
    public FactureServiceImpl(IFactureDao dao) {
        this.dao = dao;
    }

    @Override
    public Facture save(Facture f) {
        return dao.save(f);
    }

    @Override
    public Facture modify(Facture f) {
        return dao.update(f);
    }

    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    public Facture getById(long id) {
        return dao.findById(id);
    }
}
