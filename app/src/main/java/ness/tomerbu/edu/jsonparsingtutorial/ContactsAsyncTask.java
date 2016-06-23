package ness.tomerbu.edu.jsonparsingtutorial;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.io.IOException;

/**
 * Created by android on 23/06/2016.
 */
public class ContactsAsyncTask extends AsyncTask<String, Integer, ContactList> {

    @Override
    protected ContactList doInBackground(String... strings) {
        ContactList contactList = new ContactList();

        try {
            String json = HttpHandler.getURL("http://api.androidhive.info/contacts/");
            Gson gson = new Gson();
            contactList = gson.fromJson(json, ContactList.class);


        } catch (IOException e) {
            e.printStackTrace();
        }

        return contactList;
    }

    @Override
    protected void onPostExecute(ContactList contactList) {
        System.out.println(contactList);
    }
}
