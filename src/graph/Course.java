package graph;

import java.util.LinkedList;
import java.util.Queue;

public class Course {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses<=1) return true;
        if(prerequisites==null||prerequisites.length==0) return true;
        int[][] graph = new int[numCourses][numCourses];
        int[] degree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<Integer>();

        // init graph
        for(int i=0;i<prerequisites.length;i++){
            int pre = prerequisites[i][0];
            int pos = prerequisites[i][1];

            graph[pos][pre] = 1;
            degree[pos]++;
        }

        for(int i=0;i<degree.length;i++){
            if(degree[i]==0){
                queue.offer(i);
            }
        }

        while(queue.size()!=0){
            int course = queue.poll();
            for(int i=0;i<numCourses;i++){
                if(graph[i][course]==1){
                    degree[i]--;
                    if(degree[i]==0){
                        queue.offer(i);
                    }
                }
            }
        }
        for(int d:degree){
            if(d!=0) return false;
        }
        return true;

    }

    public static void main(String[] args){
        int[][] test = {{1,0}};
        canFinish(2, test);
    }
}
