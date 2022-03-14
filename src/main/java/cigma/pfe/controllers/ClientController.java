package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private IClientService service;

    @PostMapping("/create")
    public Client save(@RequestBody Client clt) {
        return service.save(clt);
    }
    @PutMapping("/update")
    public Client modify(@RequestBody Client clt){
        return service.modify(clt);
    }

    public void remove(long idClt) {
        service.remove(idClt);
    }

    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long id){
        return service.getOne(id);
    }
    @GetMapping("/all")
    public List<Client> getAll(){
        return service.getAll();
    }
}
