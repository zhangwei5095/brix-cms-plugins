/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package brix.plugin.file.admin.folder;

import org.apache.wicket.model.IModel;

import brix.jcr.api.JcrNode;
import brix.jcr.wrapper.BrixNode;
import brix.plugin.file.FolderNode;
import brix.plugin.hierarchical.HierarchicalPluginLocator;
import brix.plugin.hierarchical.admin.CreateTitledNodePanel;
import brix.plugin.hierarchical.nodes.TitledNode;
import brix.plugin.site.SimpleCallback;

/**
 * @author wickeria at gmail.com
 */
public class CreateFolderNodePanel extends CreateTitledNodePanel {

	private static final long serialVersionUID = 1L;

	public CreateFolderNodePanel(String id, IModel<BrixNode> containerNodeModel, String pluginId,
			SimpleCallback goBack, HierarchicalPluginLocator pluginLocator) {
		super(id, containerNodeModel, pluginId, goBack, pluginLocator);
	}

	@Override
	protected String getJcrPrimaryType() {
		return "nt:folder";
	}

	@Override
	protected TitledNode initializeNode(JcrNode node) {
		return FolderNode.initialize(node);
	}

}