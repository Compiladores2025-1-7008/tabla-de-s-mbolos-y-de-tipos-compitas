public class TypeImpl implements Type {
    private final String name;
    private final short items;
    private final short tam;
    private final TypeParent parent;

    public TypeImpl(String name, short items, short tam, TypeParent parent) {
        this.name = name;
        this.items = items;
        this.tam = tam;
        this.parent = parent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public short getItems() {
        return items;
    }

    @Override
    public short getTam() {
        return tam;
    }

    @Override
    public TypeParent getParent() {
        return parent;
    }
}
