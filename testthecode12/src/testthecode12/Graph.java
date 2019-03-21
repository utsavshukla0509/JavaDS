package testthecode12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graph {
	private class Vertex {
		String name;
		HashMap<Vertex, Integer> nbrs;

		Vertex(String name) {
			this.name = name;
			this.nbrs = new HashMap<>();
		}

		public boolean equals(Object other) {
			Vertex ov = (Vertex) other;
			return this.name.equals(ov.name);
		}

		public int hashCode() {
			return this.name.hashCode();
		}

		public void display() {
			String str = this.name + "=>";
			Set<Vertex> nbrs = this.nbrs.keySet();
			for (Vertex nbr : nbrs) {
				str = str + nbr.name + "(" + this.nbrs.get(nbr) + "), ";
			}
			str = str + "END";
			System.out.println(str);
		}
	}

	HashMap<String, Vertex> vtces;

	public Graph() {
		this.vtces = new HashMap<>();
	}

	public int numVertex() {
		return this.vtces.size();
	}

	public void addVertex(String name) {
		if (this.vtces.containsKey(name)) {
			return;
		}

		Vertex vtx = new Vertex(name);
		this.vtces.put(name, vtx);

	}

	public void removeVertex(String name) {
		if (!this.vtces.containsKey(name)) {
			return;
		}

		Vertex vtx = this.vtces.get(name);
		Set<Vertex> nbrs = vtx.nbrs.keySet();
		for (Vertex nbr : nbrs) {
			nbr.nbrs.remove(vtx);
		}

		this.vtces.remove(name);
	}

	public int numEdges() {

		int rv = 0;
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			rv = rv + vtx.nbrs.size();
		}
		rv = rv / 2;
		return rv;
	}

	public void addEdge(String name1, String name2, int cost) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.put(vtx2, cost);
		vtx2.nbrs.put(vtx1, cost);
	}

	public void removeEdge(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.remove(vtx2);
		vtx2.nbrs.remove(vtx1);
	}

	public void display() {
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			vtx.display();
		}
		System.out.println("*******************");
	}

	public boolean hasPath(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);
		if (vtx1 == null || vtx2 == null) {
			return false;
		}
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		return hasPathDFSI(vtx1, vtx2, explored);
	}

	private boolean hasPathDFS(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> explored) {
		if (!explored.containsKey(vtx1)) {
			explored.put(vtx1, true);
		} else {
			return false;
		}

		if (vtx1.nbrs.containsKey(vtx2)) {
			return true;
		}

		Set<Vertex> nbrs = vtx1.nbrs.keySet();
		for (Vertex nbr : nbrs) {
			if (hasPathDFS(nbr, vtx2, explored)) {
				return true;
			}
		}

		return false;
	}

	private boolean hasPathBFS(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> explored) {
		LinkedList<Vertex> queue = new LinkedList<>();
		queue.add(vtx1);
		while (!queue.isEmpty()) {
			Vertex rvtx = queue.remove();
			if (!explored.containsKey(rvtx)) {
				explored.put(rvtx, true);
				if (rvtx.nbrs.containsKey(vtx2)) {
					return true;
				} else {
					Set<Vertex> nbrs = rvtx.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							queue.add(nbr);
						}
					}
				}
			}
		}

		return false;
	}

	private boolean hasPathDFSI(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> explored) {
		LinkedList<Vertex> stack = new LinkedList<>();
		stack.addFirst(vtx1);
		while (!stack.isEmpty()) {
			Vertex rvtx = stack.removeFirst();
			if (!explored.containsKey(rvtx)) {
				explored.put(rvtx, true);
				if (rvtx.nbrs.containsKey(vtx2)) {
					return true;
				} else {
					Set<Vertex> nbrs = rvtx.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							stack.addFirst(nbr);
						}
					}
				}
			}
		}

		return false;
	}

	public void bft() {
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		LinkedList<Vertex> queue = new LinkedList<>();
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			if (!explored.containsKey(vtx)) {
				queue.add(vtx);
			}
			while (!queue.isEmpty()) {
				Vertex rvtx = queue.remove();
				if (!explored.containsKey(rvtx)) {
					explored.put(rvtx, true);
					System.out.print(rvtx.name + " ");
					Set<Vertex> nbrs = rvtx.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							queue.add(nbr);
						}
					}

				}
			}
		}
	}

	public void dft() {
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		LinkedList<Vertex> stack = new LinkedList<>();
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			if (!explored.containsKey(vtx)) {
				stack.addFirst(vtx);
			}
			while (!stack.isEmpty()) {
				Vertex rvtx = stack.removeFirst();
				if (!explored.containsKey(rvtx)) {
					explored.put(rvtx, true);
					System.out.print(rvtx.name + " ");
					Set<Vertex> nbrs = rvtx.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							stack.addFirst(nbr);
						}
					}

				}
			}
		}
	}

	public boolean isConnected() {
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		LinkedList<Vertex> queue = new LinkedList<>();
		Collection<Vertex> vtces = this.vtces.values();
		queue.add((Vertex) vtces.toArray()[0]);
		while (!queue.isEmpty()) {
			Vertex rvtx = queue.remove();
			if (!explored.containsKey(rvtx)) {
				explored.put(rvtx, true);
				// System.out.print(rvtx.name + " ");
				Set<Vertex> nbrs = rvtx.nbrs.keySet();
				for (Vertex nbr : nbrs) {
					if (!explored.containsKey(nbr)) {
						queue.add(nbr);
					}
				}

			}
		}

		return this.vtces.size() == explored.size();
	}

	public ArrayList<ArrayList<String>> getCC() {
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		LinkedList<Vertex> queue = new LinkedList<>();
		Collection<Vertex> vtces = this.vtces.values();
		ArrayList<ArrayList<String>> list = new ArrayList<>();
		for (Vertex vtx : vtces) {
			if (!explored.containsKey(vtx)) {
				queue.add(vtx);
			}
			ArrayList<String> cc = new ArrayList<>();
			while (!queue.isEmpty()) {
				Vertex rvtx = queue.remove();
				if (!explored.containsKey(rvtx)) {
					explored.put(rvtx, true);
					cc.add(rvtx.name);
					Set<Vertex> nbrs = rvtx.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							queue.add(nbr);
						}
					}

				}
			}
			if (cc.size() != 0) {
				list.add(cc);
			}
		}

		return list;

	}

	public boolean isBipartite() {
		LinkedList<Vertex> stack = new LinkedList<>();
		HashMap<Vertex, String> visited = new HashMap<>();
		Collection<Vertex> allVertices = this.vtces.values();
		for (Vertex vtx : allVertices) {
			if (!visited.containsKey(vtx)) {
				visited.put(vtx, "RED");
				stack.addFirst(vtx);
			}
			while (!stack.isEmpty()) {
				Vertex v = stack.removeFirst();
				Set<Vertex> nbrs = v.nbrs.keySet();
				for (Vertex nbr : nbrs) {
					String cov = visited.get(v);
					String colorToApply = cov.equals("RED") ? "GREEN" : "RED";
					if (!visited.containsKey(nbr)) {
						stack.addFirst(nbr);
						visited.put(nbr, colorToApply);
					} else {
						String alreadyColor = visited.get(nbr);
						if (alreadyColor.equals(colorToApply)) {
							continue;
						} else {
							return false;
						}
					}
				}
			}

		}
		return true;
	}

	public void Dijkstras(String source1) {
		int[] dis = new int[this.vtces.size()];
		for (int i = 0; i < dis.length; i++) {
			dis[i] = Integer.MAX_VALUE;
		}
		Vertex v = this.vtces.get(source1);
		dis[(int) source1.charAt(0) - 65] = 0;
		LinkedList<String> queue = new LinkedList<>();
		queue.addFirst(source1);
		while (!queue.isEmpty()) {
			String u = queue.remove();
			Vertex w = this.vtces.get(u);
			Set<Vertex> nbr = w.nbrs.keySet();
			for (Vertex nb : nbr) {
				if (dis[(int) (w.name.charAt(0)) - 65] + w.nbrs.get(nb) < dis[(int) (nb.name.charAt(0)) - 65]) {
					dis[(int) (nb.name.charAt(0)) - 65] = dis[(int) w.name.charAt(0) - 65] + w.nbrs.get(nb);
					queue.add((nb.name));
				}
			}
		}
		for (int i = 0; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}
		System.out.println();

	}

}
