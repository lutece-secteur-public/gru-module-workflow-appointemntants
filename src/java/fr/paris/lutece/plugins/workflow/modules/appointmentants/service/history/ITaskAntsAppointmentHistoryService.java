/*
 * Copyright (c) 2002-2024, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.workflow.modules.appointmentants.service.history;

import fr.paris.lutece.plugins.workflow.modules.appointmentants.business.history.TaskAntsAppointmentHistory;
import fr.paris.lutece.portal.service.plugin.Plugin;

public interface ITaskAntsAppointmentHistoryService
{
	/**
	 * Create a new entry in the ANTS task's history table
	 * 
	 * @param taskAntsAppointmentHistory
	 *            TaskAntsAppointmentHistory object to insert
	 * @param plugin
	 *            The Plugin
	 */
	void create( TaskAntsAppointmentHistory taskAntsAppointmentHistory, Plugin plugin );

	/**
	 * Remove the ANTS task's history associated with the history
	 * and task specified in parameters
	 * 
	 * @param idHistory
	 *            ID of the resource history used for the task
	 * @param idTask
	 *            ID of the task
	 * @param plugin
	 *            The Plugin
	 */
	void removeByHistory( int idHistory, int idTask, Plugin plugin );

	/**
	 * Remove the ANTS task's history associated with the task specified in parameters
	 * 
	 * @param idTask
	 *            ID of the task
	 * @param plugin
	 *            The Plugin
	 */
	void removeByTask( int idTask, Plugin plugin );

	/**
	 * Find the data that matches the specified parameters, from the ANTS task's history table
	 * 
	 * @param idHistory
	 *            ID of the resource history used for the task
	 * @param idTask
	 *            ID of the task
	 * @param plugin
	 *            The Plugin
	 * @return The TaskAntsAppointmentHistory object matching the parameters, or null if none was found
	 */
	TaskAntsAppointmentHistory findByPrimaryKey( int idHistory, int idTask, Plugin plugin );
}
