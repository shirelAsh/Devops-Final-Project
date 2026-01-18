
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class StressTestSimulation extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://karol-ununitable-degenerately.ngrok-free.dev")
      .inferHtmlResources()
      .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/143.0.0.0 Safari/537.36 Edg/143.0.0.0");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_0.put("accept-language", "en");
    headers_0.put("priority", "u=0, i");
    headers_0.put("sec-ch-ua", "Microsoft Edge\";v=\"143\", \"Chromium\";v=\"143\", \"Not A(Brand\";v=\"24");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Windows");
    headers_0.put("sec-fetch-dest", "document");
    headers_0.put("sec-fetch-mode", "navigate");
    headers_0.put("sec-fetch-site", "none");
    headers_0.put("sec-fetch-user", "?1");
    headers_0.put("upgrade-insecure-requests", "1");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("accept", "*/*");
    headers_1.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_1.put("accept-language", "en");
    headers_1.put("priority", "u=1");
    headers_1.put("sec-ch-ua", "Microsoft Edge\";v=\"143\", \"Chromium\";v=\"143\", \"Not A(Brand\";v=\"24");
    headers_1.put("sec-ch-ua-mobile", "?0");
    headers_1.put("sec-ch-ua-platform", "Windows");
    headers_1.put("sec-fetch-dest", "script");
    headers_1.put("sec-fetch-mode", "no-cors");
    headers_1.put("sec-fetch-site", "cross-site");
    headers_1.put("sec-fetch-storage-access", "none");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("accept", "text/css,*/*;q=0.1");
    headers_2.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_2.put("accept-language", "en");
    headers_2.put("priority", "u=0");
    headers_2.put("sec-ch-ua", "Microsoft Edge\";v=\"143\", \"Chromium\";v=\"143\", \"Not A(Brand\";v=\"24");
    headers_2.put("sec-ch-ua-mobile", "?0");
    headers_2.put("sec-ch-ua-platform", "Windows");
    headers_2.put("sec-fetch-dest", "style");
    headers_2.put("sec-fetch-mode", "no-cors");
    headers_2.put("sec-fetch-site", "cross-site");
    headers_2.put("sec-fetch-storage-access", "none");
    
    Map<CharSequence, String> headers_4 = new HashMap<>();
    headers_4.put("accept", "*/*");
    headers_4.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_4.put("accept-language", "en");
    headers_4.put("origin", "https://karol-ununitable-degenerately.ngrok-free.dev");
    headers_4.put("priority", "u=1");
    headers_4.put("sec-ch-ua", "Microsoft Edge\";v=\"143\", \"Chromium\";v=\"143\", \"Not A(Brand\";v=\"24");
    headers_4.put("sec-ch-ua-mobile", "?0");
    headers_4.put("sec-ch-ua-platform", "Windows");
    headers_4.put("sec-fetch-dest", "script");
    headers_4.put("sec-fetch-mode", "cors");
    headers_4.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> headers_6 = new HashMap<>();
    headers_6.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_6.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_6.put("accept-language", "en");
    headers_6.put("priority", "u=0, i");
    headers_6.put("sec-ch-ua", "Microsoft Edge\";v=\"143\", \"Chromium\";v=\"143\", \"Not A(Brand\";v=\"24");
    headers_6.put("sec-ch-ua-mobile", "?0");
    headers_6.put("sec-ch-ua-platform", "Windows");
    headers_6.put("sec-fetch-dest", "document");
    headers_6.put("sec-fetch-mode", "navigate");
    headers_6.put("sec-fetch-site", "same-origin");
    headers_6.put("sec-fetch-user", "?1");
    headers_6.put("upgrade-insecure-requests", "1");
    
    Map<CharSequence, String> headers_7 = new HashMap<>();
    headers_7.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_7.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_7.put("accept-language", "en");
    headers_7.put("priority", "u=1, i");
    headers_7.put("sec-ch-ua", "Microsoft Edge\";v=\"143\", \"Chromium\";v=\"143\", \"Not A(Brand\";v=\"24");
    headers_7.put("sec-ch-ua-mobile", "?0");
    headers_7.put("sec-ch-ua-platform", "Windows");
    headers_7.put("sec-fetch-dest", "image");
    headers_7.put("sec-fetch-mode", "no-cors");
    headers_7.put("sec-fetch-site", "same-origin");
    
    Map<CharSequence, String> headers_9 = new HashMap<>();
    headers_9.put("sec-ch-ua", "Microsoft Edge\";v=\"143\", \"Chromium\";v=\"143\", \"Not A(Brand\";v=\"24");
    headers_9.put("sec-ch-ua-mobile", "?0");
    headers_9.put("sec-ch-ua-platform", "Windows");
    
    String uri1 = "https://cdn.ngrok.com/static";

    ScenarioBuilder scn = scenario("DevOpsSimulation")
      .exec(
        http("request_0")
          .get("/Shirel_Miryam_Project/index.jsp")
          .headers(headers_0)
          .resources(
            http("request_1")
              .get(uri1 + "/js/error.js")
              .headers(headers_1),
            http("request_2")
              .get(uri1 + "/css/error.css")
              .headers(headers_2),
            http("request_3")
              .get(uri1 + "/compiled/css/global.css")
              .headers(headers_2),
            http("request_4")
              .get(uri1 + "/compiled/js/allerrors.js")
              .headers(headers_4),
            http("request_5")
              .get(uri1 + "/compiled/js/global.js")
              .headers(headers_4)
          )
      )
      .pause(26)
      .exec(
        http("request_6")
          .get("/Shirel_Miryam_Project/index.jsp")
          .headers(headers_6)
          .resources(
            http("request_7")
              .get("/favicon.ico")
              .headers(headers_7)
          )
      )
      .pause(50)
      .exec(
        http("request_8")
          .get("/Shirel_Miryam_Project/index.jsp?username=Miriam+Test")
          .headers(headers_6)
          .resources(
            http("request_9")
              .get("/favicon.ico")
              .headers(headers_9)
          )
      );
setUp(scn.injectOpen(rampUsers(1000).during(180))).protocols(httpProtocol);
  }
}
