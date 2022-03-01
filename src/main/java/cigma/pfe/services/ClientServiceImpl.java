package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.IClientDao;

public class ClientServiceImpl implements IClientService {
    private IClientDao dao;
    public ClientServiceImpl(IClientDao dao) {
        this.dao = dao;
    }
    @Override
    public Client save(Client c) {
        return dao.save(c);
    }
    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }
}
