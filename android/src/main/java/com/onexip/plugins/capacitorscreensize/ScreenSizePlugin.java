package com.onexip.plugins.capacitorscreensize;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

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
    public void getDeviceDPI(PluginCall call) {
      DisplayMetrics displayMetrics = this.getActivity().getResources().getDisplayMetrics();

      JSObject ret = new JSObject();
      ret.put("xdpi", displayMetrics.xdpi);
      ret.put("ydpi", displayMetrics.ydpi);

      call.resolve(ret);
    }
}
