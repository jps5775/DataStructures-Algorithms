package CTCI.Chapter_4_Graphs_And_Trees.Project;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
	private ArrayList<Project> childern = new ArrayList<>();
	private HashMap<String, Project> map = new HashMap<>();
	private String name;
	private int dependencies = 0;
	
	public Project(String name) {
		this.name = name;
	}
	
	public void addNeighbor(Project node) {
		if(!map.containsKey(node.getName())) {
			childern.add(node);
			map.put(node.getName(), node);
			node.incrementDependencies();
		}
	}
	
	public void incrementDependencies() { dependencies++; }
	public void decrementDependencies() { dependencies--; }
	
	public String getName() { return name; }
	public ArrayList<Project> getChildern() { return childern; }
	public int getNumberDependencies() { return dependencies; }
}
