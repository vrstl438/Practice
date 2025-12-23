package Final_Home_Work;

import HomeTasks.Final_HomeTasks.Task_1.EntityManager;
import HomeTasks.Final_HomeTasks.Task_1.EssenceModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTests {
    private EntityManager<EssenceModel> entityManager;

    @BeforeEach
    void setUp() {
        entityManager = new EntityManager();
    }

    static Stream<Arguments> EssenceProvider() {
        return Stream.of(
                Arguments.of(List.of(new EssenceModel("Ilya", 22, true)), 1),
                Arguments.of(List.of(new EssenceModel("Alena", 20, false)), 0),
                Arguments.of(List.of(new EssenceModel("Vitya", 23, true)), 0),
                Arguments.of(List.of(
                        new EssenceModel("Ilya", 22, true),
                        new EssenceModel("Alena", 20, false),
                        new EssenceModel("Vitya", 23, true)
                ), 1)
        );
    }

    @DisplayName("Проверка добавления в коллекцию")
    @ParameterizedTest
    @MethodSource("EssenceProvider")
    void addEssenceTest(List<EssenceModel> essences) {
        for (EssenceModel essence : essences) {
            entityManager.addEssence(essence);
        }
        List<EssenceModel> allEssences = entityManager.getAll();

        assertEquals(essences.size(), allEssences.size());
        assertTrue(allEssences.containsAll(essences));
    }

    @DisplayName("Проверка удаления из коллекции")
    @Test
    void deleteEssenceTest() {
        EssenceModel essence = new EssenceModel("Alena", 20, false);
        entityManager.addEssence(essence);
        entityManager.deleteEssence(essence);

        assertTrue(entityManager.getAll().isEmpty());
    }


    @DisplayName("Проверка фильтрации по возрасту")
    @ParameterizedTest
    @MethodSource("EssenceProvider")
    void sortedEssenceForAgeTest(List<EssenceModel> essences, int expectedResult) {
        for (EssenceModel essenceModel : essences) {
            entityManager.addEssence(essenceModel);
        }
        assertEquals(expectedResult, entityManager.sortedEssenceForAge(21, 22).size());
    }


    static Stream<Arguments> EssenceProviderName() {
        return Stream.of(
                Arguments.of(
                        List.of(
                                new EssenceModel("Egor", 12, false),
                                new EssenceModel("Grisha", 20, false)
                        )
                )
        );
    }

    @DisplayName("Проверка фильтрации по имени") @ParameterizedTest @MethodSource("EssenceProviderName")
    void sortedEssenceForAgeTest(List<EssenceModel> essence){
        for(EssenceModel model : essence){
            entityManager.addEssence(model);
        }
        //убеждаюсь, что в коллекцию добавились 2 объекта
        assertEquals(2, essence.size());
        //убеждаюсь, что в коллекции 1 элемент
        assertFalse(essence.size() == entityManager.sortedEssenceForName("Egor").size());
        //убеждаюсь, что поле "имя" у этого объекта соответствует имени по которому фильтровал
        assertEquals("Egor", entityManager.sortedEssenceForName("Egor").get(0).getName());
    }

    static Stream<Arguments> EssenceProviderActivity() {
        return Stream.of(
                Arguments.of(
                        List.of(
                                new EssenceModel("Egor", 12, false),
                                new EssenceModel("Grisha", 20, true)
                        )
                )
        );
    }

    @DisplayName("Проверка фильтрации по статусу активности") @ParameterizedTest() @MethodSource("EssenceProviderActivity")
    void sortedEssenceForActivityTest(List<EssenceModel> essence){
        for (EssenceModel model : essence){
            entityManager.addEssence(model);
        }
        assertEquals(2, entityManager.getAll().size());
        assertFalse(essence.size() == entityManager.sortedEssenceForActivity(true).size());
        assertEquals(true, entityManager.sortedEssenceForActivity(true).get(0).getActivity());
    }
}
