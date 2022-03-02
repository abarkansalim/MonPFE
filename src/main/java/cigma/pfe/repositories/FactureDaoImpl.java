package cigma.pfe.repositories;

import cigma.pfe.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactureDaoImpl implements IFactureDao{

    EntityManagerFactory emf=
            Persistence.createEntityManagerFactory("unit_factures");
    EntityManager em=emf.createEntityManager();

    private Class<Facture> persistentClass;

    public FactureDaoImpl() {
    }
    @Override
    public Facture save(Facture c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Facture update(Facture newFacture) {
        em.getTransaction().begin();
        Facture currentFacture =
                em.find(Facture.class,newFacture.getId());
        currentFacture.setDate(newFacture.getDate());
        currentFacture.setAmount(newFacture.getAmount());
        em.persist(currentFacture);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public void deleteById(long idFacture) {
        em.getTransaction().begin();
        Facture factureInDataBase = em.find(Facture.class,idFacture);
        em.remove(factureInDataBase);
        em.getTransaction().commit();
    }

    @Override
    public Facture findById(long idFacture) {
        return em.find(Facture.class,idFacture);
    }
}
