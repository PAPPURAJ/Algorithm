import java.util.LinkedList;
import java.util.List;

public class BFS {
    int N;
    List<Integer> list[];

    public BFS(int n){
        N=n;
        list=new List[n];
        for(int i=0;i<n;i++)
            list[i]=new LinkedList<>();
    }

    void add(int i,int v){
        list[i].add(v);
    }

    void trav(int v){
        boolean[] visited=new boolean[N];
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(v);   
        visited[v]=true;

        while(!ll.isEmpty()){
            int out=ll.poll();
            System.out.println(out);
            
            for(int i:list[out]){
                if(!visited[i]){
                    ll.add(i);
                    visited[i]=true;
                }
                 
            }      
            
        }
    }
}




/*  ==============Access by===============

      BFS bfs=new BFS(4);
      bfs.add(0, 1);
      bfs.add(0, 2);
      bfs.add(1, 2);
      bfs.add(2, 0);
      bfs.add(2, 3);
      bfs.add(3, 3);
      
      bfs.trav(2);



*/


