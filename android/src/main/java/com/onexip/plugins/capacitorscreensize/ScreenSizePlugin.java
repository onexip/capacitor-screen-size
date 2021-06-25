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
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void getDevicePPI(PluginCall call) {
      DisplayMetrics displayMetrics = this.getActivity().getResources().getDisplayMetrics();

      String xdpi = Float.toString(displayMetrics.xdpi);
      String ydpi = Float.toString(displayMetrics.ydpi);

      JSObject ret = new JSObject();
      ret.put("xdpi", xdpi);
      ret.put("ydpi", ydpi);

      //System.out.println("#### ret: " + ret.getString("xdpi") + ", " + ret.getString("ydpi"));

      call.resolve(ret);

    }

}
