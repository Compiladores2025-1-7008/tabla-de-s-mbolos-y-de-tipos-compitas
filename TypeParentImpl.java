public class TypeParentImpl implements TypeParent {
    private final int parenId;
    private final SymbolTable parentStruct;

    public TypeParentImpl(int parenId, SymbolTable parentStruct) {
        this.parenId = parenId;
        this.parentStruct = parentStruct;
    }

    @Override
    public int getParenId() {
        return parenId;
    }

    @Override
    public SymbolTable getParentStruct() {
        return parentStruct;
    }
}
