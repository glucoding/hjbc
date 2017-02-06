package com.hejiascm.dao;

import com.hejiascm.domain.Participant;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Participant entities.
 * 
 */
public interface ParticipantDAO extends JpaDao<Participant> {

	/**
	 * JPQL Query - findParticipantByRoleContaining
	 *
	 */
	public Set<Participant> findParticipantByRoleContaining(String role) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByRoleContaining
	 *
	 */
	public Set<Participant> findParticipantByRoleContaining(String role, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByNameContaining
	 *
	 */
	public Set<Participant> findParticipantByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByNameContaining
	 *
	 */
	public Set<Participant> findParticipantByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByPermission
	 *
	 */
	public Set<Participant> findParticipantByPermission(String permission) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByPermission
	 *
	 */
	public Set<Participant> findParticipantByPermission(String permission, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByRole
	 *
	 */
	public Set<Participant> findParticipantByRole(String role_1) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByRole
	 *
	 */
	public Set<Participant> findParticipantByRole(String role_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllParticipants
	 *
	 */
	public Set<Participant> findAllParticipants() throws DataAccessException;

	/**
	 * JPQL Query - findAllParticipants
	 *
	 */
	public Set<Participant> findAllParticipants(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByPrimaryKey
	 *
	 */
	public Participant findParticipantByPrimaryKey(String id) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByPrimaryKey
	 *
	 */
	public Participant findParticipantByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByPermissionContaining
	 *
	 */
	public Set<Participant> findParticipantByPermissionContaining(String permission_1) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByPermissionContaining
	 *
	 */
	public Set<Participant> findParticipantByPermissionContaining(String permission_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantById
	 *
	 */
	public Participant findParticipantById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantById
	 *
	 */
	public Participant findParticipantById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantBySignedTimeContaining
	 *
	 */
	public Set<Participant> findParticipantBySignedTimeContaining(String signedTime) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantBySignedTimeContaining
	 *
	 */
	public Set<Participant> findParticipantBySignedTimeContaining(String signedTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantBySignedTime
	 *
	 */
	public Set<Participant> findParticipantBySignedTime(String signedTime_1) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantBySignedTime
	 *
	 */
	public Set<Participant> findParticipantBySignedTime(String signedTime_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByStatus
	 *
	 */
	public Set<Participant> findParticipantByStatus(Integer status) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByStatus
	 *
	 */
	public Set<Participant> findParticipantByStatus(Integer status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByName
	 *
	 */
	public Set<Participant> findParticipantByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByName
	 *
	 */
	public Set<Participant> findParticipantByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByIdContaining
	 *
	 */
	public Set<Participant> findParticipantByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findParticipantByIdContaining
	 *
	 */
	public Set<Participant> findParticipantByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

}