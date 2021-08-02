export interface ScreenSizePlugin {
  getDevicePPI(): Promise<{ density: string, scaleFactor: string }>;
}
