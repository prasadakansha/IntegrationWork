package org.cap.theatermgt.dao;

import org.cap.theatermgt.entities.Theater;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/***
 * @author Akansha Prasad
 */
/***
 * DAO design pattern is a way to reduce coupling between Business logic and
 * Persistence logic.
 */
@Repository
public interface Dao extends JpaRepository<Theater, Integer> {

}
