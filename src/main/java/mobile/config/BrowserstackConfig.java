package mobile.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:src/main/resources/config/test.properties"
})
public interface BrowserstackConfig extends Config {

    @Key("userName")
    String username();

    @Key("accessKey")
    String passwordKey();

    @Key("remoteMobileUrl")
    String remoteMobileUrl();

    @Key("app")
    String app();

    @Key("deviceName")
    String deviceName();

    @Key("osVersion")
    String osVersion();

    @Key("url")
    @DefaultValue("http://0.0.0.0:4723/wd/hub")
    String url();

    @Key("platformName")
    String platformName();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();

    @Key("loginKey")
    String getLoginKey();

    @Key("false")
    @DefaultValue("isRemote")
    String isRemote();
}
