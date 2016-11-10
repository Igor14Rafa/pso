// this is an interface to keep the configuration for the PSO
// you can modify the value depends on your needs

public interface PSOConstants {
	int SWARM_SIZE = 20;
	int MAX_ITERATION = 100;
	int PROBLEM_DIMENSION = 24;
	double C1 = 2.0;
	double C2 = 2.0;
	double W_UPPERBOUND = 1.0;
	double W_LOWERBOUND = 0.0;
	double UTILITY_VALUE = 0.13;
	double NORMAL_COST = 0.273;
}
