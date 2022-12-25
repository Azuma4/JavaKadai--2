import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("山田孝之", "A", 39));
        actors.add(new Actor("西島秀俊", "A", 51));
        actors.add(new Actor("遠藤憲一","O", 61));
        actors.add(new Actor("堤真一", "AB", 58));
        actors.add(new Actor("田中圭", "O",38));
        actors.add(new Actor("窪田正孝", "B", 34));
        actors.add(new Actor("井浦新", "A", 48));

        System.out.println("<俳優一覧>");
        for (Actor actor : actors) {
            System.out.println("名前　　: " + actor.getName());
            System.out.println("血液型　: " + actor.getBloodtype());
            System.out.println("年齢　　: " + actor.getAge());

            System.out.println("------------------------------");
        }

        System.out.println("<A型かつ40歳以上の俳優>");
        for (Actor actor : actors) {
            if (actor.getBloodtype().equals("A") && actor.getAge() >= 40) {
                System.out.println(actor.getName());
            }
        }
    }
}
