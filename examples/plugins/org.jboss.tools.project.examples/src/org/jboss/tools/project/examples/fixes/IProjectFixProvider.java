/*************************************************************************************
 * Copyright (c) 2014 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.jboss.tools.project.examples.fixes;

import org.jboss.tools.project.examples.model.ProjectExample;
import org.jboss.tools.project.examples.model.RequirementModel;

public interface IProjectFixProvider {
	
	IProjectExamplesFix create(ProjectExample example, RequirementModel requirement);
	
	UIHandler createUIHandler(); 

}
