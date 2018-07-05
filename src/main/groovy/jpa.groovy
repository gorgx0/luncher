import model.User

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.EntityTransaction
import javax.persistence.Persistence

import static javax.persistence.Persistence.createEntityManagerFactory

def entityManagerFactory = createEntityManagerFactory("luncherDB")
def entityManager = entityManagerFactory.createEntityManager()
def transaction = entityManager.getTransaction()
transaction.begin()

def user = new User()
user.name = "Testowski01"
user.uid = "User uid"
entityManager.persist(user)

transaction.commit()
