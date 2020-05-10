package DesignPatterns.Singleton;

@SuppressWarnings("unused")
class DemoSingletonF {
    private static final long serialVersionUID = 1L;

    private DemoSingletonF(){

    }

    private static class DemoSingletonHolder {
        public static final DemoSingletonF instance = new DemoSingletonF();
    }

    public static DemoSingletonF getInstance() {
        return DemoSingletonHolder.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}

public class FinalSingletonExample {
    public static void main(String[] args) {
        
    }
}