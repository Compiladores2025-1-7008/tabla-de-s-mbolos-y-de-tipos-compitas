import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TypeTableImpl implements TypeTable {
    private final Map<Integer, Type> types;
    private int currentId;

    public TypeTableImpl() {
        this.types = new HashMap<>();
        this.currentId = 0;
    }

    @Override
    public int getTam(int id) {
        return types.get(id).getTam();
    }

    @Override
    public int getItems(int id) {
        return types.get(id).getItems();
    }

    @Override
    public String getName(int id) {
        return types.get(id).getName();
    }

    @Override
    public TypeParent getParent(int id) {
        return types.get(id).getParent();
    }

    @Override
    public Optional<Type> getType(int id) {
        return Optional.ofNullable(types.get(id));
    }

    @Override
    public int addType(String name, int items, int parentId, SymbolTable parentStruct) {
        int id = currentId++;
        TypeParent parent = new TypeParentImpl(parentId, parentStruct);
        types.put(id, new TypeImpl(name, (short) items, (short) (items * 4), parent));
        return id;
    }
}
