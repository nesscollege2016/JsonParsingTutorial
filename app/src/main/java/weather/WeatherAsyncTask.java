package weather;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.io.IOException;

import ness.tomerbu.edu.jsonparsingtutorial.HttpHandler;

/**
 * Created by android on 23/06/2016.
 */
public class WeatherAsyncTask extends AsyncTask<String, Integer, WhetherResult>{
    @Override
    protected WhetherResult doInBackground(String... strings) {
        try {
            String json = HttpHandler.getURL("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=ad0f66eb2043ed8fa4fe2789fadd6fc9");
            Gson gson = new Gson();
            return gson.fromJson(json, WhetherResult.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(WhetherResult whetherResult) {
        Float temp = whetherResult.getMain().getTemp();
    }
}
