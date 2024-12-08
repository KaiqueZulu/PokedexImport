package com.matdev.dao;

import com.matdev.model.Pokemon;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PokemonDAO {
    private static final SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Pokemon.class)
            .buildSessionFactory();

    public void SavePokemon (Pokemon pokemon){
        Session session = sessionFactory.getCurrentSession();
       try{
           session.beginTransaction();
           session.save(pokemon);
           session.getTransaction().commit();
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       finally {
           session.close();
       }
    }

    public void removePokemon(int id) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = null;

        try {
            // Inicia a transação
            transaction = session.beginTransaction();

            // Busca o Pokémon pelo ID
            Pokemon pokemon = session.get(Pokemon.class, id);

            if (pokemon != null) {
                // Remove o Pokémon do banco de dados
                session.delete(pokemon);
                System.out.println("Pokémon removed successfully!");
            } else {
                System.out.println("Pokémon not found for ID: " + id);
            }

            // Commit da transação
            transaction.commit();
        } catch (Exception e) {
            // Se houver erro, faz rollback da transação
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Fecha a session
            session.close();
        }
    }

    // Método para fechar a SessionFactory (chamado ao finalizar a aplicação)
    public void shutdown() {
        sessionFactory.close();
    }
}
