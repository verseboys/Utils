package com.tool.utils.hibernategenerator.base;


import java.io.Serializable; 
import java.util.Collection; 
import java.util.List; 

import org.hibernate.Session;




public interface IGenericDao<T, PK extends Serializable> { 

  public T findById(PK id);
 
  
  public List<T> findByHql(String hql);
  public List<T> findAll();
  public List<T> findAllByDesc(PK id);
  public List<T> findAllByPage(String hql, int start, int number);
  public int getListSize(String hql);
  public List<T> getListByPage(String hql,int currentPage);
  public List<T> findAllByPage(String hql, int start, int number,Object[] values);
  public List<T> getListByPage(int currentPage,int pageSize);
  public List<T> getListByPageByDesc(int currentPage, int pageSize,String orderId);
  public boolean save(T entity); 
  public boolean update(T entity);
  public boolean saveOrUpdate(T entity);
  public boolean delete(T entity); 
  public boolean deleteById(PK id); 
  public boolean deleteAll(Collection<T> entities);
  public int getSize();
  public Session getSession();
  public void flush();
  public void clear();
  public void sessionClose();
  
  //num等于0,表示不限制结果行数， hqlpart为问号后，不带参数Hql
  public List<T> findByProperty(String propertyName, Object value,String hqlpart,int num);
  public List<T> findByExample(T entity) ;
  //原生sql
  public List<Object> findBySql(String Sql);
  
  public List<T> findByPropertyTwo(String propertyName, Object value,String propertyNameTwo,
			Object valueTwo,String propertyNameThree, Object valueThree);
  
  public List<T> findByPropertyOpen(String propertyName, Object value ,String hqlpart,int num);
  
}
