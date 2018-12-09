package CTCI.Chapter_4_Graphs_And_Trees;
import java.util.ArrayList;

import CTCI.Chapter_4_Graphs_And_Trees.Graph.Graph;
import CTCI.Chapter_4_Graphs_And_Trees.Project.Project;;
public class BuildOrder {
	
	// O(P + D) time, where P = # of projects and D = # of dependencies
	Project[] findBuildOrder(String[] projects, String[][] dependencies) {
		Graph graph = buildGraph(projects, dependencies);
		return orderProjects(graph.getNodes());
		
	}
	
	Graph buildGraph(String[] projects, String[][] dependencies) {
		Graph graph = new Graph();
		for(String project : projects) {
			graph.getOrCreateNode(project);
		}
		
		for(String[] dependency : dependencies) {
			String first = dependency[0];
			String second = dependency[1];
			graph.addEdge(first, second);
		}
		
		return graph;
	}
	
	Project[] orderProjects(ArrayList<Project> projects) {
		Project[] order = new Project[projects.size()];
		
		// add 'roots' to the build order first
		int endOfList = addNonDependent(order, projects, 0);
		
		int toBeProcessed = 0;
		while(toBeProcessed < order.length) {
			Project current = order[toBeProcessed];
			
			// we have circular dependencies since their are no remaining projects
			// with no dependencies
			if(current == null) { return null; }
			
			// remove self as a dependency
			ArrayList<Project> childern = current.getChildern();
			for (Project child : childern) {
				child.decrementDependencies();
			}
			
			// add children that have no one depending on them
			endOfList = addNonDependent(order, childern, endOfList);
		}
		return order;
	}
	
	int addNonDependent(Project[] order, ArrayList<Project> projects, int offset) {
		for(Project project : projects) {
			if(project.getNumberDependencies() == 0) {
				order[offset] = project;
				offset++;
			}
		}
		return offset;
	}
	
}
