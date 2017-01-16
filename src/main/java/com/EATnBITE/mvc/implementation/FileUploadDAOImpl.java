package com.EATnBITE.mvc.implementation;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.EATnBITE.mvc.dao.FileUploadDAO;
import com.EATnBITE.mvc.model.UploadFile;
@Repository

public class FileUploadDAOImpl implements FileUploadDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	/*public FileUploadDAOImpl() {
	}*/

	/*public FileUploadDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
*/
	public SessionFactory getSessionFactory() {
	return sessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}

	@Override
	@Transactional
	public void save(UploadFile uploadFile) {
		Session session=sessionFactory.openSession();
		session.save(uploadFile);
		session.flush();
		session.close();
	}

	
	@Override
	public UploadFile getFile(String username) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from UploadFile where username=?");
		query.setParameter(0, username);
        UploadFile uploadFile=(UploadFile)query.uniqueResult();
		session.close();
		return uploadFile;
	}

}