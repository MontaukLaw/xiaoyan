package com.wulala.jpush.okhttp;

import com.wulala.jpush.config.ServiceConfig;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.IOException;

public class ApiAccess {

    private String apiAddress;
    private String username;
    private String password;

    public ApiAccess(String apiAddress, String username, String password) {
        this.apiAddress = apiAddress;
        this.username = username;
        this.password = password;
    }

    public String sendNotification(String rid, String content) {
        MediaType JSON = MediaType.get("application/json; charset=utf-8");
        //String url = serviceConfig.getApiAddress();
        //System.out.println("url: " + url);
        //String url = "https://api.jpush.cn/v3/push";
        String json = "{ \"platform\": \"android\",\"audience\": { \"registration_id\": [ \"" + rid + "\"] }, \"notification\": {\"android\": { \"alert\": \"" + content + "\"}}}";
        //String username = "dd62a616c435880a1ad77060";
        //String username=serviceConfig.getAppKey();

        //System.out.println("key" + serviceConfig.getAppKey());

        //String password = "4a9dc532acc60926d2902551";
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new BasicAuthInterceptor(username, password))
                .build();
        RequestBody body = RequestBody.create(JSON, json);

        Request request = new Request.Builder().url(apiAddress).post(body).build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            System.out.println(response.body().string());
            String result = "ok";
            return result;
        } catch (IOException e) {
            return e.getMessage();
        }
        //if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

        //return response.body().toString();
    }


}
