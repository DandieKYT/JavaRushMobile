package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.LikePage;

import static com.codeborne.selenide.Selenide.sleep;

public class LikeStep {

    LikePage likePage = new LikePage();

    @Step("Нажатие на кнопку лайка комментария")
    public void addLike() {
        likePage.addLike.click();
    }

    @Step("Добавление лайка комментарию")
    public void secondAddLike() {
        likePage.secondAddLike.click();
    }

    @Step("Получение количества лайков комментария")
    public int parseLikeCooment() {
        sleep(2000);
        String getParse = likePage.checkLikeValueComment.getText();
        Integer.parseInt(getParse);
        return Integer.parseInt(getParse);
    }

    @Step("Получение количества лайков лекции")
    public int parseLikeLecture() {
        sleep(2000);
        String getParse = likePage.checkLikeValueLecture.getText();
        Integer.parseInt(getParse);
        return Integer.parseInt(getParse);
    }

    @Step("Нажатие на кнопку лайка на странице лекции")
    public void likeButton() {
        likePage.likeButton.click();
    }

    @Step("Подтверждение лайка на странице лекции")
    public void clickOnLike() {
        likePage.clickOnLike.click();
    }
}
