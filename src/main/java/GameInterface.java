import java.util.List;

public interface GameInterface {
    void step(List<BaseHero> oppositeTeam);
    String getInfo();
}
