package cigma.pfe.controllers;

import cigma.pfe.models.Facture;
import cigma.pfe.services.IFactureService;

public class FactureController {
    private IFactureService service ;
    public FactureController(IFactureService service) {
        this.service = service;
    }
    public void save(Facture c){
        service.save(c);
    }
    public void modify(Facture c){
        service.modify(c);
    }

    public void removeById(long id){
        service.removeById(id);
    }

    public Facture getById(long id){
        return service.getById(id);
    }
}
