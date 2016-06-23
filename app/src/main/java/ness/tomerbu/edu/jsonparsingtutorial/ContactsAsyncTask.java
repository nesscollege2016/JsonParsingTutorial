package ness.tomerbu.edu.jsonparsingtutorial;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
            JSONObject main = new JSONObject(json);
            JSONArray contacts = main.getJSONArray("contacts");

            for (int i = 0; i < contacts.length(); i++) {
                JSONObject contactObj = contacts.getJSONObject(i);
                String id = contactObj.getString("id");
                String email = contactObj.getString("email");
                String name = contactObj.getString("name");
                String address = contactObj.getString("address");
                String gender = contactObj.getString("gender");

                JSONObject phoneObject = contactObj.getJSONObject("phone");
                String mobile = phoneObject.getString("mobile");
                String home = phoneObject.getString("home");
                String office = phoneObject.getString("office");

                Phone phone = new Phone(mobile, home, office);
                Contact contact = new Contact(id, name, email, address, gender, phone);
                contactList.add(contact);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return contactList;
    }

    @Override
    protected void onPostExecute(ContactList contactList) {

    }
}
