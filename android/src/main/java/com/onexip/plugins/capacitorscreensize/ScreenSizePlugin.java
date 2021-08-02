package com.onexip.plugins.capacitorscreensize;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import android.util.DisplayMetrics;

@CapacitorPlugin(name = "ScreenSize")
public class ScreenSizePlugin extends Plugin {

    private ScreenSize implementation = new ScreenSize();

    @PluginMethod
    public void getDevicePPI(PluginCall call) {
      DisplayMetrics displayMetrics = this.getActivity().getResources().getDisplayMetrics();

      //String density = Float.toString(displayMetrics.density);
      float density = displayMetrics.density;
      String ydpi = Float.toString(displayMetrics.ydpi);

      float scale = density / 160;
      

      JSObject ret = new JSObject();
      ret.put("density", ydpi);
      ret.put("scaleFactor", scale);

      System.out.println("#### density: " + ret.getString("density") + ", scaleFactor: " + ret.getString("scaleFactor"));

      call.resolve(ret);

    }

}
