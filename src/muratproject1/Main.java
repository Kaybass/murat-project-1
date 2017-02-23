package muratproject1;

import muratproject1.simulation.Report;
import muratproject1.simulation.Simulator;

public class Main {
	public static void main(String[] args){
		
		Simulator simulator = new Simulator();
		
		Report report = simulator.runSimulation(35);
		
		System.out.print(report.toString());
	}
}
