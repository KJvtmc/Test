//package it.akademija.dao;
//
//import java.util.List;
//
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Repository;
//
//import it.akademija.PagingData;
//import it.akademija.users.User;
//
//@Repository
//public class DBUserDAO implements UserDao {
//	@PersistenceContext
//	private EntityManager entityManager;
//	@Autowired
//	@Qualifier("pagingData")
//	private PagingData pagingData;
//
//	public List<User> getUsers() {
//		return entityManager.createQuery("SELECT u from User u", User.class).setMaxResults(pagingData.getLimit()).getResultList();
//	}
//
//	public void createUser(User user) {
//		entityManager.persist(user);
//	}
//
//	public void deleteUser(String username) {
//		User user = entityManager.createQuery("SELECT u from User u where username = :un", User.class)
//				.setParameter("un", username).getSingleResult();
//		if (entityManager.contains(user)) {
//			entityManager.remove(user);
//		} else {
//			entityManager.remove(entityManager.merge(user));
//		}
//	}
//
////	@Override
////	public void setPagingData(PagingData pagingData) {
////		// TODO Auto-generated method stub
////		
////	}
//}
