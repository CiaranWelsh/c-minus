
import org.antlr.v4.runtime.tree.Tree;
import org.yaml.snakeyaml.Yaml;


public class SimpleTreeSerializer<T extends  Tree > {
//    private final Yaml yaml;
    T tree;

    public SimpleTreeSerializer(T tree){
        this.tree = tree;
    }



}
