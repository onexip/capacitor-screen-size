package com.onexip.plugins.capacitorscreensize;

public class ScreenSize {

    public JSObject getDevicePPI() {
      DisplayMetrics displayMetrics = this.getActivity().getResources().getDisplayMetrics();

      String xdpi = Float.toString(displayMetrics.xdpi);
      String ydpi = Float.toString(displayMetrics.ydpi);

      JSObject ret = new JSObject();
      ret.put("xdpi", xdpi);
      ret.put("ydpi", ydpi);

      return ret;

    }
}
