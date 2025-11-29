package Final_HomeTasks.Task_1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EntityManager <T extends EssenceModel>{
    private List<T> essenceContainer = new CopyOnWriteArrayList<>();

    public void addEssence(T essence){
        essenceContainer.add(essence);
    }

    public void deleteEssence(EssenceModel essence){
        essenceContainer.remove(essence);
    }

    public List<T> getAll(){
        return List.copyOf(essenceContainer);
    }

    public List<T> sortedEssenceForAge(int minAge, int maxAge){
        return essenceContainer.stream()
                .filter(element -> element.getAge() >= minAge && element.getAge() <= maxAge)
                .toList();
    }

    public List<T> sortedEssenceForName(String name){
        return essenceContainer.stream()
                .filter(element -> element.getName().equals(name))
                .toList();
    }

    public List<T> sortedEssenceForActivity(boolean activity){
        return essenceContainer.stream()
                .filter(element -> element.getActivity() == activity)
                .toList();
    }
}
