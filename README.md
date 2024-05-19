# Mobile автотесты для сайта [Java-Rush](https://javarush.com/) — практический онлайн-курс по обучению Java.
![image](https://github.com/DandieKYT/JavaRush/assets/75677738/cd08eb3b-22da-4c6e-819b-f9fc04ed6361)



# <a name="TableOfContents">Содержание страницы</a>
+ [:trophy: Инструменты и технологии](#MyToolsAndTechnologies)
+ [Описаниe](#Description)
+ [Проект](#Project)
+ [:heavy_check_mark:  Реализованные проверки:](#ImplementedСhecks)  
  - <a href="#cases-mobile"> Mobile
+ [👷‍♂️ Сборка в Jenkins](#buildInJenkins)
    + [Страница сборки job в Jenkins](#buildInJenkins1)
    + [Главный экран со списком job в Jenkins](#buildInJenkins2)
+ [🖥 Параметры сборки в Jenkins](#terminal)
+ [:computer: Запуск из терминала](#Launch_from_terminal)
  - <a href="#console-mobile"> Mobile
+ [:chart_with_downwards_trend: Allure Report](#Allure_report)
    + [Главный экран отчета в Allure Report](#Allure_report1)
    + [Страница с проведенными тестами в Allure Report](#Allure_report2)
+ [:bar_chart: Интеграция с Allure TestOps](#Integration_Allure_TestOps)
    + [Экран с результатами запуска тестов](#Integration_Allure_TestOps1)
    + [Страница с тестами в TestOps](#Integration_Allure_TestOps2)
    + [Страница с тестами из Launches в Allure TestOps](#Integration_Allure_TestOps3)
+ [:bar_chart: Примеры сборок в Browserstack](#Integration_Brawserstack)
  + [Экран с результатами запуска тестов](#Integration_Brawserstack)
+ [:iphone: Отчет в Telegram](#Telegram)
+ [:movie_camera: Видео примеры прохождения тестов](#Video)
    + [Пример запуска тестов через Browserstack](#Video2)

<h2> :trophy:  Мои инструменты и технологии:</h2>

<code><a href = "https://www.java.com/ru/">![This is an image](/design/icons/Java.png)</a></code>
<code><a href = "https://gradle.org/">![This is an image](/design/icons/gradle.png)</a></code>
<code><a href = "https://www.jetbrains.com/ru-ru/idea/">![This is an image](/design/icons/Intelij_IDEA.png)</a></code>
<code><a href = "https://ru.selenide.org/">![This is an image](/design/icons/Selenide.png)</a></code>
<code><a href = "https://selenoid.autotests.cloud/#/">![This is an image](/design/icons/Selenoid.png)</a></code>
<code><a href = "https://junit.org/junit5/">![This is an image](/design/icons/JUnit5.png)</a></code>
<code><a href = "https://www.jenkins.io/">![This is an image](/design/icons/Jenkins.png)</a></code>
<code><a href = "https://github.com/allure-framework">![This is an image](/design/icons/Allure_Report.png)</a></code>
<code><a href = "https://qameta.io/">![This is an image](/design/icons/AllureTestOps.png)</a></code>
<code><a href = "https://web.telegram.org/k/">![This is an image](/design/icons/Telegram.png)</a></code>
<code><a href = "https://www.atlassian.com/ru/software/jira">![This is an image](/design/icons/Jira.png)</a></code>
<code><a href = "https://www.postman.com/">![This is an image](/design/icons/postman.png)</a></code>
<code><a href = "https://git-scm.com/">![This is an image](/design/icons/git.png)</a></code>
<code><a href = "https://github.com/">![This is an image](/design/icons/GitHub.png)</a></code>
<code><a href = "https://developer.chrome.com/docs/devtools/">![This is an image](/design/icons/devtools.png)</a></code>


<code><a href = "https://notepad-plus-plus.org/">![This is an image](/design/icons/notepad.png)</a></code>
<code><a href = "https://www.mysql.com/">![This is an image](/design/icons/sql.png)</a></code>
<code><a href = "https://ru.wikipedia.org/wiki/HTML">![This is an image](/design/icons/html.png)</a></code>
<code><a href = "https://ru.wikipedia.org/wiki/CSS">![This is an image](/design/icons/css.png)</a></code>
<code><a href = "https://www.browserstack.com/">![This is an image](/design/icons/browserstack.png)</a></code>
<code><a href = "https://appium.io/docs/en/2.0/">![This is an image](/design/icons/appium.png)</a></code>
<code><a href = "https://developer.android.com/studio">![This is an image](/design/icons/androidstudio.png)</a></code>
<code><a href = "https://rest-assured.io//">![This is an image](/design/icons/Rest-Assured.png)</a></code>
</br>
<a name="Description"><h2>Описаниe</h2></a>
Автотесты в этом проекте написаны на `Java` с использованием `Selenide`.\
`Gradle` - для автоматической системы сборки.  \
`JUnit5` - для модульного тестирования.\
`Jenkins` - CI/CD для удаленного запуска тестов.\
`Selenoid` - для удаленного запуска браузеров в `Docker` контейнере.\
`Allure Report` - для визуализации результатов тестирования.\
`Telegram Bot` - для уведомлений о результатах тестирования.\
`Allure TestOps` - система управления тестированием\
`Rest Assured` - выполняет роль обёртки над http клиентом\
`Appium` - используются для управления мобильным устройством с помощью веб драйвера\
`Browserstack` - для удаленного запуска мобильных автотестов\
`Android_Studio` - для эмулятора мобильного устройства и получения данных для подключения к apk


<a name="Project"><h2>Проект</h2></a>
<a href="https://javarush.com/"><code><img width="5%" title="Steam" src="https://yt3.googleusercontent.com/ytc/APkrFKYPRuYZhFR5vGnF2c6htR6815HiRYLmhikCqrjR7w=s900-c-k-c0x00ffffff-no-rj"></code></a> Проект по автоматизации тестирования для Java-Rush, — практический онлайн-курс по обучению Java. :star2:

<a name="ImplementedСhecks"><h2>:heavy_check_mark:  Реализованные проверки:</h2></a>

<a id="cases-mobile"></a>Mobile-кейсы:

:heavy_check_mark: Авторизация в приложении</br>

:heavy_check_mark: Создание нового аккаунта с прохождением теста по Java</br>

:heavy_check_mark: Добавление лайка на комментарий/лекцию </br>

:heavy_check_mark: Добавление коментария и проверка его автора и текста</br>

:heavy_check_mark: Открытие разделов Course/Java и проверка их содержимого</br>


<a name="buildInJenkins" href="https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRushMobile1/"><h2>👷‍♂️ Сборки в [Jenkins](https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRushMobile1/)<h2></a>
- <a name="buildInJenkins1"><h5>Страница сборки job в [Jenkins](https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRushMobile1/8/)</h5></a>

![image](https://github.com/DandieKYT/JavaRushMobile/assets/75677738/59ef2cc8-bac9-4998-9910-eaf7f5751823)


- <a name="buildInJenkins2"><h5>Главный экран со списком job в [Jenkins](https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRushMobile1/)</h5></a>

![image](https://github.com/DandieKYT/JavaRushMobile/assets/75677738/7d3a579e-9b43-4bdd-bbed-8a5f407a6d0e)


<a name="terminal"><h2>:computer: Параметры сборки в Jenkins</h2></a>

Сборка в Jenkins

- TASK (с какими тегами запускать тесты)


<a name="Launch_from_terminal"><h2>:computer: Запуск из терминала</h2></a>

### <a id="console-mobile"></a>Локальный запуск Mobile-тестов

```
gradle clean Mobile
```

Удаленный запуск:

```
clean
${TASK}
```
<a name="Allure_report"><h2>:chart_with_downwards_trend: [Allure Report](https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRushMobile1/8/allure/)</h2></a>

- <a name="Allure_report1"><h3>Главный экран отчета в [Allure Report](https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRushMobile1/8/allure/)</h3></a>

![image](https://github.com/DandieKYT/JavaRushMobile/assets/75677738/e9057cba-ca89-46f4-b905-ba90b4694d48)


-  <a name="Allure_report2"><h3>Страница с проведенными тестами в [Allure Report](https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRushMobile1/8/allure/#suites/ed674b31b140dac95fd14515ce4c23f5/7ba64c392ddb6972/)</h3></a>

![image](https://github.com/DandieKYT/JavaRushMobile/assets/75677738/f4fd4721-7b78-4fb5-b8d3-ea38861bcf41)


<a name="Integration_Allure_TestOps"><h2>:bar_chart: Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/39146)</h2></a>

- <a name="Integration_Allure_TestOps1"><h3>Экран с результатами запуска тестов</h3></a>

![image](https://github.com/DandieKYT/JavaRushMobile/assets/75677738/00f9c0b3-75e5-4e85-af72-de9602ef1541)



- <a name="Integration_Allure_TestOps2"><h3>Страница с тестами в [TestOps](https://allure.autotests.cloud/launch/39146/tree/636860?search=W3siaWQiOiJzdGF0dXMiLCJ0eXBlIjoidGVzdFN0YXR1c0FycmF5IiwidmFsdWUiOlsicGFzc2VkIl19XQ%3D%3D&treeId=6806)</h3></a>

![image](https://github.com/DandieKYT/JavaRushMobile/assets/75677738/f091b250-00e9-4317-a5ac-301a9829d4f3)


- <a name="Integration_Allure_TestOps3"><h3>Страница с тестами из Launches в [Allure TestOps](https://allure.autotests.cloud/launch/39146/tree/636862?search=W3siaWQiOiJzdGF0dXMiLCJ0eXBlIjoidGVzdFN0YXR1c0FycmF5IiwidmFsdWUiOlsicGFzc2VkIl19XQ%3D%3D&treeId=6806)</h3></a>

![image](https://github.com/DandieKYT/JavaRushMobile/assets/75677738/60c25678-547f-47fb-987b-91d71f87dcb2)


<a name="Integration_Brawserstack"><h2>:bar_chart: Примеры сборок в [Browserstack](https://app-automate.browserstack.com/dashboard/v2/builds/944c5a8a6f8c320d9570d9732bf4dc0fc08f5297/sessions/b99ee4d6bf43043f38d1dc7069f4a13b6de4b01d)</h2></a>

- <a name="Integration_Brawserstack"><h3>Экран с результатами запуска тестов</h3></a>

![image](https://github.com/DandieKYT/JavaRushMobile/assets/75677738/9d1d399f-9455-407a-86c3-7a6fac52b3ef)


<a name="Telegram"><h2>:iphone: Отчет в Telegram</h2></a>

![image](https://github.com/DandieKYT/JavaRushMobile/assets/75677738/740741c0-7f02-4125-9da8-826e01e55fe8)

<a name="Video"><h2>:movie_camera: Видео примеры прохождения тестов</h2></a>

- <a name="Video2"><h3>Пример запуска тестов через [Browserstack](https://app-automate.browserstack.com/dashboard/v2/builds/944c5a8a6f8c320d9570d9732bf4dc0fc08f5297/sessions/b99ee4d6bf43043f38d1dc7069f4a13b6de4b01d)</h3></a>

https://github.com/DandieKYT/JavaRushMobile/assets/75677738/6b99ce7b-d03b-4451-bf13-06a4ca09b2db




