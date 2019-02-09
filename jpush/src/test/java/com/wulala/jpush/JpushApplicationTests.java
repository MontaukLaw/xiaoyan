package com.wulala.jpush;

import com.wulala.jpush.config.ServiceConfig;
import com.wulala.jpush.okhttp.ApiAccess;
import com.wulala.jpush.okhttp.BasicAuthInterceptor;
import com.wulala.jpush.utils.Base64;
import okhttp3.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JpushApplicationTests {

    @Autowired
    public ServiceConfig serviceConfig;

    @Test
    public void contextLoads() {
        System.out.println("add: " + serviceConfig.getApiAddress());
        System.out.println("key: " + serviceConfig.getAppKey());
        System.out.println("secret: " + serviceConfig.getSecret());
    }

    @Test
    public void testOkHttp() throws Exception {
        //ApiAccess apiAccess = new ApiAccess();

        //System.out.println(apiAccess.example("http://square.github.io/okhttp/#examples"));

    }

    @Test
    public void apiClassTest() {
        ApiAccess apiAccess = new ApiAccess(serviceConfig.getApiAddress(),serviceConfig.getAppKey(),serviceConfig.getSecret());
        System.out.println(apiAccess.sendNotification("1a0018970a8bd8b8f11", new Date().toString()));
    }

    @Test
    public void Base64Test() throws Exception {
        //拼key+secret;
        String basic = serviceConfig.getAppKey() + ":" + serviceConfig.getSecret();
        System.out.println("from " + basic);
        String basic64 = Base64.encode(basic.getBytes());
        System.out.println("bagayalu:" + basic64);
    }

    @Test
    public void testOKPost() throws Exception {
        MediaType JSON
                = MediaType.get("application/json; charset=utf-8");
        String url = "https://api.jpush.cn/v3/push";

        String json = "{ \"platform\": \"android\",\"audience\": { \"registration_id\": [ \"1a0018970a8bd8b8f11\"] }, \"notification\": {\"android\": { \"alert\": \"测试消息!!!\"}}}";
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new BasicAuthInterceptor("dd62a616c435880a1ad77060", "4a9dc532acc60926d2902551"))
                .build();
        RequestBody body = RequestBody.create(JSON, json);

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        Response response = client.newCall(request).execute();

        //if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

        System.out.println(response.body().string());
    }

    @Test
    public void testPost() throws Exception {
        MediaType JSON
                = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client;
        //NetworkUtil networkUtil=new NetworkUtil();
//        OkHttpClient.Builder client = new OkHttpClient.Builder();
        client = new OkHttpClient.Builder().authenticator(new Authenticator() {
            @Override
            public Request authenticate(Route route, Response response) throws IOException {
                if (responseCount(response) >= 3) {
                    return null; // If we've failed 3 times, give up. - in real life, never give up!!
                }
                String credential = Credentials.basic("dd62a616c435880a1ad77060", "4a9dc532ac60926d2902551");
                return response.request().newBuilder().header("Authorization", credential).build();
            }
        }).build();

//        client.connectTimeout(10, TimeUnit.SECONDS);
//        client.writeTimeout(10, TimeUnit.SECONDS);
//        client.readTimeout(30, TimeUnit.SECONDS);

        //OkHttpClient client =networkUtil.client;


//        Headers.Builder builder =new Headers.Builder();
//        Headers jpushHeader=new Headers(builder);
        String url = "https://api.jpush.cn/v3/push";
        String json = "{\n" +
                "    \"platform\": \"android\",\n" +
                "    \"audience\": {\n" +
                "        \"registration_id\": [\n" +
                "            \"1a0018970a8bd8b8f11\"\n" +
                "        ]\n" +
                "    },\n" +
                "    \"notification\": {\n" +
                "        \"android\": {\n" +
                "            \"alert\": \"测试消息!\"\n" +
                "        }     \n" +
                "    }\n" +
                "}";
//        client.addLenient(builder,"");
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

        System.out.println(response.body().string());

    }

    public int responseCount(Response response) {
        int result = 1;
        while ((response = response.priorResponse()) != null) {
            result++;
        }
        return result;
    }

}



