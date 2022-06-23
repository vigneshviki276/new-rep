$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:screenshotImage.feature");
formatter.feature({
  "name": "To take screen shot of spider in shutterstock website through chrome Browser",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "user have to take screenshot of spider in shutterstock website",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user have to enter in shutterStock website",
  "keyword": "Given "
});
formatter.match({
  "location": "SetDefinition1.user_have_to_enter_in_shutterStock_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click search image box and pass value of spider",
  "keyword": "When "
});
formatter.match({
  "location": "SetDefinition1.user_have_to_click_search_image_box_and_pass_value_of_spider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click search button",
  "keyword": "And "
});
formatter.match({
  "location": "SetDefinition1.user_have_to_click_search_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@aria-label\u003d\u0027Sch\u0027]\"}\n  (Session info: chrome\u003d102.0.5005.63)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.1\u0027, revision: \u0027e8fcc2cecf\u0027\nSystem info: host: \u0027VIGNESH\u0027, ip: \u0027192.168.79.133\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [1ff6cbe317bac28ccf62dcea28769e93, findElement {using\u003dxpath, value\u003d//button[@aria-label\u003d\u0027Sch\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.63, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\vignesh\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:14649}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:14649/devtoo..., se:cdpVersion: 102.0.5005.63, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1ff6cbe317bac28ccf62dcea28769e93\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:359)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat org.BaseClase.BaseClass.search(BaseClass.java:47)\r\n\tat org.SetDefinition1.SetDefinition1.user_have_to_click_search_button(SetDefinition1.java:41)\r\n\tat ✽.user have to click search button(file:screenshotImage.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user have to click any one of the spider shown in the website",
  "keyword": "And "
});
formatter.match({
  "location": "SetDefinition1.user_have_to_click_any_one_of_the_spider_shown_in_the_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user have to take screenshot of the maximized spider",
  "keyword": "And "
});
formatter.match({
  "location": "SetDefinition1.user_have_to_take_screenshot_of_the_maximized_spider()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be in maximized spider webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "SetDefinition1.user_should_be_in_maximized_spider_webpage()"
});
formatter.result({
  "status": "skipped"
});
});