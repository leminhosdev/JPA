package testes;

import testes.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {



        EntityManagerFactory  mf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = mf.createEntityManager();
        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println("pronto!");
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        em.close();
        mf.close();
        System.out.println(p);
    }
}
