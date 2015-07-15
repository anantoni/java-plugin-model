import java.util.ArrayList;
import java.util.Set;

class Var {

    long[] position;
    String varName;
    String doopVarName;
    String type;
    Method method;
    Klass klass;
    ArrayList<long[]> defOccurrences;
    ArrayList<long[]> useOccurrences;
}

class Method {

    String methodName;
    String[] args;
    String[] argTypes;
    MethodDeclaration methodDeclaration;
}

class Klass {

    String className;
}

class HeapAllocation {

    long[] position;
    String heapAllocationID;
}

class VarPointsTo {

    Var var;
    Set<HeapAllocation> heapAllocationSet;
}

class MethodInvocation {

    long[] position;
    String methodInvocationID;
}

class MethodDeclaration {

    long[] position;
    String returnType;
    String[] args;
}

class CallGraphEdge {

    Var methodInvocation;
    Set<MethodDeclaration> methodDeclarationSet;
}
