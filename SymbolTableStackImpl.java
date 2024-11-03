import java.util.Optional;
import java.util.Stack;

public class SymbolTableStackImpl implements SymbolTableStack {
    private Stack<SymbolTable> stack = new Stack<>();

    @Override
    public void push(SymbolTable table) {
        stack.push(table);
    }

    @Override
    public SymbolTable pop() {
        return stack.pop();
    }

    @Override
    public Optional<SymbolTable> peek() {
        return stack.isEmpty() ? Optional.empty() : Optional.of(stack.peek());
    }

    @Override
    public Optional<SymbolTable> base() {
        return stack.isEmpty() ? Optional.empty() : Optional.of(stack.firstElement());
    }

    @Override
    public Optional<SymbolTable> lookup(String id) {
        if (stack.isEmpty()) {
            return Optional.empty();
        }

        // Primero busca en la cima de la pila
        SymbolTable topTable = stack.peek();
        if (topTable.getSymbol(id).isPresent()) {
            return Optional.of(topTable);
        }

        // Si no se encuentra en la cima, busca en la base de la pila
        SymbolTable baseTable = stack.base();
        if (baseTable.getSymbol(id).isPresent()) {
            return Optional.of(baseTable);
        }

        // No se encontró en la cima ni en la base
        return Optional.empty();
    }
}
