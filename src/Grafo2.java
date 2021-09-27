import java.util.ArrayList;
import java.util.List;

public class Grafo2 {
    public class Vertice{
        String nome;
        List<Aresta>adj;

        Vertice(String nome) {
            this.nome= nome;
            this.adj= new ArrayList<Aresta>();
        }

        void addAdj(Aresta e) {
            adj.add(e);
        }
    }

    public class Aresta{
        Vertice origem;
        Vertice destino;

        Aresta(Vertice origem, Vertice destino) {
            this.origem=origem;
            this.destino=destino;
        }
    }

    List<Vertice> vertices;
    List<Aresta> arestas;

    public Grafo2(){
        vertices=new ArrayList<Vertice>();
        arestas=new ArrayList <Aresta>();
    }

    Vertice addVertice(String nome){
        Vertice v = new Vertice(nome);
        vertices.add(v);
        return v;
    }

    Aresta addAresta(Vertice origem, Vertice destino){
        Aresta e = new Aresta(origem, destino);
        origem.addAdj(e);
        arestas.add(e);
        return  e ;
    }

    public String toString() {
        String r = "";
        for (Vertice u : vertices) {
            r += u.nome + "-";
            for (Aresta e : u.adj) {
                Vertice v = e.destino;
                r += v.nome + ",";
            }
            r += "\n";
        }
        return r;
    }

    public static void main(String[] args) {
        Grafo2 g=new Grafo2();
        Vertice a= g.addVertice("a");
        Vertice b= g.addVertice("b");
        Vertice c= g.addVertice("c");
        Vertice d= g.addVertice("d");
        Vertice e= g.addVertice("e");
        Vertice f= g.addVertice("f");


        Aresta ab =g.addAresta(a,b);
        Aresta af =g.addAresta(a,f);
        Aresta ba =g.addAresta(b,a);
        Aresta bc =g.addAresta(b,c);
        Aresta bf =g.addAresta(b,f);
        Aresta cb =g.addAresta(c,b);
        Aresta cf =g.addAresta(c,f);
        Aresta cd =g.addAresta(c,d);
        Aresta dc =g.addAresta(d,c);
        Aresta db =g.addAresta(d,b);
        Aresta de =g.addAresta(d,e);
        Aresta df =g.addAresta(d,f);
        Aresta ef =g.addAresta(e,f);
        Aresta ed =g.addAresta(e,d);
        Aresta fa =g.addAresta(f,a);
        Aresta fb =g.addAresta(f,b);
        Aresta fc =g.addAresta(f,c);
        Aresta fd =g.addAresta(f,d);
        Aresta fe =g.addAresta(f,e);
        System.out.println("Grafo não direcionado vértice para vértice ");
        System.out.println(g);

    }}