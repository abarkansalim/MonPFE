package cigma.pfe.repositories;

import cigma.pfe.models.Client;

public interface IClientDao {
    boolean save(Client c);
}
