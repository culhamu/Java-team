package Day27_Overriding;

public class EParent extends DGrandParent{
    @Override
    protected void method1() {
        System.out.println("Parent Method1");
        //@Override notasyonu overriden method ile ooverriding method u ilişkilendirir
    }
    protected void method2(){
        System.out.println("PArent method2");
    }
    private void method3(){
        System.out.println("Parent method3");
    }
}
