package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static help.GenerationData.generationRandomText;
import static org.junit.jupiter.api.Assertions.fail;

@Tag("Mobile")
@Story("Лайк")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для Mobile")
public class LikeTest extends TestBaseMobile {

    @Test
    @DisplayName("Добавление лайка на коментарий")
    public void addLikeToComment() {
        mobileCommonStep.stepsForApp();
        commentStep.commentButton();
        commentStep.addComment();
        String actualComm = generationRandomText();
        commentStep.addSomeText(actualComm);
        commentStep.sendComment();
        int countFirst = likeStep.parseLikeCooment();
        likeStep.addLike();
        likeStep.secondAddLike();
        int countSecond = likeStep.parseLikeCooment();
        if (countSecond == countFirst){
            fail("Test failed");
        }
        likeStep.addLike();
        commentStep.deleteComment();
    }

    @Test
    @DisplayName("Добавление лайка на страницу лекции")
    public void addLikeToLesson() {
        mobileCommonStep.stepsForApp();
        int countFirst = likeStep.parseLikeLecture();
        likeStep.likeButton();
        likeStep.clickOnLike();
        int countSecond = likeStep.parseLikeLecture();
        if (countSecond == countFirst){
            fail("Test failed");
        }
        likeStep.likeButton();
    }
}
