
import org.antlr.v4.runtime.tree.Tree;


public class SimpleTreeSerializer<T extends  Tree > {
    private final Yaml yaml;
    T tree;

    public SimpleTreeSerializer(T tree){
        this.tree = tree;
    }



}
