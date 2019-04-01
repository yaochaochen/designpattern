package builder;

public class BuilderClient {

        public static void main(String[] args) {
            Diretor diretor = new Diretor();
            Builder builder1 = new ConcreteBuilder1();
            Builder builder2 = new ConcreteBuilder2();
            
            diretor.construct(builder1);
            Product product1 = builder1.getBuildResult();
            
            product1.show();
            diretor.construct(builder2);
            Product product2 = builder2.getBuildResult();
            product2.show();
            
        }
}
