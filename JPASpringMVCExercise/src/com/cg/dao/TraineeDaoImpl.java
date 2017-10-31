package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;

@Repository
@Transactional
public class TraineeDaoImpl implements TraineeDao {

	//Below annotation is required to inject auto created entityManager from entityManagerFactory
	@PersistenceContext
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see com.cg.dao.EmployeeRepository#save(com.cg.entities.Employee)
	 */
	@Override
	public Trainee save(Trainee trainee) {

		entityManager.persist(trainee);
		entityManager.flush();	//required to reflect changes on database
		return trainee;
	}
	/* (non-Javadoc)
	 * @see com.cg.dao.EmployeeRepository#loadAll()
	 */
	
	@Override
	public Trainee get(int id) {
		TypedQuery<Trainee> query = entityManager.createQuery("SELECT e FROM Trainee e WHERE e.traineeId="+id, Trainee.class);
		Trainee trainee = query.getSingleResult();
		
		return trainee;
	}
	
	public Trainee deleteTrainee(long id) {
		Trainee trainee = entityManager.find(Trainee.class, id);
		entityManager.remove(trainee);
		
		return trainee;
	}
	
	@Override
	public List<Trainee> loadAll() {
		TypedQuery<Trainee> query = entityManager.createQuery("SELECT e FROM Trainee e", Trainee.class);
		return query.getResultList();
	}

	@Override
	public Trainee modify(Trainee trainee) {
		trainee = entityManager.merge(trainee);
		entityManager.flush();	//required to reflect changes on database
		
		return trainee;
	}
}