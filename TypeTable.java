import java.util.Optional;

public interface TypeTable {
    int getTam(int id);        
    int getItems(int id);
    String getName(int id);
    TypeParent getParent(int id);
    Optional<Type> getType(int id);
    int addType(String name, int items, int parentId, SymbolTable parentStruct);
}
