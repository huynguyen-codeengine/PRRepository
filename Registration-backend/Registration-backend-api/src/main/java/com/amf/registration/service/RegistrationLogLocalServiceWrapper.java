/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.amf.registration.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RegistrationLogLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationLogLocalService
 * @generated
 */
public class RegistrationLogLocalServiceWrapper
	implements RegistrationLogLocalService,
			   ServiceWrapper<RegistrationLogLocalService> {

	public RegistrationLogLocalServiceWrapper(
		RegistrationLogLocalService registrationLogLocalService) {

		_registrationLogLocalService = registrationLogLocalService;
	}

	@Override
	public com.amf.registration.model.RegistrationLog addRegistrationLog(
			long groupId, long companyId, long userId, String userName,
			java.util.Date createDate, java.util.Date modifiedDate,
			String eventType, String ipAddress)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registrationLogLocalService.addRegistrationLog(
			groupId, companyId, userId, userName, createDate, modifiedDate,
			eventType, ipAddress);
	}

	/**
	 * Adds the registration log to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegistrationLogLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param registrationLog the registration log
	 * @return the registration log that was added
	 */
	@Override
	public com.amf.registration.model.RegistrationLog addRegistrationLog(
		com.amf.registration.model.RegistrationLog registrationLog) {

		return _registrationLogLocalService.addRegistrationLog(registrationLog);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registrationLogLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new registration log with the primary key. Does not add the registration log to the database.
	 *
	 * @param registrationLogId the primary key for the new registration log
	 * @return the new registration log
	 */
	@Override
	public com.amf.registration.model.RegistrationLog createRegistrationLog(
		long registrationLogId) {

		return _registrationLogLocalService.createRegistrationLog(
			registrationLogId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registrationLogLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the registration log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegistrationLogLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param registrationLogId the primary key of the registration log
	 * @return the registration log that was removed
	 * @throws PortalException if a registration log with the primary key could not be found
	 */
	@Override
	public com.amf.registration.model.RegistrationLog deleteRegistrationLog(
			long registrationLogId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registrationLogLocalService.deleteRegistrationLog(
			registrationLogId);
	}

	/**
	 * Deletes the registration log from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegistrationLogLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param registrationLog the registration log
	 * @return the registration log that was removed
	 */
	@Override
	public com.amf.registration.model.RegistrationLog deleteRegistrationLog(
		com.amf.registration.model.RegistrationLog registrationLog) {

		return _registrationLogLocalService.deleteRegistrationLog(
			registrationLog);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _registrationLogLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _registrationLogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.model.impl.RegistrationLogModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _registrationLogLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.model.impl.RegistrationLogModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _registrationLogLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _registrationLogLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _registrationLogLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.amf.registration.model.RegistrationLog fetchRegistrationLog(
		long registrationLogId) {

		return _registrationLogLocalService.fetchRegistrationLog(
			registrationLogId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _registrationLogLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _registrationLogLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _registrationLogLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registrationLogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the registration log with the primary key.
	 *
	 * @param registrationLogId the primary key of the registration log
	 * @return the registration log
	 * @throws PortalException if a registration log with the primary key could not be found
	 */
	@Override
	public com.amf.registration.model.RegistrationLog getRegistrationLog(
			long registrationLogId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registrationLogLocalService.getRegistrationLog(
			registrationLogId);
	}

	/**
	 * Returns a range of all the registration logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.model.impl.RegistrationLogModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of registration logs
	 * @param end the upper bound of the range of registration logs (not inclusive)
	 * @return the range of registration logs
	 */
	@Override
	public java.util.List<com.amf.registration.model.RegistrationLog>
		getRegistrationLogs(int start, int end) {

		return _registrationLogLocalService.getRegistrationLogs(start, end);
	}

	@Override
	public java.util.List<com.amf.registration.model.RegistrationLog>
		getRegistrationLogsByEventType(String eventType, int start, int end) {

		return _registrationLogLocalService.getRegistrationLogsByEventType(
			eventType, start, end);
	}

	@Override
	public java.util.List<com.amf.registration.model.RegistrationLog>
		getRegistrationLogsByUser(long userId, int start, int end) {

		return _registrationLogLocalService.getRegistrationLogsByUser(
			userId, start, end);
	}

	@Override
	public java.util.List<com.amf.registration.model.RegistrationLog>
		getRegistrationLogsByUserEventType(
			long userId, String eventType, int start, int end) {

		return _registrationLogLocalService.getRegistrationLogsByUserEventType(
			userId, eventType, start, end);
	}

	/**
	 * Returns the number of registration logs.
	 *
	 * @return the number of registration logs
	 */
	@Override
	public int getRegistrationLogsCount() {
		return _registrationLogLocalService.getRegistrationLogsCount();
	}

	@Override
	public long getRegistrationLogsCountByEventType(String eventType) {
		return _registrationLogLocalService.getRegistrationLogsCountByEventType(
			eventType);
	}

	@Override
	public long getRegistrationLogsCountByUser(long userId) {
		return _registrationLogLocalService.getRegistrationLogsCountByUser(
			userId);
	}

	@Override
	public long getRegistrationLogsCountByUserEventType(
		long userId, String eventType) {

		return _registrationLogLocalService.
			getRegistrationLogsCountByUserEventType(userId, eventType);
	}

	/**
	 * Updates the registration log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegistrationLogLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param registrationLog the registration log
	 * @return the registration log that was updated
	 */
	@Override
	public com.amf.registration.model.RegistrationLog updateRegistrationLog(
		com.amf.registration.model.RegistrationLog registrationLog) {

		return _registrationLogLocalService.updateRegistrationLog(
			registrationLog);
	}

	@Override
	public RegistrationLogLocalService getWrappedService() {
		return _registrationLogLocalService;
	}

	@Override
	public void setWrappedService(
		RegistrationLogLocalService registrationLogLocalService) {

		_registrationLogLocalService = registrationLogLocalService;
	}

	private RegistrationLogLocalService _registrationLogLocalService;

}