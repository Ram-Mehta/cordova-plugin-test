package com.ram.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Test extends CordovaPlugin {

    @override
    public boolean execute(String action, JSONArray data, CallbackContext, callbackContext) extends JSONException {

        if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "Hello, " + name + " this is a test message";
            callbackContext.success(message);

            return true;

        } else {

            return false;

        }
    }
}
